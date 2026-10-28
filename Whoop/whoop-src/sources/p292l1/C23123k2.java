package p292l1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.k2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23123k2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91355w;

    /* JADX INFO: renamed from: x */
    public int f91356x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23196w3 f91357y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23123k2(C23196w3 c23196w3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f91355w = i13;
        this.f91357y = c23196w3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f91355w) {
            case 0:
                return new C23123k2(this.f91357y, interfaceC30057d, 0);
            case 1:
                return new C23123k2(this.f91357y, interfaceC30057d, 1);
            case 2:
                return new C23123k2(this.f91357y, interfaceC30057d, 2);
            case 3:
                return new C23123k2(this.f91357y, interfaceC30057d, 3);
            case 4:
                return new C23123k2(this.f91357y, interfaceC30057d, 4);
            case 5:
                return new C23123k2(this.f91357y, interfaceC30057d, 5);
            case 6:
                return new C23123k2(this.f91357y, interfaceC30057d, 6);
            default:
                return new C23123k2(this.f91357y, interfaceC30057d, 7);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f91355w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((C23123k2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f91355w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f91356x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f91356x = 1;
                    if (this.f91357y.m67154f(this) == enumC31071a) {
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
                int i14 = this.f91356x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f91356x = 1;
                    if (this.f91357y.m67152d(this) == enumC31071a2) {
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
                int i15 = this.f91356x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f91356x = 1;
                    if (this.f91357y.m67155g(this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f91356x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f91356x = 1;
                    if (this.f91357y.m67152d(this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f91356x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f91356x = 1;
                    if (this.f91357y.m67150b(this) == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i18 = this.f91356x;
                if (i18 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f91356x = 1;
                    if (this.f91357y.m67155g(this) == enumC31071a6) {
                        return enumC31071a6;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i19 = this.f91356x;
                if (i19 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f91356x = 1;
                    if (this.f91357y.m67150b(this) == enumC31071a7) {
                        return enumC31071a7;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i24 = this.f91356x;
                if (i24 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f91356x = 1;
                    if (this.f91357y.m67154f(this) == enumC31071a8) {
                        return enumC31071a8;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
