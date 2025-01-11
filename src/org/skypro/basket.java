package org.skypro;
class basket {
    public static void main(String[] args) {
        HELP basket = new HELP();
        basket.addProduct("Сыр", 350);
        basket.addProduct("Колбаса",290);
        basket.addProduct("Хлеб", 50);
        basket.addProduct("Молоко", 100);
        basket.addProduct("Конфеты", 185);
        basket.printAllname();
        System.out.println();
        basket.printAllPrice();
        System.out.println();
        basket.printAllSumma();
        basket.findName("Сыр");
        System.out.println(basket.findName("Сыр"));
        basket.cleaning();
}}


