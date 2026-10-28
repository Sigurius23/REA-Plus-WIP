package z40;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z40.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C40057d extends AbstractC40058e {

    /* JADX INFO: renamed from: a */
    public final String f172865a = "Wired Headset";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40057d) && AbstractC22676k.m65745e(this.f172865a, ((C40057d) obj).f172865a);
    }

    public final int hashCode() {
        return this.f172865a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("WiredHeadset(name=", this.f172865a, ")");
    }
}
