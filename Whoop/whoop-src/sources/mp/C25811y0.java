package mp;

import java.util.Arrays;

/* JADX INFO: renamed from: mp.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25811y0 extends AbstractC25755b1 {

    /* JADX INFO: renamed from: w */
    public final long f101555w;

    public C25811y0(long j7) {
        this.f101555w = j7;
    }

    @Override // mp.AbstractC25755b1
    /* JADX INFO: renamed from: a */
    public final int mo75988a() {
        return AbstractC25755b1.m76004d(this.f101555w >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC25755b1 abstractC25755b1 = (AbstractC25755b1) obj;
        if (mo75988a() != abstractC25755b1.mo75988a()) {
            return mo75988a() - abstractC25755b1.mo75988a();
        }
        long jAbs = Math.abs(this.f101555w);
        long jAbs2 = Math.abs(((C25811y0) abstractC25755b1).f101555w);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C25811y0.class == obj.getClass() && this.f101555w == ((C25811y0) obj).f101555w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo75988a()), Long.valueOf(this.f101555w)});
    }

    public final String toString() {
        return Long.toString(this.f101555w);
    }
}
