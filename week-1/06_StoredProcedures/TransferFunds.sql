-- Stored Procedure: TransferFunds
-- Transfers an amount from one account to another, checking sufficient balance
-- Assumes table: Accounts(account_id, balance)

CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account   IN NUMBER,
    p_amount       IN NUMBER
)
IS
    v_from_balance NUMBER;
BEGIN
    -- Check current balance of the source account
    SELECT balance INTO v_from_balance
    FROM Accounts
    WHERE account_id = p_from_account;

    IF v_from_balance >= p_amount THEN
        -- Deduct from source account
        UPDATE Accounts
        SET balance = balance - p_amount
        WHERE account_id = p_from_account;

        -- Add to destination account
        UPDATE Accounts
        SET balance = balance + p_amount
        WHERE account_id = p_to_account;

        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Transfer successful.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Transfer failed: insufficient balance.');
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: account not found.');
END TransferFunds;
/

-- Example call:
-- BEGIN
--     TransferFunds(101, 102, 500);
-- END;
-- /
