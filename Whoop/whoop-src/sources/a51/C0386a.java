package a51;

import b51.C2740d;
import b51.InterfaceC2737a;
import b51.InterfaceC2739c;
import g93.AbstractC15612d;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import z41.AbstractC40073h;
import z41.AbstractC40076k;
import z41.C40068c;
import z41.C40072g;

/* JADX INFO: renamed from: a51.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\"B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010)R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010)¨\u00060"}, m65681d2 = {"La51/a;", "La51/b;", "La51/f;", "emitterConfig", "", "pixelDensity", "Lg93/d;", "random", "<init>", "(La51/f;FLg93/d;)V", "Lz41/g;", "particleSystemSettings", "Lb51/a;", "drawArea", "La51/h;", "c", "(Lz41/g;Lb51/a;)La51/h;", "g", "(Lz41/g;)F", "Lb51/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lz41/g;)Lb51/d;", "", "d", "(Lz41/g;)D", "", "Lb51/c;", "shapes", "f", "(Ljava/util/List;)Lb51/c;", "", "i", "()Z", "deltaTime", "a", "(FLz41/g;Lb51/a;)Ljava/util/List;", "radius", "e", "(FLb51/a;)Lb51/d;", "b", "La51/f;", "F", "Lg93/d;", "", "I", "particlesCreated", "elapsedTime", "createParticleMs", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0386a extends AbstractC0387b {

    /* JADX INFO: renamed from: h */
    public static final int f1335h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C0391f emitterConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float pixelDensity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC15612d random;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int particlesCreated;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float elapsedTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float createParticleMs;

    public C0386a(C0391f emitterConfig, float f13, AbstractC15612d random) {
        AbstractC22676k.m65750j(emitterConfig, "emitterConfig");
        AbstractC22676k.m65750j(random, "random");
        this.emitterConfig = emitterConfig;
        this.pixelDensity = f13;
        this.random = random;
    }

    /* JADX INFO: renamed from: c */
    private final C0393h m1053c(C40072g particleSystemSettings, InterfaceC2737a drawArea) {
        AbstractC40076k.a aVarM128447a;
        this.particlesCreated++;
        C2740d c2740dM1061e = m1061e(particleSystemSettings.getRadius(), drawArea);
        AbstractC40076k.a aVarM128447a2 = AbstractC40073h.m128447a(particleSystemSettings.getPosition(), drawArea);
        C2740d c2740dM7719h = new C2740d(aVarM128447a2.getX(), aVarM128447a2.getY()).m7719h(c2740dM1061e);
        C40068c c40068cM128426e = particleSystemSettings.getSize().m128426e();
        InterfaceC2739c interfaceC2739cM1055f = m1055f(particleSystemSettings.m128442p());
        long j7 = particleSystemSettings.m128430d().get(this.random.mo43929g(particleSystemSettings.m128430d().size())).f69639a;
        long timeToLive = particleSystemSettings.getTimeToLive();
        boolean fadeOutEnabled = particleSystemSettings.getFadeOutEnabled();
        float fadeOutDuration = particleSystemSettings.getFadeOutDuration();
        C2740d c2740dM1057h = m1057h(particleSystemSettings);
        float damping = particleSystemSettings.getDamping();
        float f13 = this.pixelDensity;
        AbstractC40076k gravityCenter = particleSystemSettings.getGravityCenter();
        return new C0393h(c2740dM7719h, j7, c40068cM128426e, 1.0f, interfaceC2739cM1055f, timeToLive, fadeOutEnabled, fadeOutDuration, null, c2740dM1057h, damping, f13, (gravityCenter == null || (aVarM128447a = AbstractC40073h.m128447a(gravityCenter, drawArea)) == null) ? null : new C2740d(aVarM128447a.getX(), aVarM128447a.getY()), particleSystemSettings.getGravityFactor(), 256, null);
    }

    /* JADX INFO: renamed from: d */
    private final double m1054d(C40072g c40072g) {
        if (c40072g.getSpread() == 0) {
            return c40072g.getAngle();
        }
        int angle = c40072g.getAngle() - (c40072g.getSpread() / 2);
        return (this.random.mo43926b() * ((double) (((c40072g.getSpread() / 2) + c40072g.getAngle()) - angle))) + ((double) angle);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC2739c m1055f(List<? extends InterfaceC2739c> shapes) {
        return shapes.get(this.random.mo43929g(shapes.size()));
    }

    /* JADX INFO: renamed from: g */
    private final float m1056g(C40072g c40072g) {
        if (c40072g.getMaxSpeed() == -1.0f) {
            return c40072g.getSpeed();
        }
        return c40072g.getSpeed() + (this.random.mo43927e() * (c40072g.getMaxSpeed() - c40072g.getSpeed()));
    }

    /* JADX INFO: renamed from: h */
    private final C2740d m1057h(C40072g c40072g) {
        float fM1056g = m1056g(c40072g);
        double radians = Math.toRadians(m1054d(c40072g));
        return new C2740d(((float) Math.cos(radians)) * fM1056g, fM1056g * ((float) Math.sin(radians)));
    }

    /* JADX INFO: renamed from: i */
    private final boolean m1058i() {
        return (this.emitterConfig.getEmittingTime() == null || Duration.m134273getInWholeMillisecondsimpl(this.emitterConfig.getEmittingTime().getRawValue()) == 0 || this.elapsedTime < ((float) Duration.m134273getInWholeMillisecondsimpl(this.emitterConfig.getEmittingTime().getRawValue()))) ? false : true;
    }

    @Override // a51.AbstractC0387b
    /* JADX INFO: renamed from: a */
    public List<C0393h> mo1059a(float deltaTime, C40072g particleSystemSettings, InterfaceC2737a drawArea) {
        List<C0393h> arrayList;
        AbstractC22676k.m65750j(particleSystemSettings, "particleSystemSettings");
        AbstractC22676k.m65750j(drawArea, "drawArea");
        this.createParticleMs += deltaTime;
        Duration emittingTime = this.emitterConfig.getEmittingTime();
        double dM134298toDoubleimpl = emittingTime != null ? Duration.m134298toDoubleimpl(emittingTime.getRawValue(), DurationUnit.MILLISECONDS) : Double.MAX_VALUE;
        if (this.elapsedTime == 0.0f && deltaTime > dM134298toDoubleimpl) {
            this.createParticleMs = (float) dM134298toDoubleimpl;
        }
        if (this.createParticleMs < this.emitterConfig.m1071f() || m1058i()) {
            arrayList = C25271y.f99162w;
        } else {
            int iM1071f = (int) (this.createParticleMs / this.emitterConfig.m1071f());
            if (iM1071f > 10) {
                iM1071f = 10;
            }
            C18284j c18284j = new C18284j(1, iM1071f, 1);
            arrayList = new ArrayList<>(AbstractC25267u.m74163i0(c18284j, 10));
            Iterator it = c18284j.iterator();
            while (it.hasNext()) {
                ((AbstractC25243e0) it).nextInt();
                arrayList.add(m1053c(particleSystemSettings, drawArea));
            }
            this.createParticleMs %= this.emitterConfig.m1071f();
        }
        this.elapsedTime = (deltaTime * 1000) + this.elapsedTime;
        return arrayList;
    }

    @Override // a51.AbstractC0387b
    /* JADX INFO: renamed from: b */
    public boolean mo1060b() {
        return this.emitterConfig.getEmittingTime() != null && this.elapsedTime >= ((float) Duration.m134273getInWholeMillisecondsimpl(this.emitterConfig.getEmittingTime().getRawValue()));
    }

    /* JADX INFO: renamed from: e */
    public final C2740d m1061e(float radius, InterfaceC2737a drawArea) {
        AbstractC22676k.m65750j(drawArea, "drawArea");
        if (radius <= 0.0f) {
            return new C2740d(0.0f, 0.0f);
        }
        int width = (int) (drawArea.getWidth() * radius);
        int height = (int) (drawArea.getHeight() * radius);
        if (height <= 0 || width <= 0) {
            return new C2740d(0.0f, 0.0f);
        }
        float f13 = 2;
        return new C2740d(this.random.mo43929g(width) - (width / f13), this.random.mo43929g(height) - (height / f13));
    }

    public /* synthetic */ C0386a(C0391f c0391f, float f13, AbstractC15612d abstractC15612d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0391f, f13, (i13 & 4) != 0 ? AbstractC15612d.f58612w : abstractC15612d);
    }
}
