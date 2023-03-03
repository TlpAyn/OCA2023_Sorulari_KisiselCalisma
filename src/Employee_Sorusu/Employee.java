package Employee_Sorusu;

public class Employee {
    public int salary=0;
    public void m() {
        System.out.println("PARENT");
    }
}

class Director extends Employee {
    public int directorSalary=100;
    public int salary=10;
    public void m() {
        System.out.println("director");
    }
}

class Manager extends Employee {
    public int salary=20;
    public int managerSalary=200;
    public void m() {
        System.out.println("manager");
    }
}

class Test {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee director = new Director();
        Employee manager1 = new Manager();
        Manager manager2 = new Manager();

        Employee manager3 = new Manager();
        Manager manager4 = (Manager) manager3;// Casting yaptik. bu sirada manager3'de gercek manager oldu

        System.out.println("\n--------- Polymorphism Methodlarin calismasi ----------");
        System.out.println(" *** Asagidan gorulecegi gibi Polymorphism'de; CLASS DOWNCASTING DAHI YAPILSA sagdaki class'in metodu calisir...");
        System.out.print("POLY Employee employee \t= new Employee() :");employee.m();
        System.out.print("POLY Employee director \t= new Director() : ");director.m();
        System.out.print("POLY Employee manager1 \t= new Manager()\t: ");manager1.m();
        System.out.print("INHE Manager manager2 \t= new Manager()\t: ");manager2.m();
        System.out.print("POLY Employee manager3 \t= new Manager()\t: ");manager3.m();
        System.out.print("DOWNCASTING Manager manager4 = (Manager) manager3 : ");manager4.m();
        System.out.println("\n------ Polymorphism fields'larin cagrilmasi: CLASS DOWNCASTING YAPILMAZSA sadece parent'in degiskenleri gorulur/cagrilabilir-------");
        System.out.println("*** NOT1 : Polimorphism fields'ler icin degil methods'lari genisletmek icin uygun...");
        System.out.println("*** NOT2 : Polimorphism fields'ler sol taraftaki class, methods'larda sag taraftaki class'i referans aliyor.\n");
        System.out.print("POLY Employee employee \t= new Employee()-> employee.salary\t=0     OK:");m3(employee.salary);
        System.out.print("POLY Employee director \t= new Director() -> director.salary\t=10 fakat:");m3(director.salary);
        System.out.print("POLY Employee manager1 \t= new Manager()\t-> manager1.salary\t=20 fakat:");m3(manager1.salary);
        System.out.print("INHE Manager manager2 \t= new Manager()\t-> manager2.salary\t=20    OK:");m3(manager2.salary);
        System.out.print("POLY Employee manager3 \t= new Manager()\t -> manager3.salary\t=20 fakat:");m3(manager3.salary);
        System.out.print("DOWNCASTING Manager manager4 = (Manager) manager3\t-> manager4.salary\t=20 OK:");m3(manager4.salary);

    }

    public static void m2(Employee e){
        e.m();
    }

    public static void m3(int e){
        System.out.println(e);
    }
}