package p163g1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11347e2;
import p132f0.C13821r1;
import p180h0.InterfaceC16413k2;
import p268k0.AbstractC22086a;
import p389p0.C28555v0;
import p389p0.InterfaceC28549s0;
import p409q0.AbstractC29701y;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.j5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15051j5 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56344w;

    /* JADX INFO: renamed from: x */
    public int f56345x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f56346y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56347z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15051j5(Object obj, int i13, InterfaceC30057d interfaceC30057d, int i14) {
        super(2, interfaceC30057d);
        this.f56344w = i14;
        this.f56347z = obj;
        this.f56346y = i13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56344w) {
            case 0:
                return new C15051j5((C15061k5) this.f56347z, this.f56346y, interfaceC30057d, 0);
            case 1:
                return new C15051j5((C28555v0) this.f56347z, this.f56346y, interfaceC30057d, 1);
            default:
                return new C15051j5((AbstractC29701y) this.f56347z, this.f56346y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56344w) {
            case 0:
                return ((C15051j5) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C15051j5) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C15051j5) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f56344w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56345x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13821r1 c13821r1 = ((C15061k5) this.f56347z).f56396a;
                    C11347e2 c11347e2 = AbstractC14977c8.f55962b;
                    this.f56345x = 1;
                    if (c13821r1.m39184f(this.f56346y, c11347e2, this) == enumC31071a) {
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
                int i14 = this.f56345x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC28549s0 interfaceC28549s0 = ((C28555v0) this.f56347z).f115526P;
                    this.f56345x = 1;
                    if (interfaceC28549s0.mo77517a(this.f56346y, this) == enumC31071a2) {
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
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f56347z;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f56345x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f56345x = 1;
                    Object objM86821j = abstractC29701y.f121454y.m86821j(this);
                    if (objM86821j != enumC31071a3) {
                        objM86821j = c23454a0;
                    }
                    if (objM86821j == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                double d3 = 0.0f;
                if (-0.5d > d3 || d3 > 0.5d) {
                    AbstractC22086a.m63158a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                abstractC29701y.m91171w(0.0f, abstractC29701y.m91161j(this.f56346y), true);
                return c23454a0;
        }
    }
}
