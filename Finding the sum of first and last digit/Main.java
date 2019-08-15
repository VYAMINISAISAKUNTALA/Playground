#include <stdio.h>
int main() {
  int n,sum=0,first_digit,last_digit;
  scanf("%d",&n);
  last_digit=n % 10;
  while(n > 10)
  {
    first_digit=n/10;
    n=n/10;
  }
  sum=sum+first_digit+last_digit;
  printf("%d",sum);
    
    
  
	//Type your code
	return 0;
}