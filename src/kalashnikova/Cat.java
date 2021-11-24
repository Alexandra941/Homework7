package kalashnikova;

public class Cat {

    private int appetite;
    private boolean isHungry;

    public Cat (int appetite) {
        this.appetite = appetite;
        this.isHungry = true;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isHungry() {
        return this.isHungry;
    }

    public void setHungry(boolean hungry) {
        this.isHungry = hungry;
    }
}