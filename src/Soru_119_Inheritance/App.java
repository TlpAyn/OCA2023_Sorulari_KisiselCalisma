package Soru_119_Inheritance;

public class App {
   String greet= " Welcome !";
    public App(){
        String greet ="Hello";
        
    }
    public void setGreet(){
        String greet = "Good Day";
    }

    public static void main(String[] args) {

        App t = new App();
        String greet ="Good Luck";
        System.out.println(t.greet);
        }
    }

