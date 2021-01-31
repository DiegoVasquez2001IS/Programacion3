CREATE DATABASE Banrural;
USE Banrural;

CREATE TABLE tipo_cuenta(
id_tipo_cuenta int(10),
tipocuenta VARCHAR(100) NOT NULL,
PRIMARY KEY (tipocuenta)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE cuentahabiente(
num_cuenta VARCHAR(100) NOT NULL,
nombre_cuentahabiente VARCHAR(100) NOT NULL,
tipocuenta VARCHAR(100) NOT NULL,
fecha_apertura VARCHAR(100) NOT NULL,
monto_actual VARCHAR(100) NOT NULL,
  PRIMARY KEY (num_cuenta),
FOREIGN KEY(tipocuenta) REFERENCES tipo_cuenta(tipocuenta) 
)ENGINE=InnoDB DEFAULT CHARSET=latin1;



CREATE TABLE boleta(
num_boleta VARCHAR(100) NOT NULL,
num_cuenta VARCHAR(100) NOT NULL,
num_recibo VARCHAR(100) NOT NULL,
monto VARCHAR(100) NOT NULL,
concepto_de VARCHAR(100) NOT NULL,
 PRIMARY KEY (num_recibo),
FOREIGN KEY(num_cuenta) REFERENCES cuentahabiente(num_cuenta) 
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE recibo(
num_recibo VARCHAR(100) NOT NULL,
fecha_recibo VARCHAR(100) NOT NULL,
PRIMARY KEY (num_recibo),
FOREIGN KEY(num_recibo) REFERENCES boleta(num_recibo) 
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

USE Banrural;
Select * From recibo;