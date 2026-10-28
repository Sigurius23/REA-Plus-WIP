package ph;

import ch.C4589j;
import mh.AbstractC25543k;
import mh.C25547o;
import p092dh.EnumC12020g;

/* JADX INFO: renamed from: ph.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C29227a implements InterfaceC29231e {

    /* JADX INFO: renamed from: b */
    public final int f118299b;

    public C29227a(int i13, int i14) {
        i13 = (i14 & 1) != 0 ? 100 : i13;
        this.f118299b = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // ph.InterfaceC29231e
    /* JADX INFO: renamed from: a */
    public final InterfaceC29232f mo88737a(C4589j c4589j, AbstractC25543k abstractC25543k) {
        if ((abstractC25543k instanceof C25547o) && ((C25547o) abstractC25543k).f100154c != EnumC12020g.f39761w) {
            return new C29228b(c4589j, abstractC25543k, this.f118299b);
        }
        return new C29230d(c4589j, abstractC25543k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C29227a) {
            return this.f118299b == ((C29227a) obj).f118299b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f118299b * 31);
    }
}
