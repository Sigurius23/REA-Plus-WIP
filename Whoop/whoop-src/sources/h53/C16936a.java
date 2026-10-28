package h53;

import a43.C0381c;
import a43.C0384f;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d33.C11636x;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import qg3.C30352d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16936a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64985w;

    /* JADX INFO: renamed from: x */
    public int f64986x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16940e f64987y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16936a(C16940e c16940e, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f64985w = i13;
        this.f64987y = c16940e;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f64985w) {
            case 0:
                return new C16936a(this.f64987y, interfaceC30057d, 0);
            case 1:
                return new C16936a(this.f64987y, interfaceC30057d, 1);
            case 2:
                return new C16936a(this.f64987y, interfaceC30057d, 2);
            case 3:
                return new C16936a(this.f64987y, interfaceC30057d, 3);
            default:
                return new C16936a(this.f64987y, interfaceC30057d, 4);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f64985w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C16936a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f64985w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f64986x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h2 = ((C30352d) this.f64987y.f65010m).m92819s().f168690e;
                C11636x c11636x = new C11636x(2, 4, null);
                this.f64986x = 1;
                Object objM36616z = AbstractC13091v.m36616z(c13045h2, c11636x, this);
                return objM36616z == enumC31071a ? enumC31071a : objM36616z;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f64986x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f64986x = 1;
                    C16940e c16940e = this.f64987y;
                    Object objM1051a = ((C0384f) c16940e.f65003f).m1051a((C0381c) c16940e.f65014q, this);
                    if (objM1051a != enumC31071a2) {
                        objM1051a = c23454a0;
                    }
                    if (objM1051a == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f64986x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f64986x = 1;
                    C16940e c16940e2 = this.f64987y;
                    Object objM1051a2 = ((C0384f) c16940e2.f65003f).m1051a((C0381c) c16940e2.f65014q, this);
                    if (objM1051a2 != enumC31071a3) {
                        objM1051a2 = c23454a1;
                    }
                    if (objM1051a2 == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a1;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f64986x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C16940e c16940e3 = this.f64987y;
                C30352d c30352d = (C30352d) c16940e3.f65010m;
                C16939d c16939d = new C16939d(c16940e3, null, 0);
                this.f64986x = 1;
                c30352d.m92824y(c16939d, this);
                return enumC31071a4;
            default:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f64986x;
                C23454a0 c23454a2 = C23454a0.f92919a;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f64986x = 1;
                    C16940e c16940e4 = this.f64987y;
                    Object objM1052b = ((C0384f) c16940e4.f65003f).m1052b((C0381c) c16940e4.f65014q, this);
                    if (objM1052b != enumC31071a5) {
                        objM1052b = c23454a2;
                    }
                    if (objM1052b == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a2;
        }
    }
}
