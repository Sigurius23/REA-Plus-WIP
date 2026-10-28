package cp0;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: cp0.h1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcp0/h1;", "", "", "topPx", "heightPx", "fullStrengthFraction", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "c", "()F", "b", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C10964h1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float topPx;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float heightPx;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float fullStrengthFraction;

    public C10964h1(float f13, float f14, float f15) {
        this.topPx = f13;
        this.heightPx = f14;
        this.fullStrengthFraction = f15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getFullStrengthFraction() {
        return this.fullStrengthFraction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getHeightPx() {
        return this.heightPx;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getTopPx() {
        return this.topPx;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10964h1)) {
            return false;
        }
        C10964h1 c10964h1 = (C10964h1) other;
        return Float.compare(this.topPx, c10964h1.topPx) == 0 && Float.compare(this.heightPx, c10964h1.heightPx) == 0 && Float.compare(this.fullStrengthFraction, c10964h1.fullStrengthFraction) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.fullStrengthFraction) + AbstractC11266d.m30447a(this.heightPx, Float.hashCode(this.topPx) * 31, 31);
    }

    public String toString() {
        return AbstractC30007c.m91837g(this.fullStrengthFraction, ")", AbstractC2875y.m8307t("ImeScrimGeometry(topPx=", this.topPx, ", heightPx=", this.heightPx, ", fullStrengthFraction="));
    }
}
