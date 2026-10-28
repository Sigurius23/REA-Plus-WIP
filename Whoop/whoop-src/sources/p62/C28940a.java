package p62;

import c93.InterfaceC4339a;
import m62.InterfaceC25116g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p62.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28940a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117083w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC25116g.a f117084x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f117085y;

    public /* synthetic */ C28940a(Function1 function1, InterfaceC25116g.a aVar) {
        this.f117083w = 2;
        this.f117085y = function1;
        this.f117084x = aVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f117083w) {
            case 0:
                return AbstractC28941b.m87860g(this.f117084x, this.f117085y);
            case 1:
                return AbstractC28941b.m87861h(this.f117084x, this.f117085y);
            default:
                return AbstractC28941b.m87862i(this.f117085y, this.f117084x);
        }
    }

    public /* synthetic */ C28940a(InterfaceC25116g.a aVar, Function1 function1, int i13) {
        this.f117083w = i13;
        this.f117084x = aVar;
        this.f117085y = function1;
    }
}
