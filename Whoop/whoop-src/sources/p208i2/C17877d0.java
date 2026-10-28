package p208i2;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: i2.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17877d0 {

    /* JADX INFO: renamed from: a */
    public final int f69561a;

    /* JADX INFO: renamed from: a */
    public static String m51434a(int i13) {
        return AbstractC31061c.m95639o("CompositingStrategy(value=", i13, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17877d0) {
            return this.f69561a == ((C17877d0) obj).f69561a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69561a);
    }

    public final String toString() {
        return m51434a(this.f69561a);
    }
}
