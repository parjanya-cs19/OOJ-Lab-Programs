import java.util.Scanner; 

class Generics<T,S>
{
    T mem1;
    S mem2;

    Generics(T ob1,S ob2)
    {
        this.mem1=ob1;
        this.mem2=ob2;
    }
    public void displayitems()
    {
        System.out.println("The Value of "+this.mem1+" is: "+this.mem2);
    }
}

class Main
{
    public static void main(String args[])
    {
        Generics <String, String> std1=new Generics<String, String>("Name","Parjanya Modi");
        Generics <String, Double> std2=new Generics<String, Double>("Net Worth in Rupees",500.68);
        Generics <String, Integer> std3=new Generics<String, Integer>("Age",19);
        std1.displayitems();
        std2.displayitems();
        std3.displayitems();
    }
}
