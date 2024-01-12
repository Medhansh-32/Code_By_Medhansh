#include<stdlib.h>
#include <stdio.h>

struct node{
    int data;
    struct node*link;
};
struct node *bet_add(struct node *head,int pos,int data){
    struct node *ptr=head;
    int count=1;
    struct node*temp = malloc(sizeof(struct node));
    temp->data=data;
    temp->link=NULL;
    while(count!=pos-1){
        ptr=ptr->link;
       count++; 
        
    }
    
       temp->link=ptr->link;
        ptr->link=temp;
      
       
         } 

int main()
{

struct node *head = malloc(sizeof(struct node));
head->data=23;
head->link=NULL;

struct node *current= malloc(sizeof(struct node));
current->data=97;
current->link=NULL;
head->link=current;

current=malloc(sizeof(struct node));
current->data=64;
current->link=NULL;
head->link->link=current;

current=malloc(sizeof(struct node));
current->data=45;
current->link=NULL;
head->link->link->link=current;

bet_add(head,3,37);

 struct node * ptr;
ptr=head;
    
         while(ptr!=NULL){
           printf("%d  ",ptr->data); 
  ptr=ptr->link;
 
}
           
  
    return 0;
}


