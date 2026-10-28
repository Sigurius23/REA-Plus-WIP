package p520ud;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import m63.C25126d;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C34783d {

    /* JADX INFO: renamed from: a */
    public final C34784e f146469a;

    /* JADX INFO: renamed from: b */
    public final String f146470b;

    /* JADX INFO: renamed from: c */
    public final C34785f f146471c;

    /* JADX INFO: renamed from: d */
    public final Integer f146472d;

    /* JADX INFO: renamed from: e */
    public final String f146473e;

    /* JADX INFO: renamed from: f */
    public final String f146474f;

    /* JADX INFO: renamed from: g */
    public final String f146475g;

    public C34783d(C25126d c25126d) {
        this.f146469a = (C34784e) c25126d.f98484x;
        this.f146470b = (String) c25126d.f98485y;
        this.f146471c = (C34785f) c25126d.f98486z;
        this.f146472d = (Integer) c25126d.f98479E;
        this.f146473e = (String) c25126d.f98480F;
        this.f146474f = (String) c25126d.f98481G;
        this.f146475g = (String) c25126d.f98482H;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34783d.class != obj.getClass()) {
            return false;
        }
        C34783d c34783d = (C34783d) obj;
        return AbstractC22676k.m65745e(this.f146469a, c34783d.f146469a) && AbstractC22676k.m65745e(this.f146470b, c34783d.f146470b) && AbstractC22676k.m65745e(this.f146471c, c34783d.f146471c) && AbstractC22676k.m65745e(this.f146472d, c34783d.f146472d) && AbstractC22676k.m65745e(this.f146473e, c34783d.f146473e) && AbstractC22676k.m65745e(this.f146474f, c34783d.f146474f) && AbstractC22676k.m65745e(this.f146475g, c34783d.f146475g);
    }

    public final int hashCode() {
        C34784e c34784e = this.f146469a;
        int iHashCode = (c34784e != null ? c34784e.hashCode() : 0) * 31;
        String str = this.f146470b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        C34785f c34785f = this.f146471c;
        int iHashCode3 = (iHashCode2 + (c34785f != null ? c34785f.hashCode() : 0)) * 31;
        Integer num = this.f146472d;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        String str2 = this.f146473e;
        int iHashCode4 = (iIntValue + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f146474f;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f146475g;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AssumeRoleWithWebIdentityResponse(");
        sb4.append("assumedRoleUser=" + this.f146469a + DateTimeRange.lowerUpperDelimiter);
        StringBuilder sbM94768q = AbstractC30802r.m94768q(new StringBuilder("audience="), this.f146470b, DateTimeRange.lowerUpperDelimiter, sb4, "credentials=");
        sbM94768q.append(this.f146471c);
        sbM94768q.append(DateTimeRange.lowerUpperDelimiter);
        sb4.append(sbM94768q.toString());
        sb4.append("packedPolicySize=" + this.f146472d + DateTimeRange.lowerUpperDelimiter);
        return AbstractC3855a.m11828l(AbstractC30802r.m94768q(AbstractC30802r.m94768q(new StringBuilder("provider="), this.f146473e, DateTimeRange.lowerUpperDelimiter, sb4, "sourceIdentity="), this.f146474f, DateTimeRange.lowerUpperDelimiter, sb4, "subjectFromWebIdentityToken="), this.f146475g, sb4, ")");
    }
}
