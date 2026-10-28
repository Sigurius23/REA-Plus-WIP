package p389p0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11344e;
import p505ts.AbstractC34132o;
import p636y3.C39178j;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p0.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C28546r extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115490w;

    /* JADX INFO: renamed from: x */
    public int f115491x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28550t f115492y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28546r(C28550t c28550t, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f115490w = i13;
        this.f115492y = c28550t;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f115490w) {
            case 0:
                return new C28546r(this.f115492y, interfaceC30057d, 0);
            case 1:
                return new C28546r(this.f115492y, interfaceC30057d, 1);
            case 2:
                return new C28546r(this.f115492y, interfaceC30057d, 2);
            case 3:
                return new C28546r(this.f115492y, interfaceC30057d, 3);
            default:
                return new C28546r(this.f115492y, interfaceC30057d, 4);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f115490w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C28546r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f115490w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C28550t c28550t = this.f115492y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f115491x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C11344e c11344e = c28550t.f115516p;
                Float f13 = new Float(1.0f);
                this.f115491x = 1;
                return c11344e.m30551g(f13, this) == enumC31071a ? enumC31071a : c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f115491x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e2 = c28550t.f115515o;
                    C39178j c39178j = new C39178j(0L);
                    this.f115491x = 1;
                    if (c11344e2.m30551g(c39178j, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                int i16 = C28550t.f115500t;
                c28550t.m86859m(0L);
                c28550t.m86858l(false);
                return c23454a0;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i17 = this.f115491x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C11344e c11344e3 = c28550t.f115515o;
                this.f115491x = 1;
                return c11344e3.m30552h(this) == enumC31071a3 ? enumC31071a3 : c23454a0;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i18 = this.f115491x;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C11344e c11344e4 = c28550t.f115516p;
                this.f115491x = 1;
                return c11344e4.m30552h(this) == enumC31071a4 ? enumC31071a4 : c23454a0;
            default:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i19 = this.f115491x;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C11344e c11344e5 = c28550t.f115516p;
                this.f115491x = 1;
                return c11344e5.m30552h(this) == enumC31071a5 ? enumC31071a5 : c23454a0;
        }
    }
}
