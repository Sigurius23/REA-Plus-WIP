package lc3;

import androidx.lifecycle.RunnableC1605m;
import bc3.AbstractC3034m0;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: lc3.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23831a extends C22672i implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C23831a f94268w = new C23831a(3, C23832b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C23832b c23832b = (C23832b) obj;
        InterfaceC23837g interfaceC23837g = (InterfaceC23837g) obj2;
        long j7 = c23832b.f94269a;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (j7 <= 0) {
            ((C23836f) interfaceC23837g).f94284E = c23454a0;
            return c23454a0;
        }
        RunnableC1605m runnableC1605m = new RunnableC1605m(25, interfaceC23837g, c23832b);
        AbstractC22676k.m65748h(interfaceC23837g, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        C23836f c23836f = (C23836f) interfaceC23837g;
        InterfaceC30063j interfaceC30063j = c23836f.f94285w;
        c23836f.f94287y = AbstractC3034m0.m8784d(interfaceC30063j).mo8690i(j7, runnableC1605m, interfaceC30063j);
        return c23454a0;
    }
}
