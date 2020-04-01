package ソート;

public class ComparableSample implements Comparable<ComparableSample> {

    private int score;

    public ComparableSample(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(ComparableSample o) {
        return Integer.compare(o.getScore(), getScore());
    }
}
