public class maine {
  public static void main(String[] args) {
      Poliste list1 = new Poliste();
      Poliste list2 = new Poliste();

      list1.add(4, 3);
      list1.add(2, 5);
      list1.add(1, 2);
      System.out.print("Polynomial 1: ");
      list1.display();

      list2.add(3, 4);
      list2.add(2, 1);
      list2.add(1, 6);
      System.out.print("Polynomial 2: ");
      list2.display();

      Poliste sum = Poliste.addPolynomials(list1, list2);
      System.out.print("Sum of Polynomials : \n");
      sum.display();

      Poliste difference = Poliste.subtractPolynomials(list1, list2);
      System.out.print("Difference of Polynomials :\n ");
      difference.display();

     
  }
}
