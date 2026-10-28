package p440qw;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p441qx.C30712g0;
import p441qx.C30714h0;

/* JADX INFO: renamed from: qw.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30677l implements Iterator {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractMap f126222E;

    /* JADX INFO: renamed from: x */
    public int f126224x;

    /* JADX INFO: renamed from: y */
    public Map.Entry f126225y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f126223w = 0;

    /* JADX INFO: renamed from: z */
    public Map.Entry f126226z = null;

    public AbstractC30677l(C30679n c30679n) {
        this.f126222E = c30679n;
        this.f126225y = c30679n.f126238F.f126235z;
        this.f126224x = c30679n.f126237E;
    }

    /* JADX INFO: renamed from: a */
    public C30678m m94277a() {
        C30678m c30678m = (C30678m) this.f126225y;
        C30679n c30679n = (C30679n) this.f126222E;
        if (c30678m == c30679n.f126238F) {
            throw new NoSuchElementException();
        }
        if (c30679n.f126237E != this.f126224x) {
            throw new ConcurrentModificationException();
        }
        this.f126225y = c30678m.f126235z;
        this.f126226z = c30678m;
        return c30678m;
    }

    /* JADX INFO: renamed from: b */
    public C30712g0 m94278b() {
        C30712g0 c30712g0 = (C30712g0) this.f126225y;
        C30714h0 c30714h0 = (C30714h0) this.f126222E;
        if (c30712g0 == c30714h0.f126480y) {
            throw new NoSuchElementException();
        }
        if (c30714h0.f126474E != this.f126224x) {
            throw new ConcurrentModificationException();
        }
        this.f126225y = c30712g0.f126469z;
        this.f126226z = c30712g0;
        return c30712g0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f126223w) {
            case 0:
                return ((C30678m) this.f126225y) != ((C30679n) this.f126222E).f126238F;
            default:
                return ((C30712g0) this.f126225y) != ((C30714h0) this.f126222E).f126480y;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f126223w) {
            case 0:
                return m94277a();
            default:
                return m94278b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f126223w) {
            case 0:
                C30679n c30679n = (C30679n) this.f126222E;
                C30678m c30678m = (C30678m) this.f126226z;
                if (c30678m == null) {
                    throw new IllegalStateException();
                }
                c30679n.m94281c(c30678m, true);
                this.f126226z = null;
                this.f126224x = c30679n.f126237E;
                return;
            default:
                C30714h0 c30714h0 = (C30714h0) this.f126222E;
                C30712g0 c30712g0 = (C30712g0) this.f126226z;
                if (c30712g0 == null) {
                    throw new IllegalStateException();
                }
                c30714h0.m94387c(c30712g0, true);
                this.f126226z = null;
                this.f126224x = c30714h0.f126474E;
                return;
        }
    }

    public AbstractC30677l(C30714h0 c30714h0) {
        this.f126222E = c30714h0;
        this.f126225y = c30714h0.f126480y.f126469z;
        this.f126224x = c30714h0.f126474E;
    }
}
