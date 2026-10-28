package cd;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cd.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C4424d {

    /* JADX INFO: renamed from: a */
    public final String f17892a;

    /* JADX INFO: renamed from: b */
    public final String f17893b;

    /* JADX INFO: renamed from: c */
    public final String f17894c;

    public C4424d(C4421a c4421a) {
        String str = c4421a.f17885b;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for clientId");
        }
        this.f17892a = str;
        String str2 = c4421a.f17886c;
        if (str2 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for grantType");
        }
        this.f17893b = str2;
        this.f17894c = c4421a.f17887d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4424d.class != obj.getClass()) {
            return false;
        }
        C4424d c4424d = (C4424d) obj;
        return AbstractC22676k.m65745e(this.f17892a, c4424d.f17892a) && AbstractC22676k.m65745e(this.f17893b, c4424d.f17893b) && AbstractC22676k.m65745e(this.f17894c, c4424d.f17894c);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f17892a.hashCode() * 29791, 961, this.f17893b);
        String str = this.f17894c;
        return iM30450d + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CreateOAuth2TokenRequestBody(");
        sb4.append("clientId=" + this.f17892a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("code=null,codeVerifier=null,");
        sb4.append("grantType=" + this.f17893b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("redirectUri=null,refreshToken=*** Sensitive Data Redacted ***)");
        return sb4.toString();
    }
}
