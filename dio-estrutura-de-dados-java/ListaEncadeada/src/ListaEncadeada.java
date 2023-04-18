public class ListaEncadeada<T> {

    private T conteudo;
    private ListaEncadeada proximoNo = null;

    public ListaEncadeada(T conteudo){
        this.conteudo = conteudo;
    }

    public ListaEncadeada(T conteudo, ListaEncadeada proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public ListaEncadeada getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(ListaEncadeada proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" + conteudo + '}';
    }

    public String toStringEncadeado() {
        String str = "No{" + conteudo + "}";

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->null";
        }
        return str;
    }

    public void add(String string) {
    }

    public void remove(int i) {
    }

    public char[] get(int i) {
        return null;
    }
}