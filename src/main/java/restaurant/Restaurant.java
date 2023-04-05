package restaurant;

public class Restaurant {

    public static void main(String[] args) {

        Menu first = new Menu();

        MenuItem grilledCheese = new MenuItem("Grilled Cheese", 9.99, "Sweet, golden, cheesy goodness on two pieces of bread grilled to perfection","main course");

        MenuItem caesarSalad = new MenuItem("Caesar Salad", 7.99, "Typical, worthless salad", "appetizer");

        MenuItem chocolateCake = new MenuItem("Chocolate Cake", 8.99, "Yup, chocolate cake", "dessert");

        first.printMenu();

        first.addItem(grilledCheese);
//        first.addItem(grilledCheese);

        first.printMenu();


//        first.addItem(caesarSalad);
//        first.addItem(chocolateCake);
//
//        first.printMenu();
//
//        grilledCheese.isFoodNew();
//
//        first.addItem(grilledCheese);

//        first.removeItem(grilledCheese);

//        first.printMenu();

//        System.out.println(grilledCheese);

//        first.addItem(new MenuItem("BS Pie", 666, "this assignment", "appetizer"));

//        first.printMenu();






    }
}
