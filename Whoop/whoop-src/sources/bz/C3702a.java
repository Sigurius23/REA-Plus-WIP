package bz;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: bz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3702a implements InterfaceC3704c {

    /* JADX INFO: renamed from: b */
    public static final C3702a f15142b = new C3702a();

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f15143a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final Duration m11527a(EnumC3703b enumC3703b) {
        Long l7 = (Long) this.f15143a.remove(enumC3703b);
        if (l7 == null) {
            return null;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - l7.longValue();
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m134260boximpl(DurationKt.toDuration(jUptimeMillis, DurationUnit.MILLISECONDS));
    }
}
