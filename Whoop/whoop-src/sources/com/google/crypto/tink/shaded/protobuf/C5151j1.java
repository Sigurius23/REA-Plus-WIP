package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5151j1 extends AbstractC5157l1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f21525b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5151j1(Unsafe unsafe, int i13) {
        super(unsafe);
        this.f21525b = i13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: c */
    public final boolean mo16186c(long j7, Object obj) {
        switch (this.f21525b) {
            case 0:
                if (AbstractC5160m1.f21555g) {
                    if (AbstractC5160m1.m16284h(j7, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC5160m1.m16285i(j7, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (AbstractC5160m1.f21555g) {
                    if (AbstractC5160m1.m16284h(j7, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC5160m1.m16285i(j7, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: d */
    public final byte mo16187d(long j7, Object obj) {
        switch (this.f21525b) {
            case 0:
                return AbstractC5160m1.f21555g ? AbstractC5160m1.m16284h(j7, obj) : AbstractC5160m1.m16285i(j7, obj);
            default:
                return AbstractC5160m1.f21555g ? AbstractC5160m1.m16284h(j7, obj) : AbstractC5160m1.m16285i(j7, obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: e */
    public final double mo16188e(long j7, Object obj) {
        switch (this.f21525b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m16248h(j7, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: f */
    public final float mo16189f(long j7, Object obj) {
        switch (this.f21525b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m16247g(j7, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: k */
    public final void mo16190k(Object obj, long j7, boolean z4) {
        switch (this.f21525b) {
            case 0:
                if (!AbstractC5160m1.f21555g) {
                    AbstractC5160m1.m16289m(obj, j7, z4 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC5160m1.m16288l(obj, j7, z4 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC5160m1.f21555g) {
                    AbstractC5160m1.m16289m(obj, j7, z4 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC5160m1.m16288l(obj, j7, z4 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: l */
    public final void mo16191l(Object obj, long j7, byte b) {
        switch (this.f21525b) {
            case 0:
                if (!AbstractC5160m1.f21555g) {
                    AbstractC5160m1.m16289m(obj, j7, b);
                } else {
                    AbstractC5160m1.m16288l(obj, j7, b);
                }
                break;
            default:
                if (!AbstractC5160m1.f21555g) {
                    AbstractC5160m1.m16289m(obj, j7, b);
                } else {
                    AbstractC5160m1.m16288l(obj, j7, b);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: m */
    public final void mo16192m(Object obj, long j7, double d3) {
        switch (this.f21525b) {
            case 0:
                m16252p(obj, j7, Double.doubleToLongBits(d3));
                break;
            default:
                m16252p(obj, j7, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: n */
    public final void mo16193n(Object obj, long j7, float f13) {
        switch (this.f21525b) {
            case 0:
                m16251o(j7, obj, Float.floatToIntBits(f13));
                break;
            default:
                m16251o(j7, obj, Float.floatToIntBits(f13));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: s */
    public final boolean mo16194s() {
        switch (this.f21525b) {
        }
        return false;
    }
}
