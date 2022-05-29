create function onLoginEvent(@TaiKhoan nvarchar(100), @MatKhau varchar(100))
returns int
as
begin

	if (not exists(select * from taikhoan where taikhoan = @TaiKhoan and matkhau = @MatKhau))
		return -1
	else
		declare @quyen int = (select quyen from taikhoan where taikhoan = @TaiKhoan and matkhau = @MatKhau)
		return @quyen
end

insert into taikhoan values()