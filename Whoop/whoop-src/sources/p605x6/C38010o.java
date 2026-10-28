package p605x6;

import c93.InterfaceC4351m;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p395p6.C28894l;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x6.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C38010o extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162818w;

    /* JADX INFO: renamed from: x */
    public int f162819x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f162820y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C28894l f162821z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38010o(C28894l c28894l, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f162818w = i13;
        this.f162821z = c28894l;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f162818w) {
            case 0:
                C38010o c38010o = new C38010o(this.f162821z, interfaceC30057d, 0);
                c38010o.f162820y = obj;
                return c38010o;
            default:
                C38010o c38010o2 = new C38010o(this.f162821z, interfaceC30057d, 1);
                c38010o2.f162820y = obj;
                return c38010o2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C38006k c38006k = (C38006k) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f162818w) {
            case 0:
                break;
        }
        return ((C38010o) create(c38006k, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f162818w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f162819x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C38006k c38006k = (C38006k) this.f162820y;
                this.f162819x = 1;
                Object objM121740b = c38006k.m121740b(this.f162821z, this);
                return objM121740b == enumC31071a ? enumC31071a : objM121740b;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f162819x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C38006k c38006k2 = (C38006k) this.f162820y;
                    String str = this.f162821z.f116951a;
                    this.f162819x = 1;
                    C28894l c28894l = (C28894l) c38006k2.f162805a.remove(str);
                    if (c28894l != null) {
                        c28894l.f116954d.mo32217r(null);
                        c28894l.f116952b.set(false);
                        c28894l.f116963m.cancel((CancellationException) null);
                    }
                    if (c23454a0 == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
        }
    }
}
