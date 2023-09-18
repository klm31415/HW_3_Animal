public class Animal {
    int distanceRun;
    int distanceSwim;


    public Animal(int distanceRun, int distanceSwim) {
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
    }

    public void run() {
        System.out.println("пробежал " + this.distanceRun + " м.");
        //this.distanceRun = distance;
    }

    public void swim() {
        System.out.println("проплыл " + this.distanceSwim + " м.");
        //this.distanceSwim = distance;
    }
}
