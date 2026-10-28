package p459rf;

import bg.C3207b;
import bg.InterfaceC3212g;
import l83.C23474t;
import mg.C25525g;
import mg.InterfaceC25526h;
import p005a3.C0237p;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.AbstractC29125c;
import pf.AbstractC29130h;
import pf.C29144v;

/* JADX INFO: renamed from: rf.q */
/* JADX INFO: loaded from: classes.dex */
public final class C31346q extends AbstractC29130h {

    /* JADX INFO: renamed from: j */
    public C23474t f128981j;

    /* JADX INFO: renamed from: k */
    public InterfaceC25526h f128982k;

    /* JADX INFO: renamed from: l */
    public final boolean f128983l;

    public C31346q() {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        this.f117901a = DurationKt.toDuration(30, durationUnit);
        this.f117902b = DurationKt.toDuration(30, durationUnit);
        this.f117903c = DurationKt.toDuration(2, durationUnit);
        this.f117904d = DurationKt.toDuration(10, durationUnit);
        this.f117905e = DurationKt.toDuration(60, durationUnit);
        this.f117906f = 128;
        this.f117907g = new C0237p(25);
        InterfaceC3212g.f12569a.getClass();
        this.f117908h = C3207b.f12563b;
        this.f117909i = C29144v.f117936b;
        C25525g c25525g = InterfaceC25526h.f99937a;
        c25525g.getClass();
        C25525g c25525g2 = C25525g.f99935a;
        this.f128982k = AbstractC29125c.m88549z(c25525g);
        this.f128983l = true;
    }
}
