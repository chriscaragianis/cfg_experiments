import java.util.regex.Pattern;

class Parens {

  public boolean parse(String input) {
    return check(strip(input));
  }

  private boolean check(String input) {
    if (input.equals("")) {
      return true;
    }
    if (reduce(input).equals(input)) {
      return false;
    } else {
      return check(reduce(input));
    }
  }

  private String reduce(String input){
    return input.replaceAll(Pattern.quote("()"), "");
  }
  private String strip(String input){
    return input.replaceAll("[^()]", "");
  }
}
