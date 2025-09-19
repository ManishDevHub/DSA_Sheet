import java.util.*;

public class StackAll {

    public static void main(String[] args) {
        
        Stack<String> animal = new Stack<>();
        animal.push("Dog");
        animal.push("cat");
        animal.push("Cow");
        animal.push("Goat");
System.out.println(animal);
// System.out.println(animal.peek());
animal.pop();
System.out.println(animal.peek());


    }
    
}
