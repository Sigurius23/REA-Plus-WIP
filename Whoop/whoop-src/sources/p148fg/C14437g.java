package p148fg;

import gg.EnumC15819f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import p715kotlin.time.TimeMark;
import p715kotlin.time.TimeSource;

/* JADX INFO: renamed from: fg.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C14437g {

    /* JADX INFO: renamed from: a */
    public final C14432b f52706a;

    /* JADX INFO: renamed from: b */
    public final TimeSource f52707b;

    /* JADX INFO: renamed from: c */
    public double f52708c;

    /* JADX INFO: renamed from: d */
    public TimeMark f52709d;

    /* JADX INFO: renamed from: e */
    public boolean f52710e;

    /* JADX INFO: renamed from: f */
    public double f52711f;

    public C14437g(C14432b c14432b, TimeSource.Monotonic timeSource) {
        TimeMark lastThrottleTime = timeSource.markNow();
        AbstractC22676k.m65750j(timeSource, "timeSource");
        AbstractC22676k.m65750j(lastThrottleTime, "lastThrottleTime");
        this.f52706a = c14432b;
        this.f52707b = timeSource;
        this.f52708c = 0.0d;
        this.f52709d = lastThrottleTime;
        this.f52711f = Math.cbrt(((((double) 1) - 0.7d) * 0.0d) / c14432b.f52678d);
    }

    /* JADX INFO: renamed from: a */
    public final double m41166a(EnumC15819f enumC15819f, double d3, double d14) {
        EnumC15819f enumC15819f2 = EnumC15819f.f59713y;
        C14432b c14432b = this.f52706a;
        if (enumC15819f != enumC15819f2) {
            return (Math.pow(Duration.m134298toDoubleimpl(this.f52709d.mo134250elapsedNowUwyO8pc(), DurationUnit.SECONDS) - this.f52711f, 3) * c14432b.f52678d) + this.f52708c;
        }
        if (this.f52710e) {
            d3 = Math.min(d3, d14);
        }
        this.f52708c = d3;
        c14432b.getClass();
        this.f52711f = Math.cbrt(((((double) 1) - 0.7d) * d3) / c14432b.f52678d);
        this.f52709d = this.f52707b.markNow();
        this.f52710e = true;
        double d15 = this.f52708c;
        c14432b.getClass();
        return d15 * 0.7d;
    }
}
