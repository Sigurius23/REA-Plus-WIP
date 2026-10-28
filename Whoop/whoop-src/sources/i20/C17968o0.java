package i20;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13081r1;
import ec3.C13096w1;
import h20.C16760x0;
import l83.C23454a0;
import p000.C34292u;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: i20.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17968o0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69787w;

    /* JADX INFO: renamed from: x */
    public int f69788x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C17982v0 f69789y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17968o0(C17982v0 c17982v0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f69787w = i13;
        this.f69789y = c17982v0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f69787w) {
            case 0:
                return new C17968o0(this.f69789y, interfaceC30057d, 0);
            case 1:
                return new C17968o0(this.f69789y, interfaceC30057d, 1);
            default:
                return new C17968o0(this.f69789y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f69787w) {
            case 0:
                ((C17968o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 1:
                return ((C17968o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C17968o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f69787w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f69788x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C17982v0 c17982v0 = this.f69789y;
                    C13081r1 c13081r1 = c17982v0.f69816J;
                    C34292u c34292u = new C34292u(c17982v0, 12);
                    this.f69788x = 1;
                    if (c13081r1.f45200w.collect(c34292u, this) == enumC31071a) {
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
                int i14 = this.f69788x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13096w1 c13096w1 = this.f69789y.f69812F;
                    C17976s0 c17976s0 = new C17976s0(null);
                    this.f69788x = 1;
                    if (c13096w1.emit(c17976s0, this) == enumC31071a2) {
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
                C17982v0 c17982v1 = this.f69789y;
                C13081r1 c13081r2 = c17982v1.f69816J;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f69788x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13096w1 c13096w2 = c17982v1.f69812F;
                    C17974r0 c17974r0 = new C17974r0(!AbstractC39414r.m125890i0((CharSequence) c13081r2.f45200w.getValue()) ? new C16760x0(null, null, (String) c13081r2.f45200w.getValue(), null, null, null) : null);
                    this.f69788x = 1;
                    if (c13096w2.emit(c17974r0, this) == enumC31071a3) {
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
