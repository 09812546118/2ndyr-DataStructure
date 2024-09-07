#include <stdlib.h>
#include <stdio.h>
#include <conio.h>

typedef struct stack{
    char* items;
    int top;
    int size;
}STACK;

typedef enum{false,true} boolean;

STACK* createStack(int size){
    STACK* stack = (STACK*)malloc(sizeof(STACK));
        stack->items=(char*)calloc(size,sizeof(char));
        stack->top = 0;
        stack->size = size;
    return stack;
}

boolean isFull(STACK* s)        { return s->size == s->top; }

boolean isEmpty(STACK* s)        { return s->top == 0;}

boolean push(STACK* s,char ch)    {
    boolean ok=!isFull(s);
        if(ok) s->items[s->top++] = ch;
    return ok;
}

char peek(STACK* s)                { return (!isEmpty(s))? s->items[s->top-1]:'\0';}

char pop(STACK* s)                {
    char ch = peek(s);
        if(ch!='\0') s->items[--s->top]='\0';
    return ch;      
}

void displayStack(STACK* s){
    int i=s->top;
    for(;i>-1;printf("%c",s->items[i]),i--);
}

int main(){
    STACK* s = createStack(10);
        push(s,'a');
        push(s,'b');
        push(s,'c');
        push(s,'d');
        push(s,'e');
        displayStack(s);
        printf("\npeeking : %c\n",pop(s));
        displayStack(s);
        printf("\npopping : %c\n",pop(s));
        displayStack(s);
        printf("\npopping : %c\n",pop(s));
        displayStack(s);
                             
        getch();
}