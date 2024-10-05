package Problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        owner = newCardHolder;
        creditLimit = new Money(limit); // Use copy constructor for limit
        balance = new Money(0); // Initial balance is set to 0
    }

    public Money getBalance() {
        return new Money(balance); // Return a copy of the balance
    }

    public Money getCreditLimit() {
        return new Money(creditLimit); // Return a copy of the credit limit
    }

    public String getPersonals() {
        return owner.toString(); // Return the owner's information
    }

    public void charge(Money amount) {
        if (amount.compareTo(new Money(0)) < 0) { // Check if charge amount is negative
            throw new IllegalArgumentException("Charge amount cannot be negative.");
        } else if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount); // Update the balance
            System.out.println("Charge: " + amount);
        
        }
        else {
            System.out.println("Credit limit exceeded. Transaction declined.");
        }
    }
// Method to make a payment towards the credit card balance
public void payment(Money amount) {
    if (amount.compareTo(new Money(0)) < 0) {
        throw new IllegalArgumentException("Payment amount cannot be negative.");
    }

    // Check if the payment exceeds the balance
    if (amount.compareTo(balance) >= 0) {
        Money excessAmount = amount.subtract(balance); 
        balance = new Money(0); // Set balance to 0
        
        // // Update credit limit by adding the excess amount
        // creditLimit = creditLimit.add(excessAmount);
        System.out.println("Balance has been paid off. The remaining amount will be returned: " + excessAmount);
        // System.out.println("New credit limit: " + creditLimit);
    } else {
        // If the payment doesn't exceed the balance, simply subtract
        balance = balance.subtract(amount);         
        System.out.println("Payment: " + amount);
    }
}

}
