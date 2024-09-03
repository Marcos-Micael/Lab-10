package lab10;

public class ISimpleStackDemo {
    public static void main(String[] args) {
   
        ISimpleStack dynamicStack = new DynamicStack(2);
        System.out.println("testando pilha dinâmica:");
        testStack(dynamicStack);
     
        ISimpleStack fixedLengthStack = new FixedLengthStack(3);
        System.out.println("Testando pilha de comprimento fixo:");
        testStack(fixedLengthStack);
    }

    private static void testStack(ISimpleStack stack) {
        stack.push('A');
        
        stack.push('C'); 

        System.out.println("\r\n"
        		+ "Elemento superior após push: " + stack.peek());
        System.out.println("tamanho de stack: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("Elemento apos o pop: " + stack.pop());
        }

        System.out.println("A pilha está vazia? " + stack.isEmpty());
        stack.reset();
        System.out.println("Tamanho da pilha após redefinição: " + stack.size());
    }
}
