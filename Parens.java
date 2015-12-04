import java.util.regex.Pattern;

class Parens {

  //Returns true if input is a well-formed string of parens.
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

  //Reduction rule.  Removes adjacent paren pairs.
  private String reduce(String input){
    return input.replaceAll(Pattern.quote("()"), "");
  }
  //Removes all non-paren characters
  private String strip(String input){
    return input.replaceAll("[^()]", "");
  }
  //Adapter for tests.  Calls check on a stripped version of the input.
  public boolean parse(String input) {
    return check(strip(input));
  }
}
