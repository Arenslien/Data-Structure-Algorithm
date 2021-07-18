package RecursiveAndBacktracking;

public class hanoi {
  static void towerOfHanoi(int n, int start, int mid, int end) {
    if(n == 1) {
      System.out.println(1 + "번째 원반 -> " + end + "번째 막대로");
      return;
    } else {
      // 맨 아래 원반을 제외한 원반들을 mid로 옮기기
      towerOfHanoi(n - 1, start, end, mid);
      
      // 맨 아래 원반을 end로 옮기기
      System.out.println(n + "번째 원반 -> " + end + "번째 막대로");
  
      // 가운데 있는 원반들을 end로 옮기기
      towerOfHanoi(n - 1, mid, start, end);
    }
  }

  static public void main(String[] args) {
    for(int i = 1; i <= 5; i++) {
      System.out.println("하노이의 탑 원반 " + i + "개");
      towerOfHanoi(i, 1, 2, 3);
      System.out.println();
    }
  }
}
