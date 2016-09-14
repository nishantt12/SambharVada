package nishant.com.sambharvada;

/**
 * Created by nishant on 7/9/16.
 */
public class Init {

    int id, rating;

    boolean isMandatory, isChecked;


    String text, fieldName, type;

    public Init(int id, boolean isMandatory, String fieldName, String type) {

        this.fieldName = fieldName;
        this.type = type;
        this.id = id;
        this.isMandatory = isMandatory;

    }


    public boolean isMandatory() {
        return isMandatory;
    }

    public void setMandatory(boolean mandatory) {
        isMandatory = mandatory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
