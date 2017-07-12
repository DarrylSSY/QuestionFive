import java.util.Date;

/**
 * Created by ssyda on 2017-07-11.
 */
public class EMSRequest {

    private String address;
    private int urgency;
    private java.util.Date receivedTime;
    private int patientNo;

    public EMSRequest(String address, int urgency, java.util.Date receivedTime, int patientNo) {
        this.address = address;
        this.urgency = urgency;
        this.receivedTime = receivedTime;
        this.patientNo = patientNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public int getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(int patientNo) {
        this.patientNo = patientNo;
    }
}
