package ls;

import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5096j;
import com.google.crypto.tink.internal.C5101l0;
import com.google.crypto.tink.internal.C5115t;
import com.google.crypto.tink.internal.C5116u;
import com.google.crypto.tink.internal.C5119x;
import com.google.crypto.tink.internal.C5120y;
import com.google.crypto.tink.internal.C5121z;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import ms.AbstractC25925a;
import p288ks.AbstractC22819a;
import p560vs.C36368i4;

/* JADX INFO: renamed from: ls.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24708e {
    static {
        int i13 = C36368i4.CONFIG_NAME_FIELD_NUMBER;
        try {
            m72317a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72317a() throws GeneralSecurityException {
        C5120y c5120y = C5120y.f21472b;
        c5120y.m16090d(C24710g.f96641a);
        c5120y.m16089c(C24710g.f96642b);
        if (AbstractC22819a.m66183a()) {
            return;
        }
        C5089f0 c5089f0 = AbstractC24705b.f96627a;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        C5085d0 c5085d0 = AbstractC25925a.f102385a;
        C5121z c5121z = C5121z.f21474b;
        c5121z.m16096f(AbstractC25925a.f102385a);
        c5121z.m16095e(AbstractC25925a.f102386b);
        c5121z.m16094d(AbstractC25925a.f102387c);
        c5121z.m16093c(AbstractC25925a.f102388d);
        c5120y.m16089c(AbstractC24705b.f96627a);
        C5119x c5119x = C5119x.f21470b;
        HashMap map = new HashMap();
        map.put("AES256_SIV", AbstractC24711h.f96643a);
        C5101l0 c5101l0M72316b = C24707d.m72316b();
        c5101l0M72316b.m16057h0(64);
        c5101l0M72316b.f21444y = C24706c.f96633d;
        map.put("AES256_SIV_RAW", c5101l0M72316b.m16029D());
        c5119x.m16086b(Collections.unmodifiableMap(map));
        C5116u.f21465b.m16083a(AbstractC24705b.f96629c, C24707d.class);
        C5115t.f21463b.m16081a(AbstractC24705b.f96630d, C24707d.class);
        C5096j.f21426d.m15973c(AbstractC24705b.f96628b, true);
    }
}
