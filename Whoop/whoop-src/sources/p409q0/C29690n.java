package p409q0;

import c93.InterfaceC4352n;
import p012ab.C0682h0;
import p389p0.AbstractC28560y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: q0.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C29690n extends AbstractC28560y {

    /* JADX INFO: renamed from: c */
    public final InterfaceC4352n f121363c;

    /* JADX INFO: renamed from: d */
    public final Function1 f121364d;

    /* JADX INFO: renamed from: e */
    public final C0682h0 f121365e;

    public C29690n(InterfaceC4352n interfaceC4352n, Function1 function1, int i13) {
        this.f121363c = interfaceC4352n;
        this.f121364d = function1;
        C0682h0 c0682h0 = new C0682h0(12, (byte) 0);
        c0682h0.m1692g(i13, new C29684h(function1, interfaceC4352n));
        this.f121365e = c0682h0;
    }

    @Override // p389p0.AbstractC28560y
    /* JADX INFO: renamed from: m */
    public final C0682h0 mo77527m() {
        return this.f121365e;
    }
}
