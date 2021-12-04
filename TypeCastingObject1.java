public class Animal {
    public void eat()
    {
        System.out.println("Animal eats fruits");
    }
}
--------------------
public class Monkey extends Animal{
 
    public static void main(String[] args) 
    {
        //Child class object
        Monkey monkey_obj = new Monkey();
         
        //Child class object converted into Parent Class Object
        Animal animal_obj = monkey_obj;
 
        animal_obj.eat();
        //animal_obj.stay(); Parent class object can't access child class own methods.
         
        //Parent class object converted into child class object
        Monkey monkey_obj1 = (Monkey)animal_obj;
        monkey_obj1.stay();
    }
     
    public void eat()
    {
        System.out.println("Monkey eats banana");
    }
     
    public void stay()
    {
        System.out.println("Monkey staying at kutralam");
    }   
}
-------------------
Output:
Monkey eats banana
Monkey staying at kutralam