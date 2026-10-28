package p027b3;

/* JADX INFO: renamed from: b3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C2371f extends AbstractC2351b {

    /* JADX INFO: renamed from: d */
    public static C2371f f9353d;

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: C */
    public final int[] mo7244C(int i13) {
        int length = m7267u().length();
        if (length <= 0 || i13 <= 0) {
            return null;
        }
        if (i13 > length) {
            i13 = length;
        }
        while (i13 > 0 && m7267u().charAt(i13 - 1) == '\n' && !m7302L(i13)) {
            i13--;
        }
        if (i13 <= 0) {
            return null;
        }
        int i14 = i13 - 1;
        while (i14 > 0 && (m7267u().charAt(i14) == '\n' || (i14 != 0 && m7267u().charAt(i14 - 1) != '\n'))) {
            i14--;
        }
        return m7265s(i14, i13);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m7302L(int i13) {
        if (i13 <= 0 || m7267u().charAt(i13 - 1) == '\n') {
            return false;
        }
        return i13 == m7267u().length() || m7267u().charAt(i13) == '\n';
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: n */
    public final int[] mo7261n(int i13) {
        int length = m7267u().length();
        if (length <= 0 || i13 >= length) {
            return null;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        while (i13 < length && m7267u().charAt(i13) == '\n' && (m7267u().charAt(i13) == '\n' || (i13 != 0 && m7267u().charAt(i13 - 1) != '\n'))) {
            i13++;
        }
        if (i13 >= length) {
            return null;
        }
        int i14 = i13 + 1;
        while (i14 < length && !m7302L(i14)) {
            i14++;
        }
        return m7265s(i13, i14);
    }
}
