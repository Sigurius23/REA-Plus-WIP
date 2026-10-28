package p292l1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.InterfaceC11372l;
import p133f1.AbstractC13923a2;
import p133f1.C13995y1;
import p208i2.C17919x;
import p354o1.EnumC27375n;
import p505ts.AbstractC34132o;
import p636y3.C39174f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.s1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23170s1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91629w;

    /* JADX INFO: renamed from: x */
    public int f91630x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23176t1 f91631y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23170s1(C23176t1 c23176t1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f91629w = i13;
        this.f91631y = c23176t1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f91629w) {
            case 0:
                return new C23170s1(this.f91631y, interfaceC30057d, 0);
            case 1:
                return new C23170s1(this.f91631y, interfaceC30057d, 1);
            case 2:
                return new C23170s1(this.f91631y, interfaceC30057d, 2);
            default:
                return new C23170s1(this.f91631y, interfaceC30057d, 3);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f91629w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C23170s1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f91629w;
        C23176t1 c23176t1 = this.f91631y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f91630x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e = c23176t1.f91684X;
                    if (c11344e == null) {
                        return c23454a0;
                    }
                    C23089e4 c23089e4M67086c = c23176t1.f91683W;
                    if (c23089e4M67086c == null) {
                        C23107h4 c23107h4 = C23107h4.f91269a;
                        c23089e4M67086c = C23107h4.m67086c((C23132m) AbstractC0201g.m506f(c23176t1, AbstractC23138n.f91494a), (C13995y1) AbstractC0201g.m506f(c23176t1, AbstractC13923a2.f49638a));
                    }
                    C17919x c17919x = new C17919x(c23089e4M67086c.m67064c(c23176t1.f91677Q, false, c23176t1.f91681U));
                    InterfaceC11372l interfaceC11372lM67106j = c23176t1.f91677Q ? AbstractC23124k3.m67106j((InterfaceC23165r2) AbstractC0201g.m506f(c23176t1, AbstractC23200x1.f91803a), EnumC27375n.f109951z) : AbstractC11348f.m30572t();
                    this.f91630x = 1;
                    obj = C11344e.m30547d(c11344e, c17919x, interfaceC11372lM67106j, null, this, 12);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f91630x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C11344e c11344e2 = c23176t1.f91686Z;
                C39174f c39174f = new C39174f((c23176t1.f91681U && c23176t1.f91677Q) ? c23176t1.f91679S : c23176t1.f91680T);
                InterfaceC11372l interfaceC11372lM67106j2 = c23176t1.f91677Q ? AbstractC23124k3.m67106j((InterfaceC23165r2) AbstractC0201g.m506f(c23176t1, AbstractC23200x1.f91803a), EnumC27375n.f109949x) : AbstractC11348f.m30572t();
                this.f91630x = 1;
                return C11344e.m30547d(c11344e2, c39174f, interfaceC11372lM67106j2, null, this, 12) == enumC31071a2 ? enumC31071a2 : c23454a0;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f91630x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                this.f91630x = 1;
                C23176t1.m67136a1(c23176t1, this);
                return enumC31071a3;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i17 = this.f91630x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                this.f91630x = 1;
                C23176t1.m67136a1(c23176t1, this);
                return enumC31071a4;
        }
    }
}
