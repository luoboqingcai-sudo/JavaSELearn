public class ClockDisplay {
    private NumberDisplay hour = new NumberDisplay(24);
    private NumberDisplay min = new NumberDisplay(60);
    private NumberDisplay sec = new NumberDisplay(60);

    public ClockDisplay(int hourLimit){
        if(hourLimit == 12){
            hour.setLimit(12);
            hour.increaseNumber(0);
        }
    }

    public ClockDisplay(){ }

    public void setTime(int hour){
        if(hour >= 0){
            hour %= this.hour.getLimit();
            this.hour.setValue(hour);
        }
    }

    public void setTime(int hour, int min){
        this.setTime(hour);
        if(min >= 0) {
            min %= this.min.getLimit();
            this.min.setValue(min);
        }
    }

    public void setTime(int hour, int min, int sec){
        this.setTime(hour, min);
        if(sec >= 0){
            sec %= this.sec.getValue();
            this.sec.setValue(sec);
        }
    }

    public String showTime(){
        return hour.getValue() + ":" + min.getValue() + ":" + sec.getValue();
    }

    public int increaseTime(int secondIncrement){
        int result = 0;
        int hour, min;
        if(secondIncrement > 0){
            hour = secondIncrement / 3600;
            secondIncrement %= 3600;
            min = secondIncrement / 60;
            secondIncrement %= 60;
            result = this.hour.increaseNumber(hour +
                    this.min.increaseNumber(min + this.sec.increaseNumber(secondIncrement)));
        }
        return result;
    }

    public int increaseTime(){
        return this.increaseTime(1);
    }
}
