package Soru_101_Array4;

public class Soru_101_Array4 {
    public static void main(String[] args) {
        int numbers[];
        numbers = new int[2];


        numbers[0] = 10;
        numbers[1] = 20;

        // int numbers[] = new int[4];  //hata burda   compile verir. . . .
        numbers[2] = 30;
        numbers[3] = 40;
        for (int x : numbers) {
            System.out.println(" " + x);
        }
        // sebebine bakabilirsin . . .

    }
}
