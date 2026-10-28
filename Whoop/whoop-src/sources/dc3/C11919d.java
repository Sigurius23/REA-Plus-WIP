package dc3;

import bc3.InterfaceC3044o2;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import l83.C23454a0;
import lc3.C23836f;
import lc3.InterfaceC23837g;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: dc3.d */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11919d extends C22672i implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C11919d f38989w = new C11919d(3, C11923h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C11931p c11931p;
        C11923h c11923h = (C11923h) obj;
        InterfaceC23837g interfaceC23837g = (InterfaceC23837g) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C11923h.f39003x;
        c11923h.getClass();
        C11931p c11931p2 = (C11931p) C11923h.f38999G.get(c11923h);
        while (!c11923h.m32221w()) {
            long andIncrement = C11923h.f39004y.getAndIncrement(c11923h);
            long j7 = AbstractC11925j.f39009b;
            long j13 = andIncrement / j7;
            int i13 = (int) (andIncrement % j7);
            if (c11931p2.f66007y != j13) {
                C11931p c11931pM32212m = c11923h.m32212m(j13, c11931p2);
                if (c11931pM32212m == null) {
                    continue;
                } else {
                    c11931p = c11931pM32212m;
                }
            } else {
                c11931p = c11931p2;
            }
            Object objM32200H = c11923h.m32200H(c11931p, i13, andIncrement, interfaceC23837g);
            C11931p c11931p3 = c11931p;
            if (objM32200H == AbstractC11925j.f39020m) {
                InterfaceC3044o2 interfaceC3044o2 = interfaceC23837g instanceof InterfaceC3044o2 ? (InterfaceC3044o2) interfaceC23837g : null;
                if (interfaceC3044o2 != null) {
                    interfaceC3044o2.mo8762b(c11931p3, i13);
                }
            } else if (objM32200H == AbstractC11925j.f39022o) {
                if (andIncrement < c11923h.m32216q()) {
                    c11931p3.m48492b();
                }
                c11931p2 = c11931p3;
            } else {
                if (objM32200H == AbstractC11925j.f39021n) {
                    throw new IllegalStateException("unexpected");
                }
                c11931p3.m48492b();
                ((C23836f) interfaceC23837g).f94284E = objM32200H;
            }
            return C23454a0.f92919a;
        }
        ((C23836f) interfaceC23837g).f94284E = AbstractC11925j.f39019l;
        return C23454a0.f92919a;
    }
}
