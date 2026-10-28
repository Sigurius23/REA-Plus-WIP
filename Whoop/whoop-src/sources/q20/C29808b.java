package q20;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29808b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f121863a;

    /* JADX INFO: renamed from: b */
    public final boolean f121864b;

    public C29808b(InterfaceC41211c interfaceC41211c, boolean z4) {
        this.f121863a = interfaceC41211c;
        this.f121864b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29808b)) {
            return false;
        }
        C29808b c29808b = (C29808b) obj;
        return AbstractC22676k.m65745e(this.f121863a, c29808b.f121863a) && this.f121864b == c29808b.f121864b;
    }

    public final int hashCode() {
        InterfaceC41211c interfaceC41211c = this.f121863a;
        return Boolean.hashCode(this.f121864b) + ((interfaceC41211c == null ? 0 : interfaceC41211c.hashCode()) * 31);
    }

    public final String toString() {
        return "MandateText(text=" + this.f121863a + ", showAbovePrimaryButton=" + this.f121864b + ")";
    }
}
