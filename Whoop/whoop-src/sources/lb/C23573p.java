package lb;

import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import l83.C23470p;
import p007a6.C0410c;
import p007a6.C0438l0;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33688b;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: lb.p */
/* JADX INFO: loaded from: classes.dex */
public final class C23573p implements InterfaceC23558b {

    /* JADX INFO: renamed from: w */
    public final InterfaceC33688b f93485w;

    /* JADX INFO: renamed from: x */
    public final String f93486x;

    /* JADX INFO: renamed from: y */
    public final C22672i f93487y;

    /* JADX INFO: renamed from: z */
    public final C23470p f93488z = AbstractC30060g.m92088H(new C0438l0(this, 29));

    /* JADX WARN: Multi-variable type inference failed */
    public C23573p(InterfaceC33688b interfaceC33688b, String str, InterfaceC4351m interfaceC4351m) {
        this.f93485w = interfaceC33688b;
        this.f93486x = str;
        this.f93487y = (C22672i) interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c93.m, kotlin.jvm.internal.i] */
    @Override // lb.InterfaceC23558b
    /* JADX INFO: renamed from: A0 */
    public final Object mo68210A0(boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        C23572o c23572o = (C23572o) interfaceC30057d.getContext().get(C23572o.f93483x);
        InterfaceC30057d interfaceC30057d2 = null;
        C23571n c23571n = c23572o != null ? c23572o.f93484w : null;
        if (c23571n != null) {
            return interfaceC4351m.invoke(c23571n, interfaceC30057d);
        }
        C23571n c23571n2 = new C23571n(this.f93487y, (InterfaceC33687a) this.f93488z.getValue());
        return AbstractC3006f0.m8705K(new C23572o(c23571n2), new C0410c(interfaceC4351m, c23571n2, interfaceC30057d2, 24), interfaceC30057d);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        C23470p c23470p = this.f93488z;
        if (c23470p.mo5046b()) {
            ((InterfaceC33687a) c23470p.getValue()).close();
        }
    }
}
