package z41;

import a51.C0391f;
import androidx.profileinstaller.ProfileVerifier;
import b51.InterfaceC2739c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: z41.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJÒ\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001d\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b+\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b3\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b1\u0010:R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010:R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b=\u0010CR\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bD\u0010.\u001a\u0004\b;\u00100R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b2\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bH\u00100R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010*\u001a\u0004\b4\u0010&R\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bI\u0010.\u001a\u0004\bI\u00100R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b<\u0010J\u001a\u0004\b8\u0010KR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b6\u0010E\u001a\u0004\bA\u0010GR\u0017\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\bD\u00100¨\u0006L"}, m65681d2 = {"Lz41/g;", "", "", "angle", "spread", "", "speed", "maxSpeed", "damping", "Lz41/f;", "size", "", "Li2/x;", "colors", "Lb51/c;", "shapes", "", "timeToLive", "", "fadeOutEnabled", "fadeOutDuration", "Lz41/k;", "position", "radius", "delay", "rotationSpeed", "La51/f;", "emitter", "gravityCenter", "gravityFactor", "<init>", "(IIFFFLz41/f;Ljava/util/List;Ljava/util/List;JZFLz41/k;FIFLa51/f;Lz41/k;F)V", "a", "(IIFFFLz41/f;Ljava/util/List;Ljava/util/List;JZFLz41/k;FIFLa51/f;Lz41/k;F)Lz41/g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "s", "F", "r", "()F", "d", "l", "e", "f", "Lz41/f;", "q", "()Lz41/f;", "g", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "p", "i", "J", "t", "()J", "j", "Z", "()Z", "k", "Lz41/k;", "m", "()Lz41/k;", "n", "o", "La51/f;", "()La51/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40072g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int angle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int spread;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float speed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float maxSpeed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float damping;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C40071f size;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C17919x> colors;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<InterfaceC2739c> shapes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long timeToLive;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean fadeOutEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float fadeOutDuration;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final AbstractC40076k position;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float rotationSpeed;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C0391f emitter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final AbstractC40076k gravityCenter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final float gravityFactor;

    /* JADX WARN: Multi-variable type inference failed */
    public C40072g(int i13, int i14, float f13, float f14, float f15, C40071f size, List<C17919x> colors, List<? extends InterfaceC2739c> shapes, long j7, boolean z4, float f16, AbstractC40076k position, float f17, int i15, float f18, C0391f emitter, AbstractC40076k abstractC40076k, float f19) {
        AbstractC22676k.m65750j(size, "size");
        AbstractC22676k.m65750j(colors, "colors");
        AbstractC22676k.m65750j(shapes, "shapes");
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(emitter, "emitter");
        this.angle = i13;
        this.spread = i14;
        this.speed = f13;
        this.maxSpeed = f14;
        this.damping = f15;
        this.size = size;
        this.colors = colors;
        this.shapes = shapes;
        this.timeToLive = j7;
        this.fadeOutEnabled = z4;
        this.fadeOutDuration = f16;
        this.position = position;
        this.radius = f17;
        this.delay = i15;
        this.rotationSpeed = f18;
        this.emitter = emitter;
        this.gravityCenter = abstractC40076k;
        this.gravityFactor = f19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C40072g m128427b(C40072g c40072g, int i13, int i14, float f13, float f14, float f15, C40071f c40071f, List list, List list2, long j7, boolean z4, float f16, AbstractC40076k abstractC40076k, float f17, int i15, float f18, C0391f c0391f, AbstractC40076k abstractC40076k2, float f19, int i16, Object obj) {
        float f24;
        AbstractC40076k abstractC40076k3;
        int i17 = (i16 & 1) != 0 ? c40072g.angle : i13;
        int i18 = (i16 & 2) != 0 ? c40072g.spread : i14;
        float f25 = (i16 & 4) != 0 ? c40072g.speed : f13;
        float f26 = (i16 & 8) != 0 ? c40072g.maxSpeed : f14;
        float f27 = (i16 & 16) != 0 ? c40072g.damping : f15;
        C40071f c40071f2 = (i16 & 32) != 0 ? c40072g.size : c40071f;
        List list3 = (i16 & 64) != 0 ? c40072g.colors : list;
        List list4 = (i16 & 128) != 0 ? c40072g.shapes : list2;
        long j13 = (i16 & 256) != 0 ? c40072g.timeToLive : j7;
        boolean z13 = (i16 & 512) != 0 ? c40072g.fadeOutEnabled : z4;
        float f28 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c40072g.fadeOutDuration : f16;
        AbstractC40076k abstractC40076k4 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c40072g.position : abstractC40076k;
        float f29 = (i16 & 4096) != 0 ? c40072g.radius : f17;
        int i19 = i17;
        int i24 = (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c40072g.delay : i15;
        float f34 = (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c40072g.rotationSpeed : f18;
        C0391f c0391f2 = (i16 & 32768) != 0 ? c40072g.emitter : c0391f;
        AbstractC40076k abstractC40076k5 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c40072g.gravityCenter : abstractC40076k2;
        if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            abstractC40076k3 = abstractC40076k5;
            f24 = c40072g.gravityFactor;
        } else {
            f24 = f19;
            abstractC40076k3 = abstractC40076k5;
        }
        return c40072g.m128428a(i19, i18, f25, f26, f27, c40071f2, list3, list4, j13, z13, f28, abstractC40076k4, f29, i24, f34, c0391f2, abstractC40076k3, f24);
    }

    /* JADX INFO: renamed from: a */
    public final C40072g m128428a(int angle, int spread, float speed, float maxSpeed, float damping, C40071f size, List<C17919x> colors, List<? extends InterfaceC2739c> shapes, long timeToLive, boolean fadeOutEnabled, float fadeOutDuration, AbstractC40076k position, float radius, int delay, float rotationSpeed, C0391f emitter, AbstractC40076k gravityCenter, float gravityFactor) {
        AbstractC22676k.m65750j(size, "size");
        AbstractC22676k.m65750j(colors, "colors");
        AbstractC22676k.m65750j(shapes, "shapes");
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(emitter, "emitter");
        return new C40072g(angle, spread, speed, maxSpeed, damping, size, colors, shapes, timeToLive, fadeOutEnabled, fadeOutDuration, position, radius, delay, rotationSpeed, emitter, gravityCenter, gravityFactor);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAngle() {
        return this.angle;
    }

    /* JADX INFO: renamed from: d */
    public final List<C17919x> m128430d() {
        return this.colors;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getDamping() {
        return this.damping;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40072g)) {
            return false;
        }
        C40072g c40072g = (C40072g) other;
        return this.angle == c40072g.angle && this.spread == c40072g.spread && Float.compare(this.speed, c40072g.speed) == 0 && Float.compare(this.maxSpeed, c40072g.maxSpeed) == 0 && Float.compare(this.damping, c40072g.damping) == 0 && AbstractC22676k.m65745e(this.size, c40072g.size) && AbstractC22676k.m65745e(this.colors, c40072g.colors) && AbstractC22676k.m65745e(this.shapes, c40072g.shapes) && this.timeToLive == c40072g.timeToLive && this.fadeOutEnabled == c40072g.fadeOutEnabled && Float.compare(this.fadeOutDuration, c40072g.fadeOutDuration) == 0 && AbstractC22676k.m65745e(this.position, c40072g.position) && Float.compare(this.radius, c40072g.radius) == 0 && this.delay == c40072g.delay && Float.compare(this.rotationSpeed, c40072g.rotationSpeed) == 0 && AbstractC22676k.m65745e(this.emitter, c40072g.emitter) && AbstractC22676k.m65745e(this.gravityCenter, c40072g.gravityCenter) && Float.compare(this.gravityFactor, c40072g.gravityFactor) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C0391f getEmitter() {
        return this.emitter;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getFadeOutDuration() {
        return this.fadeOutDuration;
    }

    public int hashCode() {
        int iHashCode = (this.emitter.hashCode() + AbstractC11266d.m30447a(this.rotationSpeed, AbstractC11266d.m30448b(this.delay, AbstractC11266d.m30447a(this.radius, (this.position.hashCode() + AbstractC11266d.m30447a(this.fadeOutDuration, AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.size.hashCode() + AbstractC11266d.m30447a(this.damping, AbstractC11266d.m30447a(this.maxSpeed, AbstractC11266d.m30447a(this.speed, AbstractC11266d.m30448b(this.spread, Integer.hashCode(this.angle) * 31, 31), 31), 31), 31)) * 31, 31, this.colors), 31, this.shapes), this.timeToLive, 31), 31, this.fadeOutEnabled), 31)) * 31, 31), 31), 31)) * 31;
        AbstractC40076k abstractC40076k = this.gravityCenter;
        return Float.hashCode(this.gravityFactor) + ((iHashCode + (abstractC40076k == null ? 0 : abstractC40076k.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getFadeOutEnabled() {
        return this.fadeOutEnabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC40076k getGravityCenter() {
        return this.gravityCenter;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getGravityFactor() {
        return this.gravityFactor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getMaxSpeed() {
        return this.maxSpeed;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final AbstractC40076k getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getRotationSpeed() {
        return this.rotationSpeed;
    }

    /* JADX INFO: renamed from: p */
    public final List<InterfaceC2739c> m128442p() {
        return this.shapes;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final C40071f getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getSpread() {
        return this.spread;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getTimeToLive() {
        return this.timeToLive;
    }

    public String toString() {
        int i13 = this.angle;
        int i14 = this.spread;
        float f13 = this.speed;
        float f14 = this.maxSpeed;
        float f15 = this.damping;
        C40071f c40071f = this.size;
        List<C17919x> list = this.colors;
        List<InterfaceC2739c> list2 = this.shapes;
        long j7 = this.timeToLive;
        boolean z4 = this.fadeOutEnabled;
        float f16 = this.fadeOutDuration;
        AbstractC40076k abstractC40076k = this.position;
        float f17 = this.radius;
        int i15 = this.delay;
        float f18 = this.rotationSpeed;
        C0391f c0391f = this.emitter;
        AbstractC40076k abstractC40076k2 = this.gravityCenter;
        float f19 = this.gravityFactor;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ParticleSystemSettings(angle=", ", spread=", ", speed=");
        AbstractC30802r.m94772u(sbM30465s, f13, ", maxSpeed=", f14, ", damping=");
        sbM30465s.append(f15);
        sbM30465s.append(", size=");
        sbM30465s.append(c40071f);
        sbM30465s.append(", colors=");
        AbstractC21702c.m61148s(sbM30465s, list, ", shapes=", list2, ", timeToLive=");
        sbM30465s.append(j7);
        sbM30465s.append(", fadeOutEnabled=");
        sbM30465s.append(z4);
        sbM30465s.append(", fadeOutDuration=");
        sbM30465s.append(f16);
        sbM30465s.append(", position=");
        sbM30465s.append(abstractC40076k);
        sbM30465s.append(", radius=");
        sbM30465s.append(f17);
        sbM30465s.append(", delay=");
        sbM30465s.append(i15);
        sbM30465s.append(", rotationSpeed=");
        sbM30465s.append(f18);
        sbM30465s.append(", emitter=");
        sbM30465s.append(c0391f);
        sbM30465s.append(", gravityCenter=");
        sbM30465s.append(abstractC40076k2);
        sbM30465s.append(", gravityFactor=");
        sbM30465s.append(f19);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    public /* synthetic */ C40072g(int i13, int i14, float f13, float f14, float f15, C40071f c40071f, List list, List list2, long j7, boolean z4, float f16, AbstractC40076k abstractC40076k, float f17, int i15, float f18, C0391f c0391f, AbstractC40076k abstractC40076k2, float f19, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 360 : i14, (i16 & 4) != 0 ? 30.0f : f13, (i16 & 8) != 0 ? 0.0f : f14, (i16 & 16) != 0 ? 0.9f : f15, (i16 & 32) != 0 ? new C40071f(1.0f, 0.0f, null, null, 14, null) : c40071f, (i16 & 64) != 0 ? AbstractC37056f.m118958J(new C17919x(AbstractC17918w0.m51517e(4294967295L))) : list, (i16 & 128) != 0 ? AbstractC37056f.m118959K(InterfaceC2739c.b.f10773a, InterfaceC2739c.a.f10770a) : list2, (i16 & 256) != 0 ? 2000L : j7, (i16 & 512) == 0 ? z4 : true, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 1.0f : f16, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new AbstractC40076k.b(0.5d, 0.5d) : abstractC40076k, (i16 & 4096) != 0 ? 0.0f : f17, (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 0 : i15, (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 0.0f : f18, (i16 & 32768) != 0 ? new C0391f(null, 10.0f, null, 4, null) : c0391f, (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? new AbstractC40076k.b(0.5d, 0.5d) : abstractC40076k2, (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? 1.0E-5f : f19);
    }
}
