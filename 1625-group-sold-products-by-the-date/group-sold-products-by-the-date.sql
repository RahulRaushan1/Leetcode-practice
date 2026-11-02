select to_char(sell_date, 'YYYY-MM-DD') as "sell_date",
       count(*) as "num_sold",
       listagg(product, ',') within group (order by product) as "products"
from (
    select distinct sell_date, product
    from activities
)
group by sell_date
order by sell_date