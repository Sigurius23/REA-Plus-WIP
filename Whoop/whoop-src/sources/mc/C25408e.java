package mc;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: mc.e */
/* JADX INFO: loaded from: classes.dex */
public final class C25408e {

    /* JADX INFO: renamed from: a */
    public final boolean f99504a;

    /* JADX INFO: renamed from: b */
    public final boolean f99505b;

    /* JADX INFO: renamed from: c */
    public final boolean f99506c;

    /* JADX INFO: renamed from: d */
    public final boolean f99507d;

    /* JADX INFO: renamed from: e */
    public final boolean f99508e;

    public C25408e(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f99504a = z4;
        this.f99505b = z13;
        this.f99506c = z14;
        this.f99507d = z15;
        this.f99508e = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25408e)) {
            return false;
        }
        C25408e c25408e = (C25408e) obj;
        return this.f99504a == c25408e.f99504a && this.f99505b == c25408e.f99505b && this.f99506c == c25408e.f99506c && this.f99507d == c25408e.f99507d && this.f99508e == c25408e.f99508e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99508e) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.f99504a) * 31, 31, this.f99505b), 31, this.f99506c), 31, this.f99507d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("NetworkState(isConnected=");
        sb4.append(this.f99504a);
        sb4.append(", isValidated=");
        sb4.append(this.f99505b);
        sb4.append(", isMetered=");
        sb4.append(this.f99506c);
        sb4.append(", isNotRoaming=");
        sb4.append(this.f99507d);
        sb4.append(", isBlocked=");
        return AbstractC2875y.m8305r(sb4, this.f99508e, ')');
    }
}
