package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {


    private Date dateLastUpdated = new Date();

    private ArrayList<MenuItem> items = new ArrayList<>();


    public Menu() {

    }

    public void addItem(MenuItem item) {
        items.add(item);
        dateLastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        dateLastUpdated = new Date();
    }
}
