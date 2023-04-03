import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {

    private Date dateLastUpdated;
    private ArrayList<String> categories = new ArrayList<>("appetizer", "main course", "dessert");

    private ArrayList<MenuItem> items;
    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.dateLastUpdated = new Date();
    }

    public Date getDateLastUpdated() {
        return dateLastUpdated;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}
