#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Product
{
public:
    int productId;
    string productName;
    string category;

    Product(int id, string name, string cat)
    {
        productId = id;
        productName = name;
        category = cat;
    }
};

Product *linearSearch(vector<Product> &products, int key)
{
    for (int i = 0; i < products.size(); i++)
    {
        if (products[i].productId == key)
            return &products[i];
    }
    return nullptr;
}

bool compare(Product a, Product b)
{
    return a.productId < b.productId;
}

Product *binarySearch(vector<Product> &products, int key)
{
    int low = 0;
    int high = products.size() - 1;

    while (low <= high)
    {
        int mid = low + (high - low) / 2;

        if (products[mid].productId == key)
            return &products[mid];

        if (products[mid].productId < key)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return nullptr;
}

int main()
{

    vector<Product> products = {
        Product(105, "Laptop", "Electronics"),
        Product(101, "Shoes", "Fashion"),
        Product(109, "Watch", "Accessories"),
        Product(103, "Phone", "Electronics"),
        Product(107, "Bag", "Fashion")};

    int key;

    cout << "Available Product IDs: 101, 103, 105, 107, 109" << endl;
    cout << "Enter Product ID to search: ";
    cin >> key;

    cout << "\n----- Linear Search -----" << endl;

    Product *p1 = linearSearch(products, key);

    if (p1)
    {
        cout << "Product Found" << endl;
        cout << "Product ID   : " << p1->productId << endl;
        cout << "Product Name : " << p1->productName << endl;
        cout << "Category     : " << p1->category << endl;
    }
    else
    {
        cout << "Product Not Found" << endl;
    }

    sort(products.begin(), products.end(), compare);

    cout << "\n----- Binary Search -----" << endl;

    Product *p2 = binarySearch(products, key);

    if (p2)
    {
        cout << "Product Found" << endl;
        cout << "Product ID   : " << p2->productId << endl;
        cout << "Product Name : " << p2->productName << endl;
        cout << "Category     : " << p2->category << endl;
    }
    else
    {
        cout << "Product Not Found" << endl;
    }

    cout << "\n----- Time Complexity Analysis -----" << endl;
    cout << "Linear Search:" << endl;
    cout << "Best Case    : O(1)" << endl;
    cout << "Average Case : O(n)" << endl;
    cout << "Worst Case   : O(n)" << endl;

    cout << "\nBinary Search:" << endl;
    cout << "Best Case    : O(1)" << endl;
    cout << "Average Case : O(log n)" << endl;
    cout << "Worst Case   : O(log n)" << endl;

    cout << "\nConclusion:" << endl;
    cout << "Binary Search is more suitable for large e-commerce platforms because it "
            "searches much faster (O(log n)) than Linear Search (O(n)). "
            "However, Binary Search requires the products to be sorted by Product ID."
         << endl;

    return 0;
}