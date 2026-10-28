package b21;

import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: b21.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, m65681d2 = {"Lb21/e;", "", "", "spacerRatio", "segmentRatio", "<init>", "(FF)V", "a", "()F", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getSpacerRatio", "getSegmentRatio", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2332e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float spacerRatio;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float segmentRatio;

    public C2332e(float f13, float f14) {
        this.spacerRatio = f13;
        this.segmentRatio = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getSpacerRatio() {
        return this.spacerRatio;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getSegmentRatio() {
        return this.segmentRatio;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2332e)) {
            return false;
        }
        C2332e c2332e = (C2332e) other;
        return Float.compare(this.spacerRatio, c2332e.spacerRatio) == 0 && Float.compare(this.segmentRatio, c2332e.segmentRatio) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.segmentRatio) + (Float.hashCode(this.spacerRatio) * 31);
    }

    public String toString() {
        return AbstractC31061c.m95638n("TimeGraphRatio(spacerRatio=", this.spacerRatio, ", segmentRatio=", this.segmentRatio, ")");
    }
}
