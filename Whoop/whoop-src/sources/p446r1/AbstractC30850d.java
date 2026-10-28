package p446r1;

import java.util.List;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: r1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30850d {
    /* JADX INFO: renamed from: a */
    public static final void m94897a(int i13, List list) {
        int size = list.size();
        if (i13 < 0 || i13 >= size) {
            m94899c(i13, size);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m94898b(int i13, int i14, List list) {
        if (i13 > i14) {
            m94902f(i13, i14);
        }
        if (i13 < 0) {
            m94900d(i13);
        }
        if (i14 > list.size()) {
            m94901e(i14, list.size());
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m94899c(int i13, int i14) {
        throw new IndexOutOfBoundsException(AbstractC25012a.m73372e(i13, i14, "Index ", " is out of bounds. The list has ", " elements."));
    }

    /* JADX INFO: renamed from: d */
    private static final void m94900d(int i13) {
        throw new IndexOutOfBoundsException(AbstractC2875y.m8296i(i13, "fromIndex (", ") is less than 0."));
    }

    /* JADX INFO: renamed from: e */
    private static final void m94901e(int i13, int i14) {
        throw new IndexOutOfBoundsException("toIndex (" + i13 + ") is more than than the list size (" + i14 + ')');
    }

    /* JADX INFO: renamed from: f */
    private static final void m94902f(int i13, int i14) {
        throw new IllegalArgumentException(AbstractC25012a.m73372e(i13, i14, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
