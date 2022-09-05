public class Planet {
    private final String name;
    private final int size;
    public Planet(String name, int size){
        this.name = name;
        this.size = size;
    }
    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public void explode(){
        System.out.println("Boom" + name + " has exploded. " );
    }


}


