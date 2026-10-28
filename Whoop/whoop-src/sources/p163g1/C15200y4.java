package p163g1;

import p127ev.AbstractC13673n;
import p208i2.C17919x;
import p269k1.C22111b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C15200y4 {

    /* JADX INFO: renamed from: a */
    public final long f57061a;

    /* JADX INFO: renamed from: b */
    public final C22111b f57062b;

    public C15200y4(long j7, C22111b c22111b) {
        this.f57061a = j7;
        this.f57062b = c22111b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15200y4)) {
            return false;
        }
        C15200y4 c15200y4 = (C15200y4) obj;
        return C17919x.m51542d(this.f57061a, c15200y4.f57061a) && AbstractC22676k.m65745e(this.f57062b, c15200y4.f57062b);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        int iHashCode = Long.hashCode(this.f57061a) * 31;
        C22111b c22111b = this.f57062b;
        return iHashCode + (c22111b != null ? c22111b.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RippleConfiguration(color=");
        AbstractC13673n.m38574u(this.f57061a, ", rippleAlpha=", sb4);
        sb4.append(this.f57062b);
        sb4.append(')');
        return sb4.toString();
    }
}
