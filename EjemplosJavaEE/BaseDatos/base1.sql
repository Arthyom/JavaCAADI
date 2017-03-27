CREATE DATABASE IF NOT EXISTS ejemplo1;

USE ejemplo1;

CREATE TABLE IF NOT EXISTS usuarios
(
  idUsuario         int           not null auto_increment primary key,
  nombreUsuario     varchar(20)   not null
);

CREATE TABLE IF NOT EXISTS passwords
(
  idPassword      int             not null auto_increment primary key,
  password        varchar(20)     not null
);


INSERT INTO usuarios (  nombreUsuario ) VALUES ( 'alfredo');
INSERT INTO usuarios (  nombreUsuario ) VALUES ( 'balta');
INSERT INTO usuarios (  nombreUsuario ) VALUES ( 'walter');
INSERT INTO usuarios (  nombreUsuario ) VALUES ( 'kike');
INSERT INTO usuarios (  nombreUsuario ) VALUES ( 'susana');

INSERT INTO passwords ( password ) VALUES ( '1234');
INSERT INTO passwords ( password ) VALUES ( '4567');
INSERT INTO passwords ( password ) VALUES ( '7890');
INSERT INTO passwords ( password ) VALUES ( 'asdf');
INSERT INTO passwords ( password ) VALUES ( 'qwer');
