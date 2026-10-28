package p702ch0;

import nl0.AbstractC26802d;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ch0.x */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4659x implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19040w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f19041x;

    public /* synthetic */ C4659x(Function1 function1, int i13) {
        this.f19040w = i13;
        this.f19041x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19040w) {
            case 0:
                return AbstractC4609c0.m14329z(this.f19041x, (InterfaceC39147y) obj);
            case 1:
                return AbstractC4609c0.m14303U(this.f19041x, (InterfaceC39147y) obj);
            default:
                return Function1.m14408Q(this.f19041x, (AbstractC26802d) obj);
        }
    }
}
