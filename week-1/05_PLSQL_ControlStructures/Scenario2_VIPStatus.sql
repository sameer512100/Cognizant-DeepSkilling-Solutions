-- Scenario 2: Set IsVIP flag to TRUE for customers with balance over $10,000
-- Assumes table: Customers(customer_id, balance, IsVIP)

DECLARE
    CURSOR cust_cursor IS
        SELECT customer_id, balance FROM Customers;
BEGIN
    FOR cust_rec IN cust_cursor LOOP
        IF cust_rec.balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE customer_id = cust_rec.customer_id;
        END IF;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP status updated for eligible customers.');
END;
/
