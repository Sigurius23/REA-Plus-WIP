package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1226j1 extends AbstractC1232l1 {
    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: c */
    public final boolean mo3812c(long j7, Object obj) {
        return AbstractC1235m1.f5437g ? AbstractC1235m1.m3916b(j7, obj) : AbstractC1235m1.m3917c(j7, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: d */
    public final double mo3813d(long j7, Object obj) {
        return Double.longBitsToDouble(m3882g(j7, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: e */
    public final float mo3814e(long j7, Object obj) {
        return Float.intBitsToFloat(m3881f(j7, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: j */
    public final void mo3815j(Object obj, long j7, boolean z4) {
        if (AbstractC1235m1.f5437g) {
            AbstractC1235m1.m3925k(obj, j7, z4 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC1235m1.m3926l(obj, j7, z4 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: k */
    public final void mo3816k(Object obj, long j7, byte b) {
        if (AbstractC1235m1.f5437g) {
            AbstractC1235m1.m3925k(obj, j7, b);
        } else {
            AbstractC1235m1.m3926l(obj, j7, b);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: l */
    public final void mo3817l(Object obj, long j7, double d3) {
        m3886o(obj, j7, Double.doubleToLongBits(d3));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: m */
    public final void mo3818m(Object obj, long j7, float f13) {
        m3885n(j7, obj, Float.floatToIntBits(f13));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: r */
    public final boolean mo3819r() {
        return false;
    }
}
