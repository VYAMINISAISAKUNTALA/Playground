#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int first_digit=n/10;
  int second_digit=n%10;
  int sum=first_digit+second_digit;
  printf("%d",sum);
  //Type your code here
  return 0;
}