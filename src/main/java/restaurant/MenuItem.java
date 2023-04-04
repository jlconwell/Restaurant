package restaurant;

import java.util.Date;

public class MenuItem {

    private String foodName;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date introDate;

    public MenuItem(String name, double price, String description, String category) {
        this.category = category;
        this.foodName = name;
        this.description = description;
        this.price = price;
        this.introDate = new Date();
        this.isNew = true;
    }

    public String getName() {
        return foodName;
    }

    public void setName(String name) {
        this.foodName = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Date getIntroDate() {
        return introDate;
    }

    public void setIntroDate(Date introDate) {
        this.introDate = introDate;
    }
}
