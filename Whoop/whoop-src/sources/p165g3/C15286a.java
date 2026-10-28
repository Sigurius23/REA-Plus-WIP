package p165g3;

import p088dc.AbstractC11895b;
import p355o2.C27430e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C15286a {

    /* JADX INFO: renamed from: a */
    public final C27430e f57429a;

    /* JADX INFO: renamed from: b */
    public final int f57430b;

    public C15286a(C27430e c27430e, int i13) {
        this.f57429a = c27430e;
        this.f57430b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15286a)) {
            return false;
        }
        C15286a c15286a = (C15286a) obj;
        return AbstractC22676k.m65745e(this.f57429a, c15286a.f57429a) && this.f57430b == c15286a.f57430b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57430b) + (this.f57429a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb4.append(this.f57429a);
        sb4.append(", configFlags=");
        return AbstractC11895b.m31999r(sb4, this.f57430b, ')');
    }
}
