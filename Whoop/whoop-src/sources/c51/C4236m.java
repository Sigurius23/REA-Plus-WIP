package c51;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import z41.C40072g;

/* JADX INFO: renamed from: c51.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lc51/m;", "", "Lz41/g;", "particleSystemSettings", "", "rotationAnimationSpeed", "<init>", "(Lz41/g;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz41/g;", "()Lz41/g;", "b", "F", "getRotationAnimationSpeed", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4236m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C40072g particleSystemSettings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float rotationAnimationSpeed;

    public C4236m(C40072g particleSystemSettings, float f13) {
        AbstractC22676k.m65750j(particleSystemSettings, "particleSystemSettings");
        this.particleSystemSettings = particleSystemSettings;
        this.rotationAnimationSpeed = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C40072g getParticleSystemSettings() {
        return this.particleSystemSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4236m)) {
            return false;
        }
        C4236m c4236m = (C4236m) other;
        return AbstractC22676k.m65745e(this.particleSystemSettings, c4236m.particleSystemSettings) && Float.compare(this.rotationAnimationSpeed, c4236m.rotationAnimationSpeed) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.rotationAnimationSpeed) + (this.particleSystemSettings.hashCode() * 31);
    }

    public String toString() {
        return "AmoebaParticleViewState(particleSystemSettings=" + this.particleSystemSettings + ", rotationAnimationSpeed=" + this.rotationAnimationSpeed + ")";
    }

    public /* synthetic */ C4236m(C40072g c40072g, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C40072g(0, 0, 0.0f, 0.0f, 0.0f, null, null, null, 0L, false, 0.0f, null, 0.0f, 0, 0.0f, null, null, 0.0f, 262143, null) : c40072g, (i13 & 2) != 0 ? 30.0f : f13);
    }
}
