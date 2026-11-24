package workbook6.portfoliomanager;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(double weight) {
        super("Gold", 0);
        this.weight = weight;
    }

    @ Override
    public double getValue() {
        // Return the value of the gold asset
        return 0;
    }


}
