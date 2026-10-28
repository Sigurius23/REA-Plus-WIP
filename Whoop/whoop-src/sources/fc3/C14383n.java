package fc3;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.C11923h;
import ec3.InterfaceC13058l;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: fc3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C14383n extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C11923h f52508E;

    /* JADX INFO: renamed from: w */
    public int f52509w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13058l[] f52510x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f52511y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AtomicInteger f52512z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14383n(InterfaceC13058l[] interfaceC13058lArr, int i13, AtomicInteger atomicInteger, C11923h c11923h, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f52510x = interfaceC13058lArr;
        this.f52511y = i13;
        this.f52512z = atomicInteger;
        this.f52508E = c11923h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C14383n(this.f52510x, this.f52511y, this.f52512z, this.f52508E, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C14383n) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f52509w;
        AtomicInteger atomicInteger = this.f52512z;
        C11923h c11923h = this.f52508E;
        try {
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l[] interfaceC13058lArr = this.f52510x;
                int i14 = this.f52511y;
                InterfaceC13058l interfaceC13058l = interfaceC13058lArr[i14];
                C14382m c14382m = new C14382m(c11923h, i14);
                this.f52509w = 1;
                if (interfaceC13058l.collect(c14382m, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                c11923h.mo32217r(null);
            }
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            if (atomicInteger.decrementAndGet() == 0) {
                c11923h.mo32217r(null);
            }
            throw th3;
        }
    }
}
