package xq2;

import i91.AbstractC18247a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xq2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lxq2/h;", "", "", "fillPercentage", "Li91/a;", "background", "<init>", "(FLi91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "Li91/a;", "()Li91/a;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38567h {

    /* JADX INFO: renamed from: c */
    public static final int f165994c = AbstractC18247a.f71043a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float fillPercentage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC18247a background;

    public C38567h(float f13, AbstractC18247a background) {
        AbstractC22676k.m65750j(background, "background");
        this.fillPercentage = f13;
        this.background = background;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC18247a getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38567h)) {
            return false;
        }
        C38567h c38567h = (C38567h) other;
        return Float.compare(this.fillPercentage, c38567h.fillPercentage) == 0 && AbstractC22676k.m65745e(this.background, c38567h.background);
    }

    public int hashCode() {
        return this.background.hashCode() + (Float.hashCode(this.fillPercentage) * 31);
    }

    public String toString() {
        return "ComparisonBarState(fillPercentage=" + this.fillPercentage + ", background=" + this.background + ")";
    }
}
