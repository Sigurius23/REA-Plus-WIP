package re;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;

/* JADX INFO: renamed from: re.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31260c0 {

    /* JADX INFO: renamed from: a */
    public final String f128770a;

    /* JADX INFO: renamed from: b */
    public final AbstractC31272g0 f128771b;

    /* JADX INFO: renamed from: c */
    public final String f128772c;

    public C31260c0(C29938w0 c29938w0) {
        this.f128770a = (String) c29938w0.f122260x;
        this.f128771b = (AbstractC31272g0) c29938w0.f122261y;
        this.f128772c = (String) c29938w0.f122262z;
    }

    /* JADX INFO: renamed from: a */
    public final String m96284a() {
        return this.f128770a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC31272g0 m96285b() {
        return this.f128771b;
    }

    /* JADX INFO: renamed from: c */
    public final String m96286c() {
        return this.f128772c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31260c0.class != obj.getClass()) {
            return false;
        }
        C31260c0 c31260c0 = (C31260c0) obj;
        return AbstractC22676k.m65745e(this.f128770a, c31260c0.f128770a) && AbstractC22676k.m65745e(this.f128771b, c31260c0.f128771b) && AbstractC22676k.m65745e(this.f128772c, c31260c0.f128772c);
    }

    public final int hashCode() {
        String str = this.f128770a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC31272g0 abstractC31272g0 = this.f128771b;
        int iHashCode2 = (iHashCode + (abstractC31272g0 != null ? abstractC31272g0.hashCode() : 0)) * 31;
        String str2 = this.f128772c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CodeDeliveryDetailsType(");
        StringBuilder sbM94768q = AbstractC30802r.m94768q(new StringBuilder("attributeName="), this.f128770a, DateTimeRange.lowerUpperDelimiter, sb4, "deliveryMedium=");
        sbM94768q.append(this.f128771b);
        sbM94768q.append(DateTimeRange.lowerUpperDelimiter);
        sb4.append(sbM94768q.toString());
        return AbstractC3855a.m11828l(new StringBuilder("destination="), this.f128772c, sb4, ")");
    }
}
