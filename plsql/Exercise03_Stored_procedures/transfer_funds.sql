-- Scenario 3:
-- Transfer Funds Between Accounts

CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_FromAccount IN NUMBER,
    p_ToAccount IN NUMBER,
    p_Amount IN NUMBER
)
AS
    v_Balance NUMBER;
BEGIN

    -- Get source account balance
SELECT Balance
INTO v_Balance
FROM Accounts
WHERE AccountID = p_FromAccount;

-- Check sufficient balance
IF v_Balance >= p_Amount THEN

        -- Deduct amount
UPDATE Accounts
SET Balance = Balance - p_Amount
WHERE AccountID = p_FromAccount;

-- Add amount
UPDATE Accounts
SET Balance = Balance + p_Amount
WHERE AccountID = p_ToAccount;

COMMIT;

DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');

ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance.');

END IF;

END;
/