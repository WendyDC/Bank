
--------------------------------------
-- Tabla clientes
--------------------------------------
CREATE TABLE IF NOT EXISTS customer (
  id INT NOT NULL,
  identification VARCHAR(45) NOT NULL,
  name VARCHAR(100) NOT NULL,
  gender VARCHAR(45) NOT NULL,
  age INT NOT NULL,
  phone VARCHAR(45) NOT NULL,
  CONSTRAINT pk_customer PRIMARY KEY (id));

ALTER TABLE customer ADD CONSTRAINT checkGenderConstraint CHECK (gender IN('M', 'F'));

INSERT INTO customer VALUES (-1, '987645321', 'Customer default', 'M', 18, '3000000000');

--------------------------------------
-- Tabla productos
--------------------------------------
CREATE TABLE IF NOT EXISTS product (
  id INT NOT NULL,
  description VARCHAR(45) NOT NULL,
  type VARCHAR(1) NOT NULL,
  CONSTRAINT pk_product PRIMARY KEY (id));
  
ALTER TABLE product ADD CONSTRAINT checkTypeConstraint CHECK (type IN('1', '2', '3'));

INSERT INTO product VALUES (-1, 'Product default', '1');

--------------------------------------
-- Tabla cuentas - productos por clientes
--------------------------------------
CREATE TABLE IF NOT EXISTS account (
  id VARCHAR(45) NOT NULL,
  id_customer INT NOT NULL,
  id_product INT NOT NULL,  
  amount INT NOT NULL,
  status VARCHAR(1) NOT NULL, 
  CONSTRAINT pk_account PRIMARY KEY (id),
  CONSTRAINT fk_Customer FOREIGN KEY (id_customer) REFERENCES customer (id),
  CONSTRAINT fk_Product FOREIGN KEY (id_product) REFERENCES product (id));
  
ALTER TABLE account ADD CONSTRAINT checkcustomerProductConstraint CHECK (status IN('A', 'I'));

INSERT INTO account VALUES ('987654321', -1, -1, 200000, 'A');

--------------------------------------
-- Tabla movimientos
--------------------------------------
CREATE TABLE IF NOT EXISTS transaction (
  id INT NOT NULL,
  id_account VARCHAR(45) NOT NULL,
  date TIMESTAMP NOT NULL,
  office VARCHAR(45) NOT NULL,
  description VARCHAR(45) NOT NULL,
  amount INT NOT NULL, 
  CONSTRAINT pk_transaction PRIMARY KEY (id),
  CONSTRAINT fk_Account FOREIGN KEY (id_account) REFERENCES account (id));
   
INSERT INTO transaction VALUES (-1, '987654321', CURRENT_TIMESTAMP, 'Principal default', 'Recepcion cajero', 20000);


