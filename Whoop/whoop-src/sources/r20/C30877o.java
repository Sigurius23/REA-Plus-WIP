package r20;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.AbstractC2480a5;
import b30.AbstractC2592o5;
import b30.C2603q0;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import com.whoop.android.R;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import java.io.Closeable;
import p390p1.C28655q;
import p479s4.AbstractC32128i;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.C29124b;

/* JADX INFO: renamed from: r20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C30877o implements InterfaceC30881s, Closeable {

    /* JADX INFO: renamed from: E */
    public final float f127310E;

    /* JADX INFO: renamed from: F */
    public final float f127311F;

    /* JADX INFO: renamed from: G */
    public final EnumC30870h f127312G;

    /* JADX INFO: renamed from: H */
    public final boolean f127313H;

    /* JADX INFO: renamed from: w */
    public final C2603q0 f127314w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC30876n f127315x;

    /* JADX INFO: renamed from: y */
    public final C13081r1 f127316y;

    /* JADX INFO: renamed from: z */
    public final float f127317z;

    public C30877o(C2603q0 c2603q0, InterfaceC30876n cvcRecollectionState) {
        AbstractC22676k.m65750j(cvcRecollectionState, "cvcRecollectionState");
        this.f127314w = c2603q0;
        this.f127315x = cvcRecollectionState;
        this.f127316y = AbstractC3269g.m9493Z(new C30864b(true, null));
        this.f127317z = AbstractC2480a5.f9662e;
        this.f127310E = 0;
        this.f127311F = AbstractC30882t.f127339b;
        this.f127312G = EnumC30870h.f127290w;
        this.f127313H = true;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: J */
    public final void mo94924J(Composer composer, Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-289202489);
        AbstractC2592o5.m7509g(this.f127314w, this.f127315x, modifier, c28655q, 384);
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
        return AbstractC3269g.m9493Z((z4 && z13) ? null : AbstractC32128i.m100054h(R.string.stripe_paymentsheet_select_your_payment_method));
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b */
    public final C13081r1 mo94927b() {
        return this.f127316y;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC13037f2 mo94928b0(boolean z4) {
        return AbstractC3269g.m9493Z(Boolean.valueOf(z4));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC3006f0.m8714h(this.f127314w.f10141n, null);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: h */
    public final EnumC30870h mo94929h() {
        return this.f127312G;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: i */
    public final float mo94930i() {
        return this.f127310E;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: k */
    public final InterfaceC13037f2 mo94931k() {
        return AbstractC3269g.m9484M(this.f127314w.f10144q, new C29124b(this, 20));
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: m */
    public final float mo94932m() {
        return this.f127317z;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: s */
    public final boolean mo94933s() {
        return this.f127313H;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: x */
    public final float mo94934x() {
        return this.f127311F;
    }
}
