package com.whoop.coaching.sleepcoach.harvard.view;

import lp0.AbstractC24638i;
import lp0.C24641l;
import org.joda.time.Instant;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.harvard.view.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/harvard/view/a;", "", "", "pixelsPerMilli", "", "totalTimeDurationOnScreen", "Lorg/joda/time/Instant;", "timeStampAtLeftmostPixelOnScreen", "<init>", "(DILorg/joda/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "I", "c", "Lorg/joda/time/Instant;", "()Lorg/joda/time/Instant;", "d", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C6223a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f24498e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double pixelsPerMilli;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int totalTimeDurationOnScreen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Instant timeStampAtLeftmostPixelOnScreen;

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.harvard.view.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;", "", "<init>", "()V", "", "screenWidth", "Llp0/l;", "tonightsSleep", "optimalSleepWindow", "Lcom/whoop/coaching/sleepcoach/harvard/view/a;", "a", "(ILlp0/l;Llp0/l;)Lcom/whoop/coaching/sleepcoach/harvard/view/a;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6223a m18564a(int screenWidth, C24641l tonightsSleep, C24641l optimalSleepWindow) {
            AbstractC22676k.m65750j(tonightsSleep, "tonightsSleep");
            AbstractC22676k.m65750j(optimalSleepWindow, "optimalSleepWindow");
            double millis = optimalSleepWindow.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String().getMillis() * 1.33d;
            double d3 = ((double) screenWidth) / millis;
            int i13 = (int) millis;
            return new C6223a(d3, i13, AbstractC24638i.m71988b(i13, tonightsSleep));
        }

        private Companion() {
        }
    }

    public C6223a(double d3, int i13, Instant timeStampAtLeftmostPixelOnScreen) {
        AbstractC22676k.m65750j(timeStampAtLeftmostPixelOnScreen, "timeStampAtLeftmostPixelOnScreen");
        this.pixelsPerMilli = d3;
        this.totalTimeDurationOnScreen = i13;
        this.timeStampAtLeftmostPixelOnScreen = timeStampAtLeftmostPixelOnScreen;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getPixelsPerMilli() {
        return this.pixelsPerMilli;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Instant getTimeStampAtLeftmostPixelOnScreen() {
        return this.timeStampAtLeftmostPixelOnScreen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTotalTimeDurationOnScreen() {
        return this.totalTimeDurationOnScreen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6223a)) {
            return false;
        }
        C6223a c6223a = (C6223a) other;
        return Double.compare(this.pixelsPerMilli, c6223a.pixelsPerMilli) == 0 && this.totalTimeDurationOnScreen == c6223a.totalTimeDurationOnScreen && AbstractC22676k.m65745e(this.timeStampAtLeftmostPixelOnScreen, c6223a.timeStampAtLeftmostPixelOnScreen);
    }

    public int hashCode() {
        return this.timeStampAtLeftmostPixelOnScreen.hashCode() + AbstractC11266d.m30448b(this.totalTimeDurationOnScreen, Double.hashCode(this.pixelsPerMilli) * 31, 31);
    }

    public String toString() {
        return "Scale(pixelsPerMilli=" + this.pixelsPerMilli + ", totalTimeDurationOnScreen=" + this.totalTimeDurationOnScreen + ", timeStampAtLeftmostPixelOnScreen=" + this.timeStampAtLeftmostPixelOnScreen + ")";
    }
}
