package t81;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: t81.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lt81/s;", "", "", "defaultZoomLevel", "minZoomLevel", "maxZoomLevel", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getDefaultZoomLevel", "()F", "b", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33613s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float defaultZoomLevel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float minZoomLevel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float maxZoomLevel;

    public C33613s(float f13, float f14, float f15) {
        this.defaultZoomLevel = f13;
        this.minZoomLevel = f14;
        this.maxZoomLevel = f15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getMaxZoomLevel() {
        return this.maxZoomLevel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getMinZoomLevel() {
        return this.minZoomLevel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33613s)) {
            return false;
        }
        C33613s c33613s = (C33613s) other;
        return Float.compare(this.defaultZoomLevel, c33613s.defaultZoomLevel) == 0 && Float.compare(this.minZoomLevel, c33613s.minZoomLevel) == 0 && Float.compare(this.maxZoomLevel, c33613s.maxZoomLevel) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.maxZoomLevel) + AbstractC11266d.m30447a(this.minZoomLevel, Float.hashCode(this.defaultZoomLevel) * 31, 31);
    }

    public String toString() {
        return AbstractC30007c.m91837g(this.maxZoomLevel, ")", AbstractC2875y.m8307t("ZoomableGraphZoomLevelState(defaultZoomLevel=", this.defaultZoomLevel, ", minZoomLevel=", this.minZoomLevel, ", maxZoomLevel="));
    }

    public /* synthetic */ C33613s(float f13, float f14, float f15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1.0f : f13, (i13 & 2) != 0 ? 1.0f : f14, (i13 & 4) != 0 ? 5.0f : f15);
    }
}
