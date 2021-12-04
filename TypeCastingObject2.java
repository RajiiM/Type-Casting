public class Flower {
 
    public void color()
    {
        System.out.println("Flowers are colorful");
    }
}
-------------------------
public class Rose extends Flower {
 
    public static void main(String[] args) {
    Flower f = new Flower();
    f.color();
    Rose r = new Rose();
     
    //child class object converted into parent class object
    f = r;
    f.color();
     
    //parent class object converted into child class object
     
    //r = f; It throws an error. Mention explicitly
    r = (Rose) f;
    r.smell();
 
    }
 
    public void color()
    {
        System.out.println("Roses are white, red, yellow & pink.");
    }
     
    public void smell()
    {
        System.out.println("Roses give rosy smell");
    }
}
----------------------
Flowers are colorful
Roses are white, red, yellow & pink.
Roses give rosy smell