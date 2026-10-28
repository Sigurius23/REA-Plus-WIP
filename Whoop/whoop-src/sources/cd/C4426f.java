package cd;

import b30.C2570m;
import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cd.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C4426f {

    /* JADX INFO: renamed from: a */
    public final C4422b f17896a;

    /* JADX INFO: renamed from: b */
    public final int f17897b;

    /* JADX INFO: renamed from: c */
    public final String f17898c;

    /* JADX INFO: renamed from: d */
    public final String f17899d;

    /* JADX INFO: renamed from: e */
    public final String f17900e;

    public C4426f(C2570m c2570m) {
        this.f17896a = (C4422b) c2570m.f9987x;
        Integer num = (Integer) c2570m.f9988y;
        if (num == null) {
            throw new IllegalArgumentException("A non-null value must be provided for expiresIn");
        }
        this.f17897b = num.intValue();
        this.f17898c = (String) c2570m.f9989z;
        String str = (String) c2570m.f9984E;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for refreshToken");
        }
        this.f17899d = str;
        String str2 = (String) c2570m.f9985F;
        if (str2 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for tokenType");
        }
        this.f17900e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4426f.class != obj.getClass()) {
            return false;
        }
        C4426f c4426f = (C4426f) obj;
        return AbstractC22676k.m65745e(this.f17896a, c4426f.f17896a) && this.f17897b == c4426f.f17897b && AbstractC22676k.m65745e(this.f17898c, c4426f.f17898c) && AbstractC22676k.m65745e(this.f17899d, c4426f.f17899d) && AbstractC22676k.m65745e(this.f17900e, c4426f.f17900e);
    }

    public final int hashCode() {
        C4422b c4422b = this.f17896a;
        int iHashCode = (((c4422b != null ? c4422b.hashCode() : 0) * 31) + this.f17897b) * 31;
        String str = this.f17898c;
        return this.f17900e.hashCode() + AbstractC11266d.m30450d((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f17899d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CreateOAuth2TokenResponseBody(accessToken=*** Sensitive Data Redacted ***,");
        sb4.append("expiresIn=" + this.f17897b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("idToken=" + this.f17898c + DateTimeRange.lowerUpperDelimiter);
        sb4.append("refreshToken=*** Sensitive Data Redacted ***,");
        return AbstractC3855a.m11828l(new StringBuilder("tokenType="), this.f17900e, sb4, ")");
    }
}
