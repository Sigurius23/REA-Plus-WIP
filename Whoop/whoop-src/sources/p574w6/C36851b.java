package p574w6;

import p335n6.InterfaceC26397n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w6.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C36851b implements InterfaceC26397n {

    /* JADX INFO: renamed from: a */
    public final C36850a f157626a;

    public C36851b(C36850a c36850a) {
        this.f157626a = c36850a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36851b) && AbstractC22676k.m65745e(this.f157626a, ((C36851b) obj).f157626a);
    }

    public final int hashCode() {
        return this.f157626a.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.f157626a + ')';
    }
}
