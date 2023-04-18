package asd;



public class Statistik {
    private double[] data;
    private int cacah;
    
    public Statistik(int n){
        this.data = new double[n];
        this.cacah = 0;
        
    }

    
    public void addData(double data){
        this.data[this.cacah] = data;
        this.cacah++;
        
    }
    
    public double sum(){
        double sum=0;
        for (int i=0 ; i<this.cacah; i++){
            sum =+ this.data[i];
        }
        return sum;
    }
    
    public double avg(){
        return sum()/banyakdata();
    }
    
    public String ambilData(){
        String ad = "";
        for(int i = 0; i < this.cacah ; i++){
            ad = ad + String.valueOf(this.data[i]) + "  ";
        }
        return ad;
    }
    
    public double minimum(){
        double min = Double.MAX_VALUE;
        for(int i = 0 ; i < this.cacah ; i++){
            if(min > this.data[i]){
                min = this.data[i];
            }
        }
        return min;
    }
    
    public double maksimum(){
        double max = Double.MIN_VALUE;
        for(int i = 0 ; i < this.cacah ; i++){
            if(max < this.data[i]){
                max = this.data[i];
            }
        }
        return max;

    }
    public void delData(){
        this.cacah--;
        this.data[this.cacah] = 0;
    }
    
    public int banyakdata(){
        return this.cacah;
    }
            
    
}