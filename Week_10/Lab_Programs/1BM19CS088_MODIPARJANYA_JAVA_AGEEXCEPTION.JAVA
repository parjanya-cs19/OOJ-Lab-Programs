import java.util.*;

class WrongAge extends Exception {

    public String toString() {
        return "Invalid Age Exception";
    }
}

class Father {
    int father_age;

    Father(int a) throws WrongAge {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Father's age:");
        father_age = sc.nextInt();
        if (father_age <= a || father_age < 0 || a < 0) {
            throw new WrongAge();
        }
    }
}

class Son extends Father {
    int son_age;

    Son(int a) throws WrongAge {
        super(a);
        son_age = a;
    }
}

class Main {
    public static void main(String Args[]) {
        System.out.println("Please enter the son's age:");
        try {
            Son s1 = new Son(new Scanner(System.in).nextInt());
        } catch (WrongAge e) {
            System.out.println(e);
        }
    }
}
