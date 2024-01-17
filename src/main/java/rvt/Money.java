package rvt;

public class Money {


    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

      
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    
    
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros(); 
        int newCents = this.cents + addition.cents();

        return new Money(newEuros, newCents);
    }

    public Money Minus(Money decreaser){
        int newEuros = this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();

        return new Money(newEuros, newCents);
    }
    
    public boolean LessThan(Money compared){
          
         int a = this.euros + this.cents;
         int b  = compared.euros() + compared.cents();
         return a < b;
         
    
    }
   
    

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}