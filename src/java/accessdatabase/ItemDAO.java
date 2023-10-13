/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessdatabase;

import BasicObj.Item;
import MyLib.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.jasper.tagplugins.jstl.core.Catch;

/**
 *
 * @author 84398
 */
public class ItemDAO {

    public static ArrayList<Item> getAllItems() throws Exception {
        Connection cn = DBUtils.makeConnection();
        ArrayList<Item> list = new ArrayList<>();
        if (cn != null) {
            String sql = "select id,name,price,type from dbo.Item";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int price = rs.getInt("price");
                    int type = rs.getInt("type");
                    Item it = new Item(id, name, price, type);
                    list.add(it);
                }
            }
        }
        return list;
    }

    public static ArrayList<Item> getAllItem(String a) throws Exception {
        Connection cn = DBUtils.makeConnection();
        ArrayList<Item> list = new ArrayList<>();
        if (cn != null) {
            String sql = "select id,name,price,type from dbo.Item where type = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, a);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int price = rs.getInt("price");
                    int type = rs.getInt("type");
                    Item ItemList = new Item(id, name, price, type);
                    list.add(ItemList);
                }
            }
        }
        return list;
    }

    public static Item getItemByID(String b) throws Exception {
        ArrayList<Item> list = getAllItems();
        int id = Integer.parseInt(b);
        for (Item i : list) {
            if (i.getItemID() == id) {
                return i;
            }
        }
        return null;
    }

    public static int EditItem(String id, String name, String price) throws Exception {
        int kq = 0;
        Connection cn = DBUtils.makeConnection();
        if (cn != null) {
            String sql = "update [dbo].[Item] set name = ?, price = ? where id = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, price);
            pst.setString(3, id);
            kq = pst.executeUpdate();
            cn.close();
        }
        return kq;
    }
}
