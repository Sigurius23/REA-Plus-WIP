package a51;

import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a51.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"La51/e;", "", "Ll83/k;", "Lb51/d;", "", "magneticOriginAndSpeed", "stickyRadius", "<init>", "(Ll83/k;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll83/k;", "()Ll83/k;", "b", "Ljava/lang/Float;", "()Ljava/lang/Float;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0390e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23465k magneticOriginAndSpeed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Float stickyRadius;

    public C0390e(C23465k c23465k, Float f13) {
        this.magneticOriginAndSpeed = c23465k;
        this.stickyRadius = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23465k getMagneticOriginAndSpeed() {
        return this.magneticOriginAndSpeed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getStickyRadius() {
        return this.stickyRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0390e)) {
            return false;
        }
        C0390e c0390e = (C0390e) other;
        return AbstractC22676k.m65745e(this.magneticOriginAndSpeed, c0390e.magneticOriginAndSpeed) && AbstractC22676k.m65745e(this.stickyRadius, c0390e.stickyRadius);
    }

    public int hashCode() {
        C23465k c23465k = this.magneticOriginAndSpeed;
        int iHashCode = (c23465k == null ? 0 : c23465k.hashCode()) * 31;
        Float f13 = this.stickyRadius;
        return iHashCode + (f13 != null ? f13.hashCode() : 0);
    }

    public String toString() {
        return "EmitterAnimationValues(magneticOriginAndSpeed=" + this.magneticOriginAndSpeed + ", stickyRadius=" + this.stickyRadius + ")";
    }
}
