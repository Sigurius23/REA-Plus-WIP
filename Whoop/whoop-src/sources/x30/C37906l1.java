package x30;

import bi.AbstractC3269g;
import c30.C3911b;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15379k1;
import m83.C25271y;
import n53.C26318e;
import p127ev.AbstractC13673n;
import p479s4.AbstractC32128i;
import p545v6.C35728q;
import p599wz.C37722h1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: x30.l1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37906l1 implements InterfaceC15379k1 {

    /* JADX INFO: renamed from: a */
    public final C13045h2 f162295a;

    /* JADX INFO: renamed from: b */
    public final C13045h2 f162296b;

    /* JADX INFO: renamed from: c */
    public final C13045h2 f162297c;

    /* JADX INFO: renamed from: d */
    public final C26318e f162298d;

    /* JADX INFO: renamed from: e */
    public final C13081r1 f162299e;

    /* JADX INFO: renamed from: f */
    public final C26318e f162300f;

    public C37906l1(boolean z4, InterfaceC13037f2 saveForFutureUseCheckedFlow, boolean z13) {
        AbstractC22676k.m65750j(saveForFutureUseCheckedFlow, "saveForFutureUseCheckedFlow");
        this.f162295a = AbstractC13091v.m36593c(AbstractC32128i.m100064s(R.string.stripe_set_as_default_payment_method, new Object[0], C25271y.f99162w));
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.valueOf(z4));
        this.f162296b = c13045h2M36593c;
        this.f162297c = c13045h2M36593c;
        C26318e c26318eM9509p = AbstractC3269g.m9509p(saveForFutureUseCheckedFlow, c13045h2M36593c, new C3911b(z13, 5));
        this.f162298d = c26318eM9509p;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c26318eM9509p, new C37722h1(21));
        this.f162299e = AbstractC3269g.m9493Z(null);
        this.f162300f = AbstractC3269g.m9509p(AbstractC3269g.m9493Z(Boolean.TRUE), c26318eM9484M, new C35728q(29, (byte) 0));
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: b */
    public final void mo43558b(boolean z4) {
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: c */
    public final InterfaceC13037f2 mo43559c() {
        throw null;
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        return this.f162299e;
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: j */
    public final InterfaceC13037f2 mo43564j() {
        return this.f162300f;
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: s */
    public final void mo43573s(String str) {
        Boolean boolM125868N0 = AbstractC39414r.m125868N0(str);
        AbstractC13673n.m38550B(boolM125868N0 != null ? boolM125868N0.booleanValue() : true, this.f162296b, null);
    }
}
