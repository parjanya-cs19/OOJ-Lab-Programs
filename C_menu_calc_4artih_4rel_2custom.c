#include<stdio.h>
#include<conio.h>
int main()
{
    
char flag;
int n1, n2, result = 0;

while(1)
{
    printf("\nEnter Operator\n+ (addition),\n - (subtraction),\n * (multiplication),\n / (division) ,\n % (remainder) ,\n ^ (num1(to the power)num2) ,\n < (less than?) ,\n > (greater than?),\n = (equal to?),\n ! (not equal to?)\n\n");

    scanf(" %c",&flag);
    
    printf("\nEnter First Value:");
    scanf("%d",&n1);

    

    printf("\nEnter Second Value:");
    scanf("%d",&n2);

switch(flag)
{
    case '+':
        result = n1 + n2;
        printf("\nSum is = %d",result);
    break;
 
    case '-':
        result = n1 - n2;
        printf("\nDifference is = %d",result);
        printf("\n\n Enter value  Again for a New Input\n");
    break;
 
    case '*':
        result = n1 * n2;
        printf("\nProduct is = %d",result);
        printf("\n\n Enter value Again for a New Input\n");
    break;
 
    case '/':
        result = n1 / n2;
        printf("\nQuotient is = %d",result);
        printf("\n\n Enter value Again for a New Input\n");
    break;
 
    case '%':
        result = n1 % n2;
        printf("\nReminder is = %d",result);
        printf("\n\n Enter value Again for a New Input\n");
    break;
   
    case '>':
    if(n1>>n2)
    {
        printf("yes");
    }
    else{
        printf("\n\nNo");
        printf("\n Enter value Again for a New Input\n");
    }
    break;
 
    case '<':
        if(n1>>n2)
        {
            printf("no");
        }
        else{
            printf("\n\nyes");
            printf("\n Enter value Again for a New Input\n");
        }
    break;
  
    case '=':
        if(n1==n2)
        {
            printf("yes");
        }
        else{
            printf("\n\nno");
            printf("\n Enter value Again for a New Input\n");
        }
    break; 
    case '^':
        printf("%lf",pow(n1,n2));
    break; 
 
    case '!':
        if(n1==n2)
        {
            printf("no");
        }
        else{
            printf("\n\nyes");
            printf("\n Enter value Again for a New Input\n");
        }
    break;
 
    default:
        printf("\nEnter value Valid Operator!!!\n");
        printf("\n\n Enter value Again for a New Input\n");
    }
getch();
}
return 0;
}