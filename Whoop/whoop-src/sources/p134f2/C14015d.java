package p134f2;

import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14015d implements InterfaceC39171c {

    /* JADX INFO: renamed from: w */
    public InterfaceC14013b f50036w = C14020i.f50041w;

    /* JADX INFO: renamed from: x */
    public C14018g f50037x;

    /* JADX INFO: renamed from: a */
    public final C14018g m39910a(Function1 function1) {
        C14018g c14018g = new C14018g();
        c14018g.f50039a = function1;
        this.f50037x = c14018g;
        return c14018g;
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f50036w.getDensity().getDensity();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f50036w.getDensity().getFontScale();
    }
}
