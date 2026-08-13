# Write your MySQL query statement below
SELECT e.name ,b.bonus from Employee e left Join Bonus b
on  b.empId=e.empId where b.bonus is null or b.bonus<1000;
