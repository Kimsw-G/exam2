create database apartment;
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

create table apartment_info(
   i_ai int unsigned primary key auto_increment,
   deal_amount int unsigned not null ,
   build_year char(4) not null ,
   deal_year char(4) not null ,
   deal_month char(2) not null ,
   deal_day char(6) not null ,
   dong nvarchar(40) not null ,
   apartment_name nvarchar(40) not null ,
   area_for_exclusive_use float not null ,
   jibun nvarchar(10) not null ,
   flr int unsigned not null comment '층',
   location_cd int not null,
   foreign key (location_cd) references location_code(inner_code)
);