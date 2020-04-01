/*
- 同じオブジェクトのハッシュ値は、必ず同一となる
- ハッシュ値が異なる場合には、異なるオブジェクトである
- 異なるオブジェクトでもハッシュ値が同じになることがある
 */
package オブジェクトの等価性;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        // Objects.hash(this.x, this.y); 簡単にhashCodeを生成できる
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        }

        Point other = (Point) obj;
        if (x != other.x) {
            return false;
        } else if (y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Point [x=").append(x).append(", y=").append(y).append("]");
        return builder.toString();
    }
}
