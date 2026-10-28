package p007a6;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0450r extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1554w = 1;

    /* JADX INFO: renamed from: x */
    public int f1555x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1556y;

    public /* synthetic */ C0450r(int i13, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1554w) {
            case 0:
                return new C0450r((C0429i0) this.f1556y, (InterfaceC30057d) obj3).invokeSuspend(C23454a0.f92919a);
            default:
                ((Boolean) obj2).getClass();
                C0450r c0450r = new C0450r(3, (InterfaceC30057d) obj3);
                c0450r.f1556y = (InterfaceC0461w0) obj;
                return c0450r.invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1554w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f1555x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C0429i0 c0429i0 = (C0429i0) this.f1556y;
                    this.f1555x = 1;
                    if (C0429i0.m1106b(c0429i0, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f1555x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC0461w0 interfaceC0461w0 = (InterfaceC0461w0) this.f1556y;
                this.f1555x = 1;
                Object objMo1118a = interfaceC0461w0.mo1118a(this);
                return objMo1118a == enumC31071a2 ? enumC31071a2 : objMo1118a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0450r(C0429i0 c0429i0, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f1556y = c0429i0;
    }
}
