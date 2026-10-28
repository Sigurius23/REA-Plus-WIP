package p338n9;

import java.util.ArrayList;
import live.hms.video.factories.C24148c;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41045p;
import p690zr.C41056u0;
import p690zr.C41060w0;
import p690zr.C41065z;
import qa.C30096a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: n9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C26468b implements InterfaceC26467a {

    /* JADX INFO: renamed from: b */
    public static final C41065z f105121b = new C41065z(new C41045p(new C24148c(14), C41056u0.f177063x), new C41045p(new C24148c(15), C41056u0.f177064y));

    /* JADX INFO: renamed from: a */
    public final ArrayList f105122a = new ArrayList();

    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: a */
    public final AbstractC41023g0 mo1632a(long j7) {
        ArrayList arrayList = this.f105122a;
        if (!arrayList.isEmpty()) {
            if (j7 >= ((C30096a) arrayList.get(0)).f122819b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    C30096a c30096a = (C30096a) arrayList.get(i13);
                    if (j7 >= c30096a.f122819b && j7 < c30096a.f122821d) {
                        arrayList2.add(c30096a);
                    }
                    if (j7 < c30096a.f122819b) {
                        break;
                    }
                }
                C41060w0 c41060w0M133258u = AbstractC41023g0.m133258u(f105121b, arrayList2);
                C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
                for (int i14 = 0; i14 < c41060w0M133258u.f177069z; i14++) {
                    c41014d0M133251l.m133224c(((C30096a) c41060w0M133258u.get(i14)).f122818a);
                }
                return c41014d0M133251l.m133239f();
            }
        }
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        return C41060w0.f177067E;
    }

    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: b */
    public final long mo1633b(long j7) {
        ArrayList arrayList = this.f105122a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j7 < ((C30096a) arrayList.get(0)).f122819b) {
            return -9223372036854775807L;
        }
        long jMax = ((C30096a) arrayList.get(0)).f122819b;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            long j13 = ((C30096a) arrayList.get(i13)).f122819b;
            long j14 = ((C30096a) arrayList.get(i13)).f122821d;
            if (j14 > j7) {
                if (j13 > j7) {
                    break;
                }
                jMax = Math.max(jMax, j13);
            } else {
                jMax = Math.max(jMax, j14);
            }
        }
        return jMax;
    }

    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: c */
    public final long mo1634c(long j7) {
        int i13 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f105122a;
            if (i13 >= arrayList.size()) {
                break;
            }
            long j13 = ((C30096a) arrayList.get(i13)).f122819b;
            long j14 = ((C30096a) arrayList.get(i13)).f122821d;
            if (j7 < j13) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j13);
                    break;
                }
                jMin = j13;
                break;
            }
            if (j7 < j14) {
                jMin = jMin == -9223372036854775807L ? j14 : Math.min(jMin, j14);
            }
            i13++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p338n9.InterfaceC26467a
    public final void clear() {
        this.f105122a.clear();
    }

    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: d */
    public final void mo1635d(long j7) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f105122a;
            if (i13 >= arrayList.size()) {
                return;
            }
            long j13 = ((C30096a) arrayList.get(i13)).f122819b;
            if (j7 > j13 && j7 > ((C30096a) arrayList.get(i13)).f122821d) {
                arrayList.remove(i13);
                i13--;
            } else if (j7 < j13) {
                return;
            }
            i13++;
        }
    }

    @Override // p338n9.InterfaceC26467a
    /* JADX INFO: renamed from: e */
    public final boolean mo1636e(C30096a c30096a, long j7) {
        long j13 = c30096a.f122819b;
        AbstractC35849g.m113802d(j13 != -9223372036854775807L);
        AbstractC35849g.m113802d(c30096a.f122820c != -9223372036854775807L);
        boolean z4 = j13 <= j7 && j7 < c30096a.f122821d;
        ArrayList arrayList = this.f105122a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j13 >= ((C30096a) arrayList.get(size)).f122819b) {
                arrayList.add(size + 1, c30096a);
                return z4;
            }
        }
        arrayList.add(0, c30096a);
        return z4;
    }
}
