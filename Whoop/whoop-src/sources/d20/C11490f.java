package d20;

import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29910i0;

/* JADX INFO: renamed from: d20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C11490f extends AbstractC11492h {

    /* JADX INFO: renamed from: a */
    public final C29910i0 f36949a;

    public C11490f(C29910i0 c29910i0) {
        this.f36949a = c29910i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11490f) && AbstractC22676k.m65745e(this.f36949a, ((C11490f) obj).f36949a);
    }

    public final int hashCode() {
        return this.f36949a.hashCode();
    }

    public final String toString() {
        return "StartChallenge(args=" + this.f36949a + ")";
    }
}
