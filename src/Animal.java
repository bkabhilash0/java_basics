public class Animal {
    int legs=4;
    String name="Ale";
    int[] numbers = new int[]{1,2,3,4,5,6};

     Animal(){
        System.out.println("Constructor");
    }

    Animal(String name){
        System.out.println("Constructor 2");
        this.name = name;
    }

    Animal(int legs){
        System.out.println("Constructor 3");
        this.legs = legs;
    }

    Animal(String name,int legs){
        this.name = name;
        this.legs = legs;
    }

    void printInfo(){
        System.out.println("my name is "+this.name);
        System.out.printf("I have %d legs\n",this.legs);
    }
    void printInfo(String name){
        System.out.println("my name is "+name);
        System.out.printf("I have %d legs\n",this.legs);
    }
    void printInfo(int legs){
        System.out.println("my name is "+this.name);
        System.out.printf("I have %d legs\n",legs);

    }
    void printInfo(int legs,String name){
        System.out.println("my name is "+name);
        System.out.printf("I have %d legs\n",legs);
    }

    void printArray(){
         for(int i=0; i < this.numbers.length;i++){
             System.out.println(this.numbers[i]);
         }

         for(int i:this.numbers){
             System.out.println(i);
         }
    }
    public static void main(String[] args){
        Animal obj=new Animal();
//        Animal obj2=new Animal("Aleesha");
//        Animal obj3=new Animal(8);
//        Animal obj4=new Animal("Aleesha",2);
//        obj.printInfo();
//        obj.printInfo("Alisha");
//        obj.printInfo(4);
//        obj.printInfo(4,"abhi");
        obj.printArray();
//        obj2.printInfo();
//        obj3.printInfo();
//        obj4.printInfo();
    }
}
