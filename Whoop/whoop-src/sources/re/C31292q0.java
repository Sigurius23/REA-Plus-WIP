package re;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC30802r;
import p365od.C27827f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31292q0 {

    /* JADX INFO: renamed from: a */
    public final String f128830a;

    /* JADX INFO: renamed from: b */
    public final String f128831b;

    public C31292q0(C27827f c27827f) {
        this.f128830a = c27827f.f112091a;
        this.f128831b = c27827f.f112092b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31292q0.class != obj.getClass()) {
            return false;
        }
        C31292q0 c31292q0 = (C31292q0) obj;
        return AbstractC22676k.m65745e(this.f128830a, c31292q0.f128830a) && AbstractC22676k.m65745e(this.f128831b, c31292q0.f128831b);
    }

    public final int hashCode() {
        String str = this.f128830a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f128831b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("NewDeviceMetadataType(");
        return AbstractC3855a.m11828l(AbstractC30802r.m94768q(new StringBuilder("deviceGroupKey="), this.f128830a, DateTimeRange.lowerUpperDelimiter, sb4, "deviceKey="), this.f128831b, sb4, ")");
    }
}
