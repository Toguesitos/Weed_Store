create database Mota_feliz;
use Mota_feliz;
CREATE TABLE clientes(
   ID_cliente BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Tipo_documento VARCHAR(30) NOT NULL,
  Documento VARCHAR(30) NOT NULL,
  Nombres VARCHAR(50) NOT NULL,
  Apellidos VARCHAR(50) NOT NULL,
  Edad int,
  Telefono BIGINT,
  Sexo VARCHAR(50),
  Direccion VARCHAR (150)
);
CREATE TABLE tblProductos (
  IDProducto INT NOT NULL PRIMARY KEY ,
  NombreProducto VARCHAR(30) NOT NULL,
  DescripcionProducto VARCHAR(256) NOT NULL,
  CantidadProducto INT NOT NULL,
  CategoriaProducto VARCHAR(50) NOT NULL,
  PrecioCompra DOUBLE NOT NULL,
  PrecioVenta DOUBLE NOT NULL
);
CREATE TABLE tblAdministrativos(
ID  INT NOT NULL AUTO_INCREMENT primary key,
nombres VARCHAR(20),
apellidos VARCHAR(20),
usuario VARCHAR(20),
contrasena VARCHAR (30),
Tipo_usuario VARCHAR (30)
);