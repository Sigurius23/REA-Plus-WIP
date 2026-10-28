package a51;

import b51.C2740d;
import b51.InterfaceC2737a;
import b51.InterfaceC2739c;
import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import z41.C40068c;

/* JADX INFO: renamed from: a51.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001\u001dB\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010%\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b'\u0010(J3\u0010)\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010&J\u0017\u0010*\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\b@\u0010AR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010,R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010,\u001a\u0004\bB\u0010.\"\u0004\bC\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\bD\u0010AR\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\bE\u0010AR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bG\u0010.R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bI\u0010AR\"\u0010M\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u00108\u001a\u0004\bK\u0010A\"\u0004\bL\u0010+R\u0016\u0010O\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00108R\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\b0\u0010S\"\u0004\bT\u0010UR\"\u0010Y\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u00108\u001a\u0004\b<\u0010A\"\u0004\bX\u0010+R$\u0010\\\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010>\u001a\u0004\b7\u0010\u001a¨\u0006^"}, m65681d2 = {"La51/h;", "", "Lb51/d;", "location", "Li2/x;", "color", "Lz41/c;", "size", "", "mass", "Lb51/c;", "shape", "", "lifespan", "", "fadeOut", "fadeOutDuration", "acceleration", "velocity", "damping", "pixelDensity", "gravityCenter", "gravityFactor", "<init>", "(Lb51/d;JLz41/c;FLb51/c;JZFLb51/d;Lb51/d;FFLb51/d;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "force", "Ll83/a0;", "a", "(Lb51/d;)V", "deltaTime", "Lb51/a;", "drawArea", "La51/e;", "emitterAnimationValues", "rotationSpeed", "j", "(FLb51/a;La51/e;F)V", "i", "(La51/e;)Z", "k", "l", "(F)V", "Lb51/d;", "e", "()Lb51/d;", "setLocation", "b", "J", "c", "()J", "Lz41/c;", "getSize", "()Lz41/c;", "d", "F", "Lb51/c;", "g", "()Lb51/c;", "f", "getLifespan", "Z", "getFadeOut", "getFadeOutDuration", "()F", "getVelocity", "setVelocity", "getDamping", "getPixelDensity", "m", "getGravityCenter", "n", "getGravityFactor", "o", "getAge", "setAge", HttpHeaders.AGE, "p", "frameRate", "", "q", "I", "()I", "setAlpha", "(I)V", "alpha", "r", "setScale", "scale", "value", "s", "drawParticle", "t", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0393h {

    /* JADX INFO: renamed from: u */
    public static final int f1356u = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C2740d location;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C40068c size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float mass;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC2739c shape;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long lifespan;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean fadeOut;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float fadeOutDuration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C2740d acceleration;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C2740d velocity;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float damping;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float pixelDensity;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C2740d gravityCenter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float gravityFactor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float age;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float frameRate;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int alpha;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float scale;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean drawParticle;

    public /* synthetic */ C0393h(C2740d c2740d, long j7, C40068c c40068c, float f13, InterfaceC2739c interfaceC2739c, long j13, boolean z4, float f14, C2740d c2740d2, C2740d c2740d3, float f15, float f16, C2740d c2740d4, float f17, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2740d, j7, c40068c, f13, interfaceC2739c, j13, z4, f14, c2740d2, c2740d3, f15, f16, c2740d4, f17);
    }

    /* JADX INFO: renamed from: i */
    private final boolean m1074i(C0390e emitterAnimationValues) {
        Float stickyRadius;
        if (emitterAnimationValues != null && (stickyRadius = emitterAnimationValues.getStickyRadius()) != null) {
            float fFloatValue = stickyRadius.floatValue();
            C2740d c2740d = this.gravityCenter;
            if (c2740d != null && c2740d.m7717f(this.location).m7716e() < fFloatValue) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private final void m1075k(float deltaTime, InterfaceC2737a drawArea, C0390e emitterAnimationValues, float rotationSpeed) {
        C2740d c2740d;
        this.frameRate = deltaTime > 0.0f ? 1.0f / deltaTime : 60.0f;
        if (this.location.getY() > drawArea.getHeight()) {
            this.alpha = 0;
            return;
        }
        if (!m1074i(emitterAnimationValues)) {
            if ((emitterAnimationValues != null ? emitterAnimationValues.getMagneticOriginAndSpeed() : null) != null) {
                C23465k magneticOriginAndSpeed = emitterAnimationValues.getMagneticOriginAndSpeed();
                C2740d c2740d2 = (C2740d) magneticOriginAndSpeed.f92937w;
                float fFloatValue = ((Number) magneticOriginAndSpeed.f92938x).floatValue();
                this.velocity.m7722k(c2740d2.getX(), c2740d2.getY());
                this.velocity.m7723l(this.location);
                this.velocity.m7718g();
                this.velocity.m7721j(fFloatValue);
            } else {
                this.velocity.m7712a(this.acceleration);
                this.velocity.m7721j(this.damping);
            }
            this.location.m7713b(this.velocity, this.frameRate * deltaTime * this.pixelDensity);
            float f13 = rotationSpeed * deltaTime;
            if (rotationSpeed != 0.0f && (c2740d = this.gravityCenter) != null) {
                this.location.m7720i(c2740d, f13);
            }
        }
        float f14 = this.age + ((long) (1000 * deltaTime));
        this.age = f14;
        if (f14 >= this.lifespan) {
            m1076l(deltaTime);
        }
        this.scale = this.size.m128412a(this.age / this.lifespan) * this.pixelDensity;
        this.drawParticle = drawArea.mo7711c((int) this.location.getX(), (int) this.location.getY());
    }

    /* JADX INFO: renamed from: l */
    private final void m1076l(float deltaTime) {
        int i13 = 0;
        if (this.fadeOut) {
            int i14 = this.alpha - ((int) ((deltaTime / this.fadeOutDuration) * 255));
            if (i14 >= 0) {
                i13 = i14;
            }
        }
        this.alpha = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m1077a(C2740d force) {
        AbstractC22676k.m65750j(force, "force");
        this.acceleration.m7713b(force, 1.0f / this.mass);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDrawParticle() {
        return this.drawParticle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C2740d getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC2739c getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1084h() {
        return this.alpha <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m1085j(float deltaTime, InterfaceC2737a drawArea, C0390e emitterAnimationValues, float rotationSpeed) {
        C2740d c2740d;
        AbstractC22676k.m65750j(drawArea, "drawArea");
        if (!m1074i(emitterAnimationValues) && (c2740d = this.gravityCenter) != null) {
            C2740d c2740d2 = new C2740d(c2740d.getX(), c2740d.getY());
            c2740d2.m7723l(this.location);
            c2740d2.m7718g();
            c2740d2.m7721j(this.gravityFactor);
            m1077a(c2740d2);
        }
        m1075k(deltaTime, drawArea, emitterAnimationValues, rotationSpeed);
    }

    private C0393h(C2740d location, long j7, C40068c size, float f13, InterfaceC2739c shape, long j13, boolean z4, float f14, C2740d acceleration, C2740d velocity, float f15, float f16, C2740d c2740d, float f17) {
        AbstractC22676k.m65750j(location, "location");
        AbstractC22676k.m65750j(size, "size");
        AbstractC22676k.m65750j(shape, "shape");
        AbstractC22676k.m65750j(acceleration, "acceleration");
        AbstractC22676k.m65750j(velocity, "velocity");
        this.location = location;
        this.color = j7;
        this.size = size;
        this.mass = f13;
        this.shape = shape;
        this.lifespan = j13;
        this.fadeOut = z4;
        this.fadeOutDuration = f14;
        this.acceleration = acceleration;
        this.velocity = velocity;
        this.damping = f15;
        this.pixelDensity = f16;
        this.gravityCenter = c2740d;
        this.gravityFactor = f17;
        this.frameRate = 60.0f;
        this.alpha = 255;
        this.drawParticle = true;
    }

    public /* synthetic */ C0393h(C2740d c2740d, long j7, C40068c c40068c, float f13, InterfaceC2739c interfaceC2739c, long j13, boolean z4, float f14, C2740d c2740d2, C2740d c2740d3, float f15, float f16, C2740d c2740d4, float f17, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2740d, j7, c40068c, f13, interfaceC2739c, (i13 & 32) != 0 ? -1L : j13, (i13 & 64) != 0 ? true : z4, (i13 & 128) != 0 ? 1.0f : f14, (i13 & 256) != 0 ? new C2740d(0.0f, 0.0f) : c2740d2, (i13 & 512) != 0 ? new C2740d(0.0f, 0.0f, 3, null) : c2740d3, f15, f16, (i13 & 4096) != 0 ? null : c2740d4, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 1.0E-5f : f17, null);
    }
}
