-- Inserting data into the customer table
INSERT INTO customer (id,email, name) VALUES (1,'customer1@example.com', 'John Doe');
INSERT INTO customer (id,email, name) VALUES (2,'customer1@example.com', 'frank kr');
INSERT INTO customer (id,email, name) VALUES (3,'customer1@example.com', 'Jony P');
INSERT INTO customer (id,email, name) VALUES (4,'customer2@example.com', 'Customer 2');

-- Inserting data into the orders table
INSERT INTO orders (sale_amount, customer_id, order_date, sale_date) VALUES (100.50, 1, '2024-01-30', '2024-01-30');
INSERT INTO orders (sale_amount, customer_id, order_date, sale_date) VALUES (200.75, 2, '2024-01-30', '2024-01-30');
INSERT INTO orders (sale_amount, customer_id, order_date, sale_date) VALUES (400.75, 2, '2024-01-30', '2024-01-30');
-- Inserting data into the orders table with current date for order_date and sale_date
INSERT INTO orders (sale_amount, customer_id, order_date, sale_date) VALUES (100.50, 1, CURRENT_DATE, CURRENT_DATE);
INSERT INTO orders (sale_amount, customer_id, order_date, sale_date) VALUES (300.75, 2, CURRENT_DATE, CURRENT_DATE);