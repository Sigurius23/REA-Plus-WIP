package p148fg;

import bc3.AbstractC3034m0;
import eg.C13163l;
import g93.AbstractC15612d;
import g93.C15611c;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p437qt.C30582e;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import r83.EnumC31071a;

/* JADX INFO: renamed from: fg.k */
/* JADX INFO: loaded from: classes.dex */
public final class C14441k {

    /* JADX INFO: renamed from: c */
    public static final C30582e f52720c = new C30582e(18);

    /* JADX INFO: renamed from: a */
    public final C14440j f52721a;

    /* JADX INFO: renamed from: b */
    public final C15611c f52722b = AbstractC15612d.f58612w;

    public C14441k(C14440j c14440j) {
        this.f52721a = c14440j;
    }

    /* JADX INFO: renamed from: a */
    public final Object m41167a(int i13, C13163l c13163l) {
        if (i13 <= 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "attempt was ", " but must be greater than 0").toString());
        }
        C14440j c14440j = this.f52721a;
        double dMin = Math.min(Math.pow(c14440j.f52717b, i13 - 1) * Duration.m134273getInWholeMillisecondsimpl(c14440j.f52716a), Duration.m134298toDoubleimpl(c14440j.f52719d, DurationUnit.MILLISECONDS));
        double d3 = c14440j.f52718c;
        double dMo43931c = 0.0d;
        if (d3 > 0.0d) {
            this.f52722b.getClass();
            dMo43931c = AbstractC15612d.f58613x.mo43931c(d3);
        }
        Object objM8782b = AbstractC3034m0.m8782b((long) ((1.0d - dMo43931c) * dMin), c13163l);
        return objM8782b == EnumC31071a.f128113w ? objM8782b : C23454a0.f92919a;
    }
}
