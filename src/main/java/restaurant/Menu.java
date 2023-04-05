package restaurant;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {


    private Date dateLastUpdated = new Date();

    private ArrayList<MenuItem> items = new ArrayList<>();



    public Menu() {

    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }



    public void addItem(MenuItem item) {
        if (!items.contains(item)){
            items.add(item);
            dateLastUpdated = new Date();
        } else {
            System.out.println("Item already in Menu");
        }
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        dateLastUpdated = new Date();
    }

    public void printMenu() {
        System.out.println("Restaurant Menu" + "\n");
        for (MenuItem menuItem : items) {
            System.out.println(menuItem.toString() + "\n");
        }
        System.out.println("Menu was update on: " + dateLastUpdated);

    }




}
