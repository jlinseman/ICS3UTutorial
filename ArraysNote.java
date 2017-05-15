class ArraysNote
 /* Write a program that uses an 
  * array to store 10 student grades. 
  * Ask the user for their course name
  * and grade.  
  * When the 10th grade is entered, print out the list of grades.
  *Determine the average of the grades 
  * by traversing the array using a for-loop.
  */
{
  public static void main(String[] args)
  {
    //array to store 10 student course names.
    String[] courseNames = new String[10];
    
    //array to store 10 student grades.
    int[] grade = new int[10];
    
    /*Ask the user to enter each course name and the 
    *corresponding course grade
    */
    for (int count = 1; count <= 10; count = count + 1)
    {
      // Get course name
      System.out.print("Enter student " + count + "'s course name: ");
      courseNames[count-1] = In.getString();
      System.out.print("");
      // Get student grade
      System.out.print("Enter student " + count + "'s grade: ");
            grade[count-1] = In.getInt();
    } 
  
   /*Brief statement to suggest 
    * we are going to display the student's grades 
    */
     
   System.out.println("Here are all the student courses and grades:");
   
   //Display each course and grade one after the other
  System.out.print("Course Grades: ");
  printArray(grade);
            
     //Obtain the average:
     
     //Add all grades together
     int numerator = 0;
      for (int count = 1; count <= 10; count = count + 1)
{
     numerator = numerator + grade[count-1];     
} 
     //Divide by how many there are to get average
      
      double average = numerator/grade.length;
      System.out.print("The class average is: " 
                         + average);
  }
  
  //Method to print any array
  public static void printArray(int[] ArrayToBePrinted)
  {
    int i = ArrayToBePrinted.length;
   for (int j = 1; j <= i; j++)
   {
     System.out.print(ArrayToBePrinted[j-1]);           
   }
  }
} 
  
  
  
