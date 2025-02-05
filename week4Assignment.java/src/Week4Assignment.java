public class Week4Assignment {
    public static void main(String[] args) {
        
//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};

//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
System.out.println(ages[ages.length -1] - ages[0]);

//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
 
//i. Make sure that there are 9 elements of type int in this new array.  
int [] ages2 = { 4, 12, 21, 67, 5, 14, 33, 66, 45}; 

//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
System.out.println(ages2[ages2.length -1] - ages2[0]);

//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
int sum = 0;
for (int age : ages2){
    sum += age;
}
System.out.println("The average age is: " + sum/ (double) (ages2.length));


//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
int totalLetters = 0;
for (String name: names){
    totalLetters += name.length();
}
System.out.println("Average name Length: " + totalLetters/names.length);
System.out.println("Average name Length: " + (totalLetters / (double) names.length));

//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
StringBuilder allNames = new StringBuilder();
for (String name: names) {
    allNames.append(name).append(" ");
} System.out.println(allNames.toString().trim());

//3. How do you access the last element of any array?
System.out.println(names[names.length -1]);

//4. How do you access the first element of any array?
System.out.println(names[0]);

//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
int []  nameLengths = new int[names.length];
for (int i = 0; i < names.length; i++){
    nameLengths[i] = names[i].length();
}

//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
int Sum = 0; 
for (int nameLength : nameLengths){
    Sum += nameLength;
}
System.out.println(Sum);

// tryouts for the methods created below
// Step 7
System.out.println(repeatedWord("Hello", 3));

// Step 8
System.out.println(getFullName("John", "Doe"));

// Step 9
System.out.println(sumGreaterThan100(new int[]{30, 40, 35}));

// Step 10
System.out.println(averageofNumbers(new double[]{1.5, 2.5, 3.5}));

// Step 11
System.out.println(isTheFirstAverageGreater(new double[]{5.0, 6.0, 7.0}, new double[]{2.0, 3.0, 4.0}));

// Step 12
System.out.println(willBuyDrink(true, 15.00));

// Step 13
System.out.println(calculateFactorial(5)); // Factorial of 5

}

//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

public static String repeatedWord(String word, int n){ 
    String repeatedString = "";
    for (int i =0; i < n ; i++) { 
        repeatedString += word;
    }
    return repeatedString;
}

//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
public static String getFullName(String firstName, String lastName){
    return firstName + " " + lastName;
}
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

public static boolean sumGreaterThan100(int [] numbers){
    int sum = 0;
    for (int number : numbers){
        sum += number;
    }
    return sum > 100;
}
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
public static double averageofNumbers(double [] numbers){
    double sum = 0;
    for (double number : numbers){
        sum += number;
    } 
    return sum / numbers.length;
}

//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

public static boolean isTheFirstAverageGreater(double [] firstArray, double [] secondArray){
    double sumFirst = 0;
    for (double number : firstArray){
        sumFirst += number;
    }
    double averageFirst = sumFirst/ firstArray.length;

    double sumSecond = 0;
    for (double number : secondArray){
        sumSecond += number;
    }
    double averageSecond = sumSecond/ secondArray.length;
    return averageFirst > averageSecond;
} 

//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
    return isHotOutside && moneyInPocket > 10.50;
}
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
// This method calculates the factorial of a given number.
    // I created it to demonstrate how recursion works and to solve mathematical problems involving factorials. I have been studying factorials in queuing models. 
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    
}
