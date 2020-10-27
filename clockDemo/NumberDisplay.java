public class NumberDisplay {
    private int limit = 1;
    private int value = 0;

    public NumberDisplay(int limit){
        if(limit > 0){
            this.limit = limit;
        }
    }

    public NumberDisplay(int limit, int value){
        this(limit);
        if(value >= 0){
            this.value = value;
        }
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLimit() {
        return limit;
    }

    public int getValue() {
        return value;
    }

    public int increaseNumber(int numberIncrement){
        int result = 0;
        if(numberIncrement >= 0){
            value += numberIncrement;
            result = value / limit;
            value %= limit;
        }
        return result;
    }

    public int increaseNumber(){
        return this.increaseNumber(1);
    }

}
