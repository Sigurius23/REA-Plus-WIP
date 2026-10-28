package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26317d1 {

    /* JADX INFO: renamed from: a */
    public final String f104631a;

    /* JADX INFO: renamed from: b */
    public final long f104632b;

    public C26317d1(String payload, long j7) {
        AbstractC22676k.m65750j(payload, "payload");
        this.f104631a = payload;
        this.f104632b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26317d1)) {
            return false;
        }
        C26317d1 c26317d1 = (C26317d1) obj;
        return AbstractC22676k.m65745e(this.f104631a, c26317d1.f104631a) && this.f104632b == c26317d1.f104632b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104632b) + (this.f104631a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM32000s = AbstractC11895b.m32000s("SdpRtcpfbtrrint(payload=", this.f104631a, this.f104632b, ", value=");
        sbM32000s.append(")");
        return sbM32000s.toString();
    }
}
