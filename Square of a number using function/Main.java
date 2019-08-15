#include<stdio.h>
int square(int num)
{
  return num*num;
}
int main()
{
  int n;
  scanf("%d",&n);
  int res=square(n);
  printf("%d",res);
   // Type your code here
   return 0;
}