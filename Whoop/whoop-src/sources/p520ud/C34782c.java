package p520ud;

import b30.C2570m;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.List;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C34782c {

    /* JADX INFO: renamed from: a */
    public final Integer f146464a;

    /* JADX INFO: renamed from: b */
    public final List f146465b;

    /* JADX INFO: renamed from: c */
    public final String f146466c;

    /* JADX INFO: renamed from: d */
    public final String f146467d;

    /* JADX INFO: renamed from: e */
    public final String f146468e;

    public C34782c(C2570m c2570m) {
        this.f146464a = (Integer) c2570m.f9987x;
        this.f146465b = (List) c2570m.f9988y;
        this.f146466c = (String) c2570m.f9989z;
        this.f146467d = (String) c2570m.f9984E;
        this.f146468e = (String) c2570m.f9985F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34782c.class != obj.getClass()) {
            return false;
        }
        C34782c c34782c = (C34782c) obj;
        return AbstractC22676k.m65745e(this.f146464a, c34782c.f146464a) && AbstractC22676k.m65745e(this.f146465b, c34782c.f146465b) && AbstractC22676k.m65745e(this.f146466c, c34782c.f146466c) && AbstractC22676k.m65745e(this.f146467d, c34782c.f146467d) && AbstractC22676k.m65745e(this.f146468e, c34782c.f146468e);
    }

    public final int hashCode() {
        Integer num = this.f146464a;
        int iIntValue = (num != null ? num.intValue() : 0) * 961;
        List list = this.f146465b;
        int iHashCode = (iIntValue + (list != null ? list.hashCode() : 0)) * 961;
        String str = this.f146466c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f146467d;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f146468e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AssumeRoleWithWebIdentityRequest(");
        sb4.append("durationSeconds=" + this.f146464a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("policy=null,");
        sb4.append("policyArns=" + this.f146465b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("providerId=null,");
        StringBuilder sbM94768q = AbstractC30802r.m94768q(new StringBuilder("roleArn="), this.f146466c, DateTimeRange.lowerUpperDelimiter, sb4, "roleSessionName=");
        sbM94768q.append(this.f146467d);
        sbM94768q.append(DateTimeRange.lowerUpperDelimiter);
        sb4.append(sbM94768q.toString());
        sb4.append("webIdentityToken=*** Sensitive Data Redacted ***)");
        return sb4.toString();
    }
}
