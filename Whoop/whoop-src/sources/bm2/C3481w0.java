package bm2;

import hu2.InterfaceC17654a;
import p390p1.InterfaceC28593a1;
import p715kotlin.jvm.functions.Function1;
import qu2.AbstractC30640h;

/* JADX INFO: renamed from: bm2.w0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3481w0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13664w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f13665x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28593a1 f13666y;

    public /* synthetic */ C3481w0(Function1 function1, InterfaceC28593a1 interfaceC28593a1, int i13) {
        this.f13664w = i13;
        this.f13665x = function1;
        this.f13666y = interfaceC28593a1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13664w) {
            case 0:
                return AbstractC3487z0.m10242Y(this.f13665x, this.f13666y, ((Integer) obj).intValue());
            default:
                return AbstractC30640h.m94067F0(this.f13665x, this.f13666y, (InterfaceC17654a) obj);
        }
    }
}
