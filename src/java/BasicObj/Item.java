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
public class Item {

    private int ItemID;
    private String ItemName;
    private int ItemPrice;
    private int ItemType;

    public Item(int ItemID, String ItemName, int ItemPrice, int ItemType) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemType = ItemType;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(int ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public int getItemType() {
        return ItemType;
    }

    public void setItemType(int ItemType) {
        this.ItemType = ItemType;
    }

}
