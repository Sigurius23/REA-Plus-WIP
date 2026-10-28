package p163g1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.w3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15179w3 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56970w;

    /* JADX INFO: renamed from: x */
    public int f56971x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15199y3 f56972y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15179w3(C15199y3 c15199y3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f56970w = i13;
        this.f56972y = c15199y3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56970w) {
            case 0:
                return new C15179w3(this.f56972y, interfaceC30057d, 0);
            case 1:
                return new C15179w3(this.f56972y, interfaceC30057d, 1);
            case 2:
                return new C15179w3(this.f56972y, interfaceC30057d, 2);
            default:
                return new C15179w3(this.f56972y, interfaceC30057d, 3);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f56970w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C15179w3) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM43220a;
        Object objM43220a2;
        switch (this.f56970w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56971x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f56971x = 1;
                    if (this.f56972y.m43223d(this) == enumC31071a) {
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
                int i14 = this.f56971x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f56971x = 1;
                    if (this.f56972y.m43223d(this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f56971x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f56971x = 1;
                    C15199y3 c15199y3 = this.f56972y;
                    C15059k3 c15059k3M43070e = c15199y3.f57060b.m43070e();
                    EnumC15209z3 enumC15209z3 = EnumC15209z3.f57107x;
                    if (!c15059k3M43070e.f56384a.containsKey(enumC15209z3) || (objM43220a = C15199y3.m43220a(c15199y3, enumC15209z3, this)) != enumC31071a3) {
                        objM43220a = c23454a0;
                    }
                    if (objM43220a == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f56971x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f56971x = 1;
                    C15199y3 c15199y4 = this.f56972y;
                    C15059k3 c15059k3M43070e2 = c15199y4.f57060b.m43070e();
                    EnumC15209z3 enumC15209z4 = EnumC15209z3.f57108y;
                    if (!c15059k3M43070e2.f56384a.containsKey(enumC15209z4) || (objM43220a2 = C15199y3.m43220a(c15199y4, enumC15209z4, this)) != enumC31071a4) {
                        objM43220a2 = c23454a1;
                    }
                    if (objM43220a2 == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a1;
        }
    }
}
