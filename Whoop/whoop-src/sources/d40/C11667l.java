package d40;

import p636y3.C39183o;
import p636y3.C39184p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d40.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C11667l {

    /* JADX INFO: renamed from: a */
    public final Integer f37663a;

    /* JADX INFO: renamed from: b */
    public final long f37664b;

    public C11667l(long j7, Integer num) {
        this.f37663a = num;
        this.f37664b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11667l)) {
            return false;
        }
        C11667l c11667l = (C11667l) obj;
        return AbstractC22676k.m65745e(this.f37663a, c11667l.f37663a) && C39183o.m124803a(this.f37664b, c11667l.f37664b);
    }

    public final int hashCode() {
        Integer num = this.f37663a;
        int iHashCode = num == null ? 0 : num.hashCode();
        C39184p[] c39184pArr = C39183o.f168427b;
        return Long.hashCode(this.f37664b) + (iHashCode * 31);
    }

    public final String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.f37663a + ", fontSize=" + C39183o.m124807e(this.f37664b) + ")";
    }
}
