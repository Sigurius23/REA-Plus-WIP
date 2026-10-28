package lp0;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import org.joda.time.Duration;
import org.joda.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lp0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014¨\u0006\u001d"}, m65681d2 = {"Llp0/l;", "", "Lorg/joda/time/Instant;", "startTime", "endTime", "<init>", "(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/Instant;", "e", "()Lorg/joda/time/Instant;", "b", "c", "Lorg/joda/time/Duration;", "Lorg/joda/time/Duration;", "()Lorg/joda/time/Duration;", AttachmentExtensionsKt.EXTRA_DURATION, "d", "middle", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24641l {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f96385f = 8;

    /* JADX INFO: renamed from: g */
    private static final C24641l f96386g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Instant startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Instant endTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Duration duration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Instant middle;

    /* JADX INFO: renamed from: lp0.l$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Llp0/l$a;", "", "<init>", "()V", "Llp0/l;", "DEFAULT_WINDOW", "Llp0/l;", "a", "()Llp0/l;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C24641l m71998a() {
            return C24641l.f96386g;
        }

        private Companion() {
        }
    }

    static {
        Instant EPOCH = Instant.EPOCH;
        AbstractC22676k.m65749i(EPOCH, "EPOCH");
        AbstractC22676k.m65749i(EPOCH, "EPOCH");
        f96386g = new C24641l(EPOCH, EPOCH);
    }

    public C24641l(Instant startTime, Instant endTime) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = new Duration(startTime, endTime);
        this.middle = new Instant((endTime.getMillis() + startTime.getMillis()) / ((long) 2));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Duration getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getMiddle() {
        return this.middle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getStartTime() {
        return this.startTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24641l)) {
            return false;
        }
        C24641l c24641l = (C24641l) other;
        return AbstractC22676k.m65745e(this.startTime, c24641l.startTime) && AbstractC22676k.m65745e(this.endTime, c24641l.endTime);
    }

    public int hashCode() {
        return this.endTime.hashCode() + (this.startTime.hashCode() * 31);
    }

    public String toString() {
        Instant instant = this.startTime;
        Instant instant2 = this.endTime;
        return "Window(startTime=" + instant + ", endTime=" + instant2 + ", middle=" + instant2;
    }
}
