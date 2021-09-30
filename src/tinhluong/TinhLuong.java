/*

 */
package tinhluong;

public class TinhLuong {

    public static void main(String[] args) {
        
        // khai bao doi tuong NV
        NVTV nv;
        // khoi tao
        nv = new NVTV();
        nv.setNamSinh(2000);
        nv.SetMaNV("0001");
        nv.SetTenNV("Nguyen van a");
        nv.SetDonGia(200000);
        nv.SetSoNgayCong(24);
        
        // in thong tin
        System.out.print("\n "+ nv.ToString());
        
    }
    
}
