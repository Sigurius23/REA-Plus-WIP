package p005a3;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0256u0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC0262w0 f874w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f875x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f876y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0196e2 f877z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0256u0(AbstractC0262w0 abstractC0262w0, long j7, long j13, C0196e2 c0196e2) {
        super(0);
        this.f874w = abstractC0262w0;
        this.f875x = j7;
        this.f876y = j13;
        this.f877z = c0196e2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        AbstractC0262w0 abstractC0262w0 = this.f874w;
        abstractC0262w0.m792R0().f866w = false;
        abstractC0262w0.m792R0().f867x = this.f875x;
        abstractC0262w0.m792R0().f868y = this.f876y;
        Function1 function1Mo778c = this.f877z.f634w.mo778c();
        if (function1Mo778c != null) {
            function1Mo778c.invoke(abstractC0262w0.m792R0());
        }
        return C23454a0.f92919a;
    }
}
