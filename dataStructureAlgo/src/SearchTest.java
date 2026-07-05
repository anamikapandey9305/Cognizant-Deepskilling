public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Camera", "Electronics"),
                new Product(102, "Headphones", "Electronics"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Laptop", "Electronics"),
                new Product(105, "Mouse", "Accessories")
        };

        System.out.println("Linear Search:");
        Product result1 = SearchAlgorithms.linearSearch(products, "Laptop");

        if (result1 != null)
            result1.display();
        else
            System.out.println("Product Not Found");

        System.out.println("\nBinary Search:");
        Product result2 = SearchAlgorithms.binarySearch(products, "Laptop");

        if (result2 != null)
            result2.display();
        else
            System.out.println("Product Not Found");
    }
}

//Big O Notation tells us how much time an algorithm takes as the input size increases.


//For an e-commerce platform, Binary Search is more suitable because:
//
//Products are usually stored in sorted order or indexed.
//It searches much faster than linear search.
//It has a time complexity of O(log n), making it efficient even when there are thousands or millions of products.

