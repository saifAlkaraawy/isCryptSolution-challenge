package com.alkaraawy;


public class Crypt
{
    public  static   boolean isCryptSolution(String[] crypt, char[][] solution) {
        String word1="";
        String  word2="";
        String word3="";


        for (int i=0; i<crypt.length;i++){
            String x=crypt[i];

            for (int k=0; k<x.length();k++){
                for (int j=0;j<solution.length;j++) {
                    if (x.charAt(k) == solution[j][0]) {
                        if (i == 0) {
                            word1 += solution[j][1];
                        }

                        if (i == 1) {
                            word2 += solution[j][1];
                        }
                        if (i == 2) {
                            word3 += solution[j][1];
                        }

                    }
                }
            }




        }





        if(word1.charAt(0)=='0'||word2.charAt(0)=='0'){
            if(word1.length()==1||word2.length()==1){

                return true;
            }else
                return false;
        }
       long i1=Long.parseLong(word1);
        long  i2=Long.parseLong(word2);
       long i3=Long.parseLong(word3);

        long  i=i1+i2;
        if(i==i3){
            return  true;
        }else
        return false;

    }

}



