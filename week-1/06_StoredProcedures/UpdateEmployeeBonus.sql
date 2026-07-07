-- Stored Procedure: UpdateEmployeeBonus
-- Adds a bonus percentage to the salary of all employees in a given department
-- Assumes table: Employees(employee_id, department, salary)

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department  IN VARCHAR2,
    p_bonus_pct   IN NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET salary = salary + (salary * p_bonus_pct / 100)
    WHERE department = p_department;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus_pct || '% applied to department: ' || p_department);
END UpdateEmployeeBonus;
/

-- Example call:
-- BEGIN
--     UpdateEmployeeBonus('Sales', 5);
-- END;
-- /
