package fe3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import je3.InterfaceC21631d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fe3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14418b implements InterfaceC21631d {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f52589a;

    /* JADX INFO: renamed from: b */
    public final Method f52590b;

    public C14418b(X509TrustManager trustManager, Method method) {
        AbstractC22676k.m65750j(trustManager, "trustManager");
        this.f52589a = trustManager;
        this.f52590b = method;
    }

    @Override // je3.InterfaceC21631d
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo41124a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f52590b.invoke(this.f52589a, x509Certificate);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e5) {
            throw new AssertionError("unable to get issues and signature", e5);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14418b)) {
            return false;
        }
        C14418b c14418b = (C14418b) obj;
        return AbstractC22676k.m65745e(this.f52589a, c14418b.f52589a) && AbstractC22676k.m65745e(this.f52590b, c14418b.f52590b);
    }

    public final int hashCode() {
        return this.f52590b.hashCode() + (this.f52589a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f52589a + ", findByIssuerAndSignatureMethod=" + this.f52590b + ')';
    }
}
