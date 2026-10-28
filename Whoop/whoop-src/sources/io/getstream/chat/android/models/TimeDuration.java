package io.getstream.chat.android.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/models/TimeDuration;", "", AttachmentExtensionsKt.EXTRA_DURATION, "Lkotlin/time/Duration;", "<init>", "(J)V", "J", "millis", "", "getMillis", "()J", "seconds", "getSeconds", "minutes", "getMinutes", "hours", "getHours", "days", "getDays", "compareTo", "", "other", "equals", "", "", "hashCode", "toString", "", "Companion", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TimeDuration implements Comparable<TimeDuration> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long duration;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/TimeDuration$Companion;", "", "<init>", "()V", "millis", "Lio/getstream/chat/android/models/TimeDuration;", "", "seconds", "", "minutes", "hours", "days", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TimeDuration days(int days) {
            Duration.Companion companion = Duration.INSTANCE;
            return new TimeDuration(DurationKt.toDuration(days, DurationUnit.DAYS), null);
        }

        public final TimeDuration hours(int hours) {
            Duration.Companion companion = Duration.INSTANCE;
            return new TimeDuration(DurationKt.toDuration(hours, DurationUnit.HOURS), null);
        }

        public final TimeDuration millis(long millis) {
            Duration.Companion companion = Duration.INSTANCE;
            return new TimeDuration(DurationKt.toDuration(millis, DurationUnit.MILLISECONDS), null);
        }

        public final TimeDuration minutes(int minutes) {
            Duration.Companion companion = Duration.INSTANCE;
            return new TimeDuration(DurationKt.toDuration(minutes, DurationUnit.MINUTES), null);
        }

        public final TimeDuration seconds(int seconds) {
            Duration.Companion companion = Duration.INSTANCE;
            return new TimeDuration(DurationKt.toDuration(seconds, DurationUnit.SECONDS), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TimeDuration(long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof TimeDuration) {
            return Duration.m134267equalsimpl0(this.duration, ((TimeDuration) other).duration);
        }
        return false;
    }

    public final long getDays() {
        return Duration.m134270getInWholeDaysimpl(this.duration);
    }

    public final long getHours() {
        return Duration.m134271getInWholeHoursimpl(this.duration);
    }

    public final long getMillis() {
        return Duration.m134273getInWholeMillisecondsimpl(this.duration);
    }

    public final long getMinutes() {
        return Duration.m134274getInWholeMinutesimpl(this.duration);
    }

    public final long getSeconds() {
        return Duration.m134276getInWholeSecondsimpl(this.duration);
    }

    public int hashCode() {
        return Duration.m134283hashCodeimpl(this.duration);
    }

    public String toString() {
        return Duration.m134302toStringimpl(this.duration);
    }

    private TimeDuration(long j7) {
        this.duration = j7;
    }

    @Override // java.lang.Comparable
    public int compareTo(TimeDuration other) {
        AbstractC22676k.m65750j(other, "other");
        return Duration.m134261compareToLRDsOJo(this.duration, other.duration);
    }
}
