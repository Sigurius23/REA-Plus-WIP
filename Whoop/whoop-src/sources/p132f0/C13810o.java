package p132f0;

import p208i2.AbstractC17897m;
import p208i2.C17873c;
import p208i2.C17885g;
import p208i2.C17891j;
import p208i2.InterfaceC17910s0;
import p270k2.C22128b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f0.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C13810o {

    /* JADX INFO: renamed from: a */
    public C17885g f49274a = null;

    /* JADX INFO: renamed from: b */
    public C17873c f49275b = null;

    /* JADX INFO: renamed from: c */
    public C22128b f49276c = null;

    /* JADX INFO: renamed from: d */
    public C17891j f49277d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13810o)) {
            return false;
        }
        C13810o c13810o = (C13810o) obj;
        return AbstractC22676k.m65745e(this.f49274a, c13810o.f49274a) && AbstractC22676k.m65745e(this.f49275b, c13810o.f49275b) && AbstractC22676k.m65745e(this.f49276c, c13810o.f49276c) && AbstractC22676k.m65745e(this.f49277d, c13810o.f49277d);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC17910s0 m39178g() {
        C17891j c17891j = this.f49277d;
        if (c17891j != null) {
            return c17891j;
        }
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        this.f49277d = c17891jM51478a;
        return c17891jM51478a;
    }

    public final int hashCode() {
        C17885g c17885g = this.f49274a;
        int iHashCode = (c17885g == null ? 0 : c17885g.hashCode()) * 31;
        C17873c c17873c = this.f49275b;
        int iHashCode2 = (iHashCode + (c17873c == null ? 0 : c17873c.hashCode())) * 31;
        C22128b c22128b = this.f49276c;
        int iHashCode3 = (iHashCode2 + (c22128b == null ? 0 : c22128b.hashCode())) * 31;
        C17891j c17891j = this.f49277d;
        return iHashCode3 + (c17891j != null ? c17891j.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f49274a + ", canvas=" + this.f49275b + ", canvasDrawScope=" + this.f49276c + ", borderPath=" + this.f49277d + ')';
    }
}
