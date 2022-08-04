package algo.one;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        var first = 1;
        var last = n;
        var pos = 1;

        while (first <= last) {
            var mid = first + (last - first) / 2;

            if (isBadVersion(mid)) {
                last = mid - 1;
                pos = mid;
            } else {
                first = mid + 1;
            }
        }

        return pos;
    }

    public boolean isBadVersion(int version) {
        return true;
    }
}
