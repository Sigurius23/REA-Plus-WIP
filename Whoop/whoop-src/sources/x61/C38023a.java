package x61;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: x61.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lx61/a;", "", "", "isEnabled", "", "parentWidth", "<init>", "(ZF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38023a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float parentWidth;

    public C38023a(boolean z4, float f13) {
        this.isEnabled = z4;
        this.parentWidth = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getParentWidth() {
        return this.parentWidth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38023a)) {
            return false;
        }
        C38023a c38023a = (C38023a) other;
        return this.isEnabled == c38023a.isEnabled && Float.compare(this.parentWidth, c38023a.parentWidth) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.parentWidth) + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public String toString() {
        return "OverlayDynamicGrouping(isEnabled=" + this.isEnabled + ", parentWidth=" + this.parentWidth + ")";
    }

    public /* synthetic */ C38023a(boolean z4, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? 0.0f : f13);
    }
}
