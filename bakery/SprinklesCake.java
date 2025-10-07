public class SprinklesCake extends CakeDecorator{

    public SprinklesCake(Cake cake){
        super(cake);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.00;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " with Sprinkles";
    }
}
