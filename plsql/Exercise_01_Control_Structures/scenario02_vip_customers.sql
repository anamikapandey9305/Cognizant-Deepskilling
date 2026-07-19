-- Scenario 2:
-- Set IsVIP = TRUE
-- for customers having balance greater than 10000.

SET SERVEROUTPUT ON;

BEGIN
FOR customer_record IN (
        SELECT CustomerID,
               Balance
        FROM Customers
    )
    LOOP

        IF customer_record.Balance > 10000 THEN

UPDATE Customers
SET IsVIP = 'TRUE'
WHERE CustomerID = customer_record.CustomerID;

DBMS_OUTPUT.PUT_LINE(
                'VIP Status Assigned to Customer ID: '
                || customer_record.CustomerID
            );

END IF;

END LOOP;

COMMIT;
END;
/