class NhanVien {
    
    String tenNhanVien;
    double luongCoBan;
    double hesoLuong;
    double luongMax;

    NhanVien(String tenNhanVien, double luongCoBan, double hesoLuong, double luongMax) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.hesoLuong = hesoLuong;
        this.luongMax = luongMax;
    }

    boolean tangLuong(double hesoLuong) {
        if (this.hesoLuong + hesoLuong <= this.luongMax) {
            this.hesoLuong += hesoLuong;
            return true;
        }
        return false;
    }

    double tinhLuong() {
        return this.luongCoBan * this.hesoLuong;
    }

    void inThongTin() {
        System.out.println("Ten nhan vien: " + this.tenNhanVien);
        System.out.println("Luong co ban: " + this.luongCoBan);
        System.out.println("He so luong: " + this.hesoLuong);
        System.out.println("Luong: " + this.tinhLuong());
    }
}

class TestNV {

    public static void main(String[] args) {

    NhanVien nv1 = new NhanVien("Nguyen Van A", 1000000, 2.67, 20000000);
    NhanVien nv2 = new NhanVien("Nguyen Van B", 2000000, 2.67, 20000000);
    
    }
}