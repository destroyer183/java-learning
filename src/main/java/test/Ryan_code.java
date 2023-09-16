package test;

// define a class called cat
class Cat
{
    // define an instance variable called name, this belongs to all instances of the Cat class
    public String name;
    
    // define the constructor for the Cat class, this is a function called when instanciating (making) a new Cat
    public Cat(String name) 
    {
        // set the instance variable name to keep the value given in this function
        this.name = name;
    }
    
    // define a function called meow, all cats have the function meow
    public void meow() 
    {
        
        // print the name of the cat and say it's meowing
        System.out.println(this.name + " Says meow");
    }
}


public class Ryan_code
{
    public static void main(String[] args) 
    {    
        // make a new instance of the class cat
        Cat a = new Cat("Tom");
        Cat b = new Cat("Jerry");
        
        // calling the meow function which belongs to the class cat
        a.meow();
        b.meow();
    }
}