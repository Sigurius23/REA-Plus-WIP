package d51;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: d51.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006\""}, m65681d2 = {"Ld51/f;", "", "", "x", "y", "<init>", "(DD)V", "other", "g", "(Ld51/f;)Ld51/f;", "d", "scalar", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(D)Ld51/f;", "", "i", "(F)Ld51/f;", "e", "()Ld51/f;", "f", "c", "()D", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11718f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double y;

    public C11718f(double d3, double d14) {
        this.x = d3;
        this.y = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: c */
    public final double m31318c() {
        double d3 = this.x;
        double d14 = this.y;
        return Math.sqrt((d14 * d14) + (d3 * d3));
    }

    /* JADX INFO: renamed from: d */
    public final C11718f m31319d(C11718f other) {
        AbstractC22676k.m65750j(other, "other");
        return new C11718f(this.x - other.x, this.y - other.y);
    }

    /* JADX INFO: renamed from: e */
    public final C11718f m31320e() {
        double dM31318c = m31318c();
        return dM31318c == 0.0d ? new C11718f(0.0d, 0.0d) : new C11718f(this.x / dM31318c, this.y / dM31318c);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11718f)) {
            return false;
        }
        C11718f c11718f = (C11718f) other;
        return Double.compare(this.x, c11718f.x) == 0 && Double.compare(this.y, c11718f.y) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final C11718f m31321f() {
        return new C11718f(-this.y, this.x);
    }

    /* JADX INFO: renamed from: g */
    public final C11718f m31322g(C11718f other) {
        AbstractC22676k.m65750j(other, "other");
        return new C11718f(this.x + other.x, this.y + other.y);
    }

    /* JADX INFO: renamed from: h */
    public final C11718f m31323h(double scalar) {
        return new C11718f(this.x * scalar, this.y * scalar);
    }

    public int hashCode() {
        return Double.hashCode(this.y) + (Double.hashCode(this.x) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final C11718f m31324i(float scalar) {
        double d3 = scalar;
        return new C11718f(this.x * d3, this.y * d3);
    }

    public String toString() {
        return AbstractC30007c.m91836f(this.y, ")", AbstractC2875y.m8306s("Vector2(x=", this.x, ", y="));
    }
}
