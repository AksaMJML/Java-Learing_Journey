class Sample {
    private int x;
    private int y;

    public Sample(int x , int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }
}

class Hello {
    public static void main(String[] args){
        Sample sample = new Sample(10 ,20);
        System.out.println(sample.getX() + " " + sample.getY());
        sample.setX(100);
        System.out.println(sample.getX());
        sample.setY(200);
        System.out.println(sample.getY());
    }
    
}
