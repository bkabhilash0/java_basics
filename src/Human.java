public class Human {
    String name = "Abhilash";
    static String ROLE = "ADMIN";

    void printInfo(){
        String name = "Local Scope";
        System.out.println("My name is "+this.name);
        System.out.println(this.ROLE);
    }

    static void myFun(){
        System.out.println("Static Function");
    }

    public static void main(String[] args) {
        Human obj = new Human();
        obj.printInfo();
        System.out.println(obj.name);
        System.out.println(Human.ROLE);
        Human.myFun();
    }
}
