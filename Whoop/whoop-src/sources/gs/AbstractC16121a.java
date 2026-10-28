package gs;

import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5096j;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5101l0;
import com.google.crypto.tink.internal.C5108p;
import com.google.crypto.tink.internal.C5115t;
import com.google.crypto.tink.internal.C5116u;
import com.google.crypto.tink.internal.C5119x;
import com.google.crypto.tink.internal.C5120y;
import com.google.crypto.tink.internal.C5121z;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p200hs.AbstractC17589a;
import p200hs.AbstractC17590b;
import p200hs.AbstractC17591c;
import p200hs.AbstractC17592d;
import p200hs.AbstractC17594f;
import p200hs.AbstractC17599k;
import p288ks.AbstractC22819a;
import p436qs.AbstractC30569m;
import p560vs.C36368i4;
import p692zt.C41113q;

/* JADX INFO: renamed from: gs.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16121a {
    static {
        int i13 = C36368i4.CONFIG_NAME_FIELD_NUMBER;
        try {
            m45676a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m45676a() throws GeneralSecurityException {
        C5120y c5120y = C5120y.f21472b;
        c5120y.m16090d(C16131f.f61266a);
        c5120y.m16089c(C16131f.f61267b);
        AbstractC30569m.m93715a();
        int i13 = AbstractC16137i.f61291e;
        if (!AbstractC18489d0.m53361b(i13)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C5085d0 c5085d0 = AbstractC17589a.f68143a;
        C5121z c5121z = C5121z.f21474b;
        c5121z.m16096f(AbstractC17589a.f68143a);
        c5121z.m16095e(AbstractC17589a.f68144b);
        c5121z.m16094d(AbstractC17589a.f68145c);
        c5121z.m16093c(AbstractC17589a.f68146d);
        c5120y.m16089c(AbstractC16137i.f61287a);
        C5119x c5119x = C5119x.f21470b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", AbstractC16136h0.f61285e);
        C5099k0 c5099k0M45691b = C16141k.m45691b();
        c5099k0M45691b.m15995M(16);
        c5099k0M45691b.m15998P(32);
        c5099k0M45691b.m16000S(16);
        c5099k0M45691b.m15999Q(16);
        C16139j c16139j = C16139j.f61298e;
        c5099k0M45691b.f21436E = c16139j;
        C16139j c16139j2 = C16139j.f61303j;
        c5099k0M45691b.f21437F = c16139j2;
        map.put("AES128_CTR_HMAC_SHA256_RAW", c5099k0M45691b.m16006f());
        map.put("AES256_CTR_HMAC_SHA256", AbstractC16136h0.f61286f);
        C5099k0 c5099k0M45691b2 = C16141k.m45691b();
        c5099k0M45691b2.m15995M(32);
        c5099k0M45691b2.m15998P(32);
        c5099k0M45691b2.m16000S(32);
        c5099k0M45691b2.m15999Q(16);
        c5099k0M45691b2.f21436E = c16139j;
        c5099k0M45691b2.f21437F = c16139j2;
        map.put("AES256_CTR_HMAC_SHA256_RAW", c5099k0M45691b2.m16006f());
        c5119x.m16086b(Collections.unmodifiableMap(map));
        C5116u c5116u = C5116u.f21465b;
        c5116u.m16083a(AbstractC16137i.f61289c, C16141k.class);
        C5115t c5115t = C5115t.f21463b;
        c5115t.m16081a(AbstractC16137i.f61290d, C16141k.class);
        C5096j c5096j = C5096j.f21426d;
        c5096j.m15974d(AbstractC16137i.f61288b, i13, true);
        int i14 = AbstractC16147p.f61351e;
        if (!AbstractC18489d0.m53361b(i14)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        c5121z.m16096f(AbstractC17591c.f68151a);
        c5121z.m16095e(AbstractC17591c.f68152b);
        c5121z.m16094d(AbstractC17591c.f68153c);
        c5121z.m16093c(AbstractC17591c.f68154d);
        c5120y.m16089c(AbstractC16147p.f61347a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", AbstractC16136h0.f61281a);
        C41113q c41113qM45693b = C16148q.m45693b();
        c41113qM45693b.m133457I();
        c41113qM45693b.m133459K(16);
        c41113qM45693b.m133460L();
        C16139j c16139j3 = C16139j.f61309p;
        c41113qM45693b.f177222E = c16139j3;
        map2.put("AES128_GCM_RAW", c41113qM45693b.m133465j());
        map2.put("AES256_GCM", AbstractC16136h0.f61282b);
        C41113q c41113qM45693b2 = C16148q.m45693b();
        c41113qM45693b2.m133457I();
        c41113qM45693b2.m133459K(32);
        c41113qM45693b2.m133460L();
        c41113qM45693b2.f177222E = c16139j3;
        map2.put("AES256_GCM_RAW", c41113qM45693b2.m133465j());
        c5119x.m16086b(Collections.unmodifiableMap(map2));
        c5116u.m16083a(AbstractC16147p.f61349c, C16148q.class);
        c5115t.m16081a(AbstractC16147p.f61350d, C16148q.class);
        c5096j.m15974d(AbstractC16147p.f61348b, i14, true);
        if (AbstractC22819a.m66183a()) {
            return;
        }
        C5089f0 c5089f0 = AbstractC16144m.f61336a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        c5121z.m16096f(AbstractC17590b.f68147a);
        c5121z.m16095e(AbstractC17590b.f68148b);
        c5121z.m16094d(AbstractC17590b.f68149c);
        c5121z.m16093c(AbstractC17590b.f68150d);
        c5120y.m16089c(AbstractC16144m.f61336a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", AbstractC16136h0.f61283c);
        C41113q c41113qM45692b = C16145n.m45692b();
        c41113qM45692b.m133458J(16);
        c41113qM45692b.m133459K(16);
        c41113qM45692b.m133460L();
        C16139j c16139j4 = C16139j.f61306m;
        c41113qM45692b.f177222E = c16139j4;
        map3.put("AES128_EAX_RAW", c41113qM45692b.m133464g());
        map3.put("AES256_EAX", AbstractC16136h0.f61284d);
        C41113q c41113qM45692b2 = C16145n.m45692b();
        c41113qM45692b2.m133458J(16);
        c41113qM45692b2.m133459K(32);
        c41113qM45692b2.m133460L();
        c41113qM45692b2.f177222E = c16139j4;
        map3.put("AES256_EAX_RAW", c41113qM45692b2.m133464g());
        c5119x.m16086b(Collections.unmodifiableMap(map3));
        c5115t.m16081a(AbstractC16144m.f61338c, C16145n.class);
        c5096j.m15973c(AbstractC16144m.f61337b, true);
        C5089f0 c5089f1 = AbstractC16150s.f61360a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        c5121z.m16096f(AbstractC17592d.f68155a);
        c5121z.m16095e(AbstractC17592d.f68156b);
        c5121z.m16094d(AbstractC17592d.f68157c);
        c5121z.m16093c(AbstractC17592d.f68158d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            c5120y.m16089c(AbstractC16150s.f61360a);
            HashMap map4 = new HashMap();
            C5101l0 c5101l0M45694b = C16151t.m45694b();
            c5101l0M45694b.m16057h0(16);
            C16139j c16139j5 = C16139j.f61310q;
            c5101l0M45694b.f21444y = c16139j5;
            map4.put("AES128_GCM_SIV", c5101l0M45694b.m16028C());
            C5101l0 c5101l0M45694b2 = C16151t.m45694b();
            c5101l0M45694b2.m16057h0(16);
            C16139j c16139j6 = C16139j.f61312s;
            c5101l0M45694b2.f21444y = c16139j6;
            map4.put("AES128_GCM_SIV_RAW", c5101l0M45694b2.m16028C());
            C5101l0 c5101l0M45694b3 = C16151t.m45694b();
            c5101l0M45694b3.m16057h0(32);
            c5101l0M45694b3.f21444y = c16139j5;
            map4.put("AES256_GCM_SIV", c5101l0M45694b3.m16028C());
            C5101l0 c5101l0M45694b4 = C16151t.m45694b();
            c5101l0M45694b4.m16057h0(32);
            c5101l0M45694b4.f21444y = c16139j6;
            map4.put("AES256_GCM_SIV_RAW", c5101l0M45694b4.m16028C());
            c5119x.m16086b(Collections.unmodifiableMap(map4));
            c5116u.m16083a(AbstractC16150s.f61362c, C16151t.class);
            c5115t.m16081a(AbstractC16150s.f61361b, C16151t.class);
            c5096j.m15973c(AbstractC16150s.f61363d, true);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        C5089f0 c5089f2 = AbstractC16153v.f61370a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        C5085d0 c5085d1 = AbstractC17594f.f68165a;
        C5121z c5121z2 = C5121z.f21474b;
        c5121z2.m16096f(AbstractC17594f.f68165a);
        c5121z2.m16095e(AbstractC17594f.f68166b);
        c5121z2.m16094d(AbstractC17594f.f68167c);
        c5121z2.m16093c(AbstractC17594f.f68168d);
        C5120y c5120y2 = C5120y.f21472b;
        c5120y2.m16089c(AbstractC16153v.f61370a);
        C5115t c5115t2 = C5115t.f21463b;
        c5115t2.m16081a(AbstractC16153v.f61371b, C16154w.class);
        C5119x c5119x2 = C5119x.f21470b;
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new C16154w(C16139j.f61313t));
        map5.put("CHACHA20_POLY1305_RAW", new C16154w(C16139j.f61315v));
        c5119x2.m16086b(Collections.unmodifiableMap(map5));
        C5096j c5096j2 = C5096j.f21426d;
        c5096j2.m15973c(AbstractC16153v.f61372c, true);
        C5089f0 c5089f3 = AbstractC16155x.f61374a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        c5121z2.m16096f(AbstractC16128d0.f61256a);
        c5121z2.m16095e(AbstractC16128d0.f61257b);
        c5121z2.m16094d(AbstractC16128d0.f61258c);
        c5121z2.m16093c(AbstractC16128d0.f61259d);
        c5120y2.m16089c(AbstractC16155x.f61374a);
        c5115t2.m16081a(AbstractC16155x.f61376c, C16126c0.class);
        c5096j2.m15973c(AbstractC16155x.f61375b, true);
        C5108p c5108p = AbstractC16157z.f61382a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        c5121z2.m16096f(AbstractC16134g0.f61277a);
        c5121z2.m16095e(AbstractC16134g0.f61278b);
        c5121z2.m16094d(AbstractC16134g0.f61279c);
        c5121z2.m16093c(AbstractC16134g0.f61280d);
        c5115t2.m16081a(AbstractC16157z.f61383b, C16132f0.class);
        c5120y2.m16089c(AbstractC16157z.f61384c);
        c5096j2.m15973c(AbstractC16157z.f61382a, true);
        C5089f0 c5089f4 = AbstractC16140j0.f61321a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        c5121z2.m16096f(AbstractC17599k.f68173a);
        c5121z2.m16095e(AbstractC17599k.f68174b);
        c5121z2.m16094d(AbstractC17599k.f68175c);
        c5121z2.m16093c(AbstractC17599k.f68176d);
        c5120y2.m16089c(AbstractC16140j0.f61321a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new C16142k0(C16139j.f61316w));
        map6.put("XCHACHA20_POLY1305_RAW", new C16142k0(C16139j.f61318y));
        c5119x2.m16086b(Collections.unmodifiableMap(map6));
        c5115t2.m16081a(AbstractC16140j0.f61324d, C16142k0.class);
        C5116u.f21465b.m16083a(AbstractC16140j0.f61323c, C16142k0.class);
        c5096j2.m15973c(AbstractC16140j0.f61322b, true);
    }
}
