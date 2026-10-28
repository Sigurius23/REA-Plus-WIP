package p218ic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import p420qc.C30207q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18365j0 extends AbstractC18379q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18365j0(Class cls, long j7, TimeUnit repeatIntervalTimeUnit) {
        super(cls);
        AbstractC22676k.m65750j(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        this.f71544c.m92428e(repeatIntervalTimeUnit.toMillis(j7));
    }

    @Override // p218ic.AbstractC18379q0
    /* JADX INFO: renamed from: c */
    public final AbstractC18381r0 mo52869c() {
        if (this.f71542a && this.f71544c.f123643j.f71468d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        C30207q c30207q = this.f71544c;
        if (c30207q.f123650q) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new C18367k0(this.f71543b, c30207q, this.f71545d);
    }

    @Override // p218ic.AbstractC18379q0
    /* JADX INFO: renamed from: d */
    public final AbstractC18379q0 mo52870d() {
        return this;
    }

    public C18365j0(Class cls, Duration duration) {
        super(cls);
        this.f71544c.m92428e(duration.toMillis());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18365j0(Class cls) {
        super(cls);
        TimeUnit flexIntervalTimeUnit = TimeUnit.MINUTES;
        AbstractC22676k.m65750j(flexIntervalTimeUnit, "repeatIntervalTimeUnit");
        AbstractC22676k.m65750j(flexIntervalTimeUnit, "flexIntervalTimeUnit");
        this.f71544c.m92429f(flexIntervalTimeUnit.toMillis(15L), flexIntervalTimeUnit.toMillis(5L));
    }
}
