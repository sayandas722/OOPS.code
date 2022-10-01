package AnonymousClasses;
/*

Question.

    What is Anonymous Classes ?? ...

Answer.

    Anonymous classes enable you to make your code more concise.
    They enable you to declare and instantiate a class at the same time. They are like local classes except that they do not have a name.
    Use them if you need to use a local class only once.
 */


//  Example : Anonymous Class Implementing an Interface.

//Interface only contains unimplemented methods i.e. methods which doesn't have body..
interface Polygon {
    public void display();
}

// anonymousDemo class implementing interface

class AnonymousDemo {
    public void createClass() {


        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}


public class AnonymousClass {
    public static void main(String[] args) {

        // Method 1 using anonymousDemo class
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();

//        Method 2. Directly make object of polygon class without using anonymousDemo class
        Polygon polygon = new Polygon() {
            @Override
            public void display() {
                System.out.println("Calling Polygon Class without using anonymousDemo class");
            }
        };
    }
}
