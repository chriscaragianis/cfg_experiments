import java.lang.StringBuilder;

class Parens {
  private boolean counter(String input, boolean direction) {
    int left = 0;
    int right = 0;
    String[] letters = input.split("");
    for (String v : letters) {
      if (v.equals("(")) {
        left++;
      } else if (v.equals(")")) {
        right++;
      }
      if ((right > left && direction) || (left > right && !direction)) {
        return false;
      }
    }
    return true;
  }

  public boolean parse(String input) {
    return counter(input, true) && counter(new StringBuilder(input).reverse().toString(), false);
  }
}
