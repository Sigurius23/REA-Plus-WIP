package ih0;

import ah0.C0882c;
import ah0.C0885f;
import ah0.C0887h;
import c93.InterfaceC4351m;
import p181h2.C16617b;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import ql0.InterfaceC30468c;

/* JADX INFO: renamed from: ih0.f0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18493f0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72028w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f72029x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f72030y;

    public /* synthetic */ C18493f0(int i13, Object obj, Object obj2) {
        this.f72028w = i13;
        this.f72029x = obj;
        this.f72030y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f72028w) {
            case 0:
                return AbstractC18491e0.c.m53542b((InterfaceC28670t2) this.f72029x, (C0882c) this.f72030y, (C16617b) obj);
            case 1:
                return AbstractC18502l.m53557D((InterfaceC30468c) this.f72029x, (InterfaceC28601c1) this.f72030y, ((Boolean) obj).booleanValue());
            case 2:
                return AbstractC18491e0.m53540z1((InterfaceC4351m) this.f72029x, (C0885f) this.f72030y, (C29891y) obj);
            default:
                return AbstractC18491e0.m53492j1((C0887h) this.f72029x, (Function1) this.f72030y, obj);
        }
    }
}
