package mc;

import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C2996c2;
import p007a6.C0458v;
import p218ic.C18389w;
import p420qc.C30207q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mc.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25412i {

    /* JADX INFO: renamed from: a */
    public static final String f99516a;

    static {
        String strM52887f = C18389w.m52887f("WorkConstraintsTracker");
        AbstractC22676k.m65749i(strM52887f, "tagWithPrefix(...)");
        f99516a = strM52887f;
    }

    /* JADX INFO: renamed from: a */
    public static final C2996c2 m74599a(C25411h c25411h, C30207q c30207q, AbstractC3076z dispatcher, InterfaceC25409f listener) {
        AbstractC22676k.m65750j(c25411h, "<this>");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(listener, "listener");
        return AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(dispatcher), null, null, new C0458v(c25411h, c30207q, listener, null, 16), 3);
    }
}
