/* Write your PL/SQL query statement below */
select firstName , lastName,city ,state from Person p , Address a where 
p.personId= a.personId(+);