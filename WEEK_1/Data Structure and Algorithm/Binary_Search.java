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
public class Binary_Search {
    public static void sortProducts(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].productId > products[j + 1].productId) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }
 public static Product binarySearch(Product[] products, int id) {
        int l = 0;
        int h = products.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (products[m].productId == id)
                return products[m];
            else if (products[m].productId < id)
                l = m + 1;
            else
                h = m - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(104, "Watch", "Accessories"),
            new Product(101, "Laptop", "Electronics"),
            new Product(105, "Book", "Education"),
            new Product(103, "Phone", "Electronics"),
            new Product(102, "Shoes", "Fashion")
        };
        sortProducts(products);
        Product result = binarySearch(products, 104);
        System.out.println("Search Result:");
        if (result != null)
            result.display();
        else
            System.out.println("Product not found");
    }
}
