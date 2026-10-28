package re;

import c13.AbstractC3855a;
import cd.C4421a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31267e1 {

    /* JADX INFO: renamed from: a */
    public final String f128780a;

    /* JADX INFO: renamed from: b */
    public final String f128781b;

    /* JADX INFO: renamed from: c */
    public final String f128782c;

    public C31267e1(C4421a c4421a) {
        this.f128780a = c4421a.f17885b;
        this.f128781b = c4421a.f17886c;
        this.f128782c = c4421a.f17887d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31267e1.class != obj.getClass()) {
            return false;
        }
        C31267e1 c31267e1 = (C31267e1) obj;
        return AbstractC22676k.m65745e(this.f128780a, c31267e1.f128780a) && AbstractC22676k.m65745e(this.f128781b, c31267e1.f128781b) && AbstractC22676k.m65745e(this.f128782c, c31267e1.f128782c);
    }

    public final int hashCode() {
        String str = this.f128780a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f128781b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f128782c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("VerifyUserAttributeRequest(accessToken=*** Sensitive Data Redacted ***,");
        return AbstractC3855a.m11828l(AbstractC30802r.m94768q(new StringBuilder("attributeName="), this.f128781b, DateTimeRange.lowerUpperDelimiter, sb4, "code="), this.f128782c, sb4, ")");
    }
}
