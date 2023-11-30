package com.ibookshop.data;

public class BookHome {
    private String TenSach;
    private String TenTacGia;
    private String urlImage;
    private int Gia;
    private int SoTrang;
    private String ngayPhatHanh;
    private String ngonNgu;
    private String theLoai;
    private String moTa;
    public BookHome() {
    }

    public BookHome(String tenSach, String tenTacGia, String urlImage) {
        TenSach = tenSach;
        TenTacGia = tenTacGia;
        this.urlImage = urlImage;
    }

    public BookHome(String tenSach, String tenTacGia, String urlImage, int gia, int soTrang, String ngayPhatHanh, String ngonNgu, String theLoai, String moTa) {
        TenSach = tenSach;
        TenTacGia = tenTacGia;
        this.urlImage = urlImage;
        Gia = gia;
        SoTrang = soTrang;
        this.ngayPhatHanh = ngayPhatHanh;
        this.ngonNgu = ngonNgu;
        this.theLoai = theLoai;
        this.moTa = moTa;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        TenTacGia = tenTacGia;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
