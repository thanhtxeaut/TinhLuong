/*
class: NVTV (nhan vien thoi vu)
 */
package tinhluong;


public class NVTV extends NV{
    // attribute
    private int soNgayCong;
    private float donGia;
    // constructor
    public NVTV(){}
    public NVTV(String maNV, String tenNV, int namSinh, int soNgayCong, float donGia){
        super(maNV, tenNV, namSinh);
        this.donGia = donGia;
        this.soNgayCong = soNgayCong;
    }
    // set - get
    public void SetSoNgayCong(int soNgayCong){
        this.soNgayCong= soNgayCong;
    }
    public int GetSoNgayCong(){
        return this.soNgayCong;
    }
    public void SetDonGia(float donGia){
        this.donGia = donGia;
    }
    public float GetDonGia(){
        return this.donGia;
    }
    // tinh luong
    public float TinhLuong(){
        return this.GetSoNgayCong()*this.GetDonGia();
    }
    // tostring
    @Override
    public String ToString(){
        String str = super.ToString()+"\n + Luong thang: "+TinhLuong();
        return str;
    }
    
}
