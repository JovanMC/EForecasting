package com.jovanmillenno.e_forecasting;

public class proses {
    final double a = 0.1;
    final double bt = 1.62;
    final double ct1 = 0.01;
    final double ct2 = 0.81;
    double[][] data = new double[12][5];
    double hasilakhir;

    public double prosesakhir(double bln1,double bln2, double bln3, double bln4,double bln5,double bln6,double bln7,double bln8,double bln9,double bln10,double bln11,double bln12){
        data[0][0]= bln1 ;
        data[1][0]= bln2 ;
        data[2][0]= bln3 ;
        data[3][0]= bln4 ;
        data[4][0]= bln5 ;
        data[5][0]= bln6 ;
        data[6][0]= bln7 ;
        data[7][0]= bln8 ;
        data[8][0]= bln9 ;
        data[9][0]= bln10 ;
        data[10][0]= bln11 ;
        data[11][0]= bln12 ;
// batas array bulan
        data[0][1] = bln1;
        data[0][2] = bln1;
        data[0][3] = bln1;

        for (int x =1; x<=11; x++){
            double s1 = (a * data[x][0]) + (1-a) * data[x-1][1];
            double s2 = (a * s1) + ((1-a) * data[x-1][2]);
            double s3 = (a * s2) + ((1-a) * data[x-1][3]);
            double al = (3*s1) - (3*s2) + s3;

            double b = (((6-(5*a))*s1) - ((10-(8*a))*s2) + ((4-(3*a))*s3))/bt;

            double c = (ct1*(s1-(2*s2)+s3)) / ct2;
            double hsl = al + b + (0.5*c);
            data[x][1] = s1;
            data[x][2] = s2;
            data[x][3] = s3;
            data[x][4] = hsl;
        }
        hasilakhir = data[10][4];
        return hasilakhir;
    }

}
