package Problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        owner = newCardHolder;
        creditLimit = new Money(limit); // Use copy constructor for limit
        balance = new Money(0); // Initial balance is set to 0
    }

    // Getter methods
    // Getter method for balance
    public Money getBalance() {
        return new Money(balance);
    }

    // Getter method for credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Method to get the owner's first and last name and home address
    public String getPersonals() {
        return owner.toString();
    }

    // Method to charge the credit card
    public void charge(Money amount) {
        if (amount.compareTo(new Money(0)) < 0) { // Check if charge amount is negative
            throw new IllegalArgumentException("Charge amount cannot be negative.");
        } else if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount); // Update the balance
            System.out.println("Charge: " + amount);

        } else {
            System.out.println("Credit limit exceeded. Transaction declined."); // If charge exeed credit limit
        }
    }

    // Method to make a payment towards the credit card balance
    public void payment(Money amount) {
        if (amount.compareTo(new Money(0)) < 0) {
            throw new IllegalArgumentException("Payment amount cannot be negative.");
        }

        // Check if the payment exceeds the balance
        if (amount.compareTo(balance) >= 0) {
            Money excessAmount = amount.subtract(balance); // Calculate the excess payment amount
            balance = new Money(0); // Set balance to 0
            System.out.println("Balance has been paid off. The remaining amount will be returned: " + excessAmount); 
        } else {
            balance = balance.subtract(amount); // Update the balance
            System.out.println("Payment: " + amount);
        }
    }

}
