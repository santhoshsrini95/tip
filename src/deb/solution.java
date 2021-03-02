package deb;

public class solution {
    double N =6;
    static double X[]={1,2,3,4,5,5};
    double mean;
    double median;
    double mode;

    static double sum(){
          double sum =0;
        int i;
        for(i=0;i< X.length;i++)
            sum+=X[i];
        return sum;
    }
    public static void main(String[] args){
        double mean=(sum()/6);
        System.out.println("mean: "+mean);
        double a=X[2];
        double b=X[3];
        double median=((a+b)/2);
        System.out.println("median: "+median);
        
    }
}
