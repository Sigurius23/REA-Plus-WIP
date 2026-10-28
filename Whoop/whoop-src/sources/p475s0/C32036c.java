package p475s0;

import bv2.C3675b;
import p132f0.C13833w;
import p132f0.InterfaceC13832v0;
import p209i3.AbstractC18041w;
import p209i3.C18027i;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p715kotlin.jvm.functions.Function1;
import q80.C30036h;
import se.AbstractC32416g;

/* JADX INFO: renamed from: s0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C32036c extends C13833w {

    /* JADX INFO: renamed from: l0 */
    public boolean f132905l0;

    /* JADX INFO: renamed from: m0 */
    public Function1 f132906m0;

    /* JADX INFO: renamed from: n0 */
    public final C30036h f132907n0;

    public C32036c(boolean z4, InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z13, boolean z14, C18027i c18027i, Function1 function1) {
        super(interfaceC21083i, interfaceC13832v0, z13, z14, null, c18027i, new C3675b(function1, z4, 7));
        this.f132905l0 = z4;
        this.f132906m0 = function1;
        this.f132907n0 = new C30036h(this, 22);
    }

    @Override // p132f0.AbstractC13789h
    /* JADX INFO: renamed from: a1 */
    public final void mo39130a1(InterfaceC18044z interfaceC18044z) {
        AbstractC18041w.m51814m(interfaceC18044z, AbstractC32416g.m101153j(this.f132905l0));
    }
}
