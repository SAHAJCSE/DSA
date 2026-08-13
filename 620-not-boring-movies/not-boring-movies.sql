# Write your MySQL query statement below
SELECT * FROM Cinema where (id%2!=0 and not description in('boring'))
order by rating desc;