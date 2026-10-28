package r93;

import ob3.InterfaceC27798h;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;

/* JADX INFO: renamed from: r93.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C31164x extends AbstractC31167y0 {

    /* JADX INFO: renamed from: a */
    public final C35850h f128381a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC27798h f128382b;

    public C31164x(C35850h c35850h, InterfaceC27798h underlyingType) {
        AbstractC22676k.m65750j(underlyingType, "underlyingType");
        this.f128381a = c35850h;
        this.f128382b = underlyingType;
    }

    @Override // r93.AbstractC31167y0
    /* JADX INFO: renamed from: a */
    public final boolean mo95860a(C35850h c35850h) {
        return this.f128381a.equals(c35850h);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f128381a + ", underlyingType=" + this.f128382b + ')';
    }
}
