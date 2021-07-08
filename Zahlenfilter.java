class Zahlenfilter {
  public static void main(String[] args) {
    int zahl;
    int maxZahlen = 201;
    
    for (zahl = 1; zahl < maxZahlen; zahl++) {
      
      if (zahl % 5 == 0) {
      System.out.println(zahl + " ist durch 5 teilbar!");
      }

      if (zahl % 10 == 9) {
      System.out.println(zahl + " endet auf 9!");
      }

      int vorgaenger = zahl - 1;
      int ergebnis = zahl + vorgaenger;

      if(ergebnis % 3 == 0){
        System.out.println(
        zahl + " und " + vorgaenger + " addiert ergeben " + ergebnis + " und " + ergebnis + " ist durch 3 teilbar");
      }
    }
  }
}