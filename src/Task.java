package Review;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class Task {
    public static void countTheWord(String word){
     int count = 1;
     for(int i=0; i<word.length()-1;i++){
         if(word.charAt(i) != ' ' && word.charAt(i+1) == ' ') count++;
     }
        System.out.println(count);
    }

    public static void countSumOfDigit(int val){
        int count =0;
        int result = 0;
        while (val !=0){
            int rem = val % 10;
            result += rem;
            val = val / 10;
        }
        System.out.println(result);
    }

    public static void anagram(String word1, String word2){
        String s1 = word1.toLowerCase();
        String s2 = word2.toLowerCase();
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s3 = new String(arr1);
        String s4 = new String(arr2);
        if (s3.equals(s4)) System.out.println("True");
        else System.out.println("False");
    }

    public static void countCharOccurrence(String s, String val){
        int length = s.length();
        int length_aft = s.replace(val,"").length();
        System.out.println("Occurrence is " + (length-length_aft));
    }

    public static void countEvenOdd(int num){
        int countEven = 0, countOdd = 0;
        while (num !=0){
            int rem = num % 10;
            if (rem % 2 == 0) countEven++;
            else countOdd++;
            num = num / 10;
        }
        System.out.println("Even count is " + countEven);
        System.out.println("Odd count is " + countOdd);
    }

   public static void digitsOfNumber(int num){
        int count =0;
        while (num != 0){
            count++;
            num = num / 10;
        }
       System.out.println("Digits of NUmber " + count);
   }

   public static void duplicateElementInArray(String [] array){
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i] == array[j]) System.out.println("Duplicate element found " + array[i]);
            }
        }
   }

   public static void equalityCheckOfArray(int [] arr,int [] arr1){
        int count = 0;
        if (arr.length == arr1.length){
            for (int i=0;i<arr.length;i++){
                if (arr[i] == arr1[i]) count++;
                else {
                    System.out.println("Not Equal");
                    break;
                }
            }
            if (count == arr1.length) System.out.println("Equal");
            else System.out.println("Not Equal");
        }
        else System.out.println("Not Equal");
   }

   public static void evenOrOddFromArray(int [] a){
       for (int j : a) {
           if (j % 2 == 0) System.out.println("Even " + j);
           else System.out.println("Odd " + j);
       }
   }

   public static void fibonacci(int val){
        int n =0 , n1=1;
       System.out.print(n +" "+ n1);
       for (int i=2;i<val;i++){
           int result = n +n1;
           System.out.print(" "+ result);
           n = n1;
           n1 = result;
       }
       System.out.println();
   }

   public static void factorial(int value){
       int sum=1;
        for (int i=1;i<=value;i++){
            sum *= i;
        }
       System.out.println(sum);
   }

   public static void reverseString(String str){
        String s= "";
        for (int i=str.length()-1;i>=0;i--){
            s = s+ str.charAt(i);
        }
       System.out.println(s);
   }

   public static void palindrome(String str){
        String s ="";
        String given  = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            s += given.charAt(i);
        }
        if (s.equals(given)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
   }

   public static void secondHighest(int [] a){
     int max1 = 0, length=0;
     int max2 = 0;
     if (a[0] > a[1] ){
         max1 = a[0];
         max2 = a[1];
     }
     else {
         max1 = a[1];
         max2 = a[0];
     }

     for (int i=2;i<a.length;i++){
         if (a[i]>max1){
             max2 = max1;
             max1 = a[i];
         }
         if (a[i] > max2 && a[i] < max1){
             max2 = a[i];
             length = i;

         }
     }
       System.out.println("Second Highest number " + max2);
       System.out.println("Index of Second Highest number " + length);
   }

   public static void findMissingNumberInArray(int [] a){
        // array value should be in range
       int sum=0, sum1=0;
       for (int j : a) {
           sum += j;

       }
       int min = Arrays.stream(a).min().orElseThrow(NoSuchElementException::new);
       int max = Arrays.stream(a).max().orElseThrow(NoSuchElementException::new);

       for (int i=min;i<=max;i++){
           sum1 +=i;
       }
       System.out.println(sum1-sum);
   }

   public static boolean isValidParenthesis(String s){
       Stack<Character> stack = new Stack<>();
       for (char c : s.toCharArray()){
           if (c == '(' || c == '{' || c == '['){
               stack.push(c);
           }
           else if (Character.isDigit(c) || c == '+' || c == '-' || c == '*' || c == '/') continue;
           else {
               if (stack.isEmpty()) return false;
               char top = stack.pop();
               if ((c == ')' && top !='(') || (c == '}' && top !='{') || (c == ']' && top !='[')) return false;
           }

       }
       return stack.isEmpty();
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,10,2,3,4,6,5};
        int[] ar = {1,2,3,4,6};
        // System.out.println("Enter a sentence");
        // String s = sc.nextLine();
        // countTheWord(s);
        countSumOfDigit(20);
        anagram("Listen","Silent");
        countCharOccurrence("I am bangladeshi","a");
        countEvenOdd(21);
        digitsOfNumber(55);
        String[] arr = {"java","c","c++","java","python"};
        duplicateElementInArray(arr);
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};
        equalityCheckOfArray(a1,a2);
        evenOrOddFromArray(a1);
        fibonacci(5);
        factorial(4);
        reverseString("Amin");
        palindrome("Madam");
        secondHighest(a);
        findMissingNumberInArray(ar);
        System.out.println(isValidParenthesis("1+2(2+3)"));
    }
}
