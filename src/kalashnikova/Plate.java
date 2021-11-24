package kalashnikova;

public class Plate {

    private int amountOfFood;

    public Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public boolean decreaseFood(int decrease) {
        if (this.amountOfFood < decrease) {
            return false;
        }

        this.amountOfFood -= decrease;
        return true;
    }

    public void addFoodToPlate(int amountOfFood) {
        this.amountOfFood += amountOfFood;
    }

    public String amountInfo() {
        return String.format("В миске %d корма", this.amountOfFood);
    }
}