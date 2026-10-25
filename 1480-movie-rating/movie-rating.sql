select results as "results"
from (
    select name as results
    from (
        select u.name
        from movierating r
        join users u on u.user_id = r.user_id
        group by u.user_id, u.name
        order by count(*) desc, u.name
    )
    where rownum = 1
    union all
    select title
    from (
        select m.title
        from movierating r
        join movies m on m.movie_id = r.movie_id
        where r.created_at >= date '2020-02-01'
          and r.created_at < date '2020-03-01'
        group by m.movie_id, m.title
        order by avg(r.rating) desc, m.title
    )
    where rownum = 1
)
