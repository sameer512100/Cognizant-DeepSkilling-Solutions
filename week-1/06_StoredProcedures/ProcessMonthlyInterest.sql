-- Stored Procedure: ProcessMonthlyInterest
-- Applies 1% monthly interest to all savings accounts
-- Assumes table: SavingsAccounts(account_id, balance)

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    UPDATE SavingsAccounts
    SET balance = balance + (balance * 0.01);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest processed for all savings accounts.');
END ProcessMonthlyInterest;
/

-- Example call:
-- BEGIN
--     ProcessMonthlyInterest;
-- END;
-- /
