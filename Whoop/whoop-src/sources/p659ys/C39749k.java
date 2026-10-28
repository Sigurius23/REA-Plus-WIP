package p659ys;

import a33.C0352d;
import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5097j0;
import com.google.crypto.tink.internal.C5110q;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p154fs.InterfaceC14734l;
import p154fs.InterfaceC14739q;
import p624xs.C38632a;

/* JADX INFO: renamed from: ys.k */
/* JADX INFO: loaded from: classes.dex */
public final class C39749k implements InterfaceC14734l {

    /* JADX INFO: renamed from: a */
    public static final C39749k f171129a = new C39749k();

    /* JADX INFO: renamed from: b */
    public static final C5089f0 f171130b = new C5089f0(C5110q.class, InterfaceC14739q.class, new C38632a(25));

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: a */
    public final Class mo42238a() {
        return InterfaceC14739q.class;
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: b */
    public final Class mo42239b() {
        return InterfaceC14739q.class;
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: c */
    public final Object mo42240c(C0352d c0352d) throws GeneralSecurityException {
        ArrayList arrayList = new ArrayList();
        Iterator it = c0352d.m942o().iterator();
        while (it.hasNext()) {
            for (C5097j0 c5097j0 : (List) it.next()) {
                if (c5097j0.m15975a() == null) {
                    throw new GeneralSecurityException("No full primitive set for key id " + c5097j0.m15976b());
                }
                arrayList.add((InterfaceC14739q) c5097j0.m15975a());
            }
        }
        C5097j0 c5097j0M948u = c0352d.m948u();
        if (c5097j0M948u == null || c5097j0M948u.m15975a() == null) {
            throw new GeneralSecurityException("No primary set");
        }
        return new C39748j();
    }
}
