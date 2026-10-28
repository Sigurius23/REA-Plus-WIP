package p390p1;

import d93.InterfaceC11820a;
import java.util.Iterator;
import se.AbstractC32411b;

/* JADX INFO: renamed from: p1.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28640m0 implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public int f115832E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115833w = 0;

    /* JADX INFO: renamed from: x */
    public final C28614f2 f115834x;

    /* JADX INFO: renamed from: y */
    public final int f115835y;

    /* JADX INFO: renamed from: z */
    public int f115836z;

    public C28640m0(C28614f2 c28614f2, int i13, int i14) {
        this.f115834x = c28614f2;
        this.f115835y = i14;
        this.f115836z = i13;
        this.f115832E = c28614f2.f115760H;
        if (c28614f2.f115759G) {
            AbstractC28622h2.m87031f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f115833w) {
            case 0:
                return this.f115836z < this.f115835y;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f115833w) {
            case 0:
                C28614f2 c28614f2 = this.f115834x;
                int i13 = c28614f2.f115760H;
                int i14 = this.f115832E;
                if (i13 != i14) {
                    AbstractC28622h2.m87031f();
                }
                int i15 = this.f115836z;
                this.f115836z = AbstractC28622h2.m87026a(c28614f2.f115764w, i15) + i15;
                return new C28618g2(c28614f2, i15, i14);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f115833w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C28640m0(C28614f2 c28614f2, int i13, AbstractC28644n0 abstractC28644n0, AbstractC32411b abstractC32411b) {
        this.f115834x = c28614f2;
        this.f115835y = i13;
        this.f115836z = c28614f2.f115760H;
    }
}
