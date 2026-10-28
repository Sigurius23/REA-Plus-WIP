package p659ys;

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
import p288ks.AbstractC22819a;
import p560vs.C36368i4;
import p691zs.AbstractC41074b;
import p691zs.AbstractC41075c;

/* JADX INFO: renamed from: ys.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39747i {
    static {
        int i13 = C36368i4.CONFIG_NAME_FIELD_NUMBER;
        try {
            m127161a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m127161a() throws GeneralSecurityException {
        C5120y c5120y = C5120y.f21472b;
        c5120y.m16090d(C39749k.f171129a);
        c5120y.m16089c(C39749k.f171130b);
        if (AbstractC22819a.m66183a()) {
            return;
        }
        C5089f0 c5089f0 = AbstractC39740b.f171094a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
        }
        C5085d0 c5085d0 = AbstractC41074b.f177090a;
        C5121z c5121z = C5121z.f21474b;
        c5121z.m16096f(AbstractC41074b.f177090a);
        c5121z.m16095e(AbstractC41074b.f177091b);
        c5121z.m16094d(AbstractC41074b.f177092c);
        c5121z.m16093c(AbstractC41074b.f177093d);
        C5119x c5119x = C5119x.f21470b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256_4KB", AbstractC39746h.f171121a);
        map.put("AES128_CTR_HMAC_SHA256_1MB", AbstractC39746h.f171122b);
        map.put("AES256_CTR_HMAC_SHA256_4KB", AbstractC39746h.f171123c);
        map.put("AES256_CTR_HMAC_SHA256_1MB", AbstractC39746h.f171124d);
        c5119x.m16086b(Collections.unmodifiableMap(map));
        C5115t c5115t = C5115t.f21463b;
        c5115t.m16081a(AbstractC39740b.f171095b, C39742d.class);
        c5120y.m16089c(AbstractC39740b.f171094a);
        C5096j c5096j = C5096j.f21426d;
        c5096j.m15973c(AbstractC39740b.f171096c, true);
        C5089f0 c5089f1 = AbstractC39744f.f171113a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        c5121z.m16096f(AbstractC41075c.f177094a);
        c5121z.m16095e(AbstractC41075c.f177095b);
        c5121z.m16094d(AbstractC41075c.f177096c);
        c5121z.m16093c(AbstractC41075c.f177097d);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM_HKDF_4KB", AbstractC39746h.f171125e);
        map2.put("AES128_GCM_HKDF_1MB", AbstractC39746h.f171126f);
        map2.put("AES256_GCM_HKDF_4KB", AbstractC39746h.f171127g);
        map2.put("AES256_GCM_HKDF_1MB", AbstractC39746h.f171128h);
        c5119x.m16086b(Collections.unmodifiableMap(map2));
        C5116u.f21465b.m16083a(AbstractC39744f.f171116d, C39745g.class);
        c5115t.m16081a(AbstractC39744f.f171115c, C39745g.class);
        c5120y.m16089c(AbstractC39744f.f171113a);
        c5096j.m15973c(AbstractC39744f.f171114b, true);
    }
}
