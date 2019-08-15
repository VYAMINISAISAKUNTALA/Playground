#include <stdio.h>
#include <math.h> 
int main() {
  int n;
  scanf("%d",&n);
  int num=n;
  int sum=0;

  while( num != 0)
  {
    int last_digit=num % 10;   
    sum=sum + (pow(last_digit,3));
    num= num/10;
  }
  if(sum == n)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
    
	//Type your code
	return 0;
}