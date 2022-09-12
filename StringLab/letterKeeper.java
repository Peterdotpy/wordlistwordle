public class letterKeeper {
    private int firstCount;
    private int secondCount;
    private int thirdCount;
    private int fourthCount;
    private int fifthCount;

    public void setCount1(int plusOne){
        this.firstCount++;
    }
    public void setCount2(int plusOne){
        this.secondCount++;
    }

    public void setCount3(int plusOne){
        this.thirdCount++;
    }

    public void setCount4(int plusOne){
        this.fourthCount++;
    }

    public void setCount5(int plusOne){
        this.fifthCount++;
    }

    public int getCount1(){
        return firstCount;
    }
    public int getCount2(){
        return secondCount;
    }
    public int getCount3(){
        return thirdCount;
    }
    public int getCount4(){
        return fourthCount;
    }
    public int getCount5(){
        return fifthCount;
    }
}
