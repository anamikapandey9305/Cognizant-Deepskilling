-- Scenario 3:
-- Print reminder messages for loans
-- due within the next 30 days.

SET SERVEROUTPUT ON;

BEGIN
FOR loan_record IN (
        SELECT c.Name,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear '
            || loan_record.Name
            || ', your Loan ID '
            || loan_record.LoanID
            || ' is due on '
            || TO_CHAR(loan_record.DueDate, 'DD-MON-YYYY')
        );

END LOOP;
END;
/