package p395p6;

import c93.InterfaceC4352n;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p6.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28877f0 extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116870w;

    /* JADX INFO: renamed from: x */
    public int f116871x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ C28894l f116872y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ boolean f116873z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28877f0() {
        super(4, null);
        this.f116870w = 0;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13 = this.f116870w;
        C28894l c28894l = (C28894l) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj4;
        switch (i13) {
            case 0:
                C28877f0 c28877f0 = new C28877f0(4, 0, interfaceC30057d);
                c28877f0.f116872y = c28894l;
                c28877f0.f116873z = zBooleanValue;
                return c28877f0.invokeSuspend(C23454a0.f92919a);
            default:
                C28877f0 c28877f1 = new C28877f0(4, 1, interfaceC30057d);
                c28877f1.f116872y = c28894l;
                c28877f1.f116873z = zBooleanValue;
                return c28877f1.invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f116870w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f116871x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28894l c28894l = this.f116872y;
                    if (this.f116873z) {
                        this.f116871x = 1;
                        Object objM87816e = c28894l.m87816e(C28876f.f116869a, this);
                        if (objM87816e != enumC31071a) {
                            objM87816e = c23454a0;
                        }
                        if (objM87816e == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f116871x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C28894l c28894l2 = this.f116872y;
                if (this.f116873z) {
                    return null;
                }
                this.f116871x = 1;
                Object objM87817f = c28894l2.m87817f(this);
                return objM87817f == enumC31071a2 ? enumC31071a2 : objM87817f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28877f0(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f116870w = i14;
    }
}
