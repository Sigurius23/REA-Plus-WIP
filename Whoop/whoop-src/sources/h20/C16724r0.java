package h20;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;

/* JADX INFO: renamed from: h20.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16724r0 extends AbstractC16736t0 {

    /* JADX INFO: renamed from: a */
    public final C16687l f64265a;

    /* JADX INFO: renamed from: c */
    public final C38915o4 f64267c;

    /* JADX INFO: renamed from: b */
    public final EnumC16730s0 f64266b = EnumC16730s0.f64277w;

    /* JADX INFO: renamed from: d */
    public final boolean f64268d = true;

    public C16724r0(C16687l c16687l) {
        this.f64265a = c16687l;
        this.f64267c = c16687l.f64178b;
    }

    @Override // h20.AbstractC16736t0
    /* JADX INFO: renamed from: a */
    public final EnumC16730s0 mo47256a() {
        return this.f64266b;
    }

    @Override // h20.AbstractC16736t0
    /* JADX INFO: renamed from: b */
    public final boolean mo47257b() {
        return this.f64268d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16724r0) && AbstractC22676k.m65745e(this.f64265a, ((C16724r0) obj).f64265a);
    }

    public final int hashCode() {
        return this.f64265a.hashCode();
    }

    public final String toString() {
        return "SavedPaymentMethod(displayableSavedPaymentMethod=" + this.f64265a + ")";
    }
}
