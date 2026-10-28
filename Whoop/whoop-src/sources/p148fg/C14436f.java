package p148fg;

import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import p715kotlin.time.TimeMark;
import p715kotlin.time.TimeSource;

/* JADX INFO: renamed from: fg.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14436f {

    /* JADX INFO: renamed from: a */
    public final C14432b f52701a;

    /* JADX INFO: renamed from: b */
    public TimeMark f52702b;

    /* JADX INFO: renamed from: c */
    public double f52703c;

    /* JADX INFO: renamed from: d */
    public int f52704d;

    /* JADX INFO: renamed from: e */
    public final double f52705e;

    public C14436f(C14432b c14432b, TimeSource.Monotonic timeSource) {
        TimeMark lastTxBucketMark = timeSource.markNow();
        AbstractC22676k.m65750j(timeSource, "timeSource");
        AbstractC22676k.m65750j(lastTxBucketMark, "lastTxBucketMark");
        this.f52701a = c14432b;
        this.f52702b = lastTxBucketMark;
        this.f52703c = 0.0d;
        this.f52704d = 0;
        this.f52705e = ((double) 1) / Duration.m134298toDoubleimpl(c14432b.f52675a, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: a */
    public final double m41165a() {
        this.f52704d++;
        long jMo134250elapsedNowUwyO8pc = this.f52702b.mo134250elapsedNowUwyO8pc();
        C14432b c14432b = this.f52701a;
        double dFloor = Math.floor(Duration.m134263divLRDsOJo(jMo134250elapsedNowUwyO8pc, c14432b.f52675a));
        if (dFloor >= 1.0d) {
            double d3 = (((double) this.f52704d) / dFloor) * this.f52705e;
            double d14 = c14432b.f52679e;
            this.f52703c = ((((double) 1) - d14) * this.f52703c) + (d3 * d14);
            this.f52702b = this.f52702b.mo134253plusLRDsOJo(Duration.m134292timesUwyO8pc(c14432b.f52675a, dFloor));
            this.f52704d = 0;
        }
        return this.f52703c;
    }
}
