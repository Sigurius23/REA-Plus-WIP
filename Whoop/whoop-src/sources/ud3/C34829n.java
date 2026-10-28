package ud3;

import java.util.Comparator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C34829n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a5 = (String) obj;
        String b = (String) obj2;
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        int iMin = Math.min(a5.length(), b.length());
        for (int i13 = 4; i13 < iMin; i13++) {
            char cCharAt = a5.charAt(i13);
            char cCharAt2 = b.charAt(i13);
            if (cCharAt != cCharAt2) {
                return AbstractC22676k.m65751k(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a5.length();
        int length2 = b.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
