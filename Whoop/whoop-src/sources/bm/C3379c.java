package bm;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13043h0;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: bm.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C3379c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13199w;

    /* JADX INFO: renamed from: x */
    public int f13200x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3396t f13201y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3379c(C3396t c3396t, int i13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f13199w = 0;
        this.f13201y = c3396t;
        this.f13200x = i13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f13199w) {
            case 0:
                return new C3379c(this.f13201y, this.f13200x, interfaceC30057d);
            case 1:
                return new C3379c(this.f13201y, interfaceC30057d, 1);
            default:
                return new C3379c(this.f13201y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f13199w) {
            case 0:
                C3379c c3379c = (C3379c) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c3379c.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                return ((C3379c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C3379c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f13199w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C3396t c3396t = this.f13201y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                int iMin = Math.min(this.f13200x - 1, c3396t.m9774m());
                int i14 = iMin >= 0 ? iMin : 0;
                if (i14 != c3396t.m9774m()) {
                    c3396t.f13253b.setValue(Integer.valueOf(i14));
                }
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f13200x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(new C3383g(AbstractC28683x.m87240H(new C3380d(c3396t, 0)), 0), 1);
                C3381e c3381e = new C3381e(c3396t, 0);
                this.f13200x = 1;
                return c13043h0M36612v.collect(c3381e, this) == enumC31071a2 ? enumC31071a2 : c23454a0;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f13200x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC28683x.m87240H(new C3380d(c3396t, 1)));
                C3381e c3381e2 = new C3381e(c3396t, 1);
                this.f13200x = 1;
                return interfaceC13058lM36610t.collect(c3381e2, this) == enumC31071a3 ? enumC31071a3 : c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3379c(C3396t c3396t, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f13199w = i13;
        this.f13201y = c3396t;
    }
}
