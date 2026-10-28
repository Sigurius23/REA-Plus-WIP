package r20;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2550j3;
import bi.AbstractC3269g;
import com.whoop.android.R;
import d30.C11564u;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import ou1.C28376a;
import p390p1.C28655q;
import p477s2.AbstractC32073e;
import p479s4.AbstractC32128i;
import p696zy.C41210b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r20.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C30879q implements InterfaceC30881s {

    /* JADX INFO: renamed from: w */
    public final C11564u f127326w;

    /* JADX INFO: renamed from: x */
    public final C13081r1 f127327x = AbstractC3269g.m9493Z(new C30864b(true, null));

    /* JADX INFO: renamed from: y */
    public final boolean f127328y = true;

    /* JADX INFO: renamed from: z */
    public final float f127329z = 0;

    /* JADX INFO: renamed from: E */
    public final float f127323E = AbstractC30882t.f127338a;

    /* JADX INFO: renamed from: F */
    public final float f127324F = AbstractC30882t.f127340c;

    /* JADX INFO: renamed from: G */
    public final boolean f127325G = true;

    public C30879q(C11564u c11564u) {
        this.f127326w = c11564u;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: J */
    public final void mo94924J(Composer composer, Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1185148305);
        C11669n c11669n = C11671p.f37680a;
        AbstractC32073e.m99737c(this.f127326w, AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifier), c28655q, 0);
        c28655q.m87173q(false);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: T */
    public final boolean mo94925T() {
        return this.f127328y;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC13037f2 mo94926a0(boolean z4, boolean z13) {
        C41210b c41210bM100054h;
        if (z13) {
            c41210bM100054h = null;
        } else {
            c41210bM100054h = z4 ? AbstractC32128i.m100054h(R.string.stripe_paymentsheet_select_payment_method) : AbstractC32128i.m100054h(R.string.stripe_paymentsheet_choose_payment_method);
        }
        return AbstractC3269g.m9493Z(c41210bM100054h);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b */
    public final C13081r1 mo94927b() {
        return this.f127327x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC13037f2 mo94928b0(boolean z4) {
        return this.f127326w.f37314t;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: h */
    public final EnumC30870h mo94929h() {
        return EnumC30870h.f127291x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: i */
    public final float mo94930i() {
        return this.f127323E;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: k */
    public final InterfaceC13037f2 mo94931k() {
        return AbstractC3269g.m9493Z(new C2550j3(!this.f127326w.f37312r, false, false, new C28376a(7)));
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: m */
    public final float mo94932m() {
        return this.f127329z;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: s */
    public final boolean mo94933s() {
        return this.f127325G;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: x */
    public final float mo94934x() {
        return this.f127324F;
    }
}
