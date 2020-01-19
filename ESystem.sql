create table DEPT(
DeptNo number(3) primary key,
DeptName varchar2(50) not null,
Manager varchar2(20) not null);

drop SEQUENCE Dno;
-- mysql의 auto_increment기능을 사용할 수 있게 해주는 '객체'
create SEQUENCE Dno
start with 1
INCREMENT BY 1 
MAXVALUE 100000 
CYCLE;

create table EDATA(
Fno number(6) primary key,
Power number(1) not null,
Data varchar2(200));

create table INFO(
Eno number(4) primary key,
Ename varchar2(50) not null,
Power number(1) default 1,
Sex varchar2(5) not null,
DeptNo number(3) not null,
Phone varchar2(20),
Address varchar2(100),
JoinDate varchar2(20) not null,
constraint info_deptno_fk foreign key(deptno) references dept(deptno));

drop SEQUENCE Sno;
-- mysql의 auto_increment기능을 사용할 수 있게 해주는 '객체'
create SEQUENCE Sno
start with 1
INCREMENT BY 1 
MAXVALUE 5000 
CYCLE;

create table COMMUTE(
Eno number(4),
Cin varchar2(50),
Cout varchar2(50),
constraint commute_pk PRIMARY KEY(Eno, Cin),
constraint commute_eno_fk foreign key(eno) 
references info(eno) on delete cascade);