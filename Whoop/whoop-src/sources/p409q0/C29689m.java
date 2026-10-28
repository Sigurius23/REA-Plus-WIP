package p409q0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p027b3.C2471z0;
import p132f0.EnumC13840z0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: q0.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C29689m extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121360w;

    /* JADX INFO: renamed from: x */
    public int f121361x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC29701y f121362y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29689m(AbstractC29701y abstractC29701y, int i13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f121360w = i13;
        this.f121362y = abstractC29701y;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f121360w) {
            case 0:
                return new C29689m(this.f121362y, 0, interfaceC30057d);
            case 1:
                return new C29689m(this.f121362y, 1, interfaceC30057d);
            default:
                return new C29689m(this.f121362y, 2, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f121360w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C29689m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM91155g;
        Object objM91155g2;
        int i13 = this.f121360w;
        AbstractC29701y abstractC29701y = this.f121362y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f121361x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                this.f121361x = 1;
                float f13 = AbstractC29677c0.f121291a;
                if (abstractC29701y.m91162k() - 1 < 0 || (objM91155g = AbstractC29701y.m91155g(abstractC29701y, abstractC29701y.m91162k() - 1, null, this, 6)) != enumC31071a) {
                    objM91155g = c23454a0;
                }
                return objM91155g == enumC31071a ? enumC31071a : c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f121361x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                this.f121361x = 1;
                float f14 = AbstractC29677c0.f121291a;
                if (abstractC29701y.m91162k() + 1 >= abstractC29701y.mo91148m() || (objM91155g2 = AbstractC29701y.m91155g(abstractC29701y, abstractC29701y.m91162k() + 1, null, this, 6)) != enumC31071a2) {
                    objM91155g2 = c23454a0;
                }
                return objM91155g2 == enumC31071a2 ? enumC31071a2 : c23454a0;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f121361x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                this.f121361x = 1;
                EnumC13840z0 enumC13840z0 = EnumC13840z0.f49374w;
                C2471z0 c2471z0 = new C2471z0(2, 3, null);
                abstractC29701y.getClass();
                Object objM91157u = AbstractC29701y.m91157u(abstractC29701y, enumC13840z0, c2471z0, this);
                if (objM91157u != enumC31071a3) {
                    objM91157u = c23454a0;
                }
                return objM91157u == enumC31071a3 ? enumC31071a3 : c23454a0;
        }
    }
}
