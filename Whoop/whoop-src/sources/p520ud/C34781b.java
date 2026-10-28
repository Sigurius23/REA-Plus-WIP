package p520ud;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import p408q.C29662f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C34781b {

    /* JADX INFO: renamed from: a */
    public final C34784e f146460a;

    /* JADX INFO: renamed from: b */
    public final C34785f f146461b;

    /* JADX INFO: renamed from: c */
    public final Integer f146462c;

    /* JADX INFO: renamed from: d */
    public final String f146463d;

    public C34781b(C29662f c29662f) {
        this.f146460a = (C34784e) c29662f.f121230x;
        this.f146461b = (C34785f) c29662f.f121231y;
        this.f146462c = (Integer) c29662f.f121232z;
        this.f146463d = (String) c29662f.f121228E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34781b.class != obj.getClass()) {
            return false;
        }
        C34781b c34781b = (C34781b) obj;
        return AbstractC22676k.m65745e(this.f146460a, c34781b.f146460a) && AbstractC22676k.m65745e(this.f146461b, c34781b.f146461b) && AbstractC22676k.m65745e(this.f146462c, c34781b.f146462c) && AbstractC22676k.m65745e(this.f146463d, c34781b.f146463d);
    }

    public final int hashCode() {
        C34784e c34784e = this.f146460a;
        int iHashCode = (c34784e != null ? c34784e.hashCode() : 0) * 31;
        C34785f c34785f = this.f146461b;
        int iHashCode2 = (iHashCode + (c34785f != null ? c34785f.hashCode() : 0)) * 31;
        Integer num = this.f146462c;
        int iIntValue = (iHashCode2 + (num != null ? num.intValue() : 0)) * 31;
        String str = this.f146463d;
        return iIntValue + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AssumeRoleResponse(");
        sb4.append("assumedRoleUser=" + this.f146460a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("credentials=" + this.f146461b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("packedPolicySize=" + this.f146462c + DateTimeRange.lowerUpperDelimiter);
        return AbstractC3855a.m11828l(new StringBuilder("sourceIdentity="), this.f146463d, sb4, ")");
    }
}
