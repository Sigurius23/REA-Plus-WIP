package sn;

import p309lo.AbstractC24543a;
import p465rm.InterfaceC31529f;
import p690zr.AbstractC41023g0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: sn.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32768x0 implements InterfaceC31529f {

    /* JADX INFO: renamed from: z */
    public static final C32768x0 f136269z = new C32768x0(new C32766w0[0]);

    /* JADX INFO: renamed from: w */
    public final int f136270w;

    /* JADX INFO: renamed from: x */
    public final C41060w0 f136271x;

    /* JADX INFO: renamed from: y */
    public int f136272y;

    public C32768x0(C32766w0... c32766w0Arr) {
        C41060w0 c41060w0M133253n = AbstractC41023g0.m133253n(c32766w0Arr);
        this.f136271x = c41060w0M133253n;
        this.f136270w = c32766w0Arr.length;
        int i13 = 0;
        while (i13 < c41060w0M133253n.f177069z) {
            int i14 = i13 + 1;
            for (int i15 = i14; i15 < c41060w0M133253n.f177069z; i15++) {
                if (((C32766w0) c41060w0M133253n.get(i13)).equals(c41060w0M133253n.get(i15))) {
                    AbstractC24543a.m71578n("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C32766w0 m102758a(int i13) {
        return (C32766w0) this.f136271x.get(i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C32768x0.class != obj.getClass()) {
            return false;
        }
        C32768x0 c32768x0 = (C32768x0) obj;
        return this.f136270w == c32768x0.f136270w && this.f136271x.equals(c32768x0.f136271x);
    }

    public final int hashCode() {
        if (this.f136272y == 0) {
            this.f136272y = this.f136271x.hashCode();
        }
        return this.f136272y;
    }
}
