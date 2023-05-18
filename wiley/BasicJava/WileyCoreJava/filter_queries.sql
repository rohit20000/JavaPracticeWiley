

-- SELECT 
-- WHERE
-- DISTINCT 
-- AND 
-- OR 
-- IN 
-- NOT IN 
-- BETWEEN 
-- LIKE 
-- LIMIT 
-- IS NULL


--where

select select_list
from table_name
where search_conditions;


--from --> where --> select --> order by



select lastName,firstName,jobTitle from employees where jobTitle="sales rep";


select lastName,firstName,jobTitle from employees where jobTitle="sales rep" and officeCode =1;


select lastName,firstName,jobTitle from employees where jobTitle="sales rep" 
order by officeCode,jobTitle;