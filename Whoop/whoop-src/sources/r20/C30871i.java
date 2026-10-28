package r20;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import com.whoop.android.R;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import m83.C25271y;
import p390p1.C28655q;
import p477s2.AbstractC32072d;
import p479s4.AbstractC32128i;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.C29124b;
import w20.C36711b0;

/* JADX INFO: renamed from: r20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C30871i implements InterfaceC30881s {

    /* JADX INFO: renamed from: w */
    public final C36711b0 f127294w;

    /* JADX INFO: renamed from: x */
    public final C13081r1 f127295x = AbstractC3269g.m9493Z(new C30864b(true, new C30863a(AbstractC32128i.m100064s(R.string.stripe_paymentsheet_confirm, new Object[0], C25271y.f99162w))));

    /* JADX INFO: renamed from: y */
    public final float f127296y = 0;

    /* JADX INFO: renamed from: z */
    public final float f127297z = AbstractC30882t.f127338a;

    /* JADX INFO: renamed from: E */
    public final float f127293E = AbstractC30882t.f127340c;

    public C30871i(C36711b0 c36711b0) {
        this.f127294w = c36711b0;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: J */
    public final void mo94924J(Composer composer, Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-521548963);
        AbstractC32072d.m99694c(this.f127294w, c28655q, 0);
        c28655q.m87173q(false);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: T */
    public final boolean mo94925T() {
        return false;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC13037f2 mo94926a0(boolean z4, boolean z13) {
        return AbstractC3269g.m9493Z(null);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b */
    public final C13081r1 mo94927b() {
        return this.f127295x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC13037f2 mo94928b0(boolean z4) {
        return AbstractC3269g.m9493Z(Boolean.FALSE);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: h */
    public final EnumC30870h mo94929h() {
        return EnumC30870h.f127291x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: i */
    public final float mo94930i() {
        return this.f127297z;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: k */
    public final InterfaceC13037f2 mo94931k() {
        return AbstractC3269g.m9484M(this.f127294w.f157194d, new C29124b(this, 18));
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: m */
    public final float mo94932m() {
        return this.f127296y;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: s */
    public final boolean mo94933s() {
        return false;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: x */
    public final float mo94934x() {
        return this.f127293E;
    }
}
