package ok2;

import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ok2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lok2/d;", "", "", "fillFraction", "Lok2/j;", "timeLabel", "", "isReached", "showDashes", "<init>", "(FLok2/j;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Lok2/j;", "c", "()Lok2/j;", "Z", "d", "()Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27998d {

    /* JADX INFO: renamed from: e */
    public static final int f112907e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float fillFraction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28004j timeLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isReached;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showDashes;

    public C27998d(float f13, C28004j timeLabel, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(timeLabel, "timeLabel");
        this.fillFraction = f13;
        this.timeLabel = timeLabel;
        this.isReached = z4;
        this.showDashes = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getFillFraction() {
        return this.fillFraction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowDashes() {
        return this.showDashes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C28004j getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsReached() {
        return this.isReached;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27998d)) {
            return false;
        }
        C27998d c27998d = (C27998d) other;
        return Float.compare(this.fillFraction, c27998d.fillFraction) == 0 && AbstractC22676k.m65745e(this.timeLabel, c27998d.timeLabel) && this.isReached == c27998d.isReached && this.showDashes == c27998d.showDashes;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showDashes) + AbstractC2875y.m8289b((this.timeLabel.hashCode() + (Float.hashCode(this.fillFraction) * 31)) * 31, 31, this.isReached);
    }

    public String toString() {
        float f13 = this.fillFraction;
        C28004j c28004j = this.timeLabel;
        boolean z4 = this.isReached;
        boolean z13 = this.showDashes;
        StringBuilder sb4 = new StringBuilder("HrZoneGoalState(fillFraction=");
        sb4.append(f13);
        sb4.append(", timeLabel=");
        sb4.append(c28004j);
        sb4.append(", isReached=");
        return AbstractC36095b.m114682j(sb4, z4, ", showDashes=", z13, ")");
    }
}
