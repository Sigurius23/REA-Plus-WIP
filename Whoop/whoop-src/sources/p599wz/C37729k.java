package p599wz;

import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;

/* JADX INFO: renamed from: wz.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C37729k {

    /* JADX INFO: renamed from: a */
    public final C37718g0 f161671a;

    /* JADX INFO: renamed from: b */
    public final C35459c0 f161672b;

    /* JADX INFO: renamed from: c */
    public final EnumC37721h0 f161673c;

    /* JADX INFO: renamed from: d */
    public final C37708d f161674d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC37739n0 f161675e;

    public C37729k(C35459c0 paymentMethodMetadata, C37708d linkAccountInfo, C37718g0 configuration, EnumC37721h0 linkExpressMode, InterfaceC37739n0 launchMode) {
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(linkExpressMode, "linkExpressMode");
        AbstractC22676k.m65750j(linkAccountInfo, "linkAccountInfo");
        AbstractC22676k.m65750j(launchMode, "launchMode");
        this.f161671a = configuration;
        this.f161672b = paymentMethodMetadata;
        this.f161673c = linkExpressMode;
        this.f161674d = linkAccountInfo;
        this.f161675e = launchMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37729k)) {
            return false;
        }
        C37729k c37729k = (C37729k) obj;
        return AbstractC22676k.m65745e(this.f161671a, c37729k.f161671a) && AbstractC22676k.m65745e(this.f161672b, c37729k.f161672b) && this.f161673c == c37729k.f161673c && AbstractC22676k.m65745e(this.f161674d, c37729k.f161674d) && AbstractC22676k.m65745e(this.f161675e, c37729k.f161675e);
    }

    public final int hashCode() {
        return this.f161675e.hashCode() + ((this.f161674d.hashCode() + ((this.f161673c.hashCode() + ((this.f161672b.hashCode() + (this.f161671a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Args(configuration=" + this.f161671a + ", paymentMethodMetadata=" + this.f161672b + ", linkExpressMode=" + this.f161673c + ", linkAccountInfo=" + this.f161674d + ", launchMode=" + this.f161675e + ")";
    }
}
