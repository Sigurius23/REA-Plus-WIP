package mp;

import java.io.Serializable;

/* JADX INFO: renamed from: mp.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C25806w extends AbstractC25808x implements Serializable {

    /* JADX INFO: renamed from: x */
    public static final C25806w f101547x = new C25806w(0);

    /* JADX INFO: renamed from: y */
    public static final C25806w f101548y = new C25806w(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101549w;

    public /* synthetic */ C25806w(int i13) {
        this.f101549w = i13;
    }

    @Override // mp.AbstractC25808x
    /* JADX INFO: renamed from: a */
    public final AbstractC25808x mo76003a() {
        switch (this.f101549w) {
            case 0:
                return f101548y;
            default:
                return f101547x;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f101549w) {
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
        switch (this.f101549w) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
