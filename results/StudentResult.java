package results;

public class StudentResult implements Result {
  private int score;

  public StudentResult(int score) {
    this.score = score;
  }

  @Override
  public int getScore() {
    return score;
  }
}