#include <stdio.h>
int main()
{
  int n1,n2,n3,result,res;
  scanf("%d %d",&n1,&n2,&n3);
  result=greatest(n1,n2);
  res=greatest(result,n3);
  printf("%d",res);
	// Type your code here
  	return 0;
}
int greatest(int a,int b)
{
  int big;
  if(a > b)
  {
    big=a;
  }
  else
  {
    big=b;
  }
}