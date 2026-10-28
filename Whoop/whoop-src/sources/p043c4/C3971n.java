package p043c4;

import android.os.Handler;
import android.os.Looper;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p028b4.RunnableC2690a;
import p635y2.InterfaceC39147y;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c4.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C3971n extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16182w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3958f0 f16183x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3971n(C3958f0 c3958f0, int i13) {
        super(1);
        this.f16182w = i13;
        this.f16183x = c3958f0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16182w) {
            case 0:
                InterfaceC39147y interfaceC39147yMo3517V = ((InterfaceC39147y) obj).mo3517V();
                AbstractC22676k.m65747g(interfaceC39147yMo3517V);
                this.f16183x.m12001m(interfaceC39147yMo3517V);
                break;
            case 1:
                C39180l c39180l = new C39180l(((C39180l) obj).f168422a);
                C3958f0 c3958f0 = this.f16183x;
                c3958f0.m134050setPopupContentSizefhxjrPA(c39180l);
                c3958f0.m12002n();
                break;
            default:
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj;
                C3958f0 c3958f1 = this.f16183x;
                Handler handler = c3958f1.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC4339a.invoke();
                } else {
                    Handler handler2 = c3958f1.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC2690a(interfaceC4339a, 2));
                    }
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
