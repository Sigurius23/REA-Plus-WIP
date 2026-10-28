package is0;

import ld1.AbstractC23864c;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import rm1.AbstractC31595i;

/* JADX INFO: renamed from: is0.u0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20911u0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78767w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f78768x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC23864c f78769y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28670t2 f78770z;

    public /* synthetic */ C20911u0(Function1 function1, AbstractC23864c abstractC23864c, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f78767w = i13;
        this.f78768x = function1;
        this.f78769y = abstractC23864c;
        this.f78770z = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f78767w) {
            case 0:
                return AbstractC20917x0.m57994t(this.f78768x, this.f78769y, this.f78770z, obj);
            default:
                return AbstractC31595i.m97474w(this.f78768x, this.f78769y, this.f78770z, obj);
        }
    }
}
