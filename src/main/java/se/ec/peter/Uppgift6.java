package se.ec.peter;

public class Uppgift6 {

    //6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14
    // and print the average of these6 numbers. Expected output: Average is: 17.3

    public static void main(String[] args) {

        int arrNumbers[] = new int[6];
        arrNumbers[0] = 43;
        arrNumbers[1] = 5;
        arrNumbers[2] = 23;
        arrNumbers[3] = 17;
        arrNumbers[4] = 2;
        arrNumbers[5] = 14;

        //int sum =0;
        double average = 0.0;
        //int value = 0;

        //anropa metod
        calcAverage(arrNumbers);

        //skriv ut resultat
        System.out.println("Average value of array element is " + average);
        //System.out.println("Average value of array element is " + sum);
    }

    //metoder ------------------------------------------------------
            public static double calcAverage(int arrNumbers[], int sum, double average){
                average = 0.0;
                sum = 0;
                int i;

                for(i=0; i<arrNumbers.length;i++);{
                    sum = sum + arrNumbers[i];

                    average = sum/arrNumbers.length;
                    return average;
                }

            }

 }



            //System.out.println(sum);
            //System.out.println(arrNumbers.length);
            //average = sum/arrNumbers.length;
            //return average;

            //https://stackoverflow.com/questions/12002332/how-to-manipulate-arrays-find-the-average-beginner-java
/*                average = sum/arrNumbers.length;
                return average;*/
/*            for (int s : arrNumbers) sum += s;
            {
                //for(i=0; i < arrNumbers.length;i++);
                sum = sum + arrNumbers[i];
            }
            sum = sum + arrNumbers[i];*/
/*            for (int i=0; i < arrNumbers.length; i++) {
                sum = sum + arrNumbers[i];
            }*/

            //System.out.println("Average value of array element is " + average);
            //average(arrNumbers, int sum, double average);

            //average = sum/arrNumbers.length;
            //return average;
            //System.out.println(sum);  //testa skriv ut sum
            //System.out.println(arrNumbers.length);
            //System.out.println(arrNumbers.length);  //testa skriv ut antal värden i arrayen
            //double result = sum / arrNumbers.length;
            //System.out.println("Average value of array element is " + average);

            //for (int d : data) sum += d;
            //sum = sum + arrNumbers[i];

            //for (double value : arrNumbers) sum += value;{
            //System.out.println(sum);  //testa skriv ut sum
            //System.out.println(arrNumbers.length);
            //}