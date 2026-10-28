package kotlin;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.p0 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2023p0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f8021E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8022w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f8023x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC39758e.l f8024y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f8025z;

    public /* synthetic */ C2023p0(Function1 function1, AbstractC39758e.l lVar, Function1 function2, InterfaceC28601c1 interfaceC28601c1) {
        this.f8022w = 2;
        this.f8024y = lVar;
        this.f8023x = function1;
        this.f8025z = function2;
        this.f8021E = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8022w) {
            case 0:
                return AbstractC2029s0.m6341x(this.f8023x, this.f8024y, this.f8025z, this.f8021E);
            case 1:
                return AbstractC2029s0.m6342y(this.f8023x, this.f8024y, this.f8025z, this.f8021E);
            default:
                Function1 function1 = this.f8025z;
                InterfaceC28601c1 interfaceC28601c1 = this.f8021E;
                return AbstractC2029s0.m6338u(this.f8024y, this.f8023x, function1, interfaceC28601c1);
        }
    }

    public /* synthetic */ C2023p0(Function1 function1, AbstractC39758e.l lVar, Function1 function2, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f8022w = i13;
        this.f8023x = function1;
        this.f8024y = lVar;
        this.f8025z = function2;
        this.f8021E = interfaceC28601c1;
    }
}
