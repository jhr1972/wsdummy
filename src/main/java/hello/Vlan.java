package hello;

public class Vlan {

    private final long id;
    private final String description;

    public Vlan(long id, String description) {
        this.id = id;
        this.description = description;
        System.out.println("Set: "+id +"  Descritpion: " +description); 
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
