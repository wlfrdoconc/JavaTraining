package workbook6.portfoliomanager;

public abstract class FixedAsset implements Valuable {

    protected String name;
    protected double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    @ Override
    public double getValue() {
        // Return the value of the asset
        return 0;
    }

}
