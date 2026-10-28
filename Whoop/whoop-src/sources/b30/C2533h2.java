package b30;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p180h0.AbstractC16434o3;
import p180h0.AbstractC16444q3;
import p180h0.C16416l0;
import p505ts.AbstractC34132o;
import p512u2.InterfaceC34476v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b30.h2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2533h2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9836w;

    /* JADX INFO: renamed from: x */
    public int f9837x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f9838y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f9839z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2533h2(InterfaceC4339a interfaceC4339a, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9836w = i13;
        this.f9839z = interfaceC4339a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f9836w) {
            case 0:
                C2533h2 c2533h2 = new C2533h2(this.f9839z, interfaceC30057d, 0);
                c2533h2.f9838y = obj;
                return c2533h2;
            case 1:
                C2533h2 c2533h3 = new C2533h2(this.f9839z, interfaceC30057d, 1);
                c2533h3.f9838y = obj;
                return c2533h3;
            default:
                C2533h2 c2533h4 = new C2533h2(this.f9839z, interfaceC30057d, 2);
                c2533h4.f9838y = obj;
                return c2533h4;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC34476v interfaceC34476v = (InterfaceC34476v) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f9836w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C2533h2) create(interfaceC34476v, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9836w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f9837x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC34476v interfaceC34476v = (InterfaceC34476v) this.f9838y;
                    C2525g2 c2525g2 = new C2525g2(this.f9839z, null, 0);
                    this.f9837x = 1;
                    if (AbstractC16444q3.m46625g(interfaceC34476v, c2525g2, this) == enumC31071a) {
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
                int i14 = this.f9837x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC34476v interfaceC34476v2 = (InterfaceC34476v) this.f9838y;
                    C16416l0 c16416l0 = new C16416l0(this.f9839z, 3);
                    this.f9837x = 1;
                    if (AbstractC16434o3.m46605e(interfaceC34476v2, null, null, null, c16416l0, this, 7) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f9837x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC34476v interfaceC34476v3 = (InterfaceC34476v) this.f9838y;
                    C16416l0 c16416l1 = new C16416l0(this.f9839z, 21);
                    this.f9837x = 1;
                    if (AbstractC16434o3.m46605e(interfaceC34476v3, null, null, null, c16416l1, this, 7) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
