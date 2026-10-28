package ej1;

import c93.InterfaceC4339a;
import cj1.C4766v;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ej1.e0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13237e0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45851w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4766v f45852x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f45853y;

    public /* synthetic */ C13237e0(C4766v c4766v, Function1 function1, int i13) {
        this.f45851w = i13;
        this.f45852x = c4766v;
        this.f45853y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f45851w) {
            case 0:
                return AbstractC13239f0.m37191f(this.f45852x, this.f45853y);
            default:
                return AbstractC13239f0.m37193h(this.f45852x, this.f45853y);
        }
    }
}
