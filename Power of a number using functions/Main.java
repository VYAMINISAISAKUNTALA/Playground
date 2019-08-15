#include<stdio.h>
#include<math.h>
int main(){
  int base,exponent;
  scanf("%d %d",&base,&exponent);
  power(base,exponent);
    // Type your code here
  	return 0;
}
int power(int b,int e)
{
  int res;
  res=pow(b,e);
  printf("%d",res);
}
  