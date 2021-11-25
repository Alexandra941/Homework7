package kalashnikova;

public class Cat {

    private int appetite;
    private boolean isHungry;

    public Cat (int appetite) {
        this.appetite = appetite;
        this.isHungry = true;
    }

    public boolean isHungry() {
        return this.isHungry;
    }

    public void eat(Plate plate) {
        if (!this.isHungry || this.appetite > plate.getAmountOfFood()) {
            return;
        }

        this.isHungry = !plate.decreaseFood(this.appetite);
    }
}