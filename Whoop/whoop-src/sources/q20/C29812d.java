package q20;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C29812d {

    /* JADX INFO: renamed from: a */
    public final String f121869a;

    /* JADX INFO: renamed from: b */
    public final String f121870b;

    public C29812d(String label, String str) {
        AbstractC22676k.m65750j(label, "label");
        this.f121869a = label;
        this.f121870b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29812d)) {
            return false;
        }
        C29812d c29812d = (C29812d) obj;
        return AbstractC22676k.m65745e(this.f121869a, c29812d.f121869a) && AbstractC22676k.m65745e(this.f121870b, c29812d.f121870b);
    }

    public final int hashCode() {
        int iHashCode = this.f121869a.hashCode() * 31;
        String str = this.f121870b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC2875y.m8300m("Labels(label=", this.f121869a, ", sublabel=", this.f121870b, ")");
    }
}
