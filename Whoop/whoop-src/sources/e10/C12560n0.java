package e10;

import androidx.lifecycle.C1601k1;
import b20.C2326f;
import bc3.InterfaceC2994c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p012ab.C0679g;
import p026b2.C2298d;
import p442qy.C30765d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: e10.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12560n0 {

    /* JADX INFO: renamed from: a */
    public final C0679g f42892a;

    /* JADX INFO: renamed from: b */
    public final C1601k1 f42893b;

    /* JADX INFO: renamed from: c */
    public final C2326f f42894c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30063j f42895d;

    /* JADX INFO: renamed from: e */
    public final C30765d f42896e;

    /* JADX INFO: renamed from: f */
    public final C12554k0 f42897f;

    public C12560n0(C0679g registry, C1601k1 savedStateHandle, C2326f errorReporter, InterfaceC30063j ioContext, C30765d logger, C12554k0 confirmationSaver) {
        AbstractC22676k.m65750j(registry, "registry");
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(confirmationSaver, "confirmationSaver");
        this.f42892a = registry;
        this.f42893b = savedStateHandle;
        this.f42894c = errorReporter;
        this.f42895d = ioContext;
        this.f42896e = logger;
        this.f42897f = confirmationSaver;
    }

    /* JADX INFO: renamed from: a */
    public final C12568r0 m35244a(InterfaceC2994c0 interfaceC2994c0) {
        C0679g c0679g = this.f42892a;
        c0679g.getClass();
        C1601k1 savedStateHandle = this.f42893b;
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        List listM74152u1 = AbstractC25265s.m74152u1(c0679g.f2411x, new C2298d(3));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
        Iterator it = listM74152u1.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12550i0(savedStateHandle, (InterfaceC12551j) it.next()));
        }
        return new C12568r0(arrayList, interfaceC2994c0, this.f42893b, this.f42894c, this.f42895d, this.f42896e, this.f42897f);
    }
}
