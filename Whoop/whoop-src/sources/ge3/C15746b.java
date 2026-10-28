package ge3;

import android.net.http.X509TrustManagerExtensions;
import androidx.room.AbstractC1772c1;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C15746b extends AbstractC1772c1 {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f59407a;

    /* JADX INFO: renamed from: b */
    public final X509TrustManagerExtensions f59408b;

    public C15746b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        AbstractC22676k.m65750j(trustManager, "trustManager");
        this.f59407a = trustManager;
        this.f59408b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15746b) && ((C15746b) obj).f59407a == this.f59407a;
    }

    @Override // androidx.room.AbstractC1772c1
    /* JADX INFO: renamed from: h */
    public final List mo5411h(String hostname, List chain) throws SSLPeerUnverifiedException {
        AbstractC22676k.m65750j(chain, "chain");
        AbstractC22676k.m65750j(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f59408b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC22676k.m65749i(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e5) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e5.getMessage());
            sSLPeerUnverifiedException.initCause(e5);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f59407a);
    }
}
