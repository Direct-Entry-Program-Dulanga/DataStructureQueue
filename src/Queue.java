public class Queue {

    private int[] ArrayQ;

    public void enqueue(int number){
        if(ArrayQ == null){
            ArrayQ = new int[1];
            ArrayQ[0] = number;
        }else{
            int[] temp = new int[ArrayQ.length+1];
            for (int i = 0; i < ArrayQ.length; i++) {
                temp[i] = ArrayQ[i];
            }
            temp[temp.length-1] = number;
            ArrayQ = temp;
        }
    }

    public void dequeue(){

    }

    public boolean empty(){
        return ArrayQ == null;
    }

    public int peek(){
        if (empty()){
            System.err.println("Stack is empty");
        }
        return ArrayQ[ArrayQ.length];
    }

    public void clear(){

    }

    public void print(){
        if(empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[ ");
        for (int i = 0; i < ArrayQ.length ; i++) {
            System.out.print(ArrayQ[i]+" ");
        }
        System.out.print(" \b]");
        System.out.println("");
    }

    public boolean contains(int number){
        return true;
    }

    public int size(){
        return 0;
    }


}
