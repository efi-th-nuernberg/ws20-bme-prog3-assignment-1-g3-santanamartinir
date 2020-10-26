class Zahlenfilter {
  public static void main(String[] args) {
    
    int ZAHL;

    for (ZAHL = 1; ZAHL < 201; ZAHL++) {

      if(ZAHL % 5 == 0) {
      System.out.println(ZAHL + " ist durch 5 teilbar!");
      }

      if(ZAHL % 10 == 9) {
      System.out.println(ZAHL + " endet auf 9!");
      }
      
      int VORGAENGER = ZAHL--;
      int ERGEBNIS = ZAHL + VORGAENGER;

      if(ERGEBNIS % 3 == 0){
        System.out.println(
        ZAHL + " und " + VORGAENGER + " addiert ergeben " + ERGEBNIS + " und " + ERGEBNIS + " ist durch 3 teilbar");
      }

      //System.out.println(ZAHL);
    }
  }
}