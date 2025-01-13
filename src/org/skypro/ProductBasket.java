package org.skypro;

 class ProductBasket {
    private final Product[] products;
    int size;

     public ProductBasket() {
        this.products = new Product[5];
    }

    public void addProduct(String name, int price) {
        if (size < products.length){
            Product newProduct = new Product(name, price);
            products[size++] = newProduct;}
        else {
            System.out.println("Невозможно добавить продукт");}}


    public void printAllname() {
        for (int i = 0; i < size; i++) {
            Product product = products[i];
            System.out.println(product.getName());
        }}

        public void printAllPrice() {
            for (int i = 0; i < size; i++) {
                Product product = products[i];
                System.out.println(product.getPrice());
    }}
     public void printAllSumma() {
         for (int i = 0; i < size; i++) {
             Product product = products[i];
             System.out.println(product.getName() + " : "+ product.getPrice());
         }

         int summa = 0;
         int i = 0;
         do{ for (i = 0; i < size; i++) {
            Product productX = products[i];
            summa = summa + productX.getPrice();}}
            while (i > size);
            System.out.println("Итого: " + summa);
     }
     boolean findName(String name) {
         Product product = null;
         for (int i = 0; i < size; i++) {
             product = products[i];
             if (name.equals(product.getName())) {
                 return true;
             } else {
                 return false;
             }
         }
         return false;
     }
     public void cleaning() {
         for (int i = 0; i < products.length; i++) {
             products[i] = null;
         System.out.println(products[i]);}
 }}