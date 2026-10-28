package a81;

import c93.InterfaceC4339a;
import com.whoop.design.models.modal.ModalAnalyticEventModel;
import fi0.InterfaceC14515a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a81.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0552c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1904w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ModalAnalyticEventModel f1905x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC14515a f1906y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f1907z;

    public /* synthetic */ C0552c(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1, int i13) {
        this.f1904w = i13;
        this.f1905x = modalAnalyticEventModel;
        this.f1906y = interfaceC14515a;
        this.f1907z = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f1904w) {
            case 0:
                return AbstractC0564o.m1388J(this.f1905x, this.f1906y, this.f1907z);
            case 1:
                return AbstractC0564o.m1382D(this.f1905x, this.f1906y, this.f1907z);
            default:
                return AbstractC0564o.m1387I(this.f1905x, this.f1906y, this.f1907z);
        }
    }
}
