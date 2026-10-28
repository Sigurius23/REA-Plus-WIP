package p690zr;

import java.io.Serializable;

/* JADX INFO: renamed from: zr.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41056u0 extends AbstractC41058v0 implements Serializable {

    /* JADX INFO: renamed from: x */
    public static final C41056u0 f177063x = new C41056u0(0);

    /* JADX INFO: renamed from: y */
    public static final C41056u0 f177064y = new C41056u0(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177065w;

    public /* synthetic */ C41056u0(int i13) {
        this.f177065w = i13;
    }

    @Override // p690zr.AbstractC41058v0
    /* JADX INFO: renamed from: a */
    public final AbstractC41058v0 mo133240a() {
        switch (this.f177065w) {
            case 0:
                return f177064y;
            default:
                return f177063x;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f177065w) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f177065w) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
