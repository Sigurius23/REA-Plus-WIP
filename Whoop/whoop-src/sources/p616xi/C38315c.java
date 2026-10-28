package p616xi;

import java.util.List;
import p502ti.AbstractC33821d;
import p502ti.C33831n;

/* JADX INFO: renamed from: xi.c */
/* JADX INFO: loaded from: classes.dex */
public final class C38315c implements InterfaceC38318f {

    /* JADX INFO: renamed from: w */
    public final C38314b f164194w;

    /* JADX INFO: renamed from: x */
    public final C38314b f164195x;

    public C38315c(C38314b c38314b, C38314b c38314b2) {
        this.f164194w = c38314b;
        this.f164195x = c38314b2;
    }

    @Override // p616xi.InterfaceC38318f
    /* JADX INFO: renamed from: k0 */
    public final AbstractC33821d mo84473k0() {
        return new C33831n(this.f164194w.mo84473k0(), this.f164195x.mo84473k0());
    }

    @Override // p616xi.InterfaceC38318f
    /* JADX INFO: renamed from: m0 */
    public final List mo2420m0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p616xi.InterfaceC38318f
    /* JADX INFO: renamed from: p0 */
    public final boolean mo2421p0() {
        return this.f164194w.mo2421p0() && this.f164195x.mo2421p0();
    }
}
