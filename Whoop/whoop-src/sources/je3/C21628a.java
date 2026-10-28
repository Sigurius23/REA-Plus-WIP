package je3;

import androidx.room.AbstractC1772c1;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: je3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21628a extends AbstractC1772c1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21631d f83062a;

    public C21628a(InterfaceC21631d trustRootIndex) {
        AbstractC22676k.m65750j(trustRootIndex, "trustRootIndex");
        this.f83062a = trustRootIndex;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m60877U(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i13) {
        if (!AbstractC22676k.m65745e(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i13) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C21628a) && AbstractC22676k.m65745e(((C21628a) obj).f83062a, this.f83062a);
    }

    @Override // androidx.room.AbstractC1772c1
    /* JADX INFO: renamed from: h */
    public final List mo5411h(String hostname, List chain) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        AbstractC22676k.m65750j(chain, "chain");
        AbstractC22676k.m65750j(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC22676k.m65749i(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z4 = false;
        for (int i13 = 0; i13 < 9; i13++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateMo41124a = this.f83062a.mo41124a(x509Certificate2);
            if (x509CertificateMo41124a != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateMo41124a)) {
                    arrayList.add(x509CertificateMo41124a);
                }
                if (m60877U(x509CertificateMo41124a, x509CertificateMo41124a, arrayList.size() - 2)) {
                    return arrayList;
                }
                z4 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                AbstractC22676k.m65749i(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        if (!z4) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    AbstractC22676k.m65748h(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (X509Certificate) next;
                } while (!m60877U(x509Certificate2, x509Certificate, arrayList.size() - 1));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.f83062a.hashCode();
    }
}
