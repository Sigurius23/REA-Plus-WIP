package p365od;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p255jk.C21746d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: od.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C27825d {

    /* JADX INFO: renamed from: a */
    public final String f112082a;

    /* JADX INFO: renamed from: b */
    public final String f112083b;

    /* JADX INFO: renamed from: c */
    public final String f112084c;

    /* JADX INFO: renamed from: d */
    public final String f112085d;

    public C27825d(C21746d c21746d) {
        this.f112082a = c21746d.f83657a;
        this.f112083b = c21746d.f83658b;
        this.f112084c = c21746d.f83659c;
        this.f112085d = c21746d.f83660d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C27825d.class != obj.getClass()) {
            return false;
        }
        C27825d c27825d = (C27825d) obj;
        return AbstractC22676k.m65745e(this.f112082a, c27825d.f112082a) && AbstractC22676k.m65745e(this.f112083b, c27825d.f112083b) && AbstractC22676k.m65745e(this.f112084c, c27825d.f112084c) && AbstractC22676k.m65745e(this.f112085d, c27825d.f112085d);
    }

    public final int hashCode() {
        String str = this.f112082a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f112083b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 923521;
        String str3 = this.f112084c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 961;
        String str4 = this.f112085d;
        return (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CreateTokenRequest(");
        sb4.append("clientId=" + this.f112082a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("clientSecret=*** Sensitive Data Redacted ***,code=null,codeVerifier=*** Sensitive Data Redacted ***,deviceCode=null,");
        sb4.append("grantType=" + this.f112084c + DateTimeRange.lowerUpperDelimiter);
        sb4.append("redirectUri=null,refreshToken=*** Sensitive Data Redacted ***,scope=null)");
        return sb4.toString();
    }
}
