package p516u8;

import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: u8.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34623v0 {

    /* JADX INFO: renamed from: b */
    public static final C34623v0 f145863b;

    /* JADX INFO: renamed from: a */
    public final AbstractC41023g0 f145864a;

    static {
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        f145863b = new C34623v0(C41060w0.f177067E);
        AbstractC38065t.m121892F(0);
    }

    public C34623v0(C41060w0 c41060w0) {
        this.f145864a = AbstractC41023g0.m133252m(c41060w0);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m109417a(int i13) {
        int i14 = 0;
        while (true) {
            AbstractC41023g0 abstractC41023g0 = this.f145864a;
            if (i14 >= abstractC41023g0.size()) {
                return false;
            }
            C34621u0 c34621u0 = (C34621u0) abstractC41023g0.get(i14);
            for (boolean z4 : c34621u0.f145861e) {
                if (z4) {
                    if (c34621u0.f145858b.f145798c != i13) {
                        break;
                    }
                    return true;
                }
            }
            i14++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34623v0.class != obj.getClass()) {
            return false;
        }
        return this.f145864a.equals(((C34623v0) obj).f145864a);
    }

    public final int hashCode() {
        return this.f145864a.hashCode();
    }
}
