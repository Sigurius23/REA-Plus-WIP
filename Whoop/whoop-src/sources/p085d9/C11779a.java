package p085d9;

import java.util.Objects;
import java.util.Set;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41032j0;
import p690zr.AbstractC41036k1;
import p690zr.C41029i0;

/* JADX INFO: renamed from: d9.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C11779a {

    /* JADX INFO: renamed from: d */
    public static final C11779a f38173d;

    /* JADX INFO: renamed from: a */
    public final int f38174a;

    /* JADX INFO: renamed from: b */
    public final int f38175b;

    /* JADX INFO: renamed from: c */
    public final AbstractC41032j0 f38176c;

    static {
        C11779a c11779a;
        if (AbstractC38065t.f163031a >= 33) {
            C41029i0 c41029i0 = new C41029i0(4);
            for (int i13 = 1; i13 <= 10; i13++) {
                c41029i0.m133222a(Integer.valueOf(AbstractC38065t.m121924q(i13)));
            }
            c11779a = new C11779a(2, c41029i0.m133261f());
        } else {
            c11779a = new C11779a(2, 10);
        }
        f38173d = c11779a;
    }

    public C11779a(int i13, Set set) {
        this.f38174a = i13;
        AbstractC41032j0 abstractC41032j0M133264m = AbstractC41032j0.m133264m(set);
        this.f38176c = abstractC41032j0M133264m;
        AbstractC41036k1 it = abstractC41032j0M133264m.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f38175b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11779a)) {
            return false;
        }
        C11779a c11779a = (C11779a) obj;
        return this.f38174a == c11779a.f38174a && this.f38175b == c11779a.f38175b && Objects.equals(this.f38176c, c11779a.f38176c);
    }

    public final int hashCode() {
        int i13 = ((this.f38174a * 31) + this.f38175b) * 31;
        AbstractC41032j0 abstractC41032j0 = this.f38176c;
        return i13 + (abstractC41032j0 == null ? 0 : abstractC41032j0.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f38174a + ", maxChannelCount=" + this.f38175b + ", channelMasks=" + this.f38176c + "]";
    }

    public C11779a(int i13, int i14) {
        this.f38174a = i13;
        this.f38175b = i14;
        this.f38176c = null;
    }
}
