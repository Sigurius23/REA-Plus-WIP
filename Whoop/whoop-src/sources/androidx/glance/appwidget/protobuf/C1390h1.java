package androidx.glance.appwidget.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1390h1 extends AbstractC1396j1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5904b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1390h1(Unsafe unsafe, int i13) {
        super(unsafe);
        this.f5904b = i13;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: c */
    public final boolean mo4343c(long j7, Object obj) {
        switch (this.f5904b) {
            case 0:
                if (AbstractC1399k1.f5932g) {
                    if (AbstractC1399k1.m4415h(j7, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC1399k1.m4416i(j7, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (AbstractC1399k1.f5932g) {
                    if (AbstractC1399k1.m4415h(j7, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC1399k1.m4416i(j7, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: d */
    public final byte mo4344d(long j7, Object obj) {
        switch (this.f5904b) {
            case 0:
                return AbstractC1399k1.f5932g ? AbstractC1399k1.m4415h(j7, obj) : AbstractC1399k1.m4416i(j7, obj);
            default:
                return AbstractC1399k1.f5932g ? AbstractC1399k1.m4415h(j7, obj) : AbstractC1399k1.m4416i(j7, obj);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: e */
    public final double mo4345e(long j7, Object obj) {
        switch (this.f5904b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m4388h(j7, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: f */
    public final float mo4346f(long j7, Object obj) {
        switch (this.f5904b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m4387g(j7, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: k */
    public final void mo4347k(Object obj, long j7, boolean z4) {
        switch (this.f5904b) {
            case 0:
                if (!AbstractC1399k1.f5932g) {
                    AbstractC1399k1.m4420m(obj, j7, z4 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC1399k1.m4419l(obj, j7, z4 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC1399k1.f5932g) {
                    AbstractC1399k1.m4420m(obj, j7, z4 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC1399k1.m4419l(obj, j7, z4 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: l */
    public final void mo4348l(Object obj, long j7, byte b) {
        switch (this.f5904b) {
            case 0:
                if (!AbstractC1399k1.f5932g) {
                    AbstractC1399k1.m4420m(obj, j7, b);
                } else {
                    AbstractC1399k1.m4419l(obj, j7, b);
                }
                break;
            default:
                if (!AbstractC1399k1.f5932g) {
                    AbstractC1399k1.m4420m(obj, j7, b);
                } else {
                    AbstractC1399k1.m4419l(obj, j7, b);
                }
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: m */
    public final void mo4349m(Object obj, long j7, double d3) {
        switch (this.f5904b) {
            case 0:
                m4392p(obj, j7, Double.doubleToLongBits(d3));
                break;
            default:
                m4392p(obj, j7, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: n */
    public final void mo4350n(Object obj, long j7, float f13) {
        switch (this.f5904b) {
            case 0:
                m4391o(j7, obj, Float.floatToIntBits(f13));
                break;
            default:
                m4391o(j7, obj, Float.floatToIntBits(f13));
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: s */
    public final boolean mo4351s() {
        switch (this.f5904b) {
        }
        return false;
    }
}
