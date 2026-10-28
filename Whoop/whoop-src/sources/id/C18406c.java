package id;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import gf.C15774o;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: id.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C18406c {

    /* JADX INFO: renamed from: a */
    public final String f71592a;

    /* JADX INFO: renamed from: b */
    public final long f71593b;

    /* JADX INFO: renamed from: c */
    public final String f71594c;

    /* JADX INFO: renamed from: d */
    public final String f71595d;

    public C18406c(C15774o c15774o) {
        this.f71592a = (String) c15774o.f59444b;
        this.f71593b = c15774o.f59443a;
        this.f71594c = (String) c15774o.f59445c;
        this.f71595d = (String) c15774o.f59446d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18406c.class != obj.getClass()) {
            return false;
        }
        C18406c c18406c = (C18406c) obj;
        return AbstractC22676k.m65745e(this.f71592a, c18406c.f71592a) && this.f71593b == c18406c.f71593b && AbstractC22676k.m65745e(this.f71594c, c18406c.f71594c) && AbstractC22676k.m65745e(this.f71595d, c18406c.f71595d);
    }

    public final int hashCode() {
        String str = this.f71592a;
        int iM30451e = AbstractC11266d.m30451e((str != null ? str.hashCode() : 0) * 31, this.f71593b, 31);
        String str2 = this.f71594c;
        int iHashCode = (iM30451e + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71595d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RoleCredentials(");
        StringBuilder sbM94768q = AbstractC30802r.m94768q(new StringBuilder("accessKeyId="), this.f71592a, DateTimeRange.lowerUpperDelimiter, sb4, "expiration=");
        sbM94768q.append(this.f71593b);
        sbM94768q.append(DateTimeRange.lowerUpperDelimiter);
        sb4.append(sbM94768q.toString());
        sb4.append("secretAccessKey=*** Sensitive Data Redacted ***,sessionToken=*** Sensitive Data Redacted ***)");
        return sb4.toString();
    }
}
