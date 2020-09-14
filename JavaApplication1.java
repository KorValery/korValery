package javaapplication1;

public class JavaApplication1{
    public static void main(String[] args){
        short d[] = new short[14];
        double x[]=new double[18];
        short a= 4;
        for(int i=0; i<14; ++i){
            d[i]=a;
            a++;
        }
        for (int i = 0; i<18; ++i){
            x[i]=Math.random()*17.0-4.0;
        }
        double d1[][]=new double [14][18];
        for(int i=0; i<14; ++i){
            for(int j=0; j<18; ++j){
                if(d[i]==17){
                    d1[i][j]=0.5*Math.exp(Math.exp(x[j]));
                }else if(d[i]==5 || d[i]==6 || d[i]==9 || d[i]==10 || d[i]==11 || d[i]==13 || d[i]==15){
                    d1[i][j]=Math.asin(1/(Math.exp(Math.pow((Math.acos((x[j]+4.5)/17)/4), Math.tan(Math.pow(x[j]/2, 3))))));
                }else{
                    d1[i][j]=Math.sin(Math.pow(2*Math.sin(Math.pow(Math.PI/x[j], 3)), 2));
                }
                System.out.printf("%,5f %n", d1[i][j]);
            }
}
    }
}