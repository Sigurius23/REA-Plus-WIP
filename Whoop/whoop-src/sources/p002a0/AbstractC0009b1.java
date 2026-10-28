package p002a0;

import java.util.List;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.b1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0009b1 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f23a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final C0047q0 f24b = new C0047q0(0);

    /* JADX INFO: renamed from: a */
    public static final void m11a(int i13, List list) {
        int size = list.size();
        if (i13 < 0 || i13 >= size) {
            AbstractC34924m.m110135Q("Index " + i13 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m12b(int i13, int i14, List list) {
        int size = list.size();
        if (i13 > i14) {
            AbstractC34924m.m110133O("Indices are out of order. fromIndex (" + i13 + ") is greater than toIndex (" + i14 + ").");
            throw null;
        }
        if (i13 < 0) {
            AbstractC34924m.m110135Q("fromIndex (" + i13 + ") is less than 0.");
            throw null;
        }
        if (i14 <= size) {
            return;
        }
        AbstractC34924m.m110135Q("toIndex (" + i14 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
