package sc0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import qc0.C30216c;

/* JADX INFO: renamed from: sc0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32356d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133925w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30216c.b f133926x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f133927y;

    public /* synthetic */ C32356d(C30216c.b bVar, Function1 function1, int i13) {
        this.f133925w = i13;
        this.f133926x = bVar;
        this.f133927y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f133925w) {
            case 0:
                return AbstractC32357e.m100737m(this.f133926x, this.f133927y);
            case 1:
                return AbstractC32357e.m100738n(this.f133926x, this.f133927y);
            case 2:
                return AbstractC32357e.m100739o(this.f133926x, this.f133927y);
            default:
                return AbstractC32357e.m100733i(this.f133926x, this.f133927y);
        }
    }
}
