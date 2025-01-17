package restaurent;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastModified;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu()
     {
         this.lastModified = new Date();
     }

    public Date getLastModified()
     {
         return this.lastModified;
     }

    public void setLastModified(Date aLastModified) {
        this.lastModified = aLastModified;
    }

    public ArrayList<MenuItem> getMenuitems() {
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> aMenuitems) {
        ArrayList<MenuItem> aMenuItemsList;
        this.menuItems = aMenuitems;
    }

    public void addMenuItems(MenuItem aMenuItem){
         this.menuItems.add(aMenuItem);
         this.lastModified = new Date();
    }

    public void removeMenuItem(int aMenuItemIndex) {
         this.menuItems.remove(aMenuItemIndex);
         this.lastModified = new Date();
    }

    public void updateMenuItem(int aMenuItemIndex, MenuItem aMenuItem) {
         this.menuItems.set(aMenuItemIndex, aMenuItem);
         this.lastModified =new Date();
    }
}
