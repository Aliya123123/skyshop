package org.skypro;

 class HELP {
    private final Product[] Products;
    int size;

     public HELP() {
        this.Products = new Product[5];
    }

    public void addProduct(String name, int price) {
        if (size > Products.length) {
            System.out.println("Невозможно добавить продукт");
        }
        Product newProduct = new Product(name, price);
        Products[size++] = newProduct;
    }

    public void printAllname() {
        for (int i = 0; i < size; i++) {
            Product product = Products[i];
            System.out.println(product.getName());
        }}

        public void printAllPrice() {
            for (int i = 0; i < size; i++) {
                Product product = Products[i];
                System.out.println(product.getPrice());
    }}
     public void printAllSumma() {
         for (int i = 0; i < size; i++) {
             Product product = Products[i];
             System.out.println(product.getName() + " : "+ product.getPrice());
         }

         int summa = 0;
         int i = 0;
         do{ for (i = 0; i < size; i++) {
            Product productX = Products[i];
            summa = summa + productX.getPrice();}}
            while (i > size);
            System.out.println("Итого: " + summa);
     }
     boolean findName(String name) {
         Product product = null;
         for (int i = 0; i < size; i++) {
             product = Products[i];
             if (name.equals(product.getName())) {
                 return true;
             } else {
                 return false;
             }
         }
         return false;
     }
     public void cleaning() {
         for (int i = 0; i < Products.length; i++) {
             Products[i] = null;
         System.out.println(Products[i]);}
 }}