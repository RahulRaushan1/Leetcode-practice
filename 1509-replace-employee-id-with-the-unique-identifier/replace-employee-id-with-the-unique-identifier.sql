/* Write your PL/SQL query statement below */


/*  
select unique_id, name from employees emp left join employeeuni euni on emp.id=euni.id;
 */

 select unique_id,name from employees emp , employeeuni euni where emp.id=euni.id(+);