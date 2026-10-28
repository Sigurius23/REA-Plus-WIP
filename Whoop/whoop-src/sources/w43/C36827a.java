package w43;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C36827a {

    /* JADX INFO: renamed from: a */
    public final int f157531a;

    /* JADX INFO: renamed from: b */
    public final long f157532b;

    /* JADX INFO: renamed from: c */
    public final Throwable f157533c;

    /* JADX INFO: renamed from: d */
    public final C36828b f157534d;

    public C36827a(int i13, long j7, Throwable th3, C36828b policy) {
        AbstractC22676k.m65750j(policy, "policy");
        this.f157531a = i13;
        this.f157532b = j7;
        this.f157533c = th3;
        this.f157534d = policy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36827a)) {
            return false;
        }
        C36827a c36827a = (C36827a) obj;
        return this.f157531a == c36827a.f157531a && this.f157532b == c36827a.f157532b && AbstractC22676k.m65745e(this.f157533c, c36827a.f157533c) && AbstractC22676k.m65745e(this.f157534d, c36827a.f157534d);
    }

    public final int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(Integer.hashCode(this.f157531a) * 31, this.f157532b, 31);
        Throwable th3 = this.f157533c;
        return this.f157534d.hashCode() + ((iM30451e + (th3 == null ? 0 : th3.hashCode())) * 31);
    }

    public final String toString() {
        return "StreamRetryAttemptInfo(attempt=" + this.f157531a + ", currentDelay=" + this.f157532b + ", previousAttemptError=" + this.f157533c + ", policy=" + this.f157534d + ")";
    }
}
