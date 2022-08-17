package prg9;

public class StackInterface {
    public static void main(String args[]){


        FixedLengthStack fi=new FixedLengthStack(10);
        DynamicStack dy=new DynamicStack(5);
        issimplestack istack;
        istack=fi;
        System.out.println("\nFixed length contents are");
        for(int i=0;i<10;i++){
        istack.push((char)('A'+i));
        }
        for(int i=0;i<10;i++){
            System.out.print(istack.pop()+"\t"); 
        }
        System.out.println("\nContents of Dynamic Stack");
        for(int i=0;i<10;i++){
            istack.push((char)('A'+i));

        }
        for(int i=0;i<10;i++){
            System.out.print(istack.pop()+"\t");
        }
    }
}
