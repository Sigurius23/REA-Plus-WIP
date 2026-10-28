package p237j$.time;

import java.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class DesugarDuration {
    public static int toMinutesPart(Duration duration) {
        return (int) (duration.toMinutes() % 60);
    }

    public static int toSecondsPart(Duration duration) {
        return (int) (duration.getSeconds() % 60);
    }
}
