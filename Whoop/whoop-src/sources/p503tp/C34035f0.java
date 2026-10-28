package p503tp;

import java.util.Comparator;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: tp.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C34035f0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C34026b c34026b = (C34026b) obj;
        C34026b c34026b2 = (C34026b) obj2;
        AbstractC35135w.m111094f(c34026b);
        AbstractC35135w.m111094f(c34026b2);
        int i13 = c34026b.f142670w;
        int i14 = c34026b2.f142670w;
        if (i13 != i14) {
            return i13 >= i14 ? 1 : -1;
        }
        int i15 = c34026b.f142671x;
        int i16 = c34026b2.f142671x;
        if (i15 == i16) {
            return 0;
        }
        return i15 < i16 ? -1 : 1;
    }
}
