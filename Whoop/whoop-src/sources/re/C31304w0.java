package re;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31304w0 {

    /* JADX INFO: renamed from: a */
    public final String f128852a;

    /* JADX INFO: renamed from: b */
    public final C31276i0 f128853b;

    /* JADX INFO: renamed from: c */
    public final C31310z0 f128854c;

    /* JADX INFO: renamed from: d */
    public final C31258b1 f128855d;

    public C31304w0(C31302v0 c31302v0) {
        this.f128852a = c31302v0.f128847a;
        this.f128853b = c31302v0.f128848b;
        this.f128854c = c31302v0.f128849c;
        this.f128855d = c31302v0.f128850d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31304w0.class != obj.getClass()) {
            return false;
        }
        C31304w0 c31304w0 = (C31304w0) obj;
        return AbstractC22676k.m65745e(this.f128852a, c31304w0.f128852a) && AbstractC22676k.m65745e(this.f128853b, c31304w0.f128853b) && AbstractC22676k.m65745e(this.f128854c, c31304w0.f128854c) && AbstractC22676k.m65745e(this.f128855d, c31304w0.f128855d);
    }

    public final int hashCode() {
        String str = this.f128852a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        C31276i0 c31276i0 = this.f128853b;
        int iHashCode2 = (iHashCode + (c31276i0 != null ? c31276i0.hashCode() : 0)) * 31;
        C31310z0 c31310z0 = this.f128854c;
        int iHashCode3 = (iHashCode2 + (c31310z0 != null ? c31310z0.hashCode() : 0)) * 31;
        C31258b1 c31258b1 = this.f128855d;
        return iHashCode3 + (c31258b1 != null ? c31258b1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SetUserMfaPreferenceRequest(accessToken=*** Sensitive Data Redacted ***,");
        sb4.append("emailMfaSettings=" + this.f128853b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("smsMfaSettings=" + this.f128854c + DateTimeRange.lowerUpperDelimiter);
        StringBuilder sb5 = new StringBuilder("softwareTokenMfaSettings=");
        sb5.append(this.f128855d);
        sb4.append(sb5.toString());
        sb4.append(")");
        return sb4.toString();
    }
}
