/* Write your PL/SQL query statement below */


 /*
 select customer_number from(
    select customer_number, count(*) as total_orders, dense_rank() over (order by count(*) desc) as rk from orders group by customer_number
) where rk =1;

*/

select customer_number from (
    select customer_number, count(*) as customer_count from Orders group by customer_number order by customer_count desc
) where rownum=1;