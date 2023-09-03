import java.util.PriorityQueue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Toy> queueToy = new PriorityQueue<>();
        Shop shop = new Shop(queueToy);
        Result wf = new Result();
        wf.clearFile();

        shop.addToy("Кукла", 10, 30);
        shop.addToy("Пазлы", 10, 30);
        shop.addToy("Машинка", 15, 40);

        Scanner in = new Scanner(System.in);
        while (true) {
            shop.view();

            switch (in.nextInt()) {
                
                case 1:
                    Integer freqAll = 100;
                    if (!queueToy.isEmpty()) {
                        queueToy.clear();
                        wf.clearFile();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter the name of toy");
                        String name = in.nextLine();
                        String name2 = in.nextLine();
                        System.out.println("Enter the number of toys ");
                        Integer amount = in.nextInt();
                        System.out.println("Enter the chance. Available value 1 to " + freqAll);
                        Integer freq = in.nextInt();
                        shop.addToy(name2, amount, freq);
                        freqAll -= freq;
                    }
                    break;
                case 2:
                    shop.getToy();
                    break;

                case 3:
                    System.out.println("\nThe list of toys: \n");
                    if (!queueToy.isEmpty()) {
                        for (Toy item : queueToy) {
                            System.out.println(item);
                        }
                        System.out.println();
                    }
                    else{
                        System.out.println("The list is empty!\n");
                        
                    }
                    break;
                case 4:
                    System.out.println("program completed");
                    in.close();
                    System.exit(500);
                    break;
            }
        }

    }
}
