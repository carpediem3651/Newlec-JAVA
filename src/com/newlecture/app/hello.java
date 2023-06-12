package com.newlecture.app;

class hello{
    public static void main (String[] args){
		int kor1, kor2, kor3;
	    int total;
	    float avg;
	
	    kor2 = 60;
	    kor3 = 80;
	    kor1 = 50;
	    total = kor1 + kor2 + kor3;
	    avg = (float)(total / 3.0);
	    short x = (short)3276812;
	
		System.out.printf("total is %d\n", total);
		System.out.printf("avg is %.4f\n", avg);
    }
}