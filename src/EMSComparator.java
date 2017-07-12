import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by ssyda on 2017-07-11.
 */
public class EMSComparator implements Comparator<EMSRequest>{
    @Override
    public int compare(EMSRequest x, EMSRequest y) {
        if (x.getUrgency() > y.getUrgency())
        {
            return -1;
        }
        else if (x.getUrgency() < y.getUrgency())
        {
            return 1;
        }
        else
        {
            if (x.getReceivedTime().before(y.getReceivedTime()))
            {
                return -1;
            }
            else if (x.getReceivedTime().after(y.getReceivedTime()))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
}
