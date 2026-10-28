package je3;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import m83.C25271y;
import ne3.AbstractC26604b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wd3.AbstractC37171e;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: je3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C21630c implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C21630c f83064a = new C21630c();

    /* JADX INFO: renamed from: a */
    public static List m60878a(X509Certificate x509Certificate, int i13) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && AbstractC22676k.m65745e(list.get(0), Integer.valueOf(i13)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return C25271y.f99162w;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX INFO: renamed from: b */
    public static boolean m60879b(String host, X509Certificate x509Certificate) {
        boolean zM65745e;
        int length;
        AbstractC22676k.m65750j(host, "host");
        C39412p c39412p = AbstractC37171e.f158957a;
        if (AbstractC37171e.f158957a.m125851e(host)) {
            String strM119115b = AbstractC37171e.m119115b(host);
            List listM60878a = m60878a(x509Certificate, 7);
            if (!(listM60878a instanceof Collection) || !listM60878a.isEmpty()) {
                Iterator it = listM60878a.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(strM119115b, AbstractC37171e.m119115b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (host.length() == ((int) AbstractC26604b.m79165j(host))) {
            Locale locale = Locale.US;
            host = AbstractC31061c.m95641q(locale, "US", host, locale, "toLowerCase(...)");
        }
        List<String> listM60878a2 = m60878a(x509Certificate, 2);
        if (!(listM60878a2 instanceof Collection) || !listM60878a2.isEmpty()) {
            for (String strM95641q : listM60878a2) {
                if (host.length() == 0 || AbstractC39421y.m125930O(host, ".", false) || AbstractC39421y.m125920E(host, "..", false) || strM95641q == null || strM95641q.length() == 0 || AbstractC39421y.m125930O(strM95641q, ".", false) || AbstractC39421y.m125920E(strM95641q, "..", false)) {
                    zM65745e = false;
                } else {
                    String strConcat = !AbstractC39421y.m125920E(host, ".", false) ? host.concat(".") : host;
                    if (!AbstractC39421y.m125920E(strM95641q, ".", false)) {
                        strM95641q = strM95641q.concat(".");
                    }
                    if (strM95641q.length() == ((int) AbstractC26604b.m79165j(strM95641q))) {
                        Locale locale2 = Locale.US;
                        strM95641q = AbstractC31061c.m95641q(locale2, "US", strM95641q, locale2, "toLowerCase(...)");
                    }
                    if (!AbstractC39414r.m125876U(strM95641q, "*", false)) {
                        zM65745e = AbstractC22676k.m65745e(strConcat, strM95641q);
                    } else if (!AbstractC39421y.m125930O(strM95641q, "*.", false) || AbstractC39414r.m125887f0(strM95641q, '*', 1, false, 4) != -1 || strConcat.length() < strM95641q.length() || "*.".equals(strM95641q)) {
                        zM65745e = false;
                    } else {
                        String strSubstring = strM95641q.substring(1);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        if (AbstractC39421y.m125920E(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || AbstractC39414r.m125892k0(strConcat, '.', length - 1, 4) == -1)) {
                            zM65745e = true;
                        } else {
                            zM65745e = false;
                        }
                    }
                }
                if (zM65745e) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        AbstractC22676k.m65750j(host, "host");
        AbstractC22676k.m65750j(session, "session");
        if (host.length() == ((int) AbstractC26604b.m79165j(host))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                AbstractC22676k.m65748h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return m60879b(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
