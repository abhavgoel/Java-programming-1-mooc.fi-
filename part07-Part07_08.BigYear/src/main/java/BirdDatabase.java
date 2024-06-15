import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public boolean observe(String name) {
        for(Bird bird : birds) {
            if(bird.getName().equals(name)) {
                bird.observe();
                return true;
            }
        }
        return false;
    }
    public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public void getOne(String name) {
        for(Bird bird: birds) {
            if(bird.getName().equals(name)) {
                System.out.println(bird); 
            }
        }
    }

    public void getAll() {
        for(Bird bird :this.birds) {
            System.out.println(bird);
        }
    }
}
