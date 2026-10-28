package p219ig;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p097ds.AbstractC12314q;
import p194hg.C17248i;
import p194hg.C17250k;
import p194hg.InterfaceC17243d;
import p194hg.InterfaceC17244e;
import p647yf.C39498k;

/* JADX INFO: renamed from: ig.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C18457b implements InterfaceC17244e {

    /* JADX INFO: renamed from: w */
    public final C17248i f71878w;

    /* JADX INFO: renamed from: x */
    public final C39498k f71879x;

    /* JADX INFO: renamed from: y */
    public final long f71880y;

    /* JADX INFO: renamed from: z */
    public int f71881z;

    public C18457b(C18459d c18459d, C17248i c17248i) {
        this.f71878w = c17248i;
        C39498k c39498k = c18459d.f71883w;
        this.f71879x = c39498k;
        this.f71880y = c39498k.f169914w.f105866x;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [c93.m, kotlin.jvm.internal.i] */
    @Override // p194hg.InterfaceC17247h
    /* JADX INFO: renamed from: j */
    public final void mo48822j(C17250k c17250k) {
        Object next;
        this.f71881z++;
        StringBuilder sb4 = new StringBuilder();
        C17248i c17248i = this.f71878w;
        Set<InterfaceC17243d> set = c17248i.f66268c;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (InterfaceC17243d interfaceC17243d : set) {
            }
        }
        Iterator it = c17248i.f66268c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC17243d) next).getClass() != C18456a.class);
        InterfaceC17243d interfaceC17243d2 = (InterfaceC17243d) next;
        C18456a c18456a = (C18456a) (interfaceC17243d2 instanceof C18456a ? interfaceC17243d2 : null);
        if (c18456a == null) {
            c18456a = C18456a.f71877a;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(AbstractC12314q.m34332l(c17248i));
        sb5.append(".member.");
        c18456a.getClass();
        sb5.append(this.f71881z);
        sb4.append(sb5.toString());
        sb4.append('.');
        c17250k.f66271b.invoke(new C18459d(this.f71879x, sb4.toString()), c17250k.f66270a);
    }
}
