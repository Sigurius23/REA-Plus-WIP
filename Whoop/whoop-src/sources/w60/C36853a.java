package w60;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import u60.C34551c;

/* JADX INFO: renamed from: w60.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C36853a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157628w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34551c.c f157629x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f157630y;

    public /* synthetic */ C36853a(C34551c.c cVar, Function1 function1, int i13) {
        this.f157628w = i13;
        this.f157629x = cVar;
        this.f157630y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f157628w) {
            case 0:
                return AbstractC36854b.m118151j(this.f157629x, this.f157630y);
            case 1:
                return AbstractC36854b.m118152k(this.f157629x, this.f157630y);
            case 2:
                return AbstractC36854b.m118153l(this.f157629x, this.f157630y);
            default:
                return AbstractC36854b.m118156o(this.f157629x, this.f157630y);
        }
    }
}
