package p668z1;

import d93.InterfaceC11820a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: z1.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C39976y implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public Map.Entry f172510E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f172511F;

    /* JADX INFO: renamed from: w */
    public final C39970s f172512w;

    /* JADX INFO: renamed from: x */
    public final Iterator f172513x;

    /* JADX INFO: renamed from: y */
    public int f172514y;

    /* JADX INFO: renamed from: z */
    public Map.Entry f172515z;

    public C39976y(C39970s c39970s, Iterator it, int i13) {
        this.f172511F = i13;
        this.f172512w = c39970s;
        this.f172513x = it;
        this.f172514y = c39970s.m128194b().f172476d;
        m128206a();
    }

    /* JADX INFO: renamed from: a */
    public final void m128206a() {
        this.f172515z = this.f172510E;
        Iterator it = this.f172513x;
        this.f172510E = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f172510E != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f172511F) {
            case 0:
                m128206a();
                if (this.f172515z != null) {
                    return new C39975x(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f172510E;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                m128206a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f172510E;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                m128206a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C39970s c39970s = this.f172512w;
        if (c39970s.m128194b().f172476d != this.f172514y) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f172515z;
        if (entry == null) {
            throw new IllegalStateException();
        }
        c39970s.remove(entry.getKey());
        this.f172515z = null;
        this.f172514y = c39970s.m128194b().f172476d;
    }
}
