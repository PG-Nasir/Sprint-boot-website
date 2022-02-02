SELECT ProductName
FROM Products
Where ProductID = (
	SELECT ProductID
	FROM OrderDetails
	WHERE OrderID = (
		SELECT Orders.OrderID
		FROM Orders
		INNER JOIN Customers 
			ON Orders.CustomerID=Customers.CustomerID 
			WHERE city = "Helsinki"))


