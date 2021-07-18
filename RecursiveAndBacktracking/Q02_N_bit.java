package RecursiveAndBacktracking;

public class Q02_N_bit {
  static void createNbitString(int N) {
    int[] array = new int[N];

    for (int i = 0; i < 1 << N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(array[j]);
      }
      for (int j = 0; j < N; j++) {
        if (array[j] == 0) {
          array[j]++;
          break;
        } else {
          array[j]--;
        }
        
      }
      System.out.println();
    }
  }

  static public void main(String[] args) {

    System.out.println();
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + " 비트 문자열");
      createNbitString(i);
    }

  }
}
