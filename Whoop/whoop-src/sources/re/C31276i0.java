package re;

import com.whoop.data.remote.domain.dto.DateTimeRange;

/* JADX INFO: renamed from: re.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31276i0 {

    /* JADX INFO: renamed from: a */
    public final boolean f128800a;

    /* JADX INFO: renamed from: b */
    public final boolean f128801b;

    public C31276i0(C31274h0 c31274h0) {
        this.f128800a = c31274h0.f128797a;
        this.f128801b = c31274h0.f128798b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31276i0.class != obj.getClass()) {
            return false;
        }
        C31276i0 c31276i0 = (C31276i0) obj;
        return this.f128800a == c31276i0.f128800a && this.f128801b == c31276i0.f128801b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128801b) + (Boolean.hashCode(this.f128800a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("EmailMfaSettingsType(");
        sb4.append("enabled=" + this.f128800a + DateTimeRange.lowerUpperDelimiter);
        StringBuilder sb5 = new StringBuilder("preferredMfa=");
        sb5.append(this.f128801b);
        sb4.append(sb5.toString());
        sb4.append(")");
        return sb4.toString();
    }
}
