package d00;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: d00.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11435n {

    /* JADX INFO: renamed from: a */
    public static final Set f36665a = AbstractC25260n.m74059b1(new String[]{"card", "bank_account", "card"});

    /* JADX INFO: renamed from: a */
    public static final Set m30678a(InterfaceC38802c8 interfaceC38802c8, C11433l linkAccount) {
        AbstractC22676k.m65750j(interfaceC38802c8, "<this>");
        AbstractC22676k.m65750j(linkAccount, "linkAccount");
        boolean zMo124338q0 = interfaceC38802c8.mo124338q0();
        Set set = f36665a;
        if (!zMo124338q0 && AbstractC39414r.m125876U(linkAccount.f36653H, "+multiple_funding_sources@", false)) {
            return set;
        }
        List listMo124333i0 = interfaceC38802c8.mo124333i0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo124333i0) {
            if (set.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        if (setM74103I1.isEmpty()) {
            setM74103I1 = null;
        }
        return setM74103I1 == null ? AbstractC12350b.m34570S("card") : setM74103I1;
    }
}
