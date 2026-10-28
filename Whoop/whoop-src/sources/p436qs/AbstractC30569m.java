package p436qs;

import com.google.crypto.tink.internal.C5096j;
import com.google.crypto.tink.internal.C5114s;
import com.google.crypto.tink.internal.C5115t;
import com.google.crypto.tink.internal.C5116u;
import com.google.crypto.tink.internal.C5119x;
import com.google.crypto.tink.internal.C5120y;
import com.google.crypto.tink.internal.C5121z;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import p005a3.C0237p;
import p288ks.AbstractC22819a;
import p560vs.C36368i4;
import p581we.C37199o;
import p692zt.C41113q;
import rs.AbstractC31779a;
import rs.AbstractC31782d;

/* JADX INFO: renamed from: qs.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30569m {
    static {
        int i13 = C36368i4.CONFIG_NAME_FIELD_NUMBER;
        try {
            m93715a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m93715a() {
        C5120y c5120y = C5120y.f21472b;
        c5120y.m16090d(C30563g.f125765c);
        c5120y.m16089c(C30563g.f125766d);
        c5120y.m16090d(C30563g.f125764b);
        int i13 = AbstractC30565i.f125777f;
        if (!AbstractC18489d0.m53361b(i13)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C37199o c37199o = AbstractC31782d.f131592a;
        C5121z c5121z = C5121z.f21474b;
        c5121z.m16096f(AbstractC31782d.f131594c);
        c5121z.m16095e(AbstractC31782d.f131595d);
        c5121z.m16094d(AbstractC31782d.f131596e);
        c5121z.m16093c(AbstractC31782d.f131597f);
        c5120y.m16089c(AbstractC30565i.f125772a);
        c5120y.m16089c(AbstractC30565i.f125773b);
        C5119x c5119x = C5119x.f21470b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", AbstractC30571o.f125793a);
        C41113q c41113qM93713b = C30568l.m93713b();
        c41113qM93713b.f177224x = 32;
        c41113qM93713b.f177225y = 16;
        C30567k c30567k = C30567k.f125787e;
        c41113qM93713b.f177222E = c30567k;
        C30566j c30566j = C30566j.f125780d;
        c41113qM93713b.f177226z = c30566j;
        map.put("HMAC_SHA256_128BITTAG_RAW", c41113qM93713b.m133467n());
        C41113q c41113qM93713b2 = C30568l.m93713b();
        c41113qM93713b2.f177224x = 32;
        c41113qM93713b2.f177225y = 32;
        C30567k c30567k2 = C30567k.f125784b;
        c41113qM93713b2.f177222E = c30567k2;
        c41113qM93713b2.f177226z = c30566j;
        map.put("HMAC_SHA256_256BITTAG", c41113qM93713b2.m133467n());
        C41113q c41113qM93713b3 = C30568l.m93713b();
        c41113qM93713b3.f177224x = 32;
        c41113qM93713b3.f177225y = 32;
        c41113qM93713b3.f177222E = c30567k;
        c41113qM93713b3.f177226z = c30566j;
        map.put("HMAC_SHA256_256BITTAG_RAW", c41113qM93713b3.m133467n());
        C41113q c41113qM93713b4 = C30568l.m93713b();
        c41113qM93713b4.f177224x = 64;
        c41113qM93713b4.f177225y = 16;
        c41113qM93713b4.f177222E = c30567k2;
        C30566j c30566j2 = C30566j.f125782f;
        c41113qM93713b4.f177226z = c30566j2;
        map.put("HMAC_SHA512_128BITTAG", c41113qM93713b4.m133467n());
        C41113q c41113qM93713b5 = C30568l.m93713b();
        c41113qM93713b5.f177224x = 64;
        c41113qM93713b5.f177225y = 16;
        c41113qM93713b5.f177222E = c30567k;
        c41113qM93713b5.f177226z = c30566j2;
        map.put("HMAC_SHA512_128BITTAG_RAW", c41113qM93713b5.m133467n());
        C41113q c41113qM93713b6 = C30568l.m93713b();
        c41113qM93713b6.f177224x = 64;
        c41113qM93713b6.f177225y = 32;
        c41113qM93713b6.f177222E = c30567k2;
        c41113qM93713b6.f177226z = c30566j2;
        map.put("HMAC_SHA512_256BITTAG", c41113qM93713b6.m133467n());
        C41113q c41113qM93713b7 = C30568l.m93713b();
        c41113qM93713b7.f177224x = 64;
        c41113qM93713b7.f177225y = 32;
        c41113qM93713b7.f177222E = c30567k;
        c41113qM93713b7.f177226z = c30566j2;
        map.put("HMAC_SHA512_256BITTAG_RAW", c41113qM93713b7.m133467n());
        map.put("HMAC_SHA512_512BITTAG", AbstractC30571o.f125794b);
        C41113q c41113qM93713b8 = C30568l.m93713b();
        c41113qM93713b8.f177224x = 64;
        c41113qM93713b8.f177225y = 64;
        c41113qM93713b8.f177222E = c30567k;
        c41113qM93713b8.f177226z = c30566j2;
        map.put("HMAC_SHA512_512BITTAG_RAW", c41113qM93713b8.m133467n());
        c5119x.m16086b(Collections.unmodifiableMap(map));
        C5115t c5115t = C5115t.f21463b;
        c5115t.m16081a(AbstractC30565i.f125776e, C30568l.class);
        C5116u.f21465b.m16083a(AbstractC30565i.f125775d, C30568l.class);
        C5096j c5096j = C5096j.f21426d;
        c5096j.m15974d(AbstractC30565i.f125774c, i13, true);
        if (AbstractC22819a.m66183a()) {
            return;
        }
        C5114s c5114s = AbstractC30558b.f125752a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        c5121z.m16096f(AbstractC31779a.f131588a);
        c5121z.m16095e(AbstractC31779a.f131589b);
        c5121z.m16094d(AbstractC31779a.f131590c);
        c5121z.m16093c(AbstractC31779a.f131591d);
        c5115t.m16081a(AbstractC30558b.f125752a, C30560d.class);
        c5120y.m16089c(AbstractC30558b.f125753b);
        c5120y.m16089c(AbstractC30558b.f125754c);
        HashMap map2 = new HashMap();
        C30560d c30560d = AbstractC30571o.f125795c;
        map2.put("AES_CMAC", c30560d);
        map2.put("AES256_CMAC", c30560d);
        C0237p c0237pM93711b = C30560d.m93711b();
        c0237pM93711b.m688S(32);
        c0237pM93711b.m691V(16);
        c0237pM93711b.f814z = C30559c.f125759e;
        map2.put("AES256_CMAC_RAW", c0237pM93711b.m709o());
        c5119x.m16086b(Collections.unmodifiableMap(map2));
        c5096j.m15973c(AbstractC30558b.f125755d, true);
    }
}
