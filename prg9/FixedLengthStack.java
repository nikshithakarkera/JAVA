package prg9;

public class FixedLengthStack implements issimplestack{
    private char[] data;
    private int tos;
    FixedLengthStack(int size){
        data=new char[size];
        tos=0;
    }
    public void push(char ch){
        if(isFull())
        {
            System.out.println("---Stack is full");
            return;
        }
        data[tos]=ch;
        tos++;
        }
        public char pop(){
            if(isEmpty()){
                System.out.print("----Stack is empty");
                return(char)0;
            }
            tos--;
            return data[tos];
        }
        public boolean isEmpty(){
            return tos==0;

        }
        public boolean isFull(){
            return tos==data.length;
        }
            }