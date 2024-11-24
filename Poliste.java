public class Poliste {
    private Node head = null;
    private int lange;

    public void add(int paowr, int coeff) {
        Node newNode = new Node();
        newNode.setcoeff(coeff);
        newNode.setpaowr(paowr);
        if (head == null) {
            head = newNode;
            lange++;
        } else {
            if (head.getpaowr() < paowr) {
                newNode.setnext(head);
                head = newNode;
                lange++;
            } else {
                Node p = head;
                while (p.getnext() != null && p.getnext().getpaowr() >= paowr) {
                    p = p.getnext();
                }
                if (p.getpaowr() == paowr) {
                    p.setcoeff(p.getcoeff() + coeff);
                } else {
                    newNode.setnext(p.getnext());
                    p.setnext(newNode);
                    lange++;
                }
            }
        }
    }

    public void display() {
        Node current = head;
        String s = "";
        while (current != null) {
            System.out.print(s + current.getcoeff() + "x^" + current.getpaowr());
            current = current.getnext();
            s = " + ";
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public static Poliste addPolynomials(Poliste list1, Poliste list2) {
        Poliste result = new Poliste(); 
        Node p1 = list1.getHead();
        Node p2 = list2.getHead();

        while (p1 != null || p2 != null) {
            if (p1 == null) {
                result.add(p2.getpaowr(), p2.getcoeff());
                p2 = p2.getnext();
            } else if (p2 == null) {
                result.add(p1.getpaowr(), p1.getcoeff());
                p1 = p1.getnext();
            } else if (p1.getpaowr() > p2.getpaowr()) {
                result.add(p1.getpaowr(), p1.getcoeff());
                p1 = p1.getnext();
            } else if (p1.getpaowr() < p2.getpaowr()) {
                result.add(p2.getpaowr(), p2.getcoeff());
                p2 = p2.getnext();
            } else {
                result.add(p1.getpaowr(), p1.getcoeff() + p2.getcoeff());
                p1 = p1.getnext();
                p2 = p2.getnext();
            }
        }

        return result;
    }

    public static Poliste subtractPolynomials(Poliste list1, Poliste list2) {
        Poliste result = new Poliste(); 
        Node p1 = list1.getHead();
        Node p2 = list2.getHead();

        while (p1 != null || p2 != null) {
            if (p1 == null) {
                result.add(p2.getpaowr(), -p2.getcoeff());
                p2 = p2.getnext();
            } else if (p2 == null) {
                result.add(p1.getpaowr(), p1.getcoeff());
                p1 = p1.getnext();
            } else if (p1.getpaowr() > p2.getpaowr()) {
                result.add(p1.getpaowr(), p1.getcoeff());
                p1 = p1.getnext();
            } else if (p1.getpaowr() < p2.getpaowr()) {
                result.add(p2.getpaowr(), -p2.getcoeff());
                p2 = p2.getnext();
            } else {
                result.add(p1.getpaowr(), p1.getcoeff() - p2.getcoeff());
                p1 = p1.getnext();
                p2 = p2.getnext();
            }
        }

        return result;
    }
}
