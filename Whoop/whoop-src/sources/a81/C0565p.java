package a81;

import com.whoop.design.models.modal.ModalAnalyticEventModel;
import fi0.InterfaceC14515a;
import p715kotlin.jvm.functions.Function1;
import ri0.InterfaceC31443b;
import vi0.AbstractC36056a;

/* JADX INFO: renamed from: a81.p */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0565p implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2002w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ModalAnalyticEventModel f2003x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC14515a f2004y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f2005z;

    public /* synthetic */ C0565p(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1, int i13) {
        this.f2002w = i13;
        this.f2003x = modalAnalyticEventModel;
        this.f2004y = interfaceC14515a;
        this.f2005z = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2002w) {
            case 0:
                return AbstractC0567r.m1449j(this.f2003x, this.f2004y, this.f2005z, (InterfaceC0569t) obj);
            default:
                return AbstractC36056a.m114479e(this.f2003x, this.f2004y, this.f2005z, (InterfaceC31443b) obj);
        }
    }
}
