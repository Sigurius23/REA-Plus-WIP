package a63;

import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: a63.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0486f0 {

    /* JADX INFO: renamed from: a */
    public Long f1645a;

    /* JADX INFO: renamed from: b */
    public Long f1646b;

    /* JADX INFO: renamed from: c */
    public Long f1647c;

    public C0486f0() {
        this.f1645a = 0L;
        this.f1646b = 0L;
        this.f1647c = 0L;
        this.f1645a = null;
        this.f1646b = null;
        this.f1647c = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m1200a(Long l7) {
        if (l7 != null && l7.longValue() <= 0) {
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            if (AbstractC22676k.m65745e(c22673i0.getOrCreateKotlinClass(C0486f0.class), c22673i0.getOrCreateKotlinClass(obj.getClass()))) {
                C0486f0 c0486f0 = (C0486f0) obj;
                return AbstractC22676k.m65745e(this.f1645a, c0486f0.f1645a) && AbstractC22676k.m65745e(this.f1646b, c0486f0.f1646b) && AbstractC22676k.m65745e(this.f1647c, c0486f0.f1647c);
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l7 = this.f1645a;
        int iHashCode = (l7 != null ? l7.hashCode() : 0) * 31;
        Long l12 = this.f1646b;
        int iHashCode2 = (iHashCode + (l12 != null ? l12.hashCode() : 0)) * 31;
        Long l13 = this.f1647c;
        return iHashCode2 + (l13 != null ? l13.hashCode() : 0);
    }
}
