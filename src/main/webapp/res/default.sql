create database apartment default character set utf8 collate utf8_general_ci;
use apartment;

create table location_code(
  inner_code int primary key ,
  outer_code int(5),
  location varchar(10)
);

insert into location_code
(location, outer_code, inner_code)
values
('중구',27110,1),
('동구',27140,2),
('서구',27170,3),
('남구',27200,4),
('북구',27230,5),
('수성구',27260,7),
('달서구',27290,8),
('달성군',27710,9);

drop table apartment_info;

create table apartment_info(
   i_ai int unsigned primary key auto_increment,
   deal_amount int unsigned not null ,
   build_year int not null ,
   deal_year int not null ,
   deal_month int not null ,
   deal_day int not null ,
   dong nvarchar(40) not null ,
   apartment_name nvarchar(40) not null ,
   area_for_exclusive_use float not null ,
   jibun nvarchar(10) not null ,
   flr int unsigned not null comment '층',
   location_cd int not null,
   foreign key (location_cd) references location_code(inner_code)
);