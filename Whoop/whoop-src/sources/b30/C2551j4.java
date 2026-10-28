package b30;

import p392p3.AbstractC28771i;
import p636y3.C39183o;
import p636y3.C39184p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.j4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2551j4 {

    /* JADX INFO: renamed from: a */
    public final AbstractC28771i f9914a;

    /* JADX INFO: renamed from: b */
    public final long f9915b;

    public C2551j4(AbstractC28771i abstractC28771i, long j7) {
        this.f9914a = abstractC28771i;
        this.f9915b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2551j4)) {
            return false;
        }
        C2551j4 c2551j4 = (C2551j4) obj;
        return AbstractC22676k.m65745e(this.f9914a, c2551j4.f9914a) && C39183o.m124803a(this.f9915b, c2551j4.f9915b);
    }

    public final int hashCode() {
        AbstractC28771i abstractC28771i = this.f9914a;
        int iHashCode = abstractC28771i == null ? 0 : abstractC28771i.hashCode();
        C39184p[] c39184pArr = C39183o.f168427b;
        return Long.hashCode(this.f9915b) + (iHashCode * 31);
    }

    public final String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.f9914a + ", fontSize=" + C39183o.m124807e(this.f9915b) + ")";
    }
}
