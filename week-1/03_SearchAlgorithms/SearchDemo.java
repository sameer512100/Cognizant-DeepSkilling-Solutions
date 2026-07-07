public class SearchDemo {

    // Linear search: checks each element one by one
    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == targetId) {
                return i;
            }
        }
        return -1;
    }

    // Binary search: works only on a sorted array
    public static int binarySearch(Product[] sortedProducts, int targetId) {
        int low = 0;
        int high = sortedProducts.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midId = sortedProducts[mid].getProductId();

            if (midId == targetId) {
                return mid;
            } else if (midId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Array used for linear search (not sorted)
        Product[] products = {
            new Product(103, "Keyboard", "Electronics"),
            new Product(101, "Mouse", "Electronics"),
            new Product(105, "Desk Lamp", "Home"),
            new Product(102, "Monitor", "Electronics"),
            new Product(104, "Chair", "Home")
        };

        // Sorted array (by productId) used for binary search
        Product[] sortedProducts = {
            new Product(101, "Mouse", "Electronics"),
            new Product(102, "Monitor", "Electronics"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Chair", "Home"),
            new Product(105, "Desk Lamp", "Home")
        };

        int targetId = 104;

        int linearIndex = linearSearch(products, targetId);
        System.out.println("Linear search result: " +
                (linearIndex != -1 ? products[linearIndex] : "Not found"));

        int binaryIndex = binarySearch(sortedProducts, targetId);
        System.out.println("Binary search result: " +
                (binaryIndex != -1 ? sortedProducts[binaryIndex] : "Not found"));
    }
}
