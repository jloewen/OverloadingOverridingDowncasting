package Override;

public class Dog extends Animal {
    
    @Override
    public void move(){
        System.out.println("Dogs can walk and run");
    }
}