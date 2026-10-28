package d30;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13043h0;
import l83.C23454a0;
import n53.C26318e;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d30.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C11554p extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37270w;

    /* JADX INFO: renamed from: x */
    public int f37271x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11564u f37272y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11554p(C11564u c11564u, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f37270w = i13;
        this.f37272y = c11564u;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37270w) {
            case 0:
                return new C11554p(this.f37272y, interfaceC30057d, 0);
            default:
                return new C11554p(this.f37272y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f37270w) {
            case 0:
                return ((C11554p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                ((C11554p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37270w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f37271x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11564u c11564u = this.f37272y;
                    C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(c11564u.f37300f, 1);
                    C11550n c11550n = new C11550n(c11564u, 1);
                    this.f37271x = 1;
                    if (c13043h0M36612v.collect(c11550n, this) == enumC31071a) {
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
                int i14 = this.f37271x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C11564u c11564u2 = this.f37272y;
                C26318e c26318e = c11564u2.f37302h;
                C11550n c11550n2 = new C11550n(c11564u2, 2);
                this.f37271x = 1;
                c26318e.collect(c11550n2, this);
                return enumC31071a2;
        }
    }
}
