use master
go

create database QuanLyLuongThuong
go

use QuanLyLuongThuong
go


Create table [HESOLUONG]
(
	[MAHESOLUONG] Bigint NOT NULL,
	[HESOLUONG] Float NOT NULL,
Primary Key ([MAHESOLUONG])
) 
go

Create table [PHONGBAN]
(
	[MAPHONG] Bigint NOT NULL,
	[TENPHONG] Nvarchar(30) NOT NULL,
	[TEN_TRUONGPHONG] Nvarchar(30) NULL,
Primary Key ([MAPHONG])
) 
go


Create table [THUONG]
(
	[MATHUONG] Bigint NOT NULL,
	[TENTHUONG] Nvarchar(15) NOT NULL,
	[TIENTHUONG] Float NOT NULL,
Primary Key ([MATHUONG])
) 
go


Create table [PHUCAP]
(
	[MAPHUCAP] Bigint NOT NULL,
	[TIENPHUCAP] Float NOT NULL,
	[TENPHUCAP] Nvarchar(30) NOT NULL,
Primary Key ([MAPHUCAP])
) 
go



Create table [NHANVIEN]
(
	[MANHANVIEN] Bigint NOT NULL,
	[MATHUONG] Bigint NOT NULL,
	[MAPHONG] Bigint NOT NULL,
	[MAPHUCAP] Bigint NOT NULL,
	[MAHESOLUONG] Bigint NOT NULL,
	[TENNHANVIEN] Nvarchar(30) NOT NULL,
	[GIOITINH] Bit NULL,
	[NGAYSINH] Datetime NULL,
	[DIACHI] Nvarchar(50) NULL,
	[CHUCVU] Nvarchar(30) NULL,
	[TRINHDO] Nvarchar(30) NULL,
	Primary Key ([MANHANVIEN])
) 
go


Create table [CHAMCONG]
(
	[MACONG] Bigint NOT NULL,
	[THANG] Integer NULL,
	[SONGAYLAMVIEC] Integer NULL,
	[SOGIOLAMTHEM] Integer NULL,
	[HESOLUONG] Float NULL,
	[TIENTHUONG] Float NULL,
	[TIENPHUCAP] Float NULL,
	[TIENUNGTRUOC] Float NULL,
	[MANHANVIEN] Bigint NOT NULL,
	Primary Key ([MACONG])
) 
go
