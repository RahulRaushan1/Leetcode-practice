/* Write your PL/SQL query statement below */


/* 

select player_id, to_char(first_login , 'YYYY-MM-DD') as first_login from(
    select player_id, event_date as first_login , dense_rank() over (partition by player_id order by event_date asc) as dr from Activity 
) where dr=1;

*/

 select player_id ,to_char( min(event_date),'yyyy-mm-dd') as first_login from Activity group by player_id;
 