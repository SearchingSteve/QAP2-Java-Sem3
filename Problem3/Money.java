package Problem3;

public class Money {
    private long dollars;
    private long cents;

    // Constructor
    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Money amount cannot be negative");
        }
        dollars = (long) amount;
        cents = Math.round((amount - dollars) * 100);
    }

    // Copy Constructor
    public Money(Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Methods
    public Money add(Money otherAmount){
        return new Money(this.dollars + otherAmount.dollars + (this.cents + otherAmount.cents) / 100.0);
    }

    public Money subtract(Money otherAmount){
        return new Money(this.dollars - otherAmount.dollars + (this.cents - otherAmount.cents) / 100.0);
    }

    public int compareTo(Money otherObject){
        if (this.dollars == otherObject.dollars && this.cents == otherObject.cents){
            return 0;
        } else if (this.dollars > otherObject.dollars || (this.dollars == otherObject.dollars && this.cents > otherObject.cents)){
            return 1;
        } else {
            return -1;
        }
    }

    public boolean equals(Money otherObject){
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
