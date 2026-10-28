package p007a6;

import bc3.C3058t;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p037bu.C3632c;
import p505ts.AbstractC34132o;
import p692zt.C41113q;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0444o extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1531w;

    /* JADX INFO: renamed from: x */
    public int f1532x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0429i0 f1533y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0444o(C0429i0 c0429i0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1531w = i13;
        this.f1533y = c0429i0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1531w) {
            case 0:
                return new C0444o(this.f1533y, interfaceC30057d, 0);
            case 1:
                return new C0444o(this.f1533y, interfaceC30057d, 1);
            default:
                return new C0444o(this.f1533y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1531w) {
            case 0:
                return ((C0444o) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C0444o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C0444o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f1531w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f1532x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f1532x = 1;
                    if (C0429i0.m1108d(this.f1533y, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f1532x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                C0429i0 c0429i0 = this.f1533y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C41113q c41113q = c0429i0.f1478h;
                this.f1532x = 1;
                Object objM8817m = ((C3058t) c41113q.f177225y).m8817m(this);
                if (objM8817m != enumC31071a2) {
                    objM8817m = c23454a0;
                }
                if (objM8817m == enumC31071a2) {
                    return enumC31071a2;
                }
                InterfaceC13058l interfaceC13058lM36599i = AbstractC13091v.m36599i(c0429i0.m1112h().f1430c, -1, 2);
                C0466z c0466z = new C0466z(c0429i0, 0);
                this.f1532x = 2;
                if (interfaceC13058lM36599i.collect(c0466z, this) == enumC31071a2) {
                    return enumC31071a2;
                }
                return c23454a0;
            default:
                C0429i0 c0429i1 = this.f1533y;
                C3632c c3632c = c0429i1.f1477g;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f1532x;
                try {
                    if (i15 != 0) {
                        if (i15 == 1) {
                            AbstractC34132o.m107864I(obj);
                        } else {
                            if (i15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj);
                        }
                        return (AbstractC0418e1) obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    if (c3632c.m11154C() instanceof C0453s0) {
                        return c3632c.m11154C();
                    }
                    this.f1532x = 1;
                    if (C0429i0.m1109e(c0429i1, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                    this.f1532x = 2;
                    obj = C0429i0.m1110f(c0429i1, false, this);
                    if (obj == enumC31071a3) {
                        return enumC31071a3;
                    }
                    return (AbstractC0418e1) obj;
                } catch (Throwable th3) {
                    return new C0459v0(-1, th3);
                }
        }
    }
}
