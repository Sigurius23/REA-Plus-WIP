package live.hms.video.utils;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/utils/RunningAverage;", "", "<init>", "()V", "", "item", "Ll83/a0;", "add", "(J)V", "", "getAvg", "()D", "reset", "total", "J", "count", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class RunningAverage {
    public static final String TAG = "RunningAverage";
    private long count;
    private long total;

    public final void add(long item) {
        this.count++;
        this.total += item;
    }

    public final double getAvg() {
        long j7 = this.count;
        if (j7 == 0) {
            return 0.0d;
        }
        return Math.floor(this.total / j7);
    }

    public final void reset() {
        this.total = 0L;
        this.count = 0L;
    }
}
