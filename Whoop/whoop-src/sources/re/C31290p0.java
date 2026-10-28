package re;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC30802r;
import p412q3.C29875i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31290p0 {

    /* JADX INFO: renamed from: a */
    public final String f128827a;

    /* JADX INFO: renamed from: b */
    public final AbstractC31272g0 f128828b;

    public C31290p0(C29875i c29875i) {
        this.f128827a = (String) c29875i.f122095w;
        this.f128828b = (AbstractC31272g0) c29875i.f122096x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31290p0.class != obj.getClass()) {
            return false;
        }
        C31290p0 c31290p0 = (C31290p0) obj;
        return AbstractC22676k.m65745e(this.f128827a, c31290p0.f128827a) && AbstractC22676k.m65745e(this.f128828b, c31290p0.f128828b);
    }

    public final int hashCode() {
        String str = this.f128827a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC31272g0 abstractC31272g0 = this.f128828b;
        return iHashCode + (abstractC31272g0 != null ? abstractC31272g0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MfaOptionType(");
        StringBuilder sbM94768q = AbstractC30802r.m94768q(new StringBuilder("attributeName="), this.f128827a, DateTimeRange.lowerUpperDelimiter, sb4, "deliveryMedium=");
        sbM94768q.append(this.f128828b);
        sb4.append(sbM94768q.toString());
        sb4.append(")");
        return sb4.toString();
    }
}
