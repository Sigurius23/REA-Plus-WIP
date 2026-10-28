package cz0;

import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: cz0.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lcz0/q;", "", "", "bottomPercent", "topPercent", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11256q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float bottomPercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float topPercent;

    public C11256q(float f13, float f14) {
        this.bottomPercent = f13;
        this.topPercent = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBottomPercent() {
        return this.bottomPercent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getTopPercent() {
        return this.topPercent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11256q)) {
            return false;
        }
        C11256q c11256q = (C11256q) other;
        return Float.compare(this.bottomPercent, c11256q.bottomPercent) == 0 && Float.compare(this.topPercent, c11256q.topPercent) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.topPercent) + (Float.hashCode(this.bottomPercent) * 31);
    }

    public String toString() {
        return AbstractC31061c.m95638n("ScrubLineExclusionBounds(bottomPercent=", this.bottomPercent, ", topPercent=", this.topPercent, ")");
    }
}
