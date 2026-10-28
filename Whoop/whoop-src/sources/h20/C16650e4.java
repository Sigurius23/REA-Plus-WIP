package h20;

import a30.AbstractC0326t0;
import a30.C0274a0;
import a30.C0313n0;
import a30.C0328u0;
import androidx.room.C1778e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13081r1;
import ec3.C13096w1;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h20.e4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16650e4 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64017w;

    /* JADX INFO: renamed from: x */
    public int f64018x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16686k4 f64019y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16650e4(C16686k4 c16686k4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f64017w = i13;
        this.f64019y = c16686k4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f64017w) {
            case 0:
                return new C16650e4(this.f64019y, interfaceC30057d, 0);
            case 1:
                return new C16650e4(this.f64019y, interfaceC30057d, 1);
            case 2:
                return new C16650e4(this.f64019y, interfaceC30057d, 2);
            default:
                return new C16650e4(this.f64019y, interfaceC30057d, 3);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f64017w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C16650e4) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM814g;
        switch (this.f64017w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f64018x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f64018x = 1;
                    if (C16686k4.m47235A(this.f64019y, this) == enumC31071a) {
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
                int i14 = this.f64018x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16686k4 c16686k4 = this.f64019y;
                    C13081r1 c13081r1 = c16686k4.f64175s0.f42923k;
                    C1778e c1778e = new C1778e(c16686k4, null, 12);
                    this.f64018x = 1;
                    if (AbstractC13091v.m36604n(c13081r1, c1778e, this) == enumC31071a2) {
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
                C16686k4 c16686k5 = this.f64019y;
                C16757w3 c16757w3 = c16686k5.f64159c0;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f64018x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C0274a0 c0274a0 = c16686k5.f64160d0;
                    AbstractC0326t0 abstractC0326t0 = c16757w3.f64382w;
                    C0313n0 c0313n0 = new C0313n0(c16757w3.f64383x);
                    C0328u0 c0328u0 = new C0328u0(c16686k5.f64175s0.f42921i, c16757w3.f64381E);
                    this.f64018x = 1;
                    objM814g = c0274a0.m814g(abstractC0326t0, c0313n0, c0328u0, this);
                    if (objM814g == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM814g = ((C23468n) obj).f92940w;
                }
                return new C23468n(objM814g);
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f64018x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13096w1 c13096w1 = this.f64019y.f43011O;
                    this.f64018x = 1;
                    if (c13096w1.emit(c23454a0, this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
        }
    }
}
