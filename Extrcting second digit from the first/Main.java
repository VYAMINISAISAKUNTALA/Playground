#include <stdio.h>
int main() {
  int n,second_digit;
  scanf("%d",&n);
  while(n > 10)
  {
    second_digit=n%10;
    n=n/10;
  }
  printf("%d",second_digit);
    
  /*if(n > 30)
  {
      n=(n/1000)%10;
      printf("%d",n);
  }
  else
  {
    n=n%10;
    printf("%d",n);
  }*/
    
  
	//Type your code
	return 0;
}