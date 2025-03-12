package activity.selection.problem;

import java.util.ArrayList;
import java.util.Collections;

public class AspMain {
    public static void main(String[] args) {
        ArrayList<Asp> list = new ArrayList<>();

        Asp activity1 = new Asp();
        activity1.setActivity("A1");
        activity1.setStart(0);
        activity1.setFinish(6);

        Asp activity2 = new Asp();
        activity2.setActivity("A2");
        activity2.setStart(3);
        activity2.setFinish(4);
        
        Asp activity3 = new Asp();
        activity3.setActivity("A3");
        activity3.setStart(1);
        activity3.setFinish(2);

        Asp activity4 = new Asp();
        activity4.setActivity("A4");
        activity4.setStart(5);
        activity4.setFinish(9);

        Asp activity5 = new Asp();
        activity5.setActivity("A5");
        activity5.setStart(5);
        activity5.setFinish(7);

        Asp activity6 = new Asp();
        activity6.setActivity("A6");
        activity6.setStart(8);
        activity6.setFinish(9);

        list.add(activity1);
        list.add(activity2);
        list.add(activity3);
        list.add(activity4);
        list.add(activity5);
        list.add(activity6);

       
        Collections.sort(list, new TestComparator()); 
    
        ArrayList<Asp> selectedActivities = new ArrayList<>();
        int lastFinishTime = -1;

        for (Asp activity : list) {
            if (activity.getStart() >= lastFinishTime) {
                selectedActivities.add(activity);
                lastFinishTime = activity.getFinish();
            }
        }

      
        System.out.println("Selected Activities:");
        for (Asp activity : selectedActivities) {
            System.out.println(activity.getActivity());
        }
    }
}
