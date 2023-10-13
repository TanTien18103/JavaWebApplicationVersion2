/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicObj;

/**
 *
 * @author 84398
 */
public class Types {
    private int TypesID;
    private String TypesName;
    private int TypesStattus;

    public Types(int TypesID, String TypesName, int TypesStattus) {
        this.TypesID = TypesID;
        this.TypesName = TypesName;
        this.TypesStattus = TypesStattus;
    }

    public int getTypesID() {
        return TypesID;
    }

    public void setTypesID(int TypesID) {
        this.TypesID = TypesID;
    }

    public String getTypesName() {
        return TypesName;
    }

    public void setTypesName(String TypesName) {
        this.TypesName = TypesName;
    }

    public int getTypesStattus() {
        return TypesStattus;
    }

    public void setTypesStattus(int TypesStattus) {
        this.TypesStattus = TypesStattus;
    }
    
}
