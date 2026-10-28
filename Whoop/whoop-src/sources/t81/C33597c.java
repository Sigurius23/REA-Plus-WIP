package t81;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: t81.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lt81/c;", "", "", "contentOffset", "zoomLevel", "", "finished", "<init>", "(FFZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "c", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33597c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float contentOffset;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float zoomLevel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean finished;

    public C33597c(float f13, float f14, boolean z4) {
        this.contentOffset = f13;
        this.zoomLevel = f14;
        this.finished = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getContentOffset() {
        return this.contentOffset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getZoomLevel() {
        return this.zoomLevel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33597c)) {
            return false;
        }
        C33597c c33597c = (C33597c) other;
        return Float.compare(this.contentOffset, c33597c.contentOffset) == 0 && Float.compare(this.zoomLevel, c33597c.zoomLevel) == 0 && this.finished == c33597c.finished;
    }

    public int hashCode() {
        return Boolean.hashCode(this.finished) + AbstractC11266d.m30447a(this.zoomLevel, Float.hashCode(this.contentOffset) * 31, 31);
    }

    public String toString() {
        float f13 = this.contentOffset;
        float f14 = this.zoomLevel;
        return AbstractC18489d0.m53372m(AbstractC2875y.m8307t("HorizontalZoomInterpolatorResult(contentOffset=", f13, ", zoomLevel=", f14, ", finished="), this.finished, ")");
    }
}
