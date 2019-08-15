#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    if(isprime(i))
    {
      printf("%d\n",i);
    }
  }
    // Type your code here
    return 0;
}
int isprime(int m)
{
  int is_prime=1;
  for(int num=2;num<=m/2;num++)
  {
    if(m % num == 0)
    {
      is_prime=0;
      break;
    }
  }
  return is_prime;
}