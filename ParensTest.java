class ParensTest {
  private String[] falseTests;
  private String[] trueTests;

  public ParensTest() {
    falseTests = new String[]{"(",
                  "())",
                  "a)",
                  "(b()",
                  ")$",
                  "(d",
                  ";()(()",
    };
    trueTests = new String[]{"()",
                  "(())",
                  "(a)",
                  "(b())",
                  "()$",
                  "(d)",
                  ";()()()",
    };
  }

  public void runTests() {
    int tests = 0;
    int passes = 0;
    Parens subject = new Parens();
    for (String v : falseTests) {
      tests++;
      if (!subject.parse(v)) {
        passes++;
      } else {
        System.out.println("Failure: expected \'" +
        v + "\' to return false");
      }
    }
    for (String v : trueTests) {
      tests++;
      if (subject.parse(v)) {
        passes++;
      } else {
        System.out.println("Failure: expected \'" +
        v + "\' to return true");
      }
    }
  }
}
