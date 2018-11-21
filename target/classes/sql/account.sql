create table account (
 id int PRIMARY KEY AUTO_INCREMENT,
 name varchar(256),
 password varchar(265)
);


insert into account(name, password) value('a', 'a');

insert into account(name, passowrd) value('aa', ?);


select * from lost_goods;

insert into lost_goods(name, account_id, lost_type, status, create_time) value('lost_goods_1', 1, 1, 1, 1001);

insert into lost_goods(name, description, lost_province, lost_city, lost_district, lost_address, img, reward, account_id, lost_type, status, create_time) 
values('a', 'a', '天津市', '市辖区', '和平区', 'aa', 'D:\file\GoodKarma_Categories.xls,D:\file\GoodKarma_Categories.xlsx', 'aa', 1, 6, 0, '1542786280218');



select * from account;

create table lost_type (
 id int PRIMARY KEY AUTO_INCREMENT,
 name varchar(256)
);


insert into lost_type(name) value('现金');
insert into lost_type(name) value('钱包');
insert into lost_type(name) value('宠物');
insert into lost_type(name) value('电子产品');
insert into lost_type(name) value('饰品');
insert into lost_type(name) value('书籍');

