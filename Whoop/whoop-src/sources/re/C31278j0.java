package re;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p255jk.C21745c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31278j0 {

    /* JADX INFO: renamed from: a */
    public final String f128803a;

    /* JADX INFO: renamed from: b */
    public final String f128804b;

    public C31278j0(C21745c c21745c) {
        this.f128803a = c21745c.f83655a;
        this.f128804b = c21745c.f83656b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31278j0.class != obj.getClass()) {
            return false;
        }
        C31278j0 c31278j0 = (C31278j0) obj;
        return AbstractC22676k.m65745e(this.f128803a, c31278j0.f128803a) && AbstractC22676k.m65745e(this.f128804b, c31278j0.f128804b);
    }

    public final int hashCode() {
        String str = this.f128803a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f128804b;
        return (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GetUserAttributeVerificationCodeRequest(accessToken=*** Sensitive Data Redacted ***,");
        sb4.append("attributeName=" + this.f128804b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("clientMetadata=null)");
        return sb4.toString();
    }
}
