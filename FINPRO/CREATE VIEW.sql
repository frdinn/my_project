CREATE VIEW MyTransaksi AS
SELECT PELANGGAN.Id_Pelanggan,
	PELANGGAN.Nama_Pelanggan,
	PELANGGAN.No_rekening,
	PELANGGAN.Email,
	DETAIL_TRANSAKSI.Tgl_Transaksi,
	DETAIL_TRANSAKSI.PaymentType,
	TRANSAKSI.Total_Harga
FROM PELANGGAN JOIN PICKUP
ON PELANGGAN.Id_Pelanggan = PICKUP.Id_Pelanggan
JOIN TRANSAKSI
ON TRANSAKSI.Id_Pickup =PICKUP.Id_Pickup
JOIN DETAIL_TRANSAKSI
ON DETAIL_TRANSAKSI.Id_Transaksi = TRANSAKSI.Id_Transaksi

SELECT * FROM MyTransaksi

CREATE VIEW JasaPemilah AS
SELECT PELANGGAN.Id_Pelanggan,
	PELANGGAN.Nama_Pelanggan,
	PELANGGAN.Keterangan,
	SAMPAH.Jenis_Sampah,
	PEMILAH.Biaya_Pemilah
FROM PELANGGAN JOIN PICKUP
ON PELANGGAN.Id_Pelanggan = PICKUP.Id_Pelanggan
JOIN SAMPAH
ON SAMPAH.Id_Sampah = PICKUP.Id_Sampah
JOIN PEMILAH
ON PEMILAH.Id_Sampah = PICKUP.Id_Sampah

SELECT * FROM JasaPemilah

CREATE VIEW PickUpData AS
SELECT KARYAWAN.Id_Karyawan,
	KARYAWAN.Nama_Karyawan,
	Detail_Pickup.Tgl_Pickup,
	Detail_Pickup.Total_Berat,
	Detail_Pickup.Waktu,
	SAMPAH.Jenis_Sampah
FROM KARYAWAN JOIN PICKUP
ON KARYAWAN.Id_Karyawan = PICKUP.Id_Karyawan
JOIN Detail_Pickup
ON Detail_Pickup.Id_Pickup = PICKUP.Id_Pickup
JOIN SAMPAH
ON SAMPAH.Id_Sampah = PICKUP.Id_Sampah

SELECT * FROM PickUpData

CREATE PROCEDURE banyaktransaksi
as
select 
	PELANGGAN.Nama_Pelanggan,
COUNT(TRANSAKSI.Id_Transaksi) as [Jumlah Transaksi]
FROM TRANSAKSI join PICKUP
on TRANSAKSI.Id_Pickup = PICKUP.Id_Pickup
JOIN PELANGGAN
ON PELANGGAN.Id_Pelanggan = PICKUP.Id_Pelanggan
group by PELANGGAN.Nama_Pelanggan 

EXEC banyaktransaksi

CREATE PROCEDURE PopulerofTrash
as
select 
	SAMPAH.Jenis_Sampah,
COUNT(SAMPAH.Id_Sampah) as [Total Sampah]
FROM SAMPAH
group by SAMPAH.Jenis_Sampah

EXEC PopulerofTrash

CREATE PROCEDURE JamKerja
as
select 
	KARYAWAN.Nama_Karyawan,
COUNT(KARYAWAN.Id_Karyawan) as [Total Jam Kerja]
FROM KARYAWAN
group by KARYAWAN.Nama_Karyawan

EXEC JamKerja