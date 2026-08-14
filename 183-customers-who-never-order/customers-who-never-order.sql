/* Write your PL/SQL query statement below */
select name as Customers from Customers c, Orders o where c.id = o.customerId(+) and 
o.customerId is null; 

