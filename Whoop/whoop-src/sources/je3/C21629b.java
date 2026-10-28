package je3;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: je3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C21629b implements InterfaceC21631d {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f83063a;

    public C21629b(X509Certificate... caCerts) {
        AbstractC22676k.m65750j(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f83063a = linkedHashMap;
    }

    @Override // je3.InterfaceC21631d
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo41124a(X509Certificate x509Certificate) {
        Set set = (Set) this.f83063a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C21629b) && AbstractC22676k.m65745e(((C21629b) obj).f83063a, this.f83063a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f83063a.hashCode();
    }
}
