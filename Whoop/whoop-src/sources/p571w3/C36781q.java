package p571w3;

import p636y3.C39183o;
import p636y3.C39184p;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: w3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C36781q {

    /* JADX INFO: renamed from: c */
    public static final C36781q f157360c = new C36781q(AbstractC35745c.m113246h(0), AbstractC35745c.m113246h(0));

    /* JADX INFO: renamed from: a */
    public final long f157361a;

    /* JADX INFO: renamed from: b */
    public final long f157362b;

    public C36781q(long j7, long j13) {
        this.f157361a = j7;
        this.f157362b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36781q)) {
            return false;
        }
        C36781q c36781q = (C36781q) obj;
        return C39183o.m124803a(this.f157361a, c36781q.f157361a) && C39183o.m124803a(this.f157362b, c36781q.f157362b);
    }

    public final int hashCode() {
        C39184p[] c39184pArr = C39183o.f168427b;
        return Long.hashCode(this.f157362b) + (Long.hashCode(this.f157361a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C39183o.m124807e(this.f157361a)) + ", restLine=" + ((Object) C39183o.m124807e(this.f157362b)) + ')';
    }
}
