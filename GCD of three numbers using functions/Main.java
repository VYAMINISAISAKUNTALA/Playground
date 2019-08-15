#include <stdio.h>
int main() {
  int n1,n2,n3,result,res;
  scanf("%d %d %d",&n1,&n2,&n3);
  result=gcd(n1,n2);
  res=gcd(result,n3);
  printf("%d",res);
	//Type your code here
	return 0;
}
int gcd(int a,int b)
{
  int min,gcd1;
  if(a < b)
  {
    min=a;
  }
  else
  {
    min=b;
  }
  while(min >= 1)
  {
    if((a % min == 0) && (b % min == 0))
    {
      gcd1=min;
      break;
    }
    min--;
  }
  return gcd1;
}