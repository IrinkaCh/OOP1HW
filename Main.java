public class Main {
    public static void main(String[] args) {
        HotDrink cappuccino = new HotDrink("cappuccino", 0.4, true, 75, 120);
        HotDrink americano = new HotDrink("americano", 0.3, true, 75, 110);
        HotDrink coffee = new HotDrink("coffee", 0.2, true, 85, 100);
        HotDrink tea = new HotDrink("tea", 0.3, false, 60, 60);
        HotDrink cocoa = new HotDrink("cocoa", 0.3, true, 80, 80);
        HotDrink hotChocolate = new HotDrink("hotChocolate", 0.4, true, 80, 120);

        HotDrinksVendingMachine hotDrVenMach = new HotDrinksVendingMachine();
        hotDrVenMach.addHotDrinks(cappuccino);
        hotDrVenMach.addHotDrinks(americano);
        hotDrVenMach.addHotDrinks(coffee);
        hotDrVenMach.addHotDrinks(tea);
        hotDrVenMach.addHotDrinks(cocoa);
        hotDrVenMach.addHotDrinks(hotChocolate);
        System.out.println(hotDrVenMach.getHotDrinks());
        hotDrVenMach.shopHotDrinks();
    }
}