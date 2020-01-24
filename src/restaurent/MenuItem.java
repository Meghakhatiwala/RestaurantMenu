package restaurent;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double aPrice, String aDecsc, String aCategory) {
        this.price = aPrice;
        this.description = aDecsc;
        this.category = aCategory;
        this.isNew = true;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return this.description;
    }
    public void SetDescriptin(String aDescription) {
        this.description = aDescription;
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String aCategory) {
        this.category = aCategory;
    }
    public boolean isNew () {
        return this.isNew;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
