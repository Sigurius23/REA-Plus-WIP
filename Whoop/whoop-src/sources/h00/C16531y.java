package h00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import d00.C11433l;
import d30.C11528e1;
import l83.C23454a0;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p507tx.AbstractC34235f;
import p550vd.AbstractC35902e;
import p599wz.AbstractC37713e1;
import p599wz.C37773z0;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h00.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C16531y implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f63577E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC4339a f63578w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f63579x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC37713e1 f63580y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f63581z;

    public C16531y(InterfaceC4339a interfaceC4339a, Function1 function1, AbstractC37713e1 abstractC37713e1, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3) {
        this.f63578w = interfaceC4339a;
        this.f63579x = function1;
        this.f63580y = abstractC37713e1;
        this.f63581z = interfaceC4339a2;
        this.f63577E = interfaceC4339a3;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC3764o composable = (InterfaceC3764o) obj;
        C12982q it = (C12982q) obj2;
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C11433l c11433l = (C11433l) this.f63578w.invoke();
        Function1 function1 = this.f63579x;
        if (c11433l == null) {
            function1.invoke(AbstractC34235f.m108230p());
        } else {
            AbstractC35902e.m113962f(AbstractC22676k.m65745e(this.f63580y, C37773z0.f161799d) ? 1.0f : 0.0f, AbstractC37817c.m121344e(818897323, composer, new C11528e1(c11433l, this.f63581z, this.f63577E, function1)), composer, 48);
        }
        return C23454a0.f92919a;
    }
}
