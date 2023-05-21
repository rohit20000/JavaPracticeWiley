--Group by
select
    c1,
    c2,
    c3,
    c4
from
    table_name
where
    where_condition
Group by
    c1,
    c2,
    c3,
    c4;

from
    ->
where
    ->
Group by
    ->
select
    ->
order by
    ->
limit
select
    status
from
    orders
Group by
    status;

select
    orderNumber,
    sum(quantityOrdered) as itemCount,
    sum(priceEach * quantityOrdered) as total
from
    orderdetails
Group by
    orderNumber;

select
    orderNumber,
    sum(quantityOrdered) as itemCount,
    sum(priceEach * quantityOrdered) as total
from
    orderdetails
Group by
    orderNumber
having
    total > 1000
limit
    25;

select
    orderNumber,
    sum(quantityOrdered) as itemCount,
    sum(priceEach * quantityOrdered) as total
from
    orderdetails
Group by
    orderNumber
having
    total > 1000
    and itemCount > 600
limit
    25;

select
    a.orderNumber,
    status,
    sum(priceEach * quantityOrdered) as total
from
    orderdetails a
    inner join orders b on b.orderNumber = a.orderNumber
Group by
    orderNumber,
    status
having
    status = "shipped"
    and total > 1500;

-- select 
create table sales
select
    productline,
    year(orderDate),
    sum(priceEach * quantityOrdered) as orderValue
from
    orderdetails
    inner join orders using(orderNumber)
    inner join products using (productCode)
group by
    productline,
    orderYear;

select
    productline sum(orderValue) totalordervalue
from
    sales
group by
    productline;

select
    sum(orderValue) totalordervalue
from
    sales;

select
    productline sum(orderValue) totalordervalue
from
    sales
group by
    productline;

select
    productline sum(orderValue) totalordervalue
from
    sales
group by
    productline
union
all
select
    null sum(orderValue) totalordervalue
from
;

select
    productline,
    sum(orderValue) totalordervalue
from
    sales
group by
    productline with rollup;

select
    productline,
    orderYear,
    sum(orderValue) totalordervalue
from
    sales
Group by
    orderYear,
    productline 
with rollup;





