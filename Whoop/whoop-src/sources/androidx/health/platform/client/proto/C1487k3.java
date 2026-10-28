package androidx.health.platform.client.proto;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.k3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1487k3 extends AbstractC1497m3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6063b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1487k3(Unsafe unsafe, int i13) {
        super(unsafe);
        this.f6063b = i13;
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: c */
    public final boolean mo4686c(long j7, Object obj) {
        switch (this.f6063b) {
            case 0:
                if (AbstractC1502n3.f6079g) {
                    if (AbstractC1502n3.m4726h(j7, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC1502n3.m4727i(j7, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (AbstractC1502n3.f6079g) {
                    if (AbstractC1502n3.m4726h(j7, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC1502n3.m4727i(j7, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: d */
    public final byte mo4687d(long j7, Object obj) {
        switch (this.f6063b) {
            case 0:
                return AbstractC1502n3.f6079g ? AbstractC1502n3.m4726h(j7, obj) : AbstractC1502n3.m4727i(j7, obj);
            default:
                return AbstractC1502n3.f6079g ? AbstractC1502n3.m4726h(j7, obj) : AbstractC1502n3.m4727i(j7, obj);
        }
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: e */
    public final double mo4688e(long j7, Object obj) {
        switch (this.f6063b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m4710h(j7, obj));
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: f */
    public final float mo4689f(long j7, Object obj) {
        switch (this.f6063b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m4709g(j7, obj));
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: k */
    public final void mo4690k(Object obj, long j7, boolean z4) {
        switch (this.f6063b) {
            case 0:
                if (!AbstractC1502n3.f6079g) {
                    AbstractC1502n3.m4731m(obj, j7, z4 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC1502n3.m4730l(obj, j7, z4 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC1502n3.f6079g) {
                    AbstractC1502n3.m4731m(obj, j7, z4 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC1502n3.m4730l(obj, j7, z4 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: l */
    public final void mo4691l(Object obj, long j7, byte b) {
        switch (this.f6063b) {
            case 0:
                if (!AbstractC1502n3.f6079g) {
                    AbstractC1502n3.m4731m(obj, j7, b);
                } else {
                    AbstractC1502n3.m4730l(obj, j7, b);
                }
                break;
            default:
                if (!AbstractC1502n3.f6079g) {
                    AbstractC1502n3.m4731m(obj, j7, b);
                } else {
                    AbstractC1502n3.m4730l(obj, j7, b);
                }
                break;
        }
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: m */
    public final void mo4692m(Object obj, long j7, double d3) {
        switch (this.f6063b) {
            case 0:
                m4714p(obj, j7, Double.doubleToLongBits(d3));
                break;
            default:
                m4714p(obj, j7, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: n */
    public final void mo4693n(Object obj, long j7, float f13) {
        switch (this.f6063b) {
            case 0:
                m4713o(j7, obj, Float.floatToIntBits(f13));
                break;
            default:
                m4713o(j7, obj, Float.floatToIntBits(f13));
                break;
        }
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: s */
    public final boolean mo4694s() {
        switch (this.f6063b) {
        }
        return false;
    }
}
