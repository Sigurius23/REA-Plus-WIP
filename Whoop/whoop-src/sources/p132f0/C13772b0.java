package p132f0;

import bc3.AbstractC3006f0;
import l83.C23454a0;
import p180h0.C16398h2;
import p181h2.C16617b;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f0.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13772b0 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public int f49124w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ C16398h2 f49125x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ long f49126y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13775c0 f49127z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13772b0(C13775c0 c13775c0, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f49127z = c13775c0;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j7 = ((C16617b) obj2).f63937a;
        C13772b0 c13772b0 = new C13772b0(this.f49127z, (InterfaceC30057d) obj3);
        c13772b0.f49125x = (C16398h2) obj;
        c13772b0.f49126y = j7;
        return c13772b0.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM8719m;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f49124w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C16398h2 c16398h2 = this.f49125x;
            long j7 = this.f49126y;
            C13775c0 c13775c0 = this.f49127z;
            if (c13775c0.f49201V) {
                this.f49124w = 1;
                InterfaceC21083i interfaceC21083i = c13775c0.f49196Q;
                if (interfaceC21083i == null || (objM8719m = AbstractC3006f0.m8719m(new C13777d(c16398h2, j7, interfaceC21083i, c13775c0, null), this)) != enumC31071a) {
                    objM8719m = c23454a0;
                }
                if (objM8719m == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return c23454a0;
    }
}
