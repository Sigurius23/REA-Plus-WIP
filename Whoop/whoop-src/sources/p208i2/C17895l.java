package p208i2;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: i2.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C17895l {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f69597a;

    public C17895l(PathMeasure pathMeasure) {
        this.f69597a = pathMeasure;
    }

    /* JADX INFO: renamed from: a */
    public final float m51468a() {
        return this.f69597a.getLength();
    }

    /* JADX INFO: renamed from: b */
    public final void m51469b(float f13, float f14, C17891j c17891j) {
        if (c17891j == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f69597a.getSegment(f13, f14, c17891j.f69587a, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m51470c(C17891j c17891j) {
        this.f69597a.setPath(c17891j != null ? c17891j.f69587a : null, false);
    }
}
