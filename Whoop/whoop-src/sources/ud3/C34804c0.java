package ud3;

import c93.InterfaceC4339a;
import e61.C12762e;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import l83.C23470p;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: ud3.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34804c0 {

    /* JADX INFO: renamed from: a */
    public final EnumC34805c1 f146531a;

    /* JADX INFO: renamed from: b */
    public final C34831o f146532b;

    /* JADX INFO: renamed from: c */
    public final List f146533c;

    /* JADX INFO: renamed from: d */
    public final C23470p f146534d;

    public C34804c0(EnumC34805c1 enumC34805c1, C34831o c34831o, List list, InterfaceC4339a interfaceC4339a) {
        this.f146531a = enumC34805c1;
        this.f146532b = c34831o;
        this.f146533c = list;
        this.f146534d = AbstractC30060g.m92088H(new C12762e(interfaceC4339a, 12));
    }

    /* JADX INFO: renamed from: a */
    public final List m109862a() {
        return (List) this.f146534d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34804c0)) {
            return false;
        }
        C34804c0 c34804c0 = (C34804c0) obj;
        return c34804c0.f146531a == this.f146531a && AbstractC22676k.m65745e(c34804c0.f146532b, this.f146532b) && AbstractC22676k.m65745e(c34804c0.m109862a(), m109862a()) && AbstractC22676k.m65745e(c34804c0.f146533c, this.f146533c);
    }

    public final int hashCode() {
        return this.f146533c.hashCode() + ((m109862a().hashCode() + ((this.f146532b.hashCode() + ((this.f146531a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM109862a = m109862a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM109862a, 10));
        for (Certificate certificate : listM109862a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC22676k.m65749i(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb4 = new StringBuilder("Handshake{tlsVersion=");
        sb4.append(this.f146531a);
        sb4.append(" cipherSuite=");
        sb4.append(this.f146532b);
        sb4.append(" peerCertificates=");
        sb4.append(string);
        sb4.append(" localCertificates=");
        List<Certificate> list = this.f146533c;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC22676k.m65749i(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb4.append(arrayList2);
        sb4.append('}');
        return sb4.toString();
    }
}
