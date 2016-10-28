/* INPUT OUTPUT function from STDIO & String library PART 1 */
#include <stdio.h>
#include <string.h>
/*Bank account program*/
int main()
{
	/*Ask for user name*/
	char name[6];
	/*select account*/
	int account;
	double money = 800.45;
	printf("Please enter your name:");
	gets(name);
	printf("Please enter account type 1-Chequing 2-Saving: ");
	scanf("%d", &account);
	printf("User name:		%s\n", name);
	printf("Account type:		Chequing\n");
	printf("Amount of money:	$%.2lf\n",money);
	return 0;
}

/*OUPUT
User name: 		John
Account type: 		Chequing 
Amount of money: 	$800.45*/
