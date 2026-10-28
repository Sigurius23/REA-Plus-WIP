package t81;

import e93.AbstractC12889b;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: t81.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lt81/b;", "", "", "animationDuration", "<init>", "(F)V", "time", "b", "(F)F", "start", "target", "c", "(FFF)F", "startZoom", "targetZoom", "", "startOffset", "targetOffset", "", "currentTime", "startTime", "Lt81/c;", "a", "(FFIIJJ)Lt81/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getAnimationDuration", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33596b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float animationDuration;

    public C33596b(float f13) {
        this.animationDuration = f13;
    }

    /* JADX INFO: renamed from: b */
    private final float m106104b(float time) {
        float f13 = 1.0f - time;
        return 1.0f - (f13 * f13);
    }

    /* JADX INFO: renamed from: c */
    private final float m106105c(float start, float target, float time) {
        return AbstractC2875y.m8288a(target, start, time, start);
    }

    /* JADX INFO: renamed from: a */
    public final C33597c m106106a(float startZoom, float targetZoom, int startOffset, int targetOffset, long currentTime, long startTime) {
        float f13 = startTime;
        float f14 = this.animationDuration;
        float f15 = f13 + f14;
        float f16 = currentTime;
        float fM106104b = m106104b(AbstractC12889b.m36283m((f16 - f13) / f14, 0.0f, 1.0f));
        return new C33597c(m106105c(startOffset, targetOffset, fM106104b), m106105c(startZoom, targetZoom, fM106104b), f16 >= f15);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C33596b) && Float.compare(this.animationDuration, ((C33596b) other).animationDuration) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.animationDuration);
    }

    public String toString() {
        return "HorizontalZoomInterpolator(animationDuration=" + this.animationDuration + ")";
    }
}
