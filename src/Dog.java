public class Dog extends Animal {

    int runLimit = 500;
    int swimLimit = 10;

    public Dog(int distanceRun, int distanceSwim) {
        super(distanceRun, distanceSwim);
    }

    @Override
    public void swim() {
        if (super.distanceSwim <= this.swimLimit) {
            System.out.println("Бобик проплыл " + this.distanceSwim + " м.");
        }
    }

    @Override
    public void run() {
        if (super.distanceRun <= this.runLimit) {
            System.out.println("Бобик пробежал " + this.distanceRun + " м.");
        }
    }
}
