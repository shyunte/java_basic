package Java_basic.LiFOFiFO;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
    
        Stack<StackCoin> stackCoinBoxes = new Stack<StackCoin>();


        stackCoinBoxes.push(new StackCoin(100));
        stackCoinBoxes.push(new StackCoin(15));
        stackCoinBoxes.push(new StackCoin(50));
        stackCoinBoxes.push(new StackCoin(30));
        stackCoinBoxes.push(new StackCoin(75));


        while(!stackCoinBoxes.isEmpty()){
            StackCoin stackCoin = stackCoinBoxes.pop();
            System.out.println("꺼내온 동전 : " + stackCoin.getValue() +"원");
        }
}

    }
