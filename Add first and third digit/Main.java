#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int first_digit=n/100;
  int third_digit=n%10;
  int sum=first_digit+third_digit;
  printf("%d",sum);
  //Type your code here
  return 0;
}