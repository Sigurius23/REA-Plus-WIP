package l30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C23294c {

    /* JADX INFO: renamed from: b */
    public static final List f92286b = AbstractC37056f.m118959K(new C23301j(C23301j.f92345c), new C23302k(C23302k.f92346b), new C23300i(C23300i.f92343b), new C23299h(), new C23303l(C23303l.f92347b));

    /* JADX INFO: renamed from: a */
    public final List f92287a;

    public C23294c() {
        List securityChecks = f92286b;
        AbstractC22676k.m65750j(securityChecks, "securityChecks");
        this.f92287a = securityChecks;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m67388a() {
        List list = this.f92287a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC23304m) obj).mo67390a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC23304m) it.next()).f92348a);
        }
        return arrayList2;
    }
}
