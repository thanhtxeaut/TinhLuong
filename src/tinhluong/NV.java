/*
class: NV
 */
package tinhluong;

public class NV {
    // attribute
   private String maNV, tenNV;
   private int namSinh;
   // constructor
   public NV(){}
   public NV(String maNV, String tenNV, int namSinh){
       this.maNV = maNV;
       this.tenNV = tenNV;
       this.namSinh = namSinh;
   }
   // set - get
   public void SetMaNV(String maNV){
       this.maNV = maNV;
   }
   public String GetMaNV(){
       return this.maNV;
   }
   public void SetTenNV(String tenNV){
       this.tenNV = tenNV;
   }
   public String GetTenNV(){
       return this.tenNV;
   }
   public void setNamSinh(int namSinh){
       this.namSinh = namSinh;
   }
   public int GetNamSinh(){
       return this.namSinh;
   }
   // methods
   // toString
   public String ToString(){
       String str = " Thong tin nhan vien: \n"
               + " + Ma nhan vien: "+GetMaNV()+"\n"
               + " + Ten nhan vien: "+GetTenNV()+"\n"
               + " + Nam sinh: "+ GetNamSinh();
       return str;
   }
   
    
    
    
}
