package p259js;

import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5096j;
import com.google.crypto.tink.internal.C5115t;
import com.google.crypto.tink.internal.C5116u;
import com.google.crypto.tink.internal.C5119x;
import com.google.crypto.tink.internal.C5120y;
import com.google.crypto.tink.internal.C5121z;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import ls.AbstractC24708e;
import p288ks.AbstractC22819a;
import p347ns.AbstractC27096q;
import p505ts.AbstractC34120c;
import p505ts.AbstractC34123f;
import p505ts.AbstractC34127j;
import p505ts.AbstractC34129l;
import p505ts.AbstractC34131n;
import p505ts.C34121d;
import p505ts.C34125h;
import p505ts.C34128k;
import p505ts.C34135r;
import p560vs.C36368i4;
import p659ys.AbstractC39747i;
import us.AbstractC35202a;
import us.AbstractC35203b;
import us.AbstractC35204c;
import ws.AbstractC37580b0;

/* JADX INFO: renamed from: js.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21906a {
    static {
        int i13 = C36368i4.CONFIG_NAME_FIELD_NUMBER;
        try {
            m62324a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m62324a() {
        AbstractC24708e.m72317a();
        AbstractC27096q.m81466a();
        int i13 = AbstractC34131n.f143072a;
        C5120y c5120y = C5120y.f21472b;
        c5120y.m16090d(C34135r.f143075a);
        c5120y.m16089c(C34135r.f143076b);
        int i14 = AbstractC34127j.f143065e;
        if (!AbstractC18489d0.m53361b(i14)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C5085d0 c5085d0 = AbstractC35204c.f149749a;
        C5121z c5121z = C5121z.f21474b;
        c5121z.m16096f(AbstractC35204c.f149749a);
        c5121z.m16095e(AbstractC35204c.f149750b);
        c5121z.m16094d(AbstractC35204c.f149751c);
        c5121z.m16093c(AbstractC35204c.f149752d);
        c5120y.m16089c(AbstractC34127j.f143061a);
        C5119x c5119x = C5119x.f21470b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_PRF", AbstractC34129l.f143069b);
        map.put("HMAC_SHA512_PRF", AbstractC34129l.f143070c);
        c5119x.m16086b(Collections.unmodifiableMap(map));
        C5115t c5115t = C5115t.f21463b;
        c5115t.m16081a(AbstractC34127j.f143063c, C34128k.class);
        C5116u.f21465b.m16083a(AbstractC34127j.f143064d, C34128k.class);
        C5096j c5096j = C5096j.f21426d;
        c5096j.m15974d(AbstractC34127j.f143062b, i14, true);
        if (!AbstractC22819a.m66183a()) {
            C5089f0 c5089f0 = AbstractC34120c.f143034a;
            if (!AbstractC18489d0.m53360a(1)) {
                throw new GeneralSecurityException("Registering AES CMAC PRF is not supported in FIPS mode");
            }
            c5121z.m16096f(AbstractC35202a.f149741a);
            c5121z.m16095e(AbstractC35202a.f149742b);
            c5121z.m16094d(AbstractC35202a.f149743c);
            c5121z.m16093c(AbstractC35202a.f149744d);
            c5115t.m16081a(AbstractC34120c.f143036c, C34121d.class);
            c5120y.m16089c(AbstractC34120c.f143034a);
            HashMap map2 = new HashMap();
            C34121d c34121d = AbstractC34129l.f143071d;
            map2.put("AES256_CMAC_PRF", c34121d);
            map2.put("AES_CMAC_PRF", c34121d);
            c5119x.m16086b(Collections.unmodifiableMap(map2));
            c5096j.m15973c(AbstractC34120c.f143035b, true);
            C5089f0 c5089f1 = AbstractC34123f.f143040a;
            if (!AbstractC18489d0.m53360a(1)) {
                throw new GeneralSecurityException("Registering HKDF PRF is not supported in FIPS mode");
            }
            c5121z.m16096f(AbstractC35203b.f149745a);
            c5121z.m16095e(AbstractC35203b.f149746b);
            c5121z.m16094d(AbstractC35203b.f149747c);
            c5121z.m16093c(AbstractC35203b.f149748d);
            c5120y.m16089c(AbstractC34123f.f143041b);
            c5120y.m16089c(AbstractC34123f.f143040a);
            c5115t.m16081a(AbstractC34123f.f143043d, C34125h.class);
            HashMap map3 = new HashMap();
            map3.put("HKDF_SHA256", AbstractC34129l.f143068a);
            c5119x.m16086b(Collections.unmodifiableMap(map3));
            c5096j.m15973c(AbstractC34123f.f143042c, true);
        }
        AbstractC37580b0.m120649a();
        AbstractC39747i.m127161a();
    }
}
