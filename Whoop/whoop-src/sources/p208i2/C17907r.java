package p208i2;

import al.AbstractC0954a;
import android.graphics.RenderEffect;
import p000.AbstractC11266d;
import p079d2.AbstractC11480b;

/* JADX INFO: renamed from: i2.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C17907r extends AbstractC0954a {

    /* JADX INFO: renamed from: E */
    public final int f69607E;

    /* JADX INFO: renamed from: y */
    public final float f69608y;

    /* JADX INFO: renamed from: z */
    public final float f69609z;

    public C17907r(float f13, float f14, int i13) {
        super(2);
        this.f69608y = f13;
        this.f69609z = f14;
        this.f69607E = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17907r)) {
            return false;
        }
        C17907r c17907r = (C17907r) obj;
        return this.f69608y == c17907r.f69608y && this.f69609z == c17907r.f69609z && this.f69607E == c17907r.f69607E;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69607E) + AbstractC11266d.m30447a(this.f69609z, Float.hashCode(this.f69608y) * 31, 31);
    }

    @Override // al.AbstractC0954a
    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f69608y + ", radiusY=" + this.f69609z + ", edgeTreatment=" + ((Object) AbstractC17918w0.m51510L(this.f69607E)) + ')';
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: u0 */
    public final RenderEffect mo2424u0() {
        return AbstractC11480b.m30877c(this.f69608y, this.f69609z, this.f69607E);
    }
}
