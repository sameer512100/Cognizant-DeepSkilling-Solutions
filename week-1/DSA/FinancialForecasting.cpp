#include <iostream>
#include <vector>
using namespace std;

double predictFutureValue(double currentValue, double growthRate, int years)
{
    if (years == 0)
        return currentValue;

    return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
}

int main()
{

    double currentValue, growthRate;
    int years;

    cout << "Enter Current Value: ";
    cin >> currentValue;

    cout << "Enter Annual Growth Rate (%): ";
    cin >> growthRate;

    cout << "Enter Number of Years: ";
    cin >> years;

    growthRate /= 100.0;

    double futureValue = predictFutureValue(currentValue, growthRate, years);

    cout << "\nPredicted Future Value after " << years << " years = " << futureValue << endl;

    cout << "\nTime Complexity: O(n)" << endl;
    cout << "Space Complexity: O(n) (Recursion Stack)" << endl;

    return 0;
}