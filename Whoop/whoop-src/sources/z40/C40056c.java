package z40;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z40.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C40056c extends AbstractC40058e {

    /* JADX INFO: renamed from: a */
    public final String f172864a = "Speakerphone";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40056c) && AbstractC22676k.m65745e(this.f172864a, ((C40056c) obj).f172864a);
    }

    public final int hashCode() {
        return this.f172864a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Speakerphone(name=", this.f172864a, ")");
    }
}
