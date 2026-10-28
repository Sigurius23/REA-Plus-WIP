package f53;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d33.C11636x;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14113a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50719w;

    /* JADX INFO: renamed from: x */
    public int f50720x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14122j f50721y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14113a(C14122j c14122j, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f50719w = i13;
        this.f50721y = c14122j;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f50719w) {
            case 0:
                return new C14113a(this.f50721y, interfaceC30057d, 0);
            case 1:
                return new C14113a(this.f50721y, interfaceC30057d, 1);
            case 2:
                return new C14113a(this.f50721y, interfaceC30057d, 2);
            default:
                return new C14113a(this.f50721y, interfaceC30057d, 3);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f50719w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C14113a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f50719w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f50720x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h2 = this.f50721y.f50758l.m56594w().f168690e;
                C11636x c11636x = new C11636x(2, 2, null);
                this.f50720x = 1;
                Object objM36616z = AbstractC13091v.m36616z(c13045h2, c11636x, this);
                return objM36616z == enumC31071a ? enumC31071a : objM36616z;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f50720x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f50720x = 1;
                    if (C14122j.m40209a(this.f50721y, this) == enumC31071a2) {
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
                int i15 = this.f50720x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f50720x = 1;
                    if (C14122j.m40209a(this.f50721y, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f50720x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f50720x = 1;
                    if (C14122j.m40212d(this.f50721y, this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
