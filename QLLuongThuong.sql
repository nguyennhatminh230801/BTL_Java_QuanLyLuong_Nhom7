use master
go

drop database if exists QuanLyLuongThuong
go
create database QLLuongThuong
go
create table [phongban]
(
	[maphong] bigint not null,
	[tenphong] nvarchar(30) not null,
	[ten_truongphong] nvarchar(30) null,
primary key ([maphong])
) 
go

create table [hesoluong]
(
	[mahesoluong] bigint not null,
	[hesoluong] float not null,
primary key ([mahesoluong])
) 
go

create table [phucap]
(
	[maphucap] bigint not null,
	[tienphucap] float not null,
	[tenphucap] nvarchar(30) not null,
primary key ([maphucap])
) 
go

create table [thuong]
(
	[mathuong] bigint not null,
	[tenthuong] nvarchar(15) not null,
	[tienthuong] float not null,
primary key ([mathuong])
) 
go

create table [nhanvien]
(
	[manhanvien] bigint not null,
	[tennhanvien] nvarchar(30) not null,
	[gioitinh] bit null,
	[ngaysinh] datetime null,
	[diachi] nvarchar(50) null,
	[chucvu] nvarchar(30) null,
	[trinhdo] nvarchar(30) null,
	[maphong] bigint not null,
	[mahesoluong] bigint not null,
primary key ([manhanvien])
) 
go

create table [chamcong]
(
	[macong] bigint not null,
	[thang] integer null,
	[nam] integer null,
	[songaylamviec] integer null,
	[sogiolamthem] integer null,
	[tienungtruoc] float null,
	[manhanvien] bigint not null,
primary key ([macong])
) 
go

create table [danhsachphucap]
(
	[maphucap] bigint not null,
	[macong] bigint not null,
primary key ([maphucap],[macong])
) 
go

create table [danhsachthuong]
(
	[mathuong] bigint not null,
	[macong] bigint not null,
primary key ([mathuong],[macong])
) 
go

create table [taikhoan]
(
	[mataikhoan] bigint not null,
	[taikhoan] nvarchar(100) null,
	[matkhau] varchar(100) not null,
	[quyen] integer null,
primary key ([mataikhoan])
) 
go

create table [hocphan]
(
	[mahocphan] bigint not null,
	[tenhocphan] nvarchar(50) null,
primary key ([mahocphan])
) 
go

create table [chamcong_hocphan]
(
	[macong] bigint not null,
	[mahocphan] bigint not null,
	[sotiet] integer null,
primary key ([macong],[mahocphan])
) 
go


alter table [nhanvien] add  foreign key([maphong]) references [phongban] ([maphong])  on update cascade on delete cascade 
go
alter table [nhanvien] add  foreign key([mahesoluong]) references [hesoluong] ([mahesoluong])  on update cascade on delete cascade 
go
alter table [danhsachphucap] add  foreign key([maphucap]) references [phucap] ([maphucap])  on update cascade on delete cascade 
go
alter table [danhsachthuong] add  foreign key([mathuong]) references [thuong] ([mathuong])  on update cascade on delete cascade 
go
alter table [chamcong] add  foreign key([manhanvien]) references [nhanvien] ([manhanvien])  on update cascade on delete cascade 
go
alter table [danhsachphucap] add  foreign key([macong]) references [chamcong] ([macong])  on update cascade on delete cascade 
go
alter table [danhsachthuong] add  foreign key([macong]) references [chamcong] ([macong])  on update cascade on delete cascade 
go
alter table [chamcong_hocphan] add  foreign key([macong]) references [chamcong] ([macong])  on update cascade on delete cascade 
go
alter table [chamcong_hocphan] add  foreign key([mahocphan]) references [hocphan] ([mahocphan])  on update cascade on delete cascade 
go
