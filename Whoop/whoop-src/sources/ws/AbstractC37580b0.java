package ws;

import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5096j;
import com.google.crypto.tink.internal.C5115t;
import com.google.crypto.tink.internal.C5116u;
import com.google.crypto.tink.internal.C5119x;
import com.google.crypto.tink.internal.C5120y;
import com.google.crypto.tink.internal.C5121z;
import ih0.AbstractC18489d0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import p288ks.AbstractC22819a;
import p560vs.C36368i4;
import p624xs.AbstractC38633b;
import p624xs.AbstractC38634c;
import p624xs.AbstractC38635d;
import p624xs.AbstractC38636e;
import p692zt.C41113q;

/* JADX INFO: renamed from: ws.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC37580b0 {
    static {
        int i13 = C36368i4.CONFIG_NAME_FIELD_NUMBER;
        try {
            m120649a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m120649a() throws GeneralSecurityException {
        C5120y c5120y = C5120y.f21472b;
        c5120y.m16090d(C37591m.f160760b);
        c5120y.m16089c(C37591m.f160761c);
        c5120y.m16090d(C37591m.f160762d);
        c5120y.m16089c(C37591m.f160763e);
        int i13 = AbstractC37584f.f160729f;
        if (!AbstractC18489d0.m53361b(i13)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        C5085d0 c5085d0 = AbstractC38633b.f166143a;
        C5121z c5121z = C5121z.f21474b;
        c5121z.m16096f(AbstractC38633b.f166143a);
        c5121z.m16095e(AbstractC38633b.f166144b);
        c5121z.m16094d(AbstractC38633b.f166145c);
        c5121z.m16093c(AbstractC38633b.f166146d);
        c5121z.m16094d(AbstractC38633b.f166147e);
        c5121z.m16093c(AbstractC38633b.f166148f);
        C5119x c5119x = C5119x.f21470b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", AbstractC37590l.f160748a);
        map.put("ECDSA_P256_IEEE_P1363", AbstractC37590l.f160751d);
        C41113q c41113qM120650b = C37581c.m120650b();
        c41113qM120650b.f177226z = C37579b.f160703c;
        c41113qM120650b.f177225y = C37577a.f160693c;
        c41113qM120650b.f177224x = C37579b.f160706f;
        c41113qM120650b.f177222E = C37579b.f160711k;
        map.put("ECDSA_P256_RAW", c41113qM120650b.m133468o());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", AbstractC37590l.f160753f);
        map.put("ECDSA_P384", AbstractC37590l.f160749b);
        map.put("ECDSA_P384_IEEE_P1363", AbstractC37590l.f160752e);
        C41113q c41113qM120650b2 = C37581c.m120650b();
        c41113qM120650b2.f177226z = C37579b.f160705e;
        C37577a c37577a = C37577a.f160694d;
        c41113qM120650b2.f177225y = c37577a;
        C37579b c37579b = C37579b.f160707g;
        c41113qM120650b2.f177224x = c37579b;
        C37579b c37579b2 = C37579b.f160708h;
        c41113qM120650b2.f177222E = c37579b2;
        map.put("ECDSA_P384_SHA512", c41113qM120650b2.m133468o());
        C41113q c41113qM120650b3 = C37581c.m120650b();
        c41113qM120650b3.f177226z = C37579b.f160704d;
        c41113qM120650b3.f177225y = c37577a;
        c41113qM120650b3.f177224x = c37579b;
        c41113qM120650b3.f177222E = c37579b2;
        map.put("ECDSA_P384_SHA384", c41113qM120650b3.m133468o());
        map.put("ECDSA_P521", AbstractC37590l.f160750c);
        map.put("ECDSA_P521_IEEE_P1363", AbstractC37590l.f160754g);
        c5119x.m16086b(Collections.unmodifiableMap(map));
        c5120y.m16089c(AbstractC37584f.f160724a);
        c5120y.m16089c(AbstractC37584f.f160725b);
        C5115t c5115t = C5115t.f21463b;
        c5115t.m16081a(AbstractC37584f.f160728e, C37581c.class);
        C5096j c5096j = C5096j.f21426d;
        c5096j.m15974d(AbstractC37584f.f160726c, i13, true);
        c5096j.m15974d(AbstractC37584f.f160727d, i13, false);
        int i14 = AbstractC37598t.f160801f;
        if (!AbstractC18489d0.m53361b(i14)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        c5121z.m16096f(AbstractC38635d.f166156a);
        c5121z.m16095e(AbstractC38635d.f166157b);
        c5121z.m16094d(AbstractC38635d.f166158c);
        c5121z.m16093c(AbstractC38635d.f166159d);
        c5121z.m16094d(AbstractC38635d.f166160e);
        c5121z.m16093c(AbstractC38635d.f166161f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", AbstractC37590l.f160755h);
        C37592n c37592nM120654b = C37595q.m120654b();
        c37592nM120654b.f160769c = C37593o.f160771b;
        c37592nM120654b.f160767a = 3072;
        BigInteger bigInteger = C37595q.f160780e;
        c37592nM120654b.f160768b = bigInteger;
        C37594p c37594p = C37594p.f160778e;
        c37592nM120654b.f160770d = c37594p;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", c37592nM120654b.m120653a());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", AbstractC37590l.f160756i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", AbstractC37590l.f160757j);
        C37592n c37592nM120654b2 = C37595q.m120654b();
        c37592nM120654b2.f160769c = C37593o.f160773d;
        c37592nM120654b2.f160767a = 4096;
        c37592nM120654b2.f160768b = bigInteger;
        c37592nM120654b2.f160770d = c37594p;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", c37592nM120654b2.m120653a());
        c5119x.m16086b(map2);
        c5120y.m16089c(AbstractC37598t.f160796a);
        c5120y.m16089c(AbstractC37598t.f160797b);
        c5115t.m16081a(AbstractC37598t.f160800e, C37595q.class);
        c5096j.m15974d(AbstractC37598t.f160798c, i14, true);
        c5096j.m15974d(AbstractC37598t.f160799d, i14, false);
        if (AbstractC22819a.m66183a()) {
            return;
        }
        C5089f0 c5089f0 = AbstractC37578a0.f160698a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering RSA SSA PSS is not supported in FIPS mode");
        }
        c5121z.m16096f(AbstractC38636e.f166164a);
        c5121z.m16095e(AbstractC38636e.f166165b);
        c5121z.m16094d(AbstractC38636e.f166166c);
        c5121z.m16093c(AbstractC38636e.f166167d);
        c5121z.m16094d(AbstractC38636e.f166168e);
        c5121z.m16093c(AbstractC38636e.f166169f);
        HashMap map3 = new HashMap();
        C37599u c37599uM120657b = C37602x.m120657b();
        C37600v c37600v = C37600v.f160810b;
        c37599uM120657b.f160806c = c37600v;
        c37599uM120657b.f160807d = c37600v;
        c37599uM120657b.m120656b(32);
        c37599uM120657b.f160804a = 3072;
        BigInteger bigInteger2 = C37602x.f160819g;
        c37599uM120657b.f160805b = bigInteger2;
        C37601w c37601w = C37601w.f160814b;
        c37599uM120657b.f160809f = c37601w;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", c37599uM120657b.m120655a());
        C37599u c37599uM120657b2 = C37602x.m120657b();
        c37599uM120657b2.f160806c = c37600v;
        c37599uM120657b2.f160807d = c37600v;
        c37599uM120657b2.m120656b(32);
        c37599uM120657b2.f160804a = 3072;
        c37599uM120657b2.f160805b = bigInteger2;
        C37601w c37601w2 = C37601w.f160817e;
        c37599uM120657b2.f160809f = c37601w2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", c37599uM120657b2.m120655a());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", AbstractC37590l.f160758k);
        C37599u c37599uM120657b3 = C37602x.m120657b();
        C37600v c37600v2 = C37600v.f160812d;
        c37599uM120657b3.f160806c = c37600v2;
        c37599uM120657b3.f160807d = c37600v2;
        c37599uM120657b3.m120656b(64);
        c37599uM120657b3.f160804a = 4096;
        c37599uM120657b3.f160805b = bigInteger2;
        c37599uM120657b3.f160809f = c37601w;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", c37599uM120657b3.m120655a());
        C37599u c37599uM120657b4 = C37602x.m120657b();
        c37599uM120657b4.f160806c = c37600v2;
        c37599uM120657b4.f160807d = c37600v2;
        c37599uM120657b4.m120656b(64);
        c37599uM120657b4.f160804a = 4096;
        c37599uM120657b4.f160805b = bigInteger2;
        c37599uM120657b4.f160809f = c37601w2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", c37599uM120657b4.m120655a());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", AbstractC37590l.f160759l);
        c5119x.m16086b(Collections.unmodifiableMap(map3));
        c5120y.m16089c(AbstractC37578a0.f160698a);
        c5120y.m16089c(AbstractC37578a0.f160699b);
        c5115t.m16081a(AbstractC37578a0.f160702e, C37602x.class);
        c5096j.m15973c(AbstractC37578a0.f160700c, true);
        c5096j.m15973c(AbstractC37578a0.f160701d, false);
        C5089f0 c5089f1 = AbstractC37588j.f160738a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        c5121z.m16096f(AbstractC38634c.f166149a);
        c5121z.m16095e(AbstractC38634c.f166150b);
        c5121z.m16094d(AbstractC38634c.f166151c);
        c5121z.m16093c(AbstractC38634c.f166152d);
        c5121z.m16094d(AbstractC38634c.f166153e);
        c5121z.m16093c(AbstractC38634c.f166154f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new C37586h(C37585g.f160730b));
        C37585g c37585g = C37585g.f160733e;
        map4.put("ED25519_RAW", new C37586h(c37585g));
        map4.put("ED25519WithRawOutput", new C37586h(c37585g));
        c5119x.m16086b(Collections.unmodifiableMap(map4));
        c5115t.m16081a(AbstractC37588j.f160743f, C37586h.class);
        C5116u.f21465b.m16083a(AbstractC37588j.f160742e, C37586h.class);
        c5120y.m16089c(AbstractC37588j.f160738a);
        c5120y.m16089c(AbstractC37588j.f160739b);
        c5096j.m15973c(AbstractC37588j.f160740c, true);
        c5096j.m15973c(AbstractC37588j.f160741d, false);
    }
}
