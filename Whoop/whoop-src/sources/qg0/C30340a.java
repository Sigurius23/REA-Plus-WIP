package qg0;

import c93.InterfaceC4339a;
import og0.C27917c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qg0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C30340a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f124481w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27917c.c f124482x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f124483y;

    public /* synthetic */ C30340a(C27917c.c cVar, Function1 function1, int i13) {
        this.f124481w = i13;
        this.f124482x = cVar;
        this.f124483y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f124481w) {
            case 0:
                return AbstractC30341b.m92698h(this.f124482x, this.f124483y);
            case 1:
                return AbstractC30341b.m92699i(this.f124482x, this.f124483y);
            case 2:
                return AbstractC30341b.m92700j(this.f124482x, this.f124483y);
            default:
                return AbstractC30341b.m92703m(this.f124482x, this.f124483y);
        }
    }
}
