
#include <stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *link;
};
struct node *add_first(struct node*head,int data){
    
    struct node *ptr=malloc(sizeof(struct node));
    ptr->data=data;
    ptr->link=head;
    
   head=ptr;
    return head;
}
int main()
{
   struct node *head = malloc(sizeof(struct node));
head->data=12;
head->link=NULL;

struct node *current =malloc(sizeof(struct node));
current->data=22;
current->link=NULL;
head->link=current;

current = malloc(sizeof(struct node));
current->data=43;
current->link=NULL;
head->link->link=current;

head =add_first(head,54);
struct node*ptr=head;
while(ptr!=NULL){
    printf("%d ",ptr->data);
ptr=ptr->link;
    
}
    return 0;
}


