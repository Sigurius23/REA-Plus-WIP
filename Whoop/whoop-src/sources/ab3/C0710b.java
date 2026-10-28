package ab3;

import java.util.List;
import lb3.AbstractC23811y;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;
import r93.InterfaceC31126h;

/* JADX INFO: renamed from: ab3.b */
/* JADX INFO: loaded from: classes3.dex */
public class C0710b extends AbstractC0715g {

    /* JADX INFO: renamed from: b */
    public final Function1 f2692b;

    public C0710b(List list, Function1 function1) {
        super(list);
        this.f2692b = function1;
    }

    @Override // ab3.AbstractC0715g
    /* JADX INFO: renamed from: a */
    public final AbstractC23811y mo1776a(InterfaceC31109b0 module) {
        InterfaceC31126h interfaceC31126hMo1784d;
        AbstractC22676k.m65750j(module, "module");
        AbstractC23811y abstractC23811y = (AbstractC23811y) this.f2692b.invoke(module);
        if (!AbstractC27736h.m83814z(abstractC23811y) && (((interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d()) == null || AbstractC27736h.m83811s(interfaceC31126hMo1784d) == null) && !AbstractC27736h.m83801C(abstractC23811y, AbstractC27741m.f111839W.f152613a) && !AbstractC27736h.m83801C(abstractC23811y, AbstractC27741m.f111840X.f152613a) && !AbstractC27736h.m83801C(abstractC23811y, AbstractC27741m.f111841Y.f152613a))) {
            AbstractC27736h.m83801C(abstractC23811y, AbstractC27741m.f111842Z.f152613a);
        }
        return abstractC23811y;
    }
}
