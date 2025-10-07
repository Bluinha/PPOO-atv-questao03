public class WithSayingCake extends CakeDecorator {

    private String X;

    public WithSayingCake(Cake cake, String X){
        super(cake);
        this.X = X;
    }

    @Override
    public double getCost() {
        return super.getCost();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " with saying '" + this.X + "'";
    }
}
