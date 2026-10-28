package wa3;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: wa3.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C36993f0 implements Iterator {

    /* JADX INFO: renamed from: w */
    public int f158334w = -1;

    /* JADX INFO: renamed from: x */
    public boolean f158335x;

    /* JADX INFO: renamed from: y */
    public Iterator f158336y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C36983a0 f158337z;

    public C36993f0(C36983a0 c36983a0) {
        this.f158337z = c36983a0;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m118775a() {
        if (this.f158336y == null) {
            this.f158336y = this.f158337z.f158311y.entrySet().iterator();
        }
        return this.f158336y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f158334w + 1 < this.f158337z.f158310x.size() || m118775a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f158335x = true;
        int i13 = this.f158334w + 1;
        this.f158334w = i13;
        C36983a0 c36983a0 = this.f158337z;
        return i13 < c36983a0.f158310x.size() ? (Map.Entry) c36983a0.f158310x.get(this.f158334w) : (Map.Entry) m118775a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f158335x) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f158335x = false;
        int i13 = C36983a0.f158307F;
        C36983a0 c36983a0 = this.f158337z;
        c36983a0.m118728b();
        if (this.f158334w >= c36983a0.f158310x.size()) {
            m118775a().remove();
            return;
        }
        int i14 = this.f158334w;
        this.f158334w = i14 - 1;
        c36983a0.m118732g(i14);
    }
}
