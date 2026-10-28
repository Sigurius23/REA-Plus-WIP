package p510u0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p133f1.C13943h0;
import p133f1.C13985v0;
import p180h0.AbstractC16444q3;
import p180h0.AbstractC16486z0;
import p505ts.AbstractC34132o;
import p512u2.InterfaceC34476v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import tx0.C34238a;

/* JADX INFO: renamed from: u0.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34306c0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144056w;

    /* JADX INFO: renamed from: x */
    public int f144057x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC34476v f144058y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC34310d1 f144059z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34306c0(InterfaceC34476v interfaceC34476v, InterfaceC34310d1 interfaceC34310d1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f144056w = i13;
        this.f144058y = interfaceC34476v;
        this.f144059z = interfaceC34310d1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f144056w) {
            case 0:
                return new C34306c0(this.f144058y, this.f144059z, interfaceC30057d, 0);
            case 1:
                return new C34306c0(this.f144058y, this.f144059z, interfaceC30057d, 1);
            default:
                return new C34306c0(this.f144058y, this.f144059z, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f144056w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C34306c0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f144056w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f144057x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f144057x = 1;
                    if (AbstractC34339n0.m108633k(this.f144058y, this.f144059z, this) == enumC31071a) {
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
                int i14 = this.f144057x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f144057x = 1;
                    Object objM46625g = AbstractC16444q3.m46625g(this.f144058y, new C13985v0(this.f144059z, (InterfaceC30057d) null, 5), this);
                    if (objM46625g != enumC31071a2) {
                        objM46625g = c23454a0;
                    }
                    if (objM46625g == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f144057x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f144057x = 1;
                    final InterfaceC34310d1 interfaceC34310d1 = this.f144059z;
                    C13943h0 c13943h0 = new C13943h0(interfaceC34310d1, 1);
                    final int i16 = 0;
                    InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: u0.v0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    interfaceC34310d1.onStop();
                                    break;
                                default:
                                    interfaceC34310d1.onCancel();
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    final int i17 = 1;
                    Object objM46657f = AbstractC16486z0.m46657f(this.f144058y, c13943h0, interfaceC4339a, new InterfaceC4339a() { // from class: u0.v0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    interfaceC34310d1.onStop();
                                    break;
                                default:
                                    interfaceC34310d1.onCancel();
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    }, new C34238a(interfaceC34310d1, 4), this);
                    if (objM46657f != enumC31071a3) {
                        objM46657f = c23454a1;
                    }
                    if (objM46657f == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a1;
        }
    }
}
