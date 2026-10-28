package ne3;

import java.util.RandomAccess;
import m83.AbstractC25242e;

/* JADX INFO: renamed from: ne3.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26607c0 extends AbstractC25242e implements RandomAccess {

    /* JADX INFO: renamed from: w */
    public final C26624l[] f105835w;

    /* JADX INFO: renamed from: x */
    public final int[] f105836x;

    public C26607c0(C26624l[] c26624lArr, int[] iArr) {
        this.f105835w = c26624lArr;
        this.f105836x = iArr;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f105835w.length;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C26624l) {
            return super.contains((C26624l) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        return this.f105835w[i13];
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C26624l) {
            return super.indexOf((C26624l) obj);
        }
        return -1;
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C26624l) {
            return super.lastIndexOf((C26624l) obj);
        }
        return -1;
    }
}
