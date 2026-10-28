package g40;

import bi.AbstractC3269g;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import m83.C25271y;
import n53.C26318e;
import p127ev.AbstractC13673n;
import p479s4.AbstractC32128i;
import p545v6.C35728q;
import p599wz.C37722h1;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: g40.u2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15430u2 implements InterfaceC15379k1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57999a;

    /* JADX INFO: renamed from: b */
    public final C13045h2 f58000b;

    /* JADX INFO: renamed from: c */
    public final C13081r1 f58001c;

    /* JADX INFO: renamed from: d */
    public final C26318e f58002d;

    /* JADX INFO: renamed from: e */
    public final Object f58003e;

    /* JADX INFO: renamed from: f */
    public final Object f58004f;

    public C15430u2(boolean z4) {
        this.f57999a = 0;
        this.f58001c = AbstractC3269g.m9493Z(AbstractC32128i.m100064s(R.string.stripe_billing_same_as_shipping, new Object[0], C25271y.f99162w));
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.valueOf(z4));
        this.f58000b = c13045h2M36593c;
        C13081r1 c13081r1M36598h = AbstractC13091v.m36598h(c13045h2M36593c);
        this.f58003e = c13081r1M36598h;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c13081r1M36598h, new C15449y1(1));
        this.f58004f = AbstractC3269g.m9493Z(null);
        AbstractC3269g.m9493Z(Boolean.TRUE);
        this.f58002d = AbstractC3269g.m9484M(c26318eM9484M, new C15449y1(2));
    }

    /* JADX INFO: renamed from: i */
    private final void m43606i(boolean z4) {
    }

    /* JADX INFO: renamed from: u */
    private final void m43607u(boolean z4) {
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: b */
    public final void mo43558b(boolean z4) {
        int i13 = this.f57999a;
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: c */
    public InterfaceC13037f2 mo43559c() {
        throw null;
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        switch (this.f57999a) {
            case 0:
                return (C13081r1) this.f58004f;
            default:
                return this.f58001c;
        }
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: j */
    public final InterfaceC13037f2 mo43564j() {
        switch (this.f57999a) {
            case 0:
                break;
        }
        return this.f58002d;
    }

    @Override // g40.InterfaceC15379k1
    /* JADX INFO: renamed from: s */
    public final void mo43573s(String str) {
        switch (this.f57999a) {
            case 0:
                Boolean boolM125868N0 = AbstractC39414r.m125868N0(str);
                AbstractC13673n.m38550B(boolM125868N0 != null ? boolM125868N0.booleanValue() : true, this.f58000b, null);
                break;
            default:
                Boolean boolM125868N1 = AbstractC39414r.m125868N0(str);
                AbstractC13673n.m38550B(boolM125868N1 != null ? boolM125868N1.booleanValue() : true, (C13045h2) this.f58003e, null);
                break;
        }
    }

    public C15430u2(String str, boolean z4) {
        this.f57999a = 1;
        this.f58000b = AbstractC13091v.m36593c(AbstractC32128i.m100064s(R.string.stripe_save_payment_details_to_merchant_name, new Object[]{str}, C25271y.f99162w));
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.valueOf(z4));
        this.f58003e = c13045h2M36593c;
        this.f58004f = c13045h2M36593c;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c13045h2M36593c, new C37722h1(20));
        this.f58001c = AbstractC3269g.m9493Z(null);
        this.f58002d = AbstractC3269g.m9509p(AbstractC3269g.m9493Z(Boolean.TRUE), c26318eM9484M, new C35728q(28, (byte) 0));
    }
}
