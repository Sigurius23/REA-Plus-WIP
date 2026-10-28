package p005a3;

import java.util.Comparator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0269y1 implements Comparator {

    /* JADX INFO: renamed from: x */
    public static final C0269y1 f920x = new C0269y1(0);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f921w;

    public /* synthetic */ C0269y1(int i13) {
        this.f921w = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f921w) {
            case 0:
                C0230n0 c0230n0 = (C0230n0) obj;
                C0230n0 c0230n1 = (C0230n0) obj2;
                int iM65751k = AbstractC22676k.m65751k(c0230n1.f767O, c0230n0.f767O);
                return iM65751k != 0 ? iM65751k : AbstractC22676k.m65751k(c0230n0.hashCode(), c0230n1.hashCode());
            default:
                C0230n0 c0230n2 = (C0230n0) obj;
                C0230n0 c0230n3 = (C0230n0) obj2;
                int iM65751k2 = AbstractC22676k.m65751k(c0230n2.f767O, c0230n3.f767O);
                return iM65751k2 != 0 ? iM65751k2 : AbstractC22676k.m65751k(c0230n2.hashCode(), c0230n3.hashCode());
        }
    }
}
