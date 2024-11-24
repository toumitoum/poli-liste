public class Node {

    int paowr;
    int coeff;
    Node next;

    public void setnext(Node p){
        this.next=p; 
    }
    public Node getnext(){
        return next;
    }
    public void setpaowr(int p){
        this.paowr=p;

    }
    public void setcoeff(int p){
        this.coeff=p;
    }
    public int getpaowr(){
        return paowr;
    }
    public int getcoeff(){
        return coeff;
    }

}