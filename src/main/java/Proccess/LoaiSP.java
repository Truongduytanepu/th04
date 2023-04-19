/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proccess;
import java.sql.*;
import Database.Connect;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AD
 */

public class LoaiSP {
    public Connect cn= new Connect();
    //Truy van tat ca du lieu trong Table LoaiSP
    public List<LoaiSanPham> getLoaiSP() throws SQLException{
        List<LoaiSanPham> lst = new ArrayList<LoaiSanPham>();
        String sql = "SELECT * FROM LoaiSP";
        Connect cn = new Connect();
        Connection db = cn.getConnect();
        PreparedStatement st = db.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            LoaiSanPham obj = new LoaiSanPham();
            obj.setMaLoai(rs.getString("MaLoai"));
            obj.setTenLoai(rs.getString("TenLoai"));
            lst.add(obj);
        }
        st.close();
        db.close();
        return lst;
    }
    //Them moi 1 dong du lieu vao table LoaiSP
    public boolean InsertData(LoaiSanPham obj) throws SQLException{
        try{
            String sql = "INSERT INTO LoaiSP (Maloai, Tenloai) values(?, ?)";
            Connect cn = new Connect();
            Connection db = cn.getConnect();
            PreparedStatement st = db.prepareStatement(sql);
            // Thực thi truy vấn
            st.setString(1, obj.getMaLoai());
            st.setString(2, obj.getTenLoai());
            int check = st.executeUpdate();
            st.close();
            db.close();
            if(check == 1){
                return true;
            }
        }
        catch(Exception ex){
            System.out.println("Loi: " + ex.getMessage());
        }
        return false;
    }
    
    //Dieu chinh 1 dong du lieu vao table LoaiSP
        public boolean EditData(LoaiSanPham obj) throws SQLException{
            try{
                String sql = "Update LoaiSP set Tenloai=? where Maloai=?";
                Connect cn = new Connect();
                Connection db = cn.getConnect();
                // Thực thi truy vấn
                PreparedStatement st = db.prepareStatement(sql);
                // Thực thi truy vấn
                st.setString(1, obj.getTenLoai());
                st.setString(2, obj.getMaLoai());
                int check = st.executeUpdate();
                st.close();
                db.close();
                if(check == 1){
                    return true;
                }
            }
            catch(Exception ex){
                System.out.println("Loi: " + ex.getMessage());
            }
        return false;
    }
    
    //Xoa 1 dong du lieu vao table LoaiSP
        public boolean DeleteData(String ml) throws SQLException{
        String sql = "Delete from LoaiSP where Maloai=?";
        Connect cn = new Connect();
        Connection db = cn.getConnect();
        // Thực thi truy vấn
        PreparedStatement st = db.prepareStatement(sql);
        // Thực thi truy vấn
        st.setString(1, ml);
        int check = st.executeUpdate();
        st.close();
        db.close();
        if(check == 1){
            return true;
        }
        return false;
    }
        
}
