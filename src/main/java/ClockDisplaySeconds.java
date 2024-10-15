package src.main.java;


public class ClockDisplaySeconds
{
    //Extend ClockDisplaySeconds to include a seconds field.
    //Update all methods and parameters to accomodate this change
       private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    
        public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }
        public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);}
        
            //The updateDisplay method should be called before finishing
    public void setTime(int hour,int minute, int second)
    {
    hours.setValue(hour);
    minutes.setValue(minute);
    seconds.setValue(second);
    updateDisplay();
    }
    public void timeTick(){
        seconds.increment();
        
        if(seconds.getValue() == 0){
            minutes.increment();
        }
        if (minutes.getValue() == 0){
        hours.increment();
        }
        if (hours.getValue() == 24){
        hours.setValue(0);
        }
        
        updateDisplay();
    }
       public String getTime(){return display;}
           public void updateDisplay(){
    String newDiplay = " ";
    newDiplay+= hours.getDisplayValue();
    newDiplay+= ":";
    newDiplay+=minutes.getDisplayValue();
    newDiplay+= ":";
    newDiplay+=seconds.getDisplayValue();
    display = newDiplay;
    }    
    }


