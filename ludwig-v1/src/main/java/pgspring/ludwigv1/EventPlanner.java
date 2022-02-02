package pgspring.ludwigv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EventPlanner {


    public EventPlanner(){

    }

    public List<Event> getRankData(){
        List<Event> list=new ArrayList<Event>();
        list.add(new Event(1000,"Germany","DOCMUC with the visitor"));
        list.add(new Event(995,"Germany","TD in Muc with the visitor"));

        list.add(new Event(1000,"USA","DOCMUC goes San Francisco With visitor"));
        list.add(new Event(1209,"USA","Write the docs with visitor"));
        list.add(new Event(995,"USA","TD in new York with visitor"));

        list.add(new Event(999,"Germany","Tekom with the visitor"));
        Collections.sort(list);

        Collections.sort(list, new Comparator<Event>() {
            @Override
            public int compare(Event u1, Event u2) {
                return u1.getCountry().compareTo(u2.getCountry());
            }
        });

        return list;
    }


}
