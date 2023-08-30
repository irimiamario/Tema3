# Tema3

TABLE orderdetails ( id INT, product_code VARCHAR (15), quantity INT, priceEach DECIMAL (10,2) )

TABLE products ( code VARCHAR (15), name VARCHAR (70), description TEXT, stock SMALLINT, price DECIMAL (10,2) )

TABLE orders ( id INT, order_date DATE, shipped_date DATE, status VARCHAR (15), comments TEXT, customer_id INT )

TABLE customers ( id INT, username VARCHAR (50), last_name VARCHAR (50), first_name VARCHAR(50), phone VARCHAR(50), address VARCHAR(50), city VARCHAR (50), postalCode VARCHAR (15), country VARCHAR (50) )

TABLE payments ( customer_id INT, payment_date DATE, amount DECIMAL (10, 2) )

- create a new customer
- create 10 products in the database
- add 5 products to an order belonging to the customer
- create an endpoint that can display all orders belonging to a customer
- create an endpoint which displays all products
- create a DTO to return only the address, phone and city of the customer, called PostalDetailsUserDTO. Create an endpoint which will return the postal details of an user, given his username as input
