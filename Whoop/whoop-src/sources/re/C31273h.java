package re;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C31273h {

    /* JADX INFO: renamed from: a */
    public final String f128791a;

    /* JADX INFO: renamed from: b */
    public final int f128792b;

    /* JADX INFO: renamed from: c */
    public final String f128793c;

    /* JADX INFO: renamed from: d */
    public final C31292q0 f128794d;

    /* JADX INFO: renamed from: e */
    public final String f128795e;

    /* JADX INFO: renamed from: f */
    public final String f128796f;

    public C31273h(C31271g c31271g) {
        this.f128791a = (String) c31271g.f128785b;
        this.f128792b = c31271g.f128784a;
        this.f128793c = (String) c31271g.f128786c;
        this.f128794d = (C31292q0) c31271g.f128789f;
        this.f128795e = (String) c31271g.f128787d;
        this.f128796f = (String) c31271g.f128788e;
    }

    /* JADX INFO: renamed from: a */
    public final String m96291a() {
        return this.f128791a;
    }

    /* JADX INFO: renamed from: b */
    public final int m96292b() {
        return this.f128792b;
    }

    /* JADX INFO: renamed from: c */
    public final String m96293c() {
        return this.f128795e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31273h.class != obj.getClass()) {
            return false;
        }
        C31273h c31273h = (C31273h) obj;
        return AbstractC22676k.m65745e(this.f128791a, c31273h.f128791a) && this.f128792b == c31273h.f128792b && AbstractC22676k.m65745e(this.f128793c, c31273h.f128793c) && AbstractC22676k.m65745e(this.f128794d, c31273h.f128794d) && AbstractC22676k.m65745e(this.f128795e, c31273h.f128795e) && AbstractC22676k.m65745e(this.f128796f, c31273h.f128796f);
    }

    public final int hashCode() {
        String str = this.f128791a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f128792b) * 31;
        String str2 = this.f128793c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C31292q0 c31292q0 = this.f128794d;
        int iHashCode3 = (iHashCode2 + (c31292q0 != null ? c31292q0.hashCode() : 0)) * 31;
        String str3 = this.f128795e;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f128796f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AuthenticationResultType(accessToken=*** Sensitive Data Redacted ***,");
        sb4.append("expiresIn=" + this.f128792b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("idToken=*** Sensitive Data Redacted ***,");
        sb4.append("newDeviceMetadata=" + this.f128794d + DateTimeRange.lowerUpperDelimiter);
        sb4.append("refreshToken=*** Sensitive Data Redacted ***,");
        return AbstractC3855a.m11828l(new StringBuilder("tokenType="), this.f128796f, sb4, ")");
    }
}
