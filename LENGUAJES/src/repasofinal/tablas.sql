/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  T-102
 * Created: 11-dic-2017
 */


create table direccion(id integer primary key, cp integer, calle varchar(50), municipio varchar(50));
create table cliente(id integer primary key , nombre varchar(50), edad integer, id_direccion integer,
foreign key(id_direccion) references direccion(id));

select * from direccion;
select * from cliente;