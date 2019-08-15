#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int num=n,sum=0;
  while(num > 0)
  {
    int last_digit=num % 10;
    int fact=1;
    for(int i=1;i<=last_digit;i++)
    {
      fact=fact*i;
    }
    sum=sum+fact;
    num = num / 10;
  }
  if(sum == n)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
    
      
	//Type your code
	return 0;
}