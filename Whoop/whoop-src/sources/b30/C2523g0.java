package b30;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13087t1;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b30.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2523g0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9814w;

    /* JADX INFO: renamed from: x */
    public int f9815x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2547j0 f9816y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2523g0(C2547j0 c2547j0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9814w = i13;
        this.f9816y = c2547j0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f9814w) {
            case 0:
                return new C2523g0(this.f9816y, interfaceC30057d, 0);
            case 1:
                return new C2523g0(this.f9816y, interfaceC30057d, 1);
            case 2:
                return new C2523g0(this.f9816y, interfaceC30057d, 2);
            case 3:
                return new C2523g0(this.f9816y, interfaceC30057d, 3);
            default:
                return new C2523g0(this.f9816y, interfaceC30057d, 4);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f9814w) {
            case 0:
                ((C2523g0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
            case 1:
                ((C2523g0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
            case 2:
                ((C2523g0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
            case 3:
                ((C2523g0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
            default:
                ((C2523g0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
        }
        return EnumC31071a.f128113w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9814w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f9815x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2547j0 c2547j0 = this.f9816y;
                    InterfaceC13037f2 interfaceC13037f2 = c2547j0.f9881a;
                    C2515f0 c2515f0 = new C2515f0(c2547j0, 0);
                    this.f9815x = 1;
                    if (interfaceC13037f2.collect(c2515f0, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f9815x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C2547j0 c2547j1 = this.f9816y;
                C13045h2 c13045h2 = c2547j1.f9896p;
                C2515f0 c2515f1 = new C2515f0(c2547j1, 1);
                this.f9815x = 1;
                c13045h2.collect(c2515f1, this);
                return enumC31071a2;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f9815x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2547j0 c2547j2 = this.f9816y;
                    InterfaceC13037f2 interfaceC13037f3 = c2547j2.f9881a;
                    C2515f0 c2515f2 = new C2515f0(c2547j2, 2);
                    this.f9815x = 1;
                    if (interfaceC13037f3.collect(c2515f2, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f9815x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2547j0 c2547j3 = this.f9816y;
                    InterfaceC13037f2 interfaceC13037f4 = c2547j3.f9882b;
                    C2515f0 c2515f3 = new C2515f0(c2547j3, 3);
                    this.f9815x = 1;
                    if (interfaceC13037f4.collect(c2515f3, this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            default:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f9815x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2547j0 c2547j4 = this.f9816y;
                    InterfaceC13087t1 interfaceC13087t1 = c2547j4.f9883c;
                    C2515f0 c2515f4 = new C2515f0(c2547j4, 4);
                    this.f9815x = 1;
                    if (interfaceC13087t1.collect(c2515f4, this) == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
        }
    }
}
