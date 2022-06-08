use QuanLyLuongThuong;

-- Creating table
create table TAIKHOAN(
	MATAIKHOAN bigint auto_increment,
    TAIKHOAN varchar(100),
    MATKHAU varchar(100) not null,
    QUYEN int,
	primary key(MATAIKHOAN)
);

create table PHONGBAN(
	MAPHONG bigint auto_increment,
    TENPHONG varchar(30) not null,
    TEN_TRUONGPHONG varchar(30),
    primary key(MAPHONG)
);

create table HESOLUONG(
	MAHESOLUONG bigint auto_increment,
    TENHESOLUONG varchar(30),
    HESOLUONG float,
    primary key(MAHESOLUONG)
);

create table THUONG(
	MATHUONG bigint auto_increment,
    TENTHUONG varchar(30),
    TIENTHUONG bigint,
	primary key(MATHUONG)
);

create table HOCPHAN(
	MAHOCPHAN bigint auto_increment,
    TENHOCPHAN varchar(30) not null,
    primary key(MAHOCPHAN)
);

create table PHUCAP(
	MAPHUCAP bigint auto_increment,
    TENPHUCAP varchar(30),
    TIENPHUCAP bigint,
    primary key(MAPHUCAP)
);

create table NHANVIEN(
	MANHANVIEN bigint auto_increment,
    TENNHANVIEN varchar(30),
    GIOITINH bit,
    NGAYSINH datetime,
    DIACHI varchar(30),
    CHUCVU varchar(30),
    TRINHDO varchar(30),
    MAPHONG bigint,
    MAHESOLUONG bigint,
    primary key(MANHANVIEN),
    foreign key(MAPHONG) references PHONGBAN(MAPHONG) on update cascade on delete cascade,
    foreign key(MAHESOLUONG) references HESOLUONG(MAHESOLUONG) on update cascade on delete cascade
);

create table CHAMCONG(
	MACONG bigint auto_increment,
    THANG int,
    NAM int,
    SONGAYLAMVIEC int,
    SOGIOLAMTHEM int,
    TIENUNGTRUOC bigint,
    MANHANVIEN bigint,
    primary key(MACONG),
    foreign key(MANHANVIEN) references NHANVIEN(MANHANVIEN) 
);

create table DANHSACHTHUONG(
	MATHUONG bigint,
    MACONG bigint,
    primary key(MATHUONG, MACONG),
    foreign key(MATHUONG) references THUONG(MATHUONG),
    foreign key(MACONG) references CHAMCONG(MACONG)
);

create table DANHSACHPHUCAP(
	MAPHUCAP bigint,
    MACONG bigint,
    primary key(MAPHUCAP, MACONG),
    foreign key(MAPHUCAP) references PHUCAP(MAPHUCAP),
    foreign key(MACONG) references CHAMCONG(MACONG)
);

create table CHAMCONG_HOCPHAN(
	MACONG bigint,
    MAHOCPHAN bigint,
    SOTIET int,
    primary key(MACONG, MAHOCPHAN),
    foreign key(MACONG) references CHAMCONG(MACONG),
    foreign key(MAHOCPHAN) references HOCPHAN(MAHOCPHAN)
);

alter table NHANVIEN add MATAIKHOAN bigint after MAHESOLUONG;
alter table NHANVIEN add constraint FK_MATK foreign key(MATAIKHOAN) references TAIKHOAN(MATAIKHOAN);
alter table HOCPHAN add SOTINCHI int after TENHOCPHAN;

select * from HOCPHAN