package l00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p599wz.C37708d;
import p599wz.C37738n;
import p631xz.C38747x;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: l00.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C23026h extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f90777w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23027i f90778x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f90779y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23026h(C23027i c23027i, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f90778x = c23027i;
        this.f90779y = z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C23026h(this.f90778x, this.f90779y, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C23026h) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objM124162m;
        Object value2;
        C23027i c23027i = this.f90778x;
        C13045h2 c13045h2 = c23027i.f90784z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f90777w;
        boolean z4 = this.f90779y;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            do {
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, C23028j.m66795a((C23028j) value, null)));
            C38747x c38747x = c23027i.f90782x;
            this.f90777w = 1;
            objM124162m = c38747x.m124162m(z4, this);
            if (objM124162m == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM124162m = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM124162m);
        if (thM68037a == null) {
            c23027i.f90783y.invoke(new C37738n(new C37708d(c23027i.f90781w, null), null, null, Boolean.valueOf(z4), 6));
        } else {
            do {
                value2 = c13045h2.getValue();
            } while (!c13045h2.m36569i(value2, C23028j.m66795a((C23028j) value2, AbstractC37926s0.m121456H(thM68037a))));
        }
        return C23454a0.f92919a;
    }
}
