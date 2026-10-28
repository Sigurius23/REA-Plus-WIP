package q30;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyTypeException;
import gw.AbstractC16256g;
import gw.C16250a;
import gw.C16262m;
import gw.C16263n;
import gw.C16265p;
import gw.EnumC16264o;
import java.io.ByteArrayInputStream;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.SecretKey;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import la.C23548b;
import m83.AbstractC25265s;
import n30.C26212c;
import ng3.C26702o;
import org.json.JSONObject;
import p202hw.C17692c;
import p202hw.C17693d;
import p202hw.C17695f;
import p232iw.C20956a;
import p263jw.AbstractC21978d;
import p263jw.AbstractC21980f;
import p263jw.AbstractC21982h;
import p477s2.AbstractC32076h;
import p505ts.AbstractC34132o;
import p628xw.AbstractC38676f;
import p628xw.C38671a;
import p628xw.C38672b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y83.C39347c;

/* JADX INFO: renamed from: q30.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29902e0 {

    /* JADX INFO: renamed from: a */
    public final boolean f122169a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f122170b;

    /* JADX INFO: renamed from: c */
    public final C26212c f122171c;

    public C29902e0(boolean z4, ArrayList arrayList, C26212c c26212c) {
        this.f122169a = z4;
        this.f122170b = arrayList;
        this.f122171c = c26212c;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m91514a(String jws) throws CertificateException, ParseException {
        AbstractC22676k.m65750j(jws, "jws");
        C38672b[] c38672bArrM46077a = AbstractC16256g.m46077a(jws);
        if (c38672bArrM46077a.length != 3) {
            throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
        }
        C16265p c16265p = new C16265p(c38672bArrM46077a[0], c38672bArrM46077a[1], c38672bArrM46077a[2]);
        if (this.f122169a) {
            if (m91515b(c16265p, this.f122170b)) {
                return new JSONObject(c16265p.f61804w.toString());
            }
            throw new IllegalStateException("Could not validate JWS");
        }
        C16263n c16263n = c16265p.f61871x;
        List list = c16263n.f61785L;
        if (list == null || list.isEmpty()) {
            return new JSONObject(c16265p.f61804w.toString());
        }
        List list2 = c16263n.f61785L;
        AbstractC22676k.m65749i(list2, "getX509CertChain(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = ((C38671a) it.next()).f166476w;
            AbstractC22676k.m65749i(str, "toString(...)");
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(C39347c.m125469a(C39347c.f169348f, str, 0, 6)));
            X509Certificate x509Certificate = certificateGenerateCertificate instanceof X509Certificate ? (X509Certificate) certificateGenerateCertificate : null;
            if (x509Certificate != null) {
                arrayList.add(x509Certificate);
            }
        }
        if (arrayList.isEmpty() || !m91515b(c16265p, arrayList)) {
            throw new IllegalStateException("Could not validate JWS");
        }
        return new JSONObject(c16265p.f61804w.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v9, types: [b3.b, gw.q] */
    /* JADX INFO: renamed from: b */
    public final boolean m91515b(C16265p c16265p, ArrayList arrayList) throws JOSEException {
        Object objM107888l;
        ?? c17692c;
        boolean zMo46085e;
        if (c16265p.f61871x.f61781H != null) {
            this.f122171c.m77828c(new IllegalArgumentException("Encountered a JWK in " + c16265p.f61871x));
        }
        C16263n c16263n = c16265p.f61871x;
        AbstractC22676k.m65749i(c16263n, "getHeader(...)");
        C16262m c16262m = (C16262m) c16263n.f61787w;
        if (c16262m.f61776w.equals(C16250a.f61775x.f61776w)) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        C16263n c16263n2 = new C16263n(c16262m, c16263n.f61788x, c16263n.f61789y, c16263n.f61790z, c16263n.f61780G, null, c16263n.f61782I, c16263n.f61783J, c16263n.f61784K, c16263n.f61785L, c16263n.f61786M, c16263n.f61866O, c16263n.f61778E, null);
        List list = c16263n2.f61785L;
        try {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                throw new IllegalArgumentException("JWSHeader's X.509 certificate chain is null or empty");
            }
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Root certificates are empty");
            }
            C26702o.m79407f(list, arrayList);
            objM107888l = C23454a0.f92919a;
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                this.f122171c.m77828c(thM68037a);
            }
            if (objM107888l instanceof C23467m) {
                return false;
            }
            C23548b c23548b = new C20956a().f79172a;
            c23548b.f93280x = Signature.getInstance(AbstractC22676k.m65745e((C16262m) c16263n2.f61787w, C16262m.f61853I) ? "SHA256withECDSA" : "SHA256withRSA").getProvider();
            List list3 = c16263n2.f61785L;
            AbstractC22676k.m65749i(list3, "getX509CertChain(...)");
            PublicKey publicKey = AbstractC32076h.m99778k(((C38671a) AbstractC25265s.m74096F0(list3)).m124047a()).getPublicKey();
            AbstractC22676k.m65749i(publicKey, "getPublicKey(...)");
            Set set = AbstractC21980f.f85116e;
            C16262m c16262m2 = (C16262m) c16263n2.f61787w;
            if (set.contains(c16262m2)) {
                if (!(publicKey instanceof SecretKey)) {
                    throw new KeyTypeException(SecretKey.class);
                }
                c17692c = new C17693d((SecretKey) publicKey);
            } else if (AbstractC21982h.f85119d.contains(c16262m2)) {
                if (!(publicKey instanceof RSAPublicKey)) {
                    throw new KeyTypeException(RSAPublicKey.class);
                }
                c17692c = new C17695f((RSAPublicKey) publicKey);
            } else {
                if (!AbstractC21978d.f85111d.contains(c16262m2)) {
                    throw new JOSEException("Unsupported JWS algorithm: " + c16262m2);
                }
                if (!(publicKey instanceof ECPublicKey)) {
                    throw new KeyTypeException(ECPublicKey.class);
                }
                c17692c = new C17692c((ECPublicKey) publicKey);
            }
            ((C23548b) c17692c.f9292c).f93280x = (Provider) c23548b.f93280x;
            synchronized (c16265p) {
                AtomicReference atomicReference = c16265p.f61870E;
                if (atomicReference.get() != EnumC16264o.f61867w && atomicReference.get() != EnumC16264o.f61868x) {
                    throw new IllegalStateException("The JWS object must be in a signed or verified state");
                }
                try {
                    zMo46085e = c17692c.mo46085e(c16265p.f61871x, c16265p.f61872y.getBytes(AbstractC38676f.f166480a), c16265p.f61873z);
                    if (zMo46085e) {
                        c16265p.f61870E.set(EnumC16264o.f61868x);
                    }
                } catch (JOSEException e5) {
                    throw e5;
                } catch (Exception e13) {
                    throw new JOSEException(e13.getMessage(), e13);
                }
            }
            return zMo46085e;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
    }
}
