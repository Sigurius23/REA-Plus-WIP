package p505ts;

import a33.C0352d;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.C5097j0;
import com.google.crypto.tink.internal.C5117v;
import com.google.crypto.tink.internal.C5118w;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p154fs.AbstractC14724b;

/* JADX INFO: renamed from: ts.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C34134q extends AbstractC34132o {
    public C34134q(C0352d c0352d) throws GeneralSecurityException {
        byte[] bArr = AbstractC14724b.f54463a;
        List listM949v = c0352d.m949v(bArr);
        C5097j0 c5097j0 = (C5097j0) c0352d.f1238y;
        if (listM949v.isEmpty()) {
            throw new GeneralSecurityException("No primitives provided.");
        }
        if (c5097j0 == null) {
            throw new GeneralSecurityException("Primary key not set.");
        }
        if (c0352d.m953z()) {
            C5117v c5117vM16084a = C5118w.f21467b.m16084a();
            AbstractC5078a.m15936i(c0352d);
            c5117vM16084a.getClass();
        }
        List<C5097j0> listM949v2 = c0352d.m949v(bArr);
        HashMap map = new HashMap();
        for (C5097j0 c5097j1 : listM949v2) {
            map.put(Integer.valueOf(c5097j1.f21432d), new C34133p((InterfaceC34130m) c5097j1.f21429a, c5097j1.f21432d));
        }
        Collections.unmodifiableMap(map);
    }
}
