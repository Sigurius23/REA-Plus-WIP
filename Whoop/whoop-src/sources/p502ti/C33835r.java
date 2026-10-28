package p502ti;

import java.util.Collections;
import p078d1.C11457j;
import p119ej.C13224a;

/* JADX INFO: renamed from: ti.r */
/* JADX INFO: loaded from: classes.dex */
public final class C33835r extends AbstractC33821d {

    /* JADX INFO: renamed from: i */
    public final Object f141702i;

    public C33835r(C11457j c11457j, Object obj) {
        super(Collections.EMPTY_LIST);
        m106986j(c11457j);
        this.f141702i = obj;
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: b */
    public final float mo106978b() {
        return 1.0f;
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: e */
    public final Object mo106981e() {
        C11457j c11457j = this.f141649e;
        Object obj = this.f141702i;
        float f13 = this.f141648d;
        return c11457j.m30731A(0.0f, 0.0f, obj, obj, f13, f13, f13);
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: f */
    public final Object mo106982f(C13224a c13224a, float f13) {
        return mo106981e();
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: h */
    public final void mo106984h() {
        if (this.f141649e != null) {
            super.mo106984h();
        }
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: i */
    public final void mo106985i(float f13) {
        this.f141648d = f13;
    }
}
