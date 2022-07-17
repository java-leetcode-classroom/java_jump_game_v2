import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void jumpExample1() {
    assertEquals(2, sol.jump(new int[]{2,3,1,1,4}));
  }

  @Test
  void jumpExample2() {
    assertEquals(2, sol.jump(new int[]{2,3,0,1,4}));
  }
  @Test
  void jumpDpExample1() {
    assertEquals(2, sol.jumpDp(new int[]{2,3,1,1,4}));
  }
  @Test
  void jumpDpExample2() {
    assertEquals(2, sol.jumpDp(new int[]{2,3,0,1,4}));
  }
}