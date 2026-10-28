package p635y2;

import androidx.compose.p018ui.platform.AndroidComposeView;
import c93.InterfaceC4351m;
import m83.AbstractC25260n;
import p005a3.AbstractC0262w0;
import p005a3.C0212i2;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: y2.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39118o0 extends AbstractC39101i1 {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f168247x;

    /* JADX INFO: renamed from: y */
    public final Object f168248y;

    public /* synthetic */ C39118o0(Object obj, int i13) {
        this.f168247x = i13;
        this.f168248y = obj;
    }

    @Override // p635y2.AbstractC39101i1
    /* JADX INFO: renamed from: b */
    public float mo124629b(C39117o c39117o) {
        float fIntBitsToFloat;
        int iM74085z0;
        switch (this.f168247x) {
            case 0:
                InterfaceC4351m interfaceC4351m = c39117o.f168245a;
                if (interfaceC4351m != null) {
                    return ((Number) interfaceC4351m.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC0262w0 abstractC0262w0 = (AbstractC0262w0) this.f168248y;
                if (abstractC0262w0.f898K) {
                    return Float.NaN;
                }
                AbstractC0262w0 abstractC0262w1 = abstractC0262w0;
                while (true) {
                    C0212i2 c0212i2 = abstractC0262w1.f900M;
                    float f13 = (c0212i2 == null || (iM74085z0 = AbstractC25260n.m74085z0((C39117o[]) c0212i2.f705b, c39117o)) < 0) ? Float.NaN : ((float[]) c0212i2.f706c)[iM74085z0];
                    if (!Float.isNaN(f13)) {
                        abstractC0262w1.m782C0(abstractC0262w0.mo788N0(), c39117o);
                        InterfaceC39147y interfaceC39147yMo786L0 = abstractC0262w1.mo786L0();
                        InterfaceC39147y interfaceC39147yMo786L1 = abstractC0262w0.mo786L0();
                        switch (c39117o.f168246b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC39147yMo786L1.mo3537k(interfaceC39147yMo786L0, (((long) Float.floatToRawIntBits(f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (interfaceC39147yMo786L0.mo3541n() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC39147yMo786L1.mo3537k(interfaceC39147yMo786L0, (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(((int) (interfaceC39147yMo786L0.mo3541n() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    AbstractC0262w0 abstractC0262w0Mo790P0 = abstractC0262w1.mo790P0();
                    if (abstractC0262w0Mo790P0 == null) {
                        abstractC0262w1.m782C0(abstractC0262w0.mo788N0(), c39117o);
                        return Float.NaN;
                    }
                    abstractC0262w1 = abstractC0262w0Mo790P0;
                }
                break;
            default:
                return super.mo124629b(c39117o);
        }
    }

    @Override // p635y2.AbstractC39101i1
    /* JADX INFO: renamed from: c */
    public final EnumC39181m mo124630c() {
        switch (this.f168247x) {
            case 0:
                return ((AbstractC0262w0) this.f168248y).getLayoutDirection();
            default:
                return ((AndroidComposeView) this.f168248y).getLayoutDirection();
        }
    }

    @Override // p635y2.AbstractC39101i1
    /* JADX INFO: renamed from: e */
    public final int mo124631e() {
        switch (this.f168247x) {
            case 0:
                return ((AbstractC0262w0) this.f168248y).mo452j0();
            default:
                return ((AndroidComposeView) this.f168248y).getRoot().m592J();
        }
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        switch (this.f168247x) {
            case 0:
                return ((AbstractC0262w0) this.f168248y).getDensity();
            default:
                return ((AndroidComposeView) this.f168248y).getDensity().getDensity();
        }
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        switch (this.f168247x) {
            case 0:
                return ((AbstractC0262w0) this.f168248y).getFontScale();
            default:
                return ((AndroidComposeView) this.f168248y).getDensity().getFontScale();
        }
    }
}
