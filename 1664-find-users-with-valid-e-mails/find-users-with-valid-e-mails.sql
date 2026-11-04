select user_id as "user_id",
       name as "name",
       mail as "mail"
from users
where regexp_like(mail, '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\.com$')