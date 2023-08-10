import java.util.Random;

public class HomeWork8 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] mas = {3, 5 ,9};
        int tent = 1;
        for (int el: mas) {
            int num = random.nextInt(10);
           if (el==num){
               System.out.println("Ви вгадали число " + el + " з " + tent + "-го разу!");
               break;
           }else {
               System.out.println("Спроба " + tent + " невдала! Загадане число " + num);
               tent++;
           }
        }
    }
}
