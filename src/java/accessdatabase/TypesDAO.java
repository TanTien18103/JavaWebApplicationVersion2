/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessdatabase;

import BasicObj.Types;
import MyLib.DBUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 84398
 */
public class TypesDAO {

    public static ArrayList<Types> getAllTypes() throws Exception {
        Connection cn = DBUtils.makeConnection();
        ArrayList<Types> list = new ArrayList<>();
        if (cn != null) {
            String sql = "select id,name,status from dbo.Types";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int status = rs.getInt("status");
                    Types TypesList = new Types(id, name, status);
                    list.add(TypesList);
                }
            }
        }
        return list;
    }
}
