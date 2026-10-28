package p395p6;

import p008a7.C0510a;
import p335n6.InterfaceC26397n;

/* JADX INFO: renamed from: p6.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C28921u implements InterfaceC26397n {

    /* JADX INFO: renamed from: a */
    public final C0510a f117031a;

    public C28921u(C0510a c0510a) {
        this.f117031a = c0510a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28921u) && this.f117031a.equals(((C28921u) obj).f117031a);
    }

    public final int hashCode() {
        return this.f117031a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.f117031a + ')';
    }
}
