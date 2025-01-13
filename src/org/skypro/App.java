package org.skypro;

public class App {
    public static void main(String[] args) {
        ProductBasket app = new ProductBasket();
        app.addProduct("Мед", 300);
        app.addProduct("чипсы", 95);
        app.printAllname();
        System.out.println();
        app.printAllSumma();
        System.out.println();
        app.findName("Мед");
        System.out.println(app.findName("Мед"));
        System.out.println();
        app.findName("Вино");
        System.out.println(app.findName("Вино"));
        System.out.println();
        app.addProduct("Сухари", 160);
        app.addProduct("Семечки", 90);
        app.addProduct("Кефир", 110);
        app.addProduct("Булочка", 20);
        app.printAllname();
        app.cleaning();
        app.printAllname();
        app.printAllSumma();
        app.findName("Мед");
        System.out.println(app.findName("Мед"));
    }
}


