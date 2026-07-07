-- Scenario 1: Apply a 1% discount on loan interest rate for customers above 60
-- Assumes tables: Customers(customer_id, name, age)
--                 Loans(loan_id, customer_id, interest_rate)

DECLARE
    CURSOR cust_cursor IS
        SELECT customer_id, age FROM Customers;
BEGIN
    FOR cust_rec IN cust_cursor LOOP
        IF cust_rec.age > 60 THEN
            UPDATE Loans
            SET interest_rate = interest_rate - (interest_rate * 0.01)
            WHERE customer_id = cust_rec.customer_id;
        END IF;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Loan interest discount applied for eligible customers.');
END;
/
