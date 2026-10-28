package bg0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import zf0.C40611c;

/* JADX INFO: renamed from: bg0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3221c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12594w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C40611c.b f12595x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f12596y;

    public /* synthetic */ C3221c(C40611c.b bVar, Function1 function1, int i13) {
        this.f12594w = i13;
        this.f12595x = bVar;
        this.f12596y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f12594w) {
            case 0:
                return AbstractC3222d.m9275k(this.f12595x, this.f12596y);
            case 1:
                return AbstractC3222d.m9276l(this.f12595x, this.f12596y);
            case 2:
                return AbstractC3222d.m9277m(this.f12595x, this.f12596y);
            default:
                return AbstractC3222d.m9272h(this.f12595x, this.f12596y);
        }
    }
}
