package class35;

public abstract class Patient {
    public abstract void takeTylenol();

        public abstract double takePayment ( double originalBalance, double amountReceived);


    }


//abstract classes can not be instantiated, initialized directly
//this is good for cases like BaseIphone vs concrete Iphones like Iphone7
//abstract classes can not be final. =>
//what happens if the class is final? => you cannot extend it. you can not change any values in it.
//Because the whole point of abstract classes is to be extended.
//abstract classes can not be market private.

    //abstract methods do not have any implementation
    //which means we know and require each child class to have a takeTylenol method
    //and should write the specific logic to each child class


//Patient varP = new Patient();
//you declare variable, not an object.
//intialize -> new object, or value(literal values)
//12
//"gdg"

