package id;

import c13.AbstractC3855a;
import cd.C4421a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: id.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C18404a {

    /* JADX INFO: renamed from: a */
    public final String f71588a;

    /* JADX INFO: renamed from: b */
    public final String f71589b;

    /* JADX INFO: renamed from: c */
    public final String f71590c;

    public C18404a(C4421a c4421a) {
        this.f71588a = c4421a.f17885b;
        this.f71589b = c4421a.f17886c;
        this.f71590c = c4421a.f17887d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18404a.class != obj.getClass()) {
            return false;
        }
        C18404a c18404a = (C18404a) obj;
        return AbstractC22676k.m65745e(this.f71588a, c18404a.f71588a) && AbstractC22676k.m65745e(this.f71589b, c18404a.f71589b) && AbstractC22676k.m65745e(this.f71590c, c18404a.f71590c);
    }

    public final int hashCode() {
        String str = this.f71588a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f71589b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71590c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GetRoleCredentialsRequest(accessToken=*** Sensitive Data Redacted ***,");
        return AbstractC3855a.m11828l(AbstractC30802r.m94768q(new StringBuilder("accountId="), this.f71589b, DateTimeRange.lowerUpperDelimiter, sb4, "roleName="), this.f71590c, sb4, ")");
    }
}
