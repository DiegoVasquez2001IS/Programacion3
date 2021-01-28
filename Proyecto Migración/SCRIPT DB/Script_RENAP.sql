CREATE DATABASE RENAP;
USE RENAP;

CREATE TABLE Estado_civil
(Id_ecivil int (1) Primary Key NOT NULL,
Estado_civil int (1) NOT NULL unique)
ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE Persona
(cui_persona varchar(30) Primary Key,
primer_nombre Varchar(20) Not Null,
segundo_nombre Varchar(20) Not Null,
tercer_nombre Varchar(20),
primer_apellido Varchar(20) Not Null,
segundo_apellido Varchar(20) Not Null,
apellido_cas Varchar(20),
E_Civil int (1), 
Fecha_Nacimiento date not null,
FOREIGN KEY (E_Civil) REFERENCES Estado_civil (Estado_civil)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
