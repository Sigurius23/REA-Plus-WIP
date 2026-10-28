package p180h0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p181h2.C16617b;
import p505ts.AbstractC34132o;
import p512u2.C34472r;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.k3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16414k3 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C34472r f63076E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63077w;

    /* JADX INFO: renamed from: x */
    public int f63078x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function3 f63079y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16398h2 f63080z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16414k3(Function3 function3, C16398h2 c16398h2, C34472r c34472r, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f63077w = i13;
        this.f63079y = function3;
        this.f63080z = c16398h2;
        this.f63076E = c34472r;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f63077w) {
            case 0:
                return new C16414k3(this.f63079y, this.f63080z, this.f63076E, interfaceC30057d, 0);
            default:
                return new C16414k3(this.f63079y, this.f63080z, this.f63076E, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f63077w) {
            case 0:
                break;
        }
        return ((C16414k3) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f63077w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f63078x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16617b c16617b = new C16617b(this.f63076E.f144817c);
                    this.f63078x = 1;
                    if (this.f63079y.invoke(this.f63080z, c16617b, this) == enumC31071a) {
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
                int i14 = this.f63078x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16617b c16617b2 = new C16617b(this.f63076E.f144817c);
                    this.f63078x = 1;
                    if (this.f63079y.invoke(this.f63080z, c16617b2, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
