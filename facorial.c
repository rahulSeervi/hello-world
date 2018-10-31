#include<stdio.h>
#include<conio.h>
int main()
{
    int fact=1,n=0;
    printf("Enter the number to find the factorail of a number\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    print("Factorial of" n "is",fact);
}
