package cau2;

public class KyThuat extends NhanVien {
    private String chuyenNganh;

    public KyThuat(String maNhanVien, String hoTen) {
        super(maNhanVien, hoTen);
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String address, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, address);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String moTaCongViec() {
        return "lam viec voi cac van de ve ky thuat ";
    }

    @Override
    public String toString() {
        return "KyThuat[" + super.toString() +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                ']';
    }
}
