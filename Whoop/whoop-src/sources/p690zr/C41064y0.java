package p690zr;

import java.util.Map;

/* JADX INFO: renamed from: zr.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41064y0 extends AbstractC41032j0 {

    /* JADX INFO: renamed from: E */
    public final transient Object[] f177075E;

    /* JADX INFO: renamed from: F */
    public final transient int f177076F;

    /* JADX INFO: renamed from: z */
    public final transient C41009b1 f177077z;

    public C41064y0(C41009b1 c41009b1, Object[] objArr, int i13) {
        this.f177077z = c41009b1;
        this.f177075E = objArr;
        this.f177076F = i13;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: c */
    public final int mo133228c(int i13, Object[] objArr) {
        return mo133227a().mo133228c(i13, objArr);
    }

    @Override // p690zr.AbstractC41008b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f177077z.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: g */
    public final boolean mo133226g() {
        return true;
    }

    @Override // p690zr.AbstractC41032j0
    /* JADX INFO: renamed from: n */
    public final AbstractC41023g0 mo133236n() {
        return new C41062x0(this);
    }

    @Override // p690zr.AbstractC41032j0
    /* JADX INFO: renamed from: o */
    public final AbstractC41036k1 iterator() {
        return mo133227a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f177076F;
    }
}
