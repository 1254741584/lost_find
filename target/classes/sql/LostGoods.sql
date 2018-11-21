CREATE TABLE lost_goods 
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255),
  description text,
  lost_province VARCHAR(50),
  lost_city VARCHAR(50),
  lost_district VARCHAR(50),
  lost_address VARCHAR(255),
  img VARCHAR(1000),
  reward VARCHAR(1000),
  account_id INT,
  lost_type INT,
  status INT,
  create_time INT,
  update_time INT,
  lost_start_time INT,
  lost_end_time INT
);

select * from lost_goods;

insert into lost_goods(name, account_id, lost_type, status, create_time) value('lost_goods', 1, 1, 1, 1000);
insert into lost_goods(name, account_id, lost_type, status, create_time) value('lost_goods_1', 1, 1, 1, 1001);
insert into lost_goods(name, account_id, lost_type, status, create_time) value('lost_goods_3', 1, 1, 1, 1002);
insert into lost_goods(name, account_id, lost_type, status, create_time) value('lost_goods_4', 1, 1, 1, 1003);