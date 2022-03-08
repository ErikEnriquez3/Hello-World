package pega.oop.intro;

public class Clock {

    //Attributes
    int hrHand;
    int mnHand;
    int scHand;
    int[] alarm;


    //Constructors
    public Clock(){
        this.hrHand = hrHand;
        this.mnHand = mnHand;
        this.scHand = scHand;

    }

    //Methods
    public void setAlarm(int hour, int min) {
        this.alarm[0] = hour;
        this.alarm[1] = min;
    }
    public int[] get_alarm(){
        return alarm;

    }
}
