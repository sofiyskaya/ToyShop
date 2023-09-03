public class Toy implements Comparable<Toy>{
    private static int lastId = 0;
    private int id;
    private String name;
    private int amount;
    private int freq;

    
    /**
     * create object Toy
     * @param name
     * @param amount
     * @param freq
     */
    public Toy(String name, int amount, int freq){
        this.id = ++lastId;
        this.name = name;
        this.amount = amount;
        this.freq = freq;
    }

    /**
     * method gets toy's id
     * @return
     */
    public int getId(){
        return id;
    }

    /**
     * method change toy's id
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * method gets toy's name
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * method sets toy's name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * method gets amount of specific toy
     * @return
     */
    public int getAmount(){
        return amount;
    }

    /**
     * method sets amount of specific toy
     * @param amount
     */
    public void setAmount(int amount){
        this.amount = amount;
    }

    /**
     * method gets a chance of drop specific toy
     * @return
     */
    public int getFreq(){
        return freq;
    }

    /**
     * method sets a chance of drop specific toy
     * @param freq
     */
    public void setFreq(int freq){
        this.freq = freq;
    }

    /**
     * method decreases amount of specific toy after drop it off
     */
    public void decreaseAmount(){
        this.amount -= 1;
    }

    @Override
    public String toString(){
        return "Toy id = " + id + "\nname = " + name + "\ncount = " + amount + "\ndrop frequency = " + freq;
    }

    @Override
    public int compareTo(Toy o){
        if(this.getFreq() == o.getFreq()){
            return 0;
        }
        if(this.getFreq() > o.getFreq()){
            return -1;
        }
        return 1;
    }
    
}
