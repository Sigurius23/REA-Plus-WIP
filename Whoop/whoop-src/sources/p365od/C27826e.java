package p365od;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p012ab.C0684i0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: od.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C27826e {

    /* JADX INFO: renamed from: a */
    public final String f112086a;

    /* JADX INFO: renamed from: b */
    public final int f112087b;

    /* JADX INFO: renamed from: c */
    public final String f112088c;

    /* JADX INFO: renamed from: d */
    public final String f112089d;

    /* JADX INFO: renamed from: e */
    public final String f112090e;

    public C27826e(C0684i0 c0684i0) {
        this.f112086a = (String) c0684i0.f2446y;
        this.f112087b = c0684i0.f2445x;
        this.f112088c = (String) c0684i0.f2447z;
        this.f112089d = (String) c0684i0.f2442E;
        this.f112090e = (String) c0684i0.f2443F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C27826e.class != obj.getClass()) {
            return false;
        }
        C27826e c27826e = (C27826e) obj;
        return AbstractC22676k.m65745e(this.f112086a, c27826e.f112086a) && this.f112087b == c27826e.f112087b && AbstractC22676k.m65745e(this.f112088c, c27826e.f112088c) && AbstractC22676k.m65745e(this.f112089d, c27826e.f112089d) && AbstractC22676k.m65745e(this.f112090e, c27826e.f112090e);
    }

    public final int hashCode() {
        String str = this.f112086a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f112087b) * 31;
        String str2 = this.f112088c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112089d;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f112090e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CreateTokenResponse(accessToken=*** Sensitive Data Redacted ***,");
        sb4.append("expiresIn=" + this.f112087b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("idToken=*** Sensitive Data Redacted ***,refreshToken=*** Sensitive Data Redacted ***,");
        return AbstractC3855a.m11828l(new StringBuilder("tokenType="), this.f112090e, sb4, ")");
    }
}
