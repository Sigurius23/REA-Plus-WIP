package p520ud;

import a30.C0332w0;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.ArrayList;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C34780a {

    /* JADX INFO: renamed from: a */
    public final Integer f146454a;

    /* JADX INFO: renamed from: b */
    public final String f146455b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f146456c;

    /* JADX INFO: renamed from: d */
    public final String f146457d;

    /* JADX INFO: renamed from: e */
    public final String f146458e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f146459f;

    public C34780a(C0332w0 c0332w0) {
        this.f146454a = (Integer) c0332w0.f1168x;
        this.f146455b = (String) c0332w0.f1170z;
        this.f146456c = (ArrayList) c0332w0.f1169y;
        this.f146457d = (String) c0332w0.f1164E;
        this.f146458e = (String) c0332w0.f1165F;
        this.f146459f = (ArrayList) c0332w0.f1166G;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34780a.class != obj.getClass()) {
            return false;
        }
        C34780a c34780a = (C34780a) obj;
        return AbstractC22676k.m65745e(this.f146454a, c34780a.f146454a) && AbstractC22676k.m65745e(this.f146455b, c34780a.f146455b) && AbstractC22676k.m65745e(this.f146456c, c34780a.f146456c) && AbstractC22676k.m65745e(this.f146457d, c34780a.f146457d) && AbstractC22676k.m65745e(this.f146458e, c34780a.f146458e) && AbstractC22676k.m65745e(this.f146459f, c34780a.f146459f);
    }

    public final int hashCode() {
        Integer num = this.f146454a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        String str = this.f146455b;
        int iHashCode = (iIntValue + (str != null ? str.hashCode() : 0)) * 961;
        ArrayList arrayList = this.f146456c;
        int iHashCode2 = (iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 961;
        String str2 = this.f146457d;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f146458e;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 29791;
        ArrayList arrayList2 = this.f146459f;
        return (iHashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AssumeRoleRequest(");
        sb4.append("durationSeconds=" + this.f146454a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("externalId=" + this.f146455b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("policy=null,");
        sb4.append("policyArns=" + this.f146456c + DateTimeRange.lowerUpperDelimiter);
        sb4.append("providedContexts=null,");
        StringBuilder sbM94768q = AbstractC30802r.m94768q(new StringBuilder("roleArn="), this.f146457d, DateTimeRange.lowerUpperDelimiter, sb4, "roleSessionName=");
        sbM94768q.append(this.f146458e);
        sbM94768q.append(DateTimeRange.lowerUpperDelimiter);
        sb4.append(sbM94768q.toString());
        sb4.append("serialNumber=null,sourceIdentity=null,");
        sb4.append("tags=" + this.f146459f + DateTimeRange.lowerUpperDelimiter);
        sb4.append("tokenCode=null,transitiveTagKeys=null)");
        return sb4.toString();
    }
}
