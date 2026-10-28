package b51;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: b51.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\tJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020&2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010,R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010)\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010,¨\u0006/"}, m65681d2 = {"Lb51/d;", "", "", "x", "y", "<init>", "(FF)V", "other", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lb51/d;)Lb51/d;", "f", "v", "s", "Ll83/a0;", "b", "(Lb51/d;F)V", "e", "()F", "a", "l", "scalar", "j", "(F)Lb51/d;", "g", "()Lb51/d;", "center", "", "angle", "i", "(Lb51/d;D)Lb51/d;", "k", "(FF)Lb51/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "F", "c", "setX", "(F)V", "d", "setY", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2740d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float y;

    public C2740d(float f13, float f14) {
        this.x = f13;
        this.y = f14;
    }

    /* JADX INFO: renamed from: a */
    public final C2740d m7712a(C2740d other) {
        AbstractC22676k.m65750j(other, "other");
        this.x += other.x;
        this.y += other.y;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m7713b(C2740d v13, float s13) {
        AbstractC22676k.m65750j(v13, "v");
        this.x = (v13.x * s13) + this.x;
        this.y = (v13.y * s13) + this.y;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: e */
    public final float m7716e() {
        float f13 = this.x;
        float f14 = this.y;
        return (float) Math.sqrt((f14 * f14) + (f13 * f13));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2740d)) {
            return false;
        }
        C2740d c2740d = (C2740d) other;
        return Float.compare(this.x, c2740d.x) == 0 && Float.compare(this.y, c2740d.y) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final C2740d m7717f(C2740d other) {
        AbstractC22676k.m65750j(other, "other");
        return new C2740d(this.x - other.x, this.y - other.y);
    }

    /* JADX INFO: renamed from: g */
    public final C2740d m7718g() {
        float fM7716e = m7716e();
        if (fM7716e == 0.0f) {
            this.x = 0.0f;
            this.y = 0.0f;
            return this;
        }
        this.x /= fM7716e;
        this.y /= fM7716e;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C2740d m7719h(C2740d other) {
        AbstractC22676k.m65750j(other, "other");
        return new C2740d(this.x + other.x, this.y + other.y);
    }

    public int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final C2740d m7720i(C2740d center, double angle) {
        AbstractC22676k.m65750j(center, "center");
        float f13 = center.x;
        float f14 = center.y;
        double dCos = ((Math.cos(angle) * ((double) (this.x - f13))) - (Math.sin(angle) * ((double) (this.y - f14)))) + ((double) f13);
        double dCos2 = (Math.cos(angle) * ((double) (this.y - f14))) + (Math.sin(angle) * ((double) (this.x - f13))) + ((double) f14);
        this.x = (float) dCos;
        this.y = (float) dCos2;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C2740d m7721j(float scalar) {
        this.x *= scalar;
        this.y *= scalar;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C2740d m7722k(float x3, float y13) {
        this.x = x3;
        this.y = y13;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C2740d m7723l(C2740d other) {
        AbstractC22676k.m65750j(other, "other");
        this.x -= other.x;
        this.y -= other.y;
        return this;
    }

    public String toString() {
        return AbstractC31061c.m95638n("Vector(x=", this.x, ", y=", this.y, ")");
    }

    public /* synthetic */ C2740d(float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 0.0f : f14);
    }
}
