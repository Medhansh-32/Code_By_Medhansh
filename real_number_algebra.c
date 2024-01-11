//Write a program to add, subtract and multiply two complex numbers using structures to function

#include <stdio.h>
  char c ;
  
struct complex{
    int real;
    int imaginary;
}n1,n2;
char sign(int i,char c){
   
 if(i>=0){
    return c='+';
}  
}
 void multiply(struct complex n1,struct complex n2,char c){
     int ans =n1.real*n2.real-n2.imaginary*n1.imaginary;
  
  printf("%d %c %di ",ans,sign(n1.real*n2.imaginary+n1.imaginary*n2.real,c),n1.real*n2.imaginary+n1.imaginary*n2.real);

      
  }
  void sum(struct complex n1,struct complex n2,char c){
    int r = n1.real+n2.real;
    int i = n1.imaginary+n2.imaginary;
printf("%d  %c %di",r,sign(i,c),i); 
      
  }
  void sub(struct complex n1,struct complex n2,char c){
    
      
    int r = n1.real-n2.real;
    int i = n1.imaginary-n2.imaginary;

printf("%d  %c %di",r,sign(i,c),i); 

      
  }


int main()
{
    
printf("Enter the real part of 1st number :");
scanf("%d",&n1.real);
printf("Enter the imaginary part of 1st number :");
scanf("%d",&n1.imaginary);
printf("Enter the real part of 2nd number :");
scanf("%d",&n2.real);
printf("Enter the imaginary part of 2nd number :");
scanf("%d",&n2.imaginary);
multiply(n1,n2,c);
    return 0;
}



