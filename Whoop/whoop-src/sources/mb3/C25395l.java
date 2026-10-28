package mb3;

import lb3.AbstractC23773f1;
import lb3.AbstractC23811y;
import lb3.C23765d;
import lb3.C23794p0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ya3.C39371n;

/* JADX INFO: renamed from: mb3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C25395l implements InterfaceC25394k {

    /* JADX INFO: renamed from: c */
    public final C25388e f99490c = C25388e.f99473a;

    /* JADX INFO: renamed from: d */
    public final C39371n f99491d = new C39371n(C39371n.f169421d);

    /* JADX INFO: renamed from: a */
    public final boolean m74524a(AbstractC23811y a5, AbstractC23811y b) {
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        return C23765d.m69833g(AbstractC25390g.m74502k(false, null, this.f99490c, 6), a5.mo69863p0(), b.mo69863p0());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m74525b(AbstractC23811y subtype, AbstractC23811y supertype) {
        AbstractC22676k.m65750j(subtype, "subtype");
        AbstractC22676k.m65750j(supertype, "supertype");
        C23794p0 c23794p0M74502k = AbstractC25390g.m74502k(true, null, this.f99490c, 6);
        AbstractC23773f1 abstractC23773f1Mo69863p0 = subtype.mo69863p0();
        AbstractC23773f1 abstractC23773f1Mo69863p1 = supertype.mo69863p0();
        if (abstractC23773f1Mo69863p0 == abstractC23773f1Mo69863p1) {
            return true;
        }
        c23794p0M74502k.m69904b(abstractC23773f1Mo69863p0, abstractC23773f1Mo69863p1);
        return C23765d.f94131a.m69840e(c23794p0M74502k, c23794p0M74502k.f94180c, abstractC23773f1Mo69863p0, abstractC23773f1Mo69863p1);
    }
}
