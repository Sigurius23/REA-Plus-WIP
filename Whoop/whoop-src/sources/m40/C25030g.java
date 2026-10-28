package m40;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m40.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C25030g implements InterfaceC25031h {

    /* JADX INFO: renamed from: w */
    public final String f98051w;

    public C25030g(String str) {
        this.f98051w = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25030g) && AbstractC22676k.m65745e(this.f98051w, ((C25030g) obj).f98051w);
    }

    @Override // m40.InterfaceC25031h
    public final String getValue() {
        return this.f98051w;
    }

    public final int hashCode() {
        return this.f98051w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Unknown(value=", this.f98051w, ")");
    }
}
