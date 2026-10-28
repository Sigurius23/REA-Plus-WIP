package b61;

import d61.InterfaceC11732a;
import h01.AbstractC16549p;
import p294l3.C23277r0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b61.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2752g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10819w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f10820x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f10821y;

    public /* synthetic */ C2752g(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f10820x = function1;
        this.f10821y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10819w) {
            case 0:
                return AbstractC2756k.m7805v(this.f10821y, this.f10820x, (InterfaceC11732a) obj);
            default:
                return AbstractC16549p.m46786t(this.f10820x, this.f10821y, (C23277r0) obj);
        }
    }

    public /* synthetic */ C2752g(InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        this.f10821y = interfaceC28601c1;
        this.f10820x = function1;
    }
}
