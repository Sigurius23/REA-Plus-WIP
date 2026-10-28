package wo1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import so1.C32810e;

/* JADX INFO: renamed from: wo1.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C37454j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160278w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32810e f160279x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f160280y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f160281z;

    public /* synthetic */ C37454j(C32810e c32810e, Function1 function1, Function1 function2, int i13) {
        this.f160278w = i13;
        this.f160279x = c32810e;
        this.f160280y = function1;
        this.f160281z = function2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f160278w) {
            case 0:
                return AbstractC37456k.m119986w(this.f160279x, this.f160280y, this.f160281z);
            default:
                return AbstractC37456k.m119977n(this.f160279x, this.f160280y, this.f160281z);
        }
    }
}
