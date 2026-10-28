package n53;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26358r0 {

    /* JADX INFO: renamed from: a */
    public final String f104772a;

    /* JADX INFO: renamed from: b */
    public final long f104773b;

    /* JADX INFO: renamed from: c */
    public final String f104774c;

    /* JADX INFO: renamed from: d */
    public final String f104775d;

    public C26358r0(String type, String protocol, long j7, String payloads) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(protocol, "protocol");
        AbstractC22676k.m65750j(payloads, "payloads");
        this.f104772a = type;
        this.f104773b = j7;
        this.f104774c = protocol;
        this.f104775d = payloads;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26358r0)) {
            return false;
        }
        C26358r0 c26358r0 = (C26358r0) obj;
        return AbstractC22676k.m65745e(this.f104772a, c26358r0.f104772a) && this.f104773b == c26358r0.f104773b && AbstractC22676k.m65745e(this.f104774c, c26358r0.f104774c) && AbstractC22676k.m65745e(this.f104775d, c26358r0.f104775d);
    }

    public final int hashCode() {
        return this.f104775d.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30451e(this.f104772a.hashCode() * 31, this.f104773b, 31), 31, this.f104774c);
    }

    public final String toString() {
        StringBuilder sbM32000s = AbstractC11895b.m32000s("SdpMline(type=", this.f104772a, this.f104773b, ", port=");
        AbstractC11266d.m30444B(sbM32000s, ", protocol=", this.f104774c, ", payloads=", this.f104775d);
        sbM32000s.append(")");
        return sbM32000s.toString();
    }
}
