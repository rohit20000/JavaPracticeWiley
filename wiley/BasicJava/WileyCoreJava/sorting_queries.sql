select
    select_list
from
    table_name
order by
    column1 [asc];

    -- FROM -> SELECT -> ORDER BY
select
    contactLastname,
    contactFirstname
from
    customers
order by
    contactLastname desc;

select
    orderNumber,
    orderlinenumber,
    quantityOrdered * priceEach as subtotal
from
    orderdetails
order by
    subtotal desc;


    select 
    orderNumber,status
    from orders
    order by field(status,"In Process" , "On Hold ","Cancelled","Resolved","Shipped");



-- sort the customers by their last name in asc order

select customerName ,contactLastName from customers order by
contactLastName ASC;



-- Sort the customers last name by DESC order and first name in asc order

select customerName ,contactLastName from customers order by
contactLastName desc , customerName asc;



-- select the order line items from the orderdetails table. 
--It calculates the subtotal for each line item and sorts
-- the result set based on the subtotal.

select orderlinenumber,quantityOrdered*priceEach as total  from orderdetails 
order by total desc;


-- sort order based on their status
SELECT
    orderNumber,
    status
FROM
    orders
ORDER BY
    FIELD(
        status,
        "In Process",
        "On Hold",
        "Cancelled",
        "Resolved",
        "Disputed",
        "Shipped"
    );


