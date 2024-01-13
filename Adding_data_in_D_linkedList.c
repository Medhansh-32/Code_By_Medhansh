#include<stdlib.h>
#include <stdio.h>

struct node{
    struct node*prev;
    int data;
    struct node*next;
};
struct node*addbeg(struct node*head,int data){
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->data=data;
    temp->next=NULL;
    head->prev=temp;
    temp->next=head;
    head=temp;
    return head;
}
struct node*addback(struct node*head,int data){
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->data=data;
    temp->next=NULL;
    struct node*ptr=head;
    while(ptr->next != NULL){
        ptr=ptr->next;
    }
ptr->next=temp;
temp->prev=ptr;
}
struct node*addbet(struct node*head,int pos,int data){
    struct node*ptr=head;
    struct node*temp=malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->data=data;
    temp->next=NULL;
    int count=1;
    while(count!=pos-1){
        ptr=ptr->next;
        count++;
    }
   struct node*ptr1;
ptr1=ptr->next;
ptr->next=temp;
ptr1->prev=temp;
temp->prev=ptr;
temp->next=ptr1;
}

int main(){
    struct node*head=malloc(sizeof(struct node));
    head->prev=NULL;
    head->data=70;
    head->next=NULL;
    head = addbeg(head,60);
    head = addbeg(head,50);
    head = addbeg(head,40);
    head = addbeg(head,10);
    addback(head,80);
      addbet(head,2,20);
      addbet(head,3,30);
struct node*temp=head;
while(temp !=NULL){
    
    printf("%d->",temp->data);
    temp=temp->next;
}
printf("NULL");
   
    
    return 0;
}


