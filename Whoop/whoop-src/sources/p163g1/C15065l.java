package p163g1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p132f0.C13776c1;
import p132f0.EnumC13840z0;
import p181h2.C16617b;
import p182h3.ScrollCaptureCallbackC16787c;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18037s;
import p239j1.C21193k;
import p239j1.C21194l;
import p292l1.C23196w3;
import p316m1.C24902g;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C15065l extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56412w;

    /* JADX INFO: renamed from: x */
    public int f56413x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ float f56414y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56415z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15065l(ScrollCaptureCallbackC16787c scrollCaptureCallbackC16787c, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f56412w = 2;
        this.f56415z = scrollCaptureCallbackC16787c;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56412w) {
            case 0:
                return new C15065l((C14947a0) this.f56415z, this.f56414y, interfaceC30057d, 0);
            case 1:
                return new C15065l((C15093n7) this.f56415z, this.f56414y, interfaceC30057d, 1);
            case 2:
                C15065l c15065l = new C15065l((ScrollCaptureCallbackC16787c) this.f56415z, interfaceC30057d);
                c15065l.f56414y = ((Number) obj).floatValue();
                return c15065l;
            case 3:
                return new C15065l((C21194l) this.f56415z, this.f56414y, interfaceC30057d, 3);
            default:
                return new C15065l((C23196w3) this.f56415z, this.f56414y, interfaceC30057d, 4);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56412w) {
            case 0:
                return ((C15065l) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C15065l) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C15065l) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C15065l) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C15065l) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM73006b;
        switch (this.f56412w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56413x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C14947a0 c14947a0 = (C14947a0) this.f56415z;
                    float f13 = this.f56414y;
                    this.f56413x = 1;
                    if (c14947a0.m43074i(f13, this) == enumC31071a) {
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
                int i14 = this.f56413x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15093n7 c15093n7 = (C15093n7) this.f56415z;
                    float f14 = this.f56414y;
                    this.f56413x = 1;
                    Object objCollect = c15093n7.f56517j.collect(new C15053j7(c15093n7, f14), this);
                    if (objCollect != enumC31071a2) {
                        objCollect = c23454a0;
                    }
                    if (objCollect == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            case 2:
                ScrollCaptureCallbackC16787c scrollCaptureCallbackC16787c = (ScrollCaptureCallbackC16787c) this.f56415z;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f56413x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    float f15 = this.f56414y;
                    InterfaceC4351m interfaceC4351m = (InterfaceC4351m) AbstractC18037s.m51799d(scrollCaptureCallbackC16787c.f64531a.f69989d, AbstractC18029k.f69958e);
                    if (interfaceC4351m == null) {
                        throw AbstractC2875y.m8310w("Required value was null.");
                    }
                    C16617b c16617b = new C16617b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L));
                    this.f56413x = 1;
                    obj = interfaceC4351m.invoke(c16617b, this);
                    if (obj == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((C16617b) obj).f63937a & 4294967295L)));
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f56413x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C21194l c21194l = (C21194l) this.f56415z;
                    C13776c1 c13776c1 = c21194l.f80764i;
                    C21193k c21193k = new C21193k(c21194l, this.f56414y, null);
                    this.f56413x = 1;
                    if (C13776c1.m39137b(c13776c1, c21193k, this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f56413x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C23196w3 c23196w3 = (C23196w3) this.f56415z;
                    float f16 = this.f56414y;
                    this.f56413x = 1;
                    C24902g c24902g = c23196w3.f91787e;
                    Object value = c24902g.f97547g.getValue();
                    Object objM73007c = c24902g.m73007c(c24902g.m73010f(), f16, value);
                    InterfaceC30057d interfaceC30057d = null;
                    if (((Boolean) c24902g.f97544d.invoke(objM73007c)).booleanValue()) {
                        objM73006b = c24902g.m73006b(objM73007c, EnumC13840z0.f49374w, new C15085n(c24902g, f16, interfaceC30057d, 1), this);
                        if (objM73006b != enumC31071a5) {
                            objM73006b = c23454a1;
                        }
                        if (objM73006b != enumC31071a5) {
                            objM73006b = c23454a1;
                        }
                    } else {
                        objM73006b = c24902g.m73006b(value, EnumC13840z0.f49374w, new C15085n(c24902g, f16, interfaceC30057d, 1), this);
                        if (objM73006b != enumC31071a5) {
                            objM73006b = c23454a1;
                        }
                        if (objM73006b != enumC31071a5) {
                            objM73006b = c23454a1;
                        }
                    }
                    if (objM73006b != enumC31071a5) {
                        objM73006b = c23454a1;
                    }
                    if (objM73006b == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15065l(Object obj, float f13, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f56412w = i13;
        this.f56415z = obj;
        this.f56414y = f13;
    }
}
