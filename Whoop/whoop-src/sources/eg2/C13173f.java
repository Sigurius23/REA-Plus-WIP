package eg2;

import c93.InterfaceC4339a;
import dg2.C12010b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: eg2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13173f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45655w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12010b f45656x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f45657y;

    public /* synthetic */ C13173f(C12010b c12010b, Function1 function1) {
        this.f45656x = c12010b;
        this.f45657y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f45655w) {
            case 0:
                return AbstractC13176i.m36961S(this.f45657y, this.f45656x);
            default:
                return AbstractC13177j.m37005M(this.f45656x, this.f45657y);
        }
    }

    public /* synthetic */ C13173f(Function1 function1, C12010b c12010b) {
        this.f45657y = function1;
        this.f45656x = c12010b;
    }
}
