public class Movie {
    public static final int  CHILDREN = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private final String _title;
    private final Price _price;

    public Movie(String title, Price price) {
        _title = title;
        _price = price;
    }

    public String getTitle ()       {
        return _title;
    };

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    public int frequentRenterPoints(int daysRented){
        return _price.getFrequentRenterPoints(daysRented);
    }
}
