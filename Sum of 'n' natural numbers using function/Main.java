#include<stdio.h>
int sum_of_digits(int num)
{
  int sum=0;
  for(int i=1;i<=num;i++)
  {
    sum=sum+i;
  }
  return sum;
}
int main() 
{
  int n;
  scanf("%d",&n);
  int res=sum_of_digits(n);
  printf("%d",res);
  
    // Type your code here
  	return 0;
}