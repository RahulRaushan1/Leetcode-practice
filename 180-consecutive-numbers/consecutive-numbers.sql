select distinct num as "ConsecutiveNums"
from (
    select
        num,
        lead(num, 1) over (order by id) as n1,
        lead(num, 2) over (order by id) as n2
    from logs
)
where num = n1 and num = n2;