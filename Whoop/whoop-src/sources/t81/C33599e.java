package t81;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: t81.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lt81/e;", "", "", "zoomInLevel", "zoomOutLevel", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33599e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float zoomInLevel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float zoomOutLevel;

    public C33599e(float f13, float f14) {
        this.zoomInLevel = f13;
        this.zoomOutLevel = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getZoomInLevel() {
        return this.zoomInLevel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getZoomOutLevel() {
        return this.zoomOutLevel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33599e)) {
            return false;
        }
        C33599e c33599e = (C33599e) other;
        return Float.compare(this.zoomInLevel, c33599e.zoomInLevel) == 0 && Float.compare(this.zoomOutLevel, c33599e.zoomOutLevel) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.zoomOutLevel) + (Float.hashCode(this.zoomInLevel) * 31);
    }

    public String toString() {
        return AbstractC31061c.m95638n("ZoomToggleState(zoomInLevel=", this.zoomInLevel, ", zoomOutLevel=", this.zoomOutLevel, ")");
    }

    public /* synthetic */ C33599e(float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 2.0f : f13, (i13 & 2) != 0 ? 1.0f : f14);
    }
}
