public class Sach {
    public static int soLuong = 0;
    private String tieuDe;
    private String tacGia;
    private String theLoai;
    private String ngayXB;
    public Sach(){

    }
    public Sach(String tieuDe, String tacGia, String theLoai, String ngayXB) {
        soLuong++;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.ngayXB = ngayXB;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTieuDe() {

        return tieuDe;
    }

    public void setTacGia(String tacGia) {

        this.tacGia = tacGia;
    }

    public String getTacGia() {

        return tacGia;
    }

    public void setTheLoai(String theLoai) {

        this.theLoai = theLoai;
    }

    public String getTheLoai() {

        return theLoai;
    }

    public void setNgayXB(String ngayXB) {

        this.ngayXB = ngayXB;
    }

    public String getNgayXB() {

        return ngayXB;
    }
    public boolean soSanh(String x){
        if(x.equals(tieuDe) || x.equals(tacGia) || x.equals(theLoai) || x.equals(ngayXB)){
            return true;
        }
        else return false;
    }
}
