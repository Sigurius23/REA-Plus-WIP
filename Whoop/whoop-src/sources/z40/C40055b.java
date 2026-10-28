package z40;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z40.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C40055b extends AbstractC40058e {

    /* JADX INFO: renamed from: a */
    public final String f172863a = "Earpiece";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40055b) && AbstractC22676k.m65745e(this.f172863a, ((C40055b) obj).f172863a);
    }

    public final int hashCode() {
        return this.f172863a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Earpiece(name=", this.f172863a, ")");
    }
}
