package p112e9;

import java.util.List;
import java.util.NoSuchElementException;
import p324m9.InterfaceC25282j;
import p528un.InterfaceC35092c;
import p589wn.AbstractC37400h;

/* JADX INFO: renamed from: e9.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C12872k implements InterfaceC25282j, InterfaceC35092c {

    /* JADX INFO: renamed from: E */
    public final Object f44292E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44293w;

    /* JADX INFO: renamed from: x */
    public final long f44294x;

    /* JADX INFO: renamed from: y */
    public long f44295y;

    /* JADX INFO: renamed from: z */
    public long f44296z;

    public C12872k(C12871j c12871j, long j7, long j13) {
        this.f44293w = 0;
        this.f44294x = j7;
        this.f44295y = j13;
        this.f44296z = j7 - 1;
        this.f44292E = c12871j;
    }

    @Override // p324m9.InterfaceC25282j, p528un.InterfaceC35092c
    /* JADX INFO: renamed from: b */
    public final long mo36164b() {
        switch (this.f44293w) {
            case 0:
                long j7 = this.f44296z;
                if (j7 < this.f44294x || j7 > this.f44295y) {
                    throw new NoSuchElementException();
                }
                return ((C12871j) this.f44292E).m36162f(j7);
            default:
                long j13 = this.f44295y;
                if (j13 < 0 || j13 > this.f44294x) {
                    throw new NoSuchElementException();
                }
                return this.f44296z + ((AbstractC37400h) ((List) this.f44292E).get((int) j13)).f160012E;
        }
    }

    @Override // p324m9.InterfaceC25282j, p528un.InterfaceC35092c
    /* JADX INFO: renamed from: e */
    public final long mo36165e() {
        switch (this.f44293w) {
            case 0:
                long j7 = this.f44296z;
                if (j7 < this.f44294x || j7 > this.f44295y) {
                    throw new NoSuchElementException();
                }
                return ((C12871j) this.f44292E).m36161e(j7);
            default:
                long j13 = this.f44295y;
                if (j13 < 0 || j13 > this.f44294x) {
                    throw new NoSuchElementException();
                }
                AbstractC37400h abstractC37400h = (AbstractC37400h) ((List) this.f44292E).get((int) j13);
                return this.f44296z + abstractC37400h.f160012E + abstractC37400h.f160021y;
        }
    }

    @Override // p324m9.InterfaceC25282j, p528un.InterfaceC35092c
    public final boolean next() {
        switch (this.f44293w) {
            case 0:
                long j7 = this.f44296z + 1;
                this.f44296z = j7;
                return !(j7 > this.f44295y);
            default:
                long j13 = this.f44295y + 1;
                this.f44295y = j13;
                return !(j13 > this.f44294x);
        }
    }

    public C12872k(long j7, List list) {
        this.f44293w = 1;
        this.f44294x = list.size() - 1;
        this.f44295y = -1L;
        this.f44296z = j7;
        this.f44292E = list;
    }
}
