package hello;

public class Greeting {

    private final long added;

    public Greeting(String num1, String num2){
        int i1 = Integer.parseInt(num1);
        int i2 = Integer.parseInt(num2);

        int sum = i1+i2;
        this.added = sum;
    }

    public long getId() {
        return added;
    }

}
