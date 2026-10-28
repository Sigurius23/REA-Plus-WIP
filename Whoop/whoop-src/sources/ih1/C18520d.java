package ih1;

import c93.InterfaceC4339a;
import gh1.C15854d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ih1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18520d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72158w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15854d.b f72159x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f72160y;

    public /* synthetic */ C18520d(C15854d.b bVar, Function1 function1, int i13) {
        this.f72158w = i13;
        this.f72159x = bVar;
        this.f72160y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f72158w) {
            case 0:
                return AbstractC18521e.m53650k(this.f72159x, this.f72160y);
            case 1:
                return AbstractC18521e.m53651l(this.f72159x, this.f72160y);
            case 2:
                return AbstractC18521e.m53652m(this.f72159x, this.f72160y);
            default:
                return AbstractC18521e.m53647h(this.f72159x, this.f72160y);
        }
    }
}
