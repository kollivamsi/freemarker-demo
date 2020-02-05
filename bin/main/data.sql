DROP TABLE IF EXISTS product;

CREATE TABLE product (
	id INT AUTO_INCREMENT PRIMARY KEY,
	product_name VARCHAR(250) NOT NULL,
	product_description VARCHAR(250) NOT NULL,
	product_price DECIMAL NOT NULL
);

INSERT INTO product 
(product_name, product_description, product_price) 
VALUES 
('Apples', 'Red fruit', 5.50),
('Grapes', 'Purple fruit', 3.50),
('Lemons', 'Yellow fruit', 2.00),
('Potatoes', 'Brown vegetable', 7.25);