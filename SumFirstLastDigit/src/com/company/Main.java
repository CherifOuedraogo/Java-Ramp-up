package com.company;

public class Main {

    public static void main(String[] args) {
       /* System.out.println(sumFirstAndLastDigit(13));
        System.out.println(getEvenDigitSum(228));
        System.out.println(hasSharedDigit(100,10));

        */
        System.out.println(reverse(120));
        System.out.println(getDigitCount(120));
        numberToWords(120);
        //System.out.println(isPerfectNumber(28));
       // System.out.println(getGCD(250,62));
       // printFactors(6);
    }
    public static int reverse(int number){
        int reversedNumber = 0;
        while(number!=0){
            reversedNumber = reversedNumber * 10;
            reversedNumber= reversedNumber + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
    public static  int getDigitCount(int number){
        int digitCount = 0;
        if(number<0){
            return  -1;
        }else if(number==0){
            digitCount++;
            return  digitCount;
        }
        for(digitCount=0; number>0;number/=10){
            digitCount++;
        }
        return digitCount;

    }
    public static void numberToWords(int number){
        int initialCount =0, temp = 0 , reversedCount = 0, reversedNumber=0 , diff;
        if (number<0){
            System.out.println("Invalid value");
        }
        /*if(number==0){
            System.out.println("Zero");
        }*/

        initialCount= getDigitCount(number);
       reversedNumber=reverse(number);
       reversedCount=getDigitCount(reversedNumber);
       diff= initialCount-reversedCount;
      if(diff!=0 && number % 100 == 0){
           reversedNumber= (int)(reversedNumber * Math.pow(10,diff));
           //System.out.println(reversedNumber);
       }
       while(reversedNumber!=0){
           temp=reversedNumber % 10;
           switch(temp){
               case 0 :
                   System.out.println("Zero");
                   break;
               case 1 :
                   System.out.println("One");
                   break;
               case 2 :
                   System.out.println("Two");
                   break;
               case 3 :
                   System.out.println("Three");
                   break;
               case 4 :
                   System.out.println("Four");
                   break;
               case 5 :
                   System.out.println("Five");
                   break;
               case 6 :
                   System.out.println("Six");
                   break;
               case 7 :
                   System.out.println("Seven");
                   break;
               case 8 :
                   System.out.println("Eight");
                   break;
               case 9 :
                   System.out.println("Nine");
                   break;
           }
           /*while (initialCount!=reversedCount){
               System.out.println("Zero");
               reversedCount++;
           }*/
           reversedNumber/=10;

       }

    }
    public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0, lastDigit = 0, sum;
        if (number<0){
            return -1;
        }
        lastDigit = number % 10;
        while(number>=10){
            number /=10;
        }
        firstDigit=number;
       sum = firstDigit + lastDigit;
        return sum;
    }
    public static int getEvenDigitSum(int number){
        int digit = 0, sumEvenDigit = 0 ;
        if (number<0){
            return -1;
        }
        while(number>0){
            digit = number%10;
            if(digit%2==0){
                sumEvenDigit+= digit;
            }
            number/=10;
        }
        return sumEvenDigit;
    }
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        int first = 0, second = 0;
        if(firstNumber < 10 || secondNumber > 99){
            return  false;
        }
        while(firstNumber> 0 && secondNumber > 0){
            first= firstNumber%10;
            second= secondNumber%10;
            firstNumber/=10;
            secondNumber/=10;
        }
        return (first==second || firstNumber/10==secondNumber/10 || firstNumber/10==second ||first==secondNumber/10);
    }
    public static boolean hasSharedDigits(int a, int b){
        if((a<10 || a>99) || (b<10 ||b>99)) {
            return false;
        }
        return a/10==b/10|| a/10==b%10|| a%10==b%10|| a%10==b/10;
    }
    public static boolean isValid(int a){
        if(a>=10 && a<=1000){
            return true;
        }else {
            return false;
        }
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if((a<10 || a>1000) || (b<10 ||b>1000) || (c<10 || c> 1000)) {
            return false;
        }
        return a%10==b%10 || a%10==c%10|| b%10==c%10;
    }
    public static int getGreatestCommonDivisor(int a, int b){
        if(a < 10 || b < 10){
           return -1;
        }
        while (a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return b;
    }
    public static int getGCD(int a, int b){
        int gcd = 0;
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a%i==0 && b%i==0)
                gcd = i;
        }
        return gcd;
    }
    public static void printFactors(int a){
        if(a<1){
            System.out.println("Invalid Value");
        }
        for(int i=1; i<=a; i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfectNumber(int a){
        int sum = 0;
        if(a<1){
           return false;
        }
        for(int i=1; i<a; i++){
            if(a%i==0){
                sum+=i;
            }
        }
        return (sum==a);
    }

}
