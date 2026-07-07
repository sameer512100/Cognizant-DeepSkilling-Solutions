-- Scenario 3: Print a reminder for loans due within the next 30 days
-- Assumes tables: Loans(loan_id, customer_id, due_date)
--                 Customers(customer_id, name)

DECLARE
    CURSOR loan_cursor IS
        SELECT l.loan_id, c.name, l.due_date
        FROM Loans l
        JOIN Customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR loan_rec IN loan_cursor LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID ' || loan_rec.loan_id ||
            ' for customer ' || loan_rec.name ||
            ' is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/
