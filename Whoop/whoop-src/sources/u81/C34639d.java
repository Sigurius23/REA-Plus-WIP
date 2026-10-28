package u81;

import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: u81.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lu81/d;", "", "", "start", "end", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34639d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float end;

    public C34639d(float f13, float f14) {
        this.start = f13;
        this.end = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34639d)) {
            return false;
        }
        C34639d c34639d = (C34639d) other;
        return Float.compare(this.start, c34639d.start) == 0 && Float.compare(this.end, c34639d.end) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.end) + (Float.hashCode(this.start) * 31);
    }

    public String toString() {
        return AbstractC31061c.m95638n("ZoomTargets(start=", this.start, ", end=", this.end, ")");
    }
}
