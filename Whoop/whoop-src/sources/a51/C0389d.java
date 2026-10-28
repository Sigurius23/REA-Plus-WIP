package a51;

import b51.C2740d;
import b51.InterfaceC2737a;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z41.AbstractC40073h;
import z41.AbstractC40076k;

/* JADX INFO: renamed from: a51.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"La51/d;", "", "La51/g;", "magneticAnimation", "La51/c;", "stickyRadiusAnimation", "<init>", "(La51/g;La51/c;)V", "", "emitterAge", "Lb51/a;", "drawArea", "La51/e;", "a", "(FLb51/a;)La51/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "La51/g;", "getMagneticAnimation", "()La51/g;", "b", "La51/c;", "getStickyRadiusAnimation", "()La51/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0389d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C0392g magneticAnimation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C0388c stickyRadiusAnimation;

    public C0389d(C0392g c0392g, C0388c c0388c) {
        this.magneticAnimation = c0392g;
        this.stickyRadiusAnimation = c0388c;
    }

    /* JADX INFO: renamed from: a */
    public final C0390e m1063a(float emitterAge, InterfaceC2737a drawArea) {
        C23465k c23465k;
        C0388c speedAttribute;
        Float fM1062a;
        AbstractC22676k.m65750j(drawArea, "drawArea");
        C0392g c0392g = this.magneticAnimation;
        if (c0392g == null || (speedAttribute = c0392g.getSpeedAttribute()) == null || (fM1062a = speedAttribute.m1062a(emitterAge)) == null) {
            c23465k = null;
        } else {
            float fFloatValue = fM1062a.floatValue();
            AbstractC40076k.a aVarM128447a = AbstractC40073h.m128447a(this.magneticAnimation.getCom.stripe.android.core.networking.AnalyticsRequestV2.HEADER_ORIGIN java.lang.String(), drawArea);
            c23465k = new C23465k(new C2740d(aVarM128447a.getX(), aVarM128447a.getY()), Float.valueOf(fFloatValue));
        }
        C0388c c0388c = this.stickyRadiusAnimation;
        return new C0390e(c23465k, c0388c != null ? c0388c.m1062a(emitterAge) : null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0389d)) {
            return false;
        }
        C0389d c0389d = (C0389d) other;
        return AbstractC22676k.m65745e(this.magneticAnimation, c0389d.magneticAnimation) && AbstractC22676k.m65745e(this.stickyRadiusAnimation, c0389d.stickyRadiusAnimation);
    }

    public int hashCode() {
        C0392g c0392g = this.magneticAnimation;
        int iHashCode = (c0392g == null ? 0 : c0392g.hashCode()) * 31;
        C0388c c0388c = this.stickyRadiusAnimation;
        return iHashCode + (c0388c != null ? c0388c.hashCode() : 0);
    }

    public String toString() {
        return "EmitterAnimationConfig(magneticAnimation=" + this.magneticAnimation + ", stickyRadiusAnimation=" + this.stickyRadiusAnimation + ")";
    }
}
