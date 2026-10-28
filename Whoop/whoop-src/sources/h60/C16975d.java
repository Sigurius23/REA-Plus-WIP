package h60;

import c93.InterfaceC4339a;
import f60.C14138c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h60.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16975d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65140w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14138c.a f65141x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f65142y;

    public /* synthetic */ C16975d(C14138c.a aVar, Function1 function1, int i13) {
        this.f65140w = i13;
        this.f65141x = aVar;
        this.f65142y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f65140w) {
            case 0:
                return AbstractC16976e.m47748l(this.f65141x, this.f65142y);
            case 1:
                return AbstractC16976e.m47749m(this.f65141x, this.f65142y);
            default:
                return AbstractC16976e.m47744h(this.f65141x, this.f65142y);
        }
    }
}
