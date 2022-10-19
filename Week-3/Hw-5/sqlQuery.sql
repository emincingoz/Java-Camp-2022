select ContactName Adi,CompanyName Sirketadi,City Sehir from Customers

Select * from Customers where City='London'

select * from Products where CategoryID=1 or CategoryID=3

select * from Products where CategoryID=1 and UnitPrice>10

select * from Products order by CategoryID,UnitPrice asc   --ascending

select * from Products order by CategoryID,UnitPrice desc   --descending

select * from Products where CategoryID=1 order by UnitPrice asc

select count(*) Adet from Products where CategoryID=2 -- satırları say count = adet

select CategoryID,count(*) adet from Products where UnitPrice>20group by CategoryID having count(*)<10

select Products.ProductID,Products.UnitPrice,Products.ProductName,Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>5

select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID=od.OrderID

select * from Customers c right join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null