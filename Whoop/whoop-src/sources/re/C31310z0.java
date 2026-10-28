package re;

import com.whoop.data.remote.domain.dto.DateTimeRange;

/* JADX INFO: renamed from: re.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31310z0 {

    /* JADX INFO: renamed from: a */
    public final boolean f128861a;

    /* JADX INFO: renamed from: b */
    public final boolean f128862b;

    public C31310z0(C31308y0 c31308y0) {
        this.f128861a = c31308y0.f128858a;
        this.f128862b = c31308y0.f128859b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31310z0.class != obj.getClass()) {
            return false;
        }
        C31310z0 c31310z0 = (C31310z0) obj;
        return this.f128861a == c31310z0.f128861a && this.f128862b == c31310z0.f128862b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128862b) + (Boolean.hashCode(this.f128861a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SmsMfaSettingsType(");
        sb4.append("enabled=" + this.f128861a + DateTimeRange.lowerUpperDelimiter);
        StringBuilder sb5 = new StringBuilder("preferredMfa=");
        sb5.append(this.f128862b);
        sb4.append(sb5.toString());
        sb4.append(")");
        return sb4.toString();
    }
}
