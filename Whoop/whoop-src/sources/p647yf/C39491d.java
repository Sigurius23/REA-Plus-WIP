package p647yf;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C39491d {

    /* JADX INFO: renamed from: a */
    public final Throwable f169888a;

    public C39491d(Throwable th3) {
        this.f169888a = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39491d) && AbstractC22676k.m65745e(this.f169888a, ((C39491d) obj).f169888a);
    }

    public final int hashCode() {
        Throwable th3 = this.f169888a;
        if (th3 == null) {
            return 0;
        }
        return th3.hashCode();
    }

    public final String toString() {
        return "ClosedSentinel(cause=" + this.f169888a + ')';
    }
}
