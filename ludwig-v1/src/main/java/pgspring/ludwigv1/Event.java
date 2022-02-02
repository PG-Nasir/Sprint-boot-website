package pgspring.ludwigv1;

public class Event implements Comparable{
    int numberOfVisitors;
    String country;
    String name;

    public Event(){

    }

    public Event(int numberOfVisitors, String country, String name) {
        this.numberOfVisitors = numberOfVisitors;
        this.country = country;
        this.name = name;
    }



    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    public void setNumberOfVisitors(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Object comparestu) {
        int numberOfVisitors=((Event)comparestu).getNumberOfVisitors();
        return numberOfVisitors-this.numberOfVisitors;
    }

    @Override
    public String toString() {
        return "Event{" +
                "numberOfVisitors=" + numberOfVisitors +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
