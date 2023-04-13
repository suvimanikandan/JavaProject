public class Main {
    public static void main(String[] args) {
       Pizza basepizza=new Pizza(false);
       basepizza.addExtraToppings();
       basepizza.addExtraCheese();
       basepizza.takeAway();
       basepizza.getBill();

       /*
       Main.DeluxPizza dp=new Main.DeluxPizza(true);
       dp.takeawa();
       dp.getBill();
        */
    }

    public static class DeluxPizza extends Pizza{
        public DeluxPizza(Boolean veg) {
            super(veg);
            super.addExtraCheese();
            super.addExtraToppings();
        }

        @Override
        public void addExtraCheese() {
            super.addExtraCheese();
        }

        @Override
        public void addExtraToppings() {
            super.addExtraToppings();
        }


    }
}