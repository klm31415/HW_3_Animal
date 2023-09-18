public class Cat extends Animal {
    int runLimit = 200;
    int swimLimit = 0;

    public Cat(int distanceRun, int distanceSwim) {
        super(distanceRun, distanceSwim);
    }

    @Override
    public void run() {
        if (super.distanceRun <= this.runLimit) {
            System.out.println("Кот пробежал " + this.distanceRun + " м.");
        }
    }

    @Override
    public void swim() {
            System.out.println("Коты не плавают");
    }
}
