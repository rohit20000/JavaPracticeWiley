--select 
select
    *
from
    employees;

--     FROM
--     ->
-- SELECT


-- MySQL doesn’t require the FROM clause
SELECT
    1 + 1;

    
--  return the current date and time of the MySQL server
SELECT
    NOW();

    
-- If a function has parameters, you need to pass arguments into it. For example, concatenate strings into one string, you can use the CONCAT() function:
SELECT
    CONCAT('John', ' ', 'Doe');