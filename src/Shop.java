import java.io.IOException;
import java.util.PriorityQueue;

public class Shop extends PriorityQueue<Toy> {
    private PriorityQueue<Toy> toys;
    private Result res = new Result();

    /**
     * class describes functioning of Toy shop
     * @param toys
     */
    public Shop(PriorityQueue<Toy> toys){
        this.toys = toys;
    }

    /**
     * method adds new items in list of toys for lottery
     * @param name
     * @param amount
     * @param freq
     */
    public void addToy(String name, int amount, int freq){
        Toy item = new Toy(name, amount, freq);
        toys.add(item);
    }

    @Override
    public String toString(){
        return "Shop " + "\n" + toys;
    }

    /**
     * method gets a toy from list
     * @throws IOException
     */
    public void getToy() throws IOException{
        if(!this.toys.isEmpty()){
            Toy prize = toys.poll();
            if(prize.getAmount() == 0){
                getToy();
            }

            if(prize.getAmount() >= 1){
                prize.decreaseAmount();
                this.toys.add(prize);
                res.saveResultToFile(prize);
            }
            System.out.println("Your prize - " + prize.getName());
        }
        else{
            System.out.println("toys no add items");
        }
    }

    /**
     * method view the main interface of programm
     */
    public void view(){
        System.out.println("\nEnter the number: ");
        System.out.println("1. Enter a list of toys");
        System.out.println("2. Get the prize");
        System.out.println("3. Show the list");
        System.out.println("4. Exit");
    }
}
