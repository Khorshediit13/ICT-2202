package activity.selection.problem;

import java.util.Comparator;

public class TestComparator implements 
Comparator<Asp>{

    @Override
    public int compare(final Asp o1, final Asp o2) {
        // TODO Auto-generated method stub
        return  o1.getFinish() - o2.getFinish();
    }

   
    

    
}
