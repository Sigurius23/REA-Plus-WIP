package n01;

import c93.InterfaceC4339a;
import l83.C23465k;
import l83.InterfaceC23459e;
import nw0.AbstractC27200g;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import ry0.C31909d;

/* JADX INFO: renamed from: n01.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C26086c implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f103312E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f103313F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23459e f103314G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103315w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f103316x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f103317y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f103318z;

    public /* synthetic */ C26086c(Function1 function1, Function1 function2, C23465k c23465k, String str, boolean z4, Function1 function3) {
        this.f103316x = function1;
        this.f103318z = function2;
        this.f103312E = c23465k;
        this.f103313F = str;
        this.f103317y = z4;
        this.f103314G = function3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f103315w) {
            case 0:
                return AbstractC26087d.m77591h((C26088e) this.f103318z, (C31909d) this.f103312E, this.f103317y, (C39967p) this.f103313F, this.f103316x, (Function3) this.f103314G);
            default:
                return AbstractC27200g.m81784I(this.f103316x, (Function1) this.f103318z, (C23465k) this.f103312E, (String) this.f103313F, this.f103317y, (Function1) this.f103314G);
        }
    }

    public /* synthetic */ C26086c(C26088e c26088e, C31909d c31909d, boolean z4, C39967p c39967p, Function1 function1, Function3 function3) {
        this.f103318z = c26088e;
        this.f103312E = c31909d;
        this.f103317y = z4;
        this.f103313F = c39967p;
        this.f103316x = function1;
        this.f103314G = function3;
    }
}
