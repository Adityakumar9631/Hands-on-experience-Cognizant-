
class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
    }
}

public class LinearSearch {
     public static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }
        return null;
    }
    public static void main(String[] args) {
         Product[] products = {
            new Product(105, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(104, "Phone", "Electronics"),
            new Product(103, "Watch", "Accessories"),
            new Product(101, "Book", "Education")
        };

        Product result = linearSearch(products, 104);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found");
    }
}
    

