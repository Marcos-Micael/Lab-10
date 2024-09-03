package lab10;

public class DynamicStack implements ISimpleStack {
    private char[] dadosDaPilha;
    private int topo;

    public DynamicStack(int tamanho) {
        this.dadosDaPilha = new char[tamanho];
        this.topo = 0;
    }

    @Override
    public void push(char dado) {
        if (this.topo == this.dadosDaPilha.length) {
            char[] t = new char[this.dadosDaPilha.length * 2];
            System.arraycopy(this.dadosDaPilha, 0, t, 0, this.topo);
            this.dadosDaPilha = t;
        }
        this.dadosDaPilha[topo++] = dado;
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            System.out.println("Pilha Vazia");
            return (char) 0;
        }
        return this.dadosDaPilha[--topo];
    }

    @Override
    public boolean isEmpty() {
        return this.topo == 0;
    }

    @Override
    public boolean isFull() {
        return false; 
    }

    @Override
    public void reset() {
        this.topo = 0;
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Pilha Vazia");
            return (char) 0;
        }
        return this.dadosDaPilha[topo - 1];
    }

    @Override
    public int size() {
        return topo;
    }
}
