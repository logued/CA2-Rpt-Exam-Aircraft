package dkit.oop;

/**
 *  DO NOT change any code in this class.
 */

public abstract class Airplane {

    private String id;
    private String makeAndModel;     // e.g. "Airbus 360"

    Airplane(String id, String makeAndModel) {
        this.id = id;
        this.makeAndModel = makeAndModel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id='" + id + '\'' +
                ", makeAndModel='" + makeAndModel + '\'' +
                '}';
    }
}
