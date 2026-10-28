package c51;

import p000.AbstractC11266d;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: c51.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006!"}, m65681d2 = {"Lc51/q;", "", "Lkotlin/time/Duration;", "easeInDuration", "", "percentTimeInColorPulse", "colorPulseAnimationDuration", "easeOutDuration", "Li2/x;", "positivePulseColor", "negativePulseColor", "<init>", "(JFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "F", "e", "()F", "c", "d", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4240q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long easeInDuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float percentTimeInColorPulse;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long colorPulseAnimationDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long easeOutDuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long positivePulseColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long negativePulseColor;

    public /* synthetic */ C4240q(long j7, float f13, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, f13, j13, j14, j15, j16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getColorPulseAnimationDuration() {
        return this.colorPulseAnimationDuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEaseInDuration() {
        return this.easeInDuration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEaseOutDuration() {
        return this.easeOutDuration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getNegativePulseColor() {
        return this.negativePulseColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getPercentTimeInColorPulse() {
        return this.percentTimeInColorPulse;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4240q)) {
            return false;
        }
        C4240q c4240q = (C4240q) other;
        return Duration.m134267equalsimpl0(this.easeInDuration, c4240q.easeInDuration) && Float.compare(this.percentTimeInColorPulse, c4240q.percentTimeInColorPulse) == 0 && Duration.m134267equalsimpl0(this.colorPulseAnimationDuration, c4240q.colorPulseAnimationDuration) && Duration.m134267equalsimpl0(this.easeOutDuration, c4240q.easeOutDuration) && C17919x.m51542d(this.positivePulseColor, c4240q.positivePulseColor) && C17919x.m51542d(this.negativePulseColor, c4240q.negativePulseColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getPositivePulseColor() {
        return this.positivePulseColor;
    }

    public int hashCode() {
        int iM134283hashCodeimpl = (Duration.m134283hashCodeimpl(this.easeOutDuration) + ((Duration.m134283hashCodeimpl(this.colorPulseAnimationDuration) + AbstractC11266d.m30447a(this.percentTimeInColorPulse, Duration.m134283hashCodeimpl(this.easeInDuration) * 31, 31)) * 31)) * 31;
        long j7 = this.positivePulseColor;
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.negativePulseColor) + AbstractC11266d.m30451e(iM134283hashCodeimpl, j7, 31);
    }

    public String toString() {
        String strM134302toStringimpl = Duration.m134302toStringimpl(this.easeInDuration);
        float f13 = this.percentTimeInColorPulse;
        String strM134302toStringimpl2 = Duration.m134302toStringimpl(this.colorPulseAnimationDuration);
        String strM134302toStringimpl3 = Duration.m134302toStringimpl(this.easeOutDuration);
        String strM51548j = C17919x.m51548j(this.positivePulseColor);
        String strM51548j2 = C17919x.m51548j(this.negativePulseColor);
        StringBuilder sb4 = new StringBuilder("AmoebaTransitionSettings(easeInDuration=");
        sb4.append(strM134302toStringimpl);
        sb4.append(", percentTimeInColorPulse=");
        sb4.append(f13);
        sb4.append(", colorPulseAnimationDuration=");
        AbstractC11266d.m30444B(sb4, strM134302toStringimpl2, ", easeOutDuration=", strM134302toStringimpl3, ", positivePulseColor=");
        return AbstractC11266d.m30464r(sb4, strM51548j, ", negativePulseColor=", strM51548j2, ")");
    }

    private C4240q(long j7, float f13, long j13, long j14, long j15, long j16) {
        this.easeInDuration = j7;
        this.percentTimeInColorPulse = f13;
        this.colorPulseAnimationDuration = j13;
        this.easeOutDuration = j14;
        this.positivePulseColor = j15;
        this.negativePulseColor = j16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4240q(long j7, float f13, long j13, long j14, long j15, long j16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        long duration;
        long duration2;
        long duration3;
        if ((i13 & 1) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            duration = DurationKt.toDuration(1.8d, DurationUnit.SECONDS);
        } else {
            duration = j7;
        }
        float f14 = (i13 & 2) != 0 ? 0.8f : f13;
        if ((i13 & 4) != 0) {
            Duration.Companion companion2 = Duration.INSTANCE;
            duration2 = DurationKt.toDuration(1.3d, DurationUnit.SECONDS);
        } else {
            duration2 = j13;
        }
        if ((i13 & 8) != 0) {
            Duration.Companion companion3 = Duration.INSTANCE;
            duration3 = DurationKt.toDuration(2, DurationUnit.SECONDS);
        } else {
            duration3 = j14;
        }
        this(duration, f14, duration2, duration3, (i13 & 16) != 0 ? AbstractC17918w0.m51517e(4278251935L) : j15, (i13 & 32) != 0 ? AbstractC17918w0.m51517e(4294944546L) : j16, null);
    }
}
