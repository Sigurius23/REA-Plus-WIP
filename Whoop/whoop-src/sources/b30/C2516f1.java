package b30;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.f1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2516f1 implements InterfaceC2532h1 {

    /* JADX INFO: renamed from: a */
    public final String f9786a;

    public C2516f1(String text) {
        AbstractC22676k.m65750j(text, "text");
        this.f9786a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2516f1) && AbstractC22676k.m65745e(this.f9786a, ((C2516f1) obj).f9786a);
    }

    public final int hashCode() {
        return this.f9786a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("DateChanged(text=", this.f9786a, ")");
    }
}
