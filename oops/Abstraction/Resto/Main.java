package Abstraction.Resto;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        FoodItem pizza = new Pizza();
        FoodItem burger = new Burger();
        FoodItem coldDrink = new ColdDrink();

        restaurant.serveFood(pizza);
        restaurant.serveFood(burger);
        restaurant.serveFood(coldDrink);
    }
}
