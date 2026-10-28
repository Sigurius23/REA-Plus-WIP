package a51;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;

/* JADX INFO: renamed from: a51.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m65681d2 = {"La51/f;", "", "Lkotlin/time/Duration;", "emittingTime", "", "particlesPerSecond", "La51/d;", "animations", "<init>", "(Lkotlin/time/Duration;FLa51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "f", "()F", "a", "(Lkotlin/time/Duration;FLa51/d;)La51/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/time/Duration;", "d", "()Lkotlin/time/Duration;", "b", "F", "e", "c", "La51/d;", "()La51/d;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0391f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Duration emittingTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float particlesPerSecond;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C0389d animations;

    public /* synthetic */ C0391f(Duration duration, float f13, C0389d c0389d, DefaultConstructorMarker defaultConstructorMarker) {
        this(duration, f13, c0389d);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0391f m1066b(C0391f c0391f, Duration duration, float f13, C0389d c0389d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            duration = c0391f.emittingTime;
        }
        if ((i13 & 2) != 0) {
            f13 = c0391f.particlesPerSecond;
        }
        if ((i13 & 4) != 0) {
            c0389d = c0391f.animations;
        }
        return c0391f.m1067a(duration, f13, c0389d);
    }

    /* JADX INFO: renamed from: a */
    public final C0391f m1067a(Duration emittingTime, float particlesPerSecond, C0389d animations) {
        return new C0391f(emittingTime, particlesPerSecond, animations, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C0389d getAnimations() {
        return this.animations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Duration getEmittingTime() {
        return this.emittingTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getParticlesPerSecond() {
        return this.particlesPerSecond;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0391f)) {
            return false;
        }
        C0391f c0391f = (C0391f) other;
        return AbstractC22676k.m65745e(this.emittingTime, c0391f.emittingTime) && Float.compare(this.particlesPerSecond, c0391f.particlesPerSecond) == 0 && AbstractC22676k.m65745e(this.animations, c0391f.animations);
    }

    /* JADX INFO: renamed from: f */
    public final float m1071f() {
        return 1.0f / this.particlesPerSecond;
    }

    public int hashCode() {
        Duration duration = this.emittingTime;
        int iM30447a = AbstractC11266d.m30447a(this.particlesPerSecond, (duration == null ? 0 : Duration.m134283hashCodeimpl(duration.getRawValue())) * 31, 31);
        C0389d c0389d = this.animations;
        return iM30447a + (c0389d != null ? c0389d.hashCode() : 0);
    }

    public String toString() {
        return "EmitterConfig(emittingTime=" + this.emittingTime + ", particlesPerSecond=" + this.particlesPerSecond + ", animations=" + this.animations + ")";
    }

    private C0391f(Duration duration, float f13, C0389d c0389d) {
        this.emittingTime = duration;
        this.particlesPerSecond = f13;
        this.animations = c0389d;
    }

    public /* synthetic */ C0391f(Duration duration, float f13, C0389d c0389d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(duration, f13, (i13 & 4) != 0 ? null : c0389d, null);
    }
}
