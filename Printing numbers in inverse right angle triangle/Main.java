#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  for(int cur_row=n;cur_row>=1;cur_row--)
  {
    int num=cur_row;
    for(int cur_col=1;cur_col<=cur_row;cur_col++)
    {
      printf("%d",num);
      num=num-1;
    }
    printf("\n");
  }
    // Type your code here
	return 0;
}