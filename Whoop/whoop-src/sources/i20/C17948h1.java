package i20;

import c13.AbstractC3855a;

/* JADX INFO: renamed from: i20.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17948h1 implements InterfaceC17951i1 {

    /* JADX INFO: renamed from: a */
    public final boolean f69730a;

    public C17948h1(boolean z4) {
        this.f69730a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17948h1) && this.f69730a == ((C17948h1) obj).f69730a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69730a);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("Show(isChecked=", ")", this.f69730a);
    }
}
