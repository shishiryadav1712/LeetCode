// Lemonade Change
class Solution {
    public boolean lemonadeChange(int[] bills) {
        // Initialize counters for five and ten dollar bills
        int fiveDollarBills = 0;
        int tenDollarBills = 0;
      
        // Iterate over each bill in the array
        for (int bill : bills) {
            // Use switch-case to handle different bill values
            switch (bill) {
                case 5:
                    // If it's a $5 bill, no change is needed, increase count of $5 bills
                    fiveDollarBills++;
                    break;
                case 10:
                    // For a $10 bill, we need to give one $5 bill as change
                    tenDollarBills++;        // Increase $10 bills
                    fiveDollarBills--;       // Reduce $5 bills as we give it as change
                    break;
                case 20:
                    // For a $20 bill, prefer to give one $10 and one $5 as change if possible
                    if (tenDollarBills > 0) {
                        tenDollarBills--;     // Use a $10 bill for change
                        fiveDollarBills--;    // Use a $5 bill for change
                    } else {
                        // If no $10 bills, we need to give three $5 bills as change
                        fiveDollarBills -= 3;
                    }
                    break;
            }
            // If at any point we do not have enough $5 bills to give as change, return false
            if (fiveDollarBills < 0) {
                return false;
            }
        }
        // If we can make change for all customers, return true
        return true;
    }
}
