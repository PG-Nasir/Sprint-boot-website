package pgspring.ludwigv1;

import java.sql.Date;

public class Conversion {
    private String binary;
    private String decimal;
    private String textStatus;

    // getters
    // setters

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    public String getTextStatus() {
        return textStatus;
    }

    public void setTextStatus(String textStatus) {
        this.textStatus = textStatus;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "binary='" + binary + '\'' +
                ", decimal='" + decimal + '\'' +
                ", textStatus='" + textStatus + '\'' +
                '}';
    }

    // override toString()



}
