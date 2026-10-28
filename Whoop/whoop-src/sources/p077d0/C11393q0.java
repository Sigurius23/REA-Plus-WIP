package p077d0;

import al.AbstractC0954a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11393q0 extends AbstractC0954a {

    /* JADX INFO: renamed from: y */
    public final C28633k1 f36534y;

    /* JADX INFO: renamed from: z */
    public final C28633k1 f36535z;

    public C11393q0(Object obj) {
        super(1);
        this.f36534y = AbstractC28683x.m87272z(obj);
        this.f36535z = AbstractC28683x.m87272z(obj);
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: B0 */
    public final void mo2414B0(Object obj) {
        this.f36534y.setValue(obj);
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: C0 */
    public final void mo2415C0(C11421z1 c11421z1) {
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: D0 */
    public final void mo2416D0() {
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m30627H0() {
        return AbstractC22676k.m65745e(this.f36534y.getValue(), this.f36535z.getValue()) && !((Boolean) ((C28633k1) this.f3536x).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m30628I0(Boolean bool) {
        this.f36535z.setValue(bool);
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: y0 */
    public final Object mo2428y0() {
        return this.f36534y.getValue();
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: z0 */
    public final Object mo2429z0() {
        return this.f36535z.getValue();
    }
}
