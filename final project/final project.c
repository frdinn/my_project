#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <malloc.h>
#ifdef __cplusplus__
  #include <cstdlib>
#else
  #include <stdlib.h>
#endif

void CLEAR_SCREEN(){
	if (system("CLS")) system("clear");
}

struct node{
	char code[5];
	int value;
	char item[31];
	int price;
	int stock;
	struct node *right;
	struct node *left;
}*root,*curr;


void preorder(struct node *curr);
void display();

int valid(char kode[4]){
	char *temp;
	char convert[4]="";
	int i,val;
	temp=strchr(kode,'C');
	for(i=0;i<10;i++){
		convert[i]=temp[i];
	}
	convert[0]="\0";
	val=atoi(convert);
	return val;
}

void newItem(){
	struct node *temp,*ptr;
	int h=1;
	int i;
	ptr=(struct node *)malloc(sizeof(struct node));
	do{
		printf(" Input Item Tag C[1-9][1-9][1-9]\t :  ");
		fflush(stdin);gets(ptr->code);
		ptr->value=valid(ptr->code);
	}while((ptr->value<0)||(ptr->value>999));
	do{
		printf(" Input Item [max 30 letter]\t : ");
		fflush(stdin);gets(ptr->item);
		i=strlen(ptr->item);
	}while((i<0)||(i>30));
	do{
		printf(" Input Item Price [Rp.1000 - Rp.100000]\t : ");
		scanf("%d",&ptr->price);
	}while((ptr->price<1000)||(ptr->price>100000));
	do{
		printf(" Input Item Stock [1-20]\t : ");
		scanf("%d",&ptr->stock);
	}while((ptr->stock<1)||(ptr->stock>20));
	
	ptr->left=NULL;
	ptr->right=NULL;
	
	if(root==NULL){
		root=ptr;
		root->left=NULL;
		root->right=NULL;
		printf("\n\n --- Add New Item Success ---");
	}else{
		temp=NULL;
		curr=root;
		while(curr!=NULL){
			temp=curr;
			if(ptr->value<temp->value){
				curr=curr->left;
			}else{
				curr=curr->right;
			}
			h++;
		}
		if(h<=4){
			if(ptr->value<temp->value){
				temp->left=ptr;
			}else{
				temp->right=ptr;
			}
			printf("\n\n --- Add New Item Success ---");
		}else{
			printf("\n\n --- Maximum Tree Level is 4 ---");
		}
	}
}

void addStock(){
	struct node *temp;
	char kode[5];
	int i,t;
	if(root==NULL){
		printf(" --- There Is No Stock ---");
	}else{
		display();
		printf("\n\n\n");
		do{
		printf(" Input Item Code C[1-9][1-9][1-9]\t : ");
		fflush(stdin);gets(kode);
		i=valid(kode);
	}while((i<0)||(i>999));
	curr=root;
	if(i == root->value){
		printf("\n Item Code\t : %s",root->code);
		printf("\n Item\t : %s",root->item);
		printf("\n Item Price\t : Rp. %d",root->price);
		printf("\n Item Stock\t : %d",root->stock);
		printf("\n");
		do{
			printf("\n How Many Stock Do You Want to Add [1-20]\t : ");
			scanf("%d",&t);
		}while((t<1)||(t>20));
		root->stock=root->stock+t;
		printf("\n\n\n --- Add Stock Success ---");	
	}else{
		temp=NULL;
		curr=root;
		while(curr!=NULL){
			temp=curr;
			if(i == temp->value){
				printf(" Item Code\t : %s",curr->code);
				printf("\n Item\t : %s",curr->item);
				printf("\n Item Price\t : Rp. %d",curr->price);
				printf("\n Item Stock\t : %d",curr->stock);
				do{
					printf("\n\n How Many Stock Do You Want to Add [1-20]\t : ");
					scanf("%d",&t);
				}while((t<1)||(t>20));
				curr->stock=curr->stock+t;
				printf("\n\n\n --- Add Stock Success ---");
				break;
			}else{
				if(i < temp->value){
				curr=curr->left;
			}else{
				curr=curr->right;
			}	
		}
		}
	}
	}
}

