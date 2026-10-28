package bc3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import lc3.C23836f;
import lc3.InterfaceC23837g;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: bc3.s1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3057s1 extends C22672i implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C3057s1 f12088w = new C3057s1(3, C3060t1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        C23454a0 c23454a0;
        C3060t1 c3060t1 = (C3060t1) obj;
        InterfaceC23837g interfaceC23837g = (InterfaceC23837g) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3060t1.f12091w;
        c3060t1.getClass();
        do {
            obj4 = C3060t1.f12091w.get(c3060t1);
            boolean z4 = obj4 instanceof InterfaceC3011g1;
            c23454a0 = C23454a0.f92919a;
            if (!z4) {
                ((C23836f) interfaceC23837g).f94284E = c23454a0;
                return c23454a0;
            }
        } while (c3060t1.m8813U(obj4) < 0);
        ((C23836f) interfaceC23837g).f94287y = AbstractC3006f0.m8728v(c3060t1, true, new C3051q1(c3060t1, interfaceC23837g));
        return c23454a0;
    }
}
