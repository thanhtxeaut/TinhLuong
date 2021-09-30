/*

 */
package tinhluong;

public class NVDH extends NV {
    // attribute
    private float luongCB, phuCap;
    
    // constructor
    public NVDH(){}
    public NVDH(String maNV, String tenNV, int namSinh, float luongCB, float phuCap){
        super(maNV, tenNV,namSinh);
        this.luongCB = luongCB;
        this.phuCap = phuCap;
    }
    // set-get
    public void SetLuongCB(float luongCB){
        this.luongCB = luongCB;
    }
    public float GetLuongCB(){
        return this.luongCB;
    }
    public void SetPhuCap(float phuCap){
        this.phuCap = phuCap;
    }
    public float GetPhuCap(){
        return this.phuCap;
    }
    // tinh luong
    public float TinhLuong(){
        return this.GetLuongCB()+this.GetPhuCap();
    }
    // tostring
    @Override
    public String ToString(){
        String str = super.ToString() +"\n + Luong thang: "+TinhLuong();
        return str;
    }
}
