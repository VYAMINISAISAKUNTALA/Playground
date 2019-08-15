#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int second_digit=(n%100)/10;
  printf("%d",second_digit);
  //Type your code here
  return 0;
}