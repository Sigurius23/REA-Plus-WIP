package c51;

import p000.AbstractC11266d;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;

/* JADX INFO: renamed from: c51.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001e¨\u0006&"}, m65681d2 = {"Lc51/r;", "", "Lc51/p;", "type", "Lkotlin/time/Duration;", "easeInDuration", "easeOutDuration", "Li2/x;", "pulseColor", "", "percentTimeInColorPulse", "colorPulseAnimationDuration", "<init>", "(Lc51/p;JJJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc51/p;", "d", "()Lc51/p;", "b", "J", "()J", "c", "getEaseOutDuration-UwyO8pc", "e", "F", "()F", "f", "getColorPulseAnimationDuration-UwyO8pc", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4241r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC4239p type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long easeInDuration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long easeOutDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long pulseColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float percentTimeInColorPulse;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long colorPulseAnimationDuration;

    public /* synthetic */ C4241r(EnumC4239p enumC4239p, long j7, long j13, long j14, float f13, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4239p, j7, j13, j14, f13, j15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEaseInDuration() {
        return this.easeInDuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getPercentTimeInColorPulse() {
        return this.percentTimeInColorPulse;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPulseColor() {
        return this.pulseColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC4239p getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4241r)) {
            return false;
        }
        C4241r c4241r = (C4241r) other;
        return this.type == c4241r.type && Duration.m134267equalsimpl0(this.easeInDuration, c4241r.easeInDuration) && Duration.m134267equalsimpl0(this.easeOutDuration, c4241r.easeOutDuration) && C17919x.m51542d(this.pulseColor, c4241r.pulseColor) && Float.compare(this.percentTimeInColorPulse, c4241r.percentTimeInColorPulse) == 0 && Duration.m134267equalsimpl0(this.colorPulseAnimationDuration, c4241r.colorPulseAnimationDuration);
    }

    public int hashCode() {
        int iM134283hashCodeimpl = (Duration.m134283hashCodeimpl(this.easeOutDuration) + ((Duration.m134283hashCodeimpl(this.easeInDuration) + (this.type.hashCode() * 31)) * 31)) * 31;
        long j7 = this.pulseColor;
        int i13 = C17919x.f69638o;
        return Duration.m134283hashCodeimpl(this.colorPulseAnimationDuration) + AbstractC11266d.m30447a(this.percentTimeInColorPulse, AbstractC11266d.m30451e(iM134283hashCodeimpl, j7, 31), 31);
    }

    public String toString() {
        EnumC4239p enumC4239p = this.type;
        String strM134302toStringimpl = Duration.m134302toStringimpl(this.easeInDuration);
        String strM134302toStringimpl2 = Duration.m134302toStringimpl(this.easeOutDuration);
        String strM51548j = C17919x.m51548j(this.pulseColor);
        float f13 = this.percentTimeInColorPulse;
        String strM134302toStringimpl3 = Duration.m134302toStringimpl(this.colorPulseAnimationDuration);
        StringBuilder sb4 = new StringBuilder("AmoebaTransitionViewState(type=");
        sb4.append(enumC4239p);
        sb4.append(", easeInDuration=");
        sb4.append(strM134302toStringimpl);
        sb4.append(", easeOutDuration=");
        AbstractC11266d.m30444B(sb4, strM134302toStringimpl2, ", pulseColor=", strM51548j, ", percentTimeInColorPulse=");
        sb4.append(f13);
        sb4.append(", colorPulseAnimationDuration=");
        sb4.append(strM134302toStringimpl3);
        sb4.append(")");
        return sb4.toString();
    }

    private C4241r(EnumC4239p type, long j7, long j13, long j14, float f13, long j15) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.easeInDuration = j7;
        this.easeOutDuration = j13;
        this.pulseColor = j14;
        this.percentTimeInColorPulse = f13;
        this.colorPulseAnimationDuration = j15;
    }
}
