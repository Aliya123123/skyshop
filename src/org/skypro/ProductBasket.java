package org.skypro;

 class ProductBasket {
    private final Product[] products;
    int size;

     public ProductBasket() {
        this.products = new Product[5];
    }

    public void addProduct(String name, int price) {
        if (size > 5 ) {
            System.out.println("Невозможно добавить продукт");
        }
        else {
            Product newProduct = new Product(name, price);
            products[size++] = newProduct;}}


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
         for (i = 0; i < size; i++) {
             summa += products[i].getPrice();
         }
         System.out.println("Итого: " + summa);
         return;
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