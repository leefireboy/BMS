-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE bms;
-- 使用数据库
use bms;
-- 创建秒杀库存表
CREATE TABLE seckill (
	seckill_id bigint NOT NULL AUTO_INCREMENT COMMENT '秒杀商品库存ID',
	name varchar(120) NOT NULL COMMENT '商品名称',
	number int NOT NULL COMMENT '库存数量',
	start_time timestamp NOT NULL COMMENT '秒杀开启时间',
	end_time timestamp NOT NULL COMMENT '秒杀结束时间',
	create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	PRIMARY KEY (seckill_id),
	KEY idx_start_time (start_time),
	KEY idx_end_time (end_time),
	KEY idx_create_time (create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

-- 初始化数据
INSERT INTO 
	seckill(name,number,start_time,end_time)
VALUES
	('1000元秒杀iphone6',100,'2015-11-01 00:00:00','2016-11-02 00:00:00'),
	('500元秒杀iphone6',200,'2015-11-01 00:00:00','2016-11-02 00:00:00'),
	('300元秒杀iphone6',300,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
	('200元秒杀iphone6',400,'2015-11-01 00:00:00','2015-11-02 00:00:00');


-- 秒杀成功明细表
-- 用户登录认证相关的信息
CREATE TABLE success_killed (
	seckill_id bigint NOT NULL COMMENT '秒杀商品ID',
	user_phone bigint NOT NULL COMMENT '用户手机号',
	state tinyint NOT NULL DEFAULT -1 COMMENT '状态标识：-1：无效 0：成功 1：已付款',
	create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	PRIMARY KEY (seckill_id,user_phone),/* 联合主键 */
	KEY idx_create_time (create_time)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';

-- 用户表
CREATE TABLE user (
	id bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
	name varchar(120) NOT NULL COMMENT '用户名',
	sex tinyint NOT NULL DEFAULT 0 COMMENT '性别   0：男   1：女   2：其他',
	phone bigint NOT NULL COMMENT '联系电话',
	company varchar(120) NOT NULL COMMENT '所属公司',
	remark varchar(255) NOT NULL DEFAULT '...' COMMENT '备注',
	create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	modify_time timestamp NOT NULL COMMENT '修改时间',
	delete_flag tinyint NOT NULL DEFAULT 0 COMMENT '是否删除   0：否   1：是',
	PRIMARY KEY (id),
	UNIQUE KEY idx_name (name)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '用户表';

-- 初始化数据
INSERT INTO 
	user(name,phone,company,modify_time)
VALUES
	('admin',12345678900,'神州商龙',now());

-- 书籍
CREATE TABLE book (
	id bigint NOT NULL AUTO_INCREMENT COMMENT '书籍ID',
	store_id int NOT NULL COMMENT '入库书籍唯一编号',
	name varchar(120) NOT NULL COMMENT '书名',
	author varchar(120) NOT NULL COMMENT '作者',
	press varchar(120) NOT NULL COMMENT '出版社',
	public_time timestamp NOT NULL COMMENT '出版时间',
	price double NOT NULL COMMENT '价格',
	remark varchar(255) NOT NULL DEFAULT '...' COMMENT '备注',
	state tinyint NOT NULL DEFAULT 0 COMMENT '书籍状态   0：未借出   1：已借出   2：不可借',
	store_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
	state_modify_id bigint NOT NULL DEFAULT 0 COMMENT '状态修改用户ID',
	state_modify_name varchar(120) NOT NULL COMMENT '状态修改用户名',
	delete_flag tinyint NOT NULL DEFAULT 0 COMMENT '是否下架   0：否   1：是',
	delete_time timestamp NOT NULL COMMENT '下架日期',
	PRIMARY KEY (id),
	UNIQUE KEY idx_store_id (store_id),
	KEY idx_name (name),
	KEY idx_store_id_name (store_id, name),
	KEY idx_store_time (store_time)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '书籍表';

-- 初始化数据
INSERT INTO
	book(store_id,name,author,press,public_time,price,state_modify_name,delete_time)
VALUES
	(1,'Java编程思想','Mr','清华大学出版社','2013-08-08 00:00:00',50.00,'admin','2033-08-08 00:00:00'),
	(2,'Java并发编程','Mr','清华大学出版社','2013-08-08 00:00:00',60.00,'admin','2033-08-08 00:00:00'),
	(3,'Java设计模式','Mr','清华大学出版社','2013-08-08 00:00:00',70.00,'admin','2033-08-08 00:00:00');

-- 借阅信息
CREATE TABLE borrow_info (
	id bigint NOT NULL AUTO_INCREMENT COMMENT '借阅记录信息ID',
	user_id bigint NOT NULL COMMENT '用户ID',
	user_name varchar(120) NOT NULL COMMENT '用户名',
	book_id bigint NOT NULL COMMENT '书籍ID',
	book_name varchar(120) NOT NULL COMMENT '书名',
	borrow_date timestamp NOT NULL COMMENT '借出日期',
	return_date timestamp NOT NULL COMMENT '归还日期',
	create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
	PRIMARY KEY (id),
	UNIQUE KEY idx_book_id_user_id (user_id, book_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '借阅信息表';