void changePrice(){
	struct node *temp;
	char kode[5];
	int i;
	if(root==NULL){
		printf(" --- There Is No Stock ---");
	}else{
		display();
		do{
		printf(" Input Item Code C[1-9][1-9][1-9]\t : ");
		fflush(stdin);gets(kode);
		i=valid(kode);
	}while((i<0)||(i>999));
	curr=root;
	if(i == root->value){
		printf(" Item Code\t : %s",root->code);
		printf("\n Item\t : %s",root->item);
		printf("\n Item Price\t : Rp.%d",root->price);
		printf("\n Item Stock\t : %d",root->stock);
		do{
			printf("\n\n What is The New Price of %s [Rp.1000-Rp.100000] : ",root->item);
			scanf("%d",&root->price);
		}while((root->price<1000)||(root->price>100000));
		printf("\n\n --- Change Price Success ---");		
	}else{
		temp=NULL;
		curr=root;
		while(curr!=NULL){
			temp=curr;
			if(i == temp->value){
				printf(" Item Code\t : %s",curr->code);
				printf("\n Item\t : %s",curr->item);
				printf("\n Item Price\t : Rp. %d",curr->price);
				printf("\n Item Stock\t : %d",curr->stock);
				do{
					printf("\n\n What is The New Price of %s [Rp.1000-Rp.100000]\t : ",curr->item);
					scanf("%d",&curr->price);
				}while((curr->price<1000)||(curr->price>100000));
				printf("\n\n\n --- Change Price Success ---");
				break;
			}else{
				if(i < temp->value){
				curr=curr->left;
			}else{
				curr=curr->right;
			}	
		}
		}
	}
	}
}

void takeStock(){
	struct node *temp;
	char kode[5];
	int i,t;
	if(root==NULL){
		printf(" --- There Is No Stock ---");
	}else{
		display();
		do{
		printf(" Input Item Code C[1-9][1-9][1-9][1-9]\t : ");
		fflush(stdin);gets(kode);
		i=valid(kode);
	}while((i<0)||(i>1000));
	if(i == root->value){
		printf(" Item Code\t : %s",root->code);
		printf("\n Item\t : %s",root->item);
		printf("\n Item Price\t : Rp.%d",root->price);
		printf("\n Item Stock\t : %d",root->stock);
		do{
			printf("\n\n How Many Item Do You Want to Take [1-%d]: ",root->stock);
			scanf("%d",&t);
		}while((t<1)||(t>root->stock));
		root->stock=root->stock-t;
		printf("\n\n\n --- Take Item Success ---");
	}else{
		temp=NULL;
		curr=root;
		while(curr!=NULL){
			temp=curr;
			if(i == temp->value){
				printf(" Item Code\t : %s",curr->code);
				printf("\n Item\t : %s",curr->item);
				printf("\n Item Price\t : Rp.%d",curr->price);
				printf("\n Item Stock\t : %d",curr->stock);
			do{
				printf("\n\n How Many Item Do You Want to Take [1-%d]: ",curr->stock);
				scanf("%d",&t);
			}while((t<1)||(t>curr->stock));
			curr->stock=curr->stock-t;
			printf("\n\n\n --- Take Item Success ---");
			break;
			}else{
				if(i < temp->value){
					curr=curr->left;
				}else{
					curr=curr->right;
				}
			}
		}
	}
	}
}

void modify(){
	char pil;
	printf(" Makmur Sentosa\n");
	printf(" **************\n");
	printf(" 1. Add Stock\n");
	printf(" 2. Take Stock\n");
	printf(" 3. Change Price\n");
	printf(" 4. Cancel\n");
	do{
		printf("\n >> Input Choice : ");
		pil=getche();
	}while((pil!='1')&&(pil!='2')&&(pil!='3')&&(pil!='4'));
	switch(pil){
		case '1' :
			CLEAR_SCREEN();
			addStock();
			break;
		case '2' :
			CLEAR_SCREEN();
			takeStock();
			break;
		case '3' :
			CLEAR_SCREEN();
			changePrice();
			break;
	}
}

void preorder(struct node *curr){
	int no=1;
	if(curr!=NULL){
		printf("  | %-10s | %-30s | %5d | Rp.%-10d | \n",curr->code,curr->item,curr->stock,curr->price);
		preorder(curr->left);
		preorder(curr->right);
		no++;
	}
}

void display(){
	if(root==NULL){
		printf(" --- There's No Item ---");
	}else{
	printf("\t\t\t Makmur Sentosa\n");
	printf("\t\t\t **************\n\n"); 
	printf(" ========================================================================\n");
	printf("  | %-10s | %-30s | %-5s | %-13s | \n","Code","Item","Stock","Price");
	printf(" ========================================================================\n");
	curr=root;
	preorder(curr);
	printf(" ========================================================================\n");
	}	
}

	int main(){
		char pil;
		do{
			CLEAR_SCREEN();
			printf(" Makmur Sentosa\n");
			printf(" **************\n");
			printf(" 1. Add New Item\n");
			printf(" 2. Modify Stock\n");
			printf(" 3. Display Stock (preorder)\n");
			printf(" 4. Exit");
			do{
				printf("\n\n >> Input Your Choice : ");
				pil=getche();
			}while((pil!='1')&&(pil!='2')&&(pil!='3')&&(pil!='4'));
			switch(pil){
				case '1' :
					CLEAR_SCREEN();
					newItem();
					break;
				case '2' :
					CLEAR_SCREEN();
					modify();
					break;
				case '3' :
					CLEAR_SCREEN();
					display();
					break;
			}
			if(pil!='4')
				getche();
		}while(pil!='4');
		return 0;
	}
