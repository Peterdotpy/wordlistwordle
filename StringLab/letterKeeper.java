public class letterKeeper {
    private String firstCount;
    private String secondCount;
    private String thirdCount;
    private String fourthCount;
    private String fifthCount;

    void setCount1(String most){
        this.firstCount = most;
    }
    void setCount2(String most){
        this.secondCount = most;
    }

    void setCount3(String most){
        this.thirdCount = most;
    }

     void setCount4(String most){
        this.fourthCount = most;
    }

    void setCount5(String most){
        this.fifthCount = most;
    }

    String getCount1(){
        return firstCount;
    }
    String getCount2(){
        return secondCount;
    }
    String getCount3(){
        return thirdCount;
    }
    String getCount4(){
        return fourthCount;
    }
    String getCount5(){
        return fifthCount;
    }
}
