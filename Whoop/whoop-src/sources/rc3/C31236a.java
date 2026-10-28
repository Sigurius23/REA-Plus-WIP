package rc3;

import com.whoop.service.network.model.UserSessionDto;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rc3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C31236a implements Comparable {

    /* JADX INFO: renamed from: w */
    public final int f128618w;

    /* JADX INFO: renamed from: x */
    public final int f128619x;

    public C31236a(int i13, int i14) {
        this.f128618w = i13;
        this.f128619x = i14;
        if (i14 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "Digits must be non-negative, but was ").toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m96188a(int i13) {
        int i14 = this.f128618w;
        int i15 = this.f128619x;
        if (i13 == i15) {
            return i14;
        }
        int[] iArr = AbstractC31237b.f128620a;
        return i13 > i15 ? i14 * iArr[i13 - i15] : i14 / iArr[i15 - i13];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31236a other = (C31236a) obj;
        AbstractC22676k.m65750j(other, "other");
        int iMax = Math.max(this.f128619x, other.f128619x);
        return AbstractC22676k.m65751k(m96188a(iMax), other.m96188a(iMax));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C31236a)) {
            return false;
        }
        C31236a c31236a = (C31236a) obj;
        int iMax = Math.max(this.f128619x, c31236a.f128619x);
        return AbstractC22676k.m65751k(m96188a(iMax), c31236a.m96188a(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        int i13 = AbstractC31237b.f128620a[this.f128619x];
        int i14 = this.f128618w;
        sb4.append(i14 / i13);
        sb4.append('.');
        sb4.append(AbstractC39414r.m125898q0(String.valueOf((i14 % i13) + i13), UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE));
        return sb4.toString();
    }
}
