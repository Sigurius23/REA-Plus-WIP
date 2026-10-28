package l83;

import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;

/* JADX INFO: renamed from: l83.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C23476v implements Comparable {

    /* JADX INFO: renamed from: w */
    public final long f92954w;

    /* JADX INFO: renamed from: a */
    public static String m68040a(long j7) {
        if (j7 >= 0) {
            AbstractC35846d.m113779c(10);
            String string = Long.toString(j7, 10);
            AbstractC22676k.m65749i(string, "toString(...)");
            return string;
        }
        long j13 = 10;
        long j14 = ((j7 >>> 1) / j13) << 1;
        long j15 = j7 - (j14 * j13);
        if (j15 >= j13) {
            j15 -= j13;
            j14++;
        }
        AbstractC35846d.m113779c(10);
        String string2 = Long.toString(j14, 10);
        AbstractC22676k.m65749i(string2, "toString(...)");
        AbstractC35846d.m113779c(10);
        String string3 = Long.toString(j15, 10);
        AbstractC22676k.m65749i(string3, "toString(...)");
        return string2.concat(string3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC22676k.m65752l(this.f92954w ^ Long.MIN_VALUE, ((C23476v) obj).f92954w ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23476v) {
            return this.f92954w == ((C23476v) obj).f92954w;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f92954w);
    }

    public final String toString() {
        return m68040a(this.f92954w);
    }
}
