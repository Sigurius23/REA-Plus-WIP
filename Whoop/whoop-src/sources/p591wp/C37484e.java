package p591wp;

import ih0.AbstractC18489d0;
import p529uo.AbstractC35135w;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: wp.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C37484e extends C37483d {

    /* JADX INFO: renamed from: E */
    public final float f160324E;

    /* JADX INFO: renamed from: z */
    public final C37481b f160325z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37484e(C37481b c37481b, float f13) {
        super(3, c37481b, Float.valueOf(f13));
        AbstractC35135w.m111095g(c37481b, "bitmapDescriptor must not be null");
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        this.f160325z = c37481b;
        this.f160324E = f13;
    }

    @Override // p591wp.C37483d
    public final String toString() {
        return AbstractC30007c.m91837g(this.f160324E, "]", AbstractC18489d0.m53375p("[CustomCap: bitmapDescriptor=", String.valueOf(this.f160325z), " refWidth="));
    }
}
