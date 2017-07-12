import java.util.*;

/**
 * Created by ssyda on 2017-07-11.
 */
public class EMSSimulator {


    public void simulate() {
        Comparator<EMSRequest> comparator = new EMSComparator();
        PriorityQueue<EMSRequest> queue = new PriorityQueue<>(comparator);
        Scanner sc = new Scanner(System.in);
        int patientNo = 1;
        int requestAmount = (int) (Math.random() + 5 * 1);
        for (int y = 0; y < requestAmount; y++) {

            System.out.println("Enter priority of patient " + patientNo + ": ");
            int priority = sc.nextInt();
            System.out.println("Enter location of patient " + patientNo + ": ");
            String location = sc.next();
            java.util.Date date = new java.util.Date(System.currentTimeMillis());
            System.out.println("Registered patient " + patientNo + " from " + location + " with priority " + priority + " at " + date + ".");
            queue.add(new EMSRequest(location, priority, date, patientNo));
            patientNo++;
            try {
                Thread.sleep(new Random().nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        if (queue.size() > 0)
        {
            System.out.println("Ambulance handled patient " + queue.peek().getPatientNo() + " from " + queue.peek().getAddress() + " with priority " + queue.peek().getUrgency() + " at " + queue.remove().getReceivedTime());
        }
        while (queue.size() > 0)
        {
            System.out.println("Handled patient " +queue.peek().getPatientNo() + " from " + queue.peek().getAddress() + " with priority " + queue.peek().getUrgency() + " at " + queue.remove().getReceivedTime());
        }
        
    }
}

