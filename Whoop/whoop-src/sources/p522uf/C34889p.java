package p522uf;

import c13.AbstractC3855a;
import java.util.Map;
import p613xf.InterfaceC38260f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uf.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C34889p {

    /* JADX INFO: renamed from: d */
    public static final C34889p f146932d = AbstractC34890q.f146936a;

    /* JADX INFO: renamed from: a */
    public final InterfaceC34869c f146933a;

    /* JADX INFO: renamed from: b */
    public final Map f146934b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38260f f146935c;

    public C34889p(InterfaceC34869c authSchemeResolver, Map configuredAuthSchemes, InterfaceC38260f identityProviderConfig) {
        AbstractC22676k.m65750j(authSchemeResolver, "authSchemeResolver");
        AbstractC22676k.m65750j(configuredAuthSchemes, "configuredAuthSchemes");
        AbstractC22676k.m65750j(identityProviderConfig, "identityProviderConfig");
        this.f146933a = authSchemeResolver;
        this.f146934b = configuredAuthSchemes;
        this.f146935c = identityProviderConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34889p)) {
            return false;
        }
        C34889p c34889p = (C34889p) obj;
        return AbstractC22676k.m65745e(this.f146933a, c34889p.f146933a) && AbstractC22676k.m65745e(this.f146934b, c34889p.f146934b) && AbstractC22676k.m65745e(this.f146935c, c34889p.f146935c);
    }

    public final int hashCode() {
        return this.f146935c.hashCode() + AbstractC3855a.m11821e(this.f146934b, this.f146933a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OperationAuthConfig(authSchemeResolver=" + this.f146933a + ", configuredAuthSchemes=" + this.f146934b + ", identityProviderConfig=" + this.f146935c + ')';
    }
}
