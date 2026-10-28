package p545v6;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: v6.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C35720i {

    /* JADX INFO: renamed from: a */
    public final int f151961a;

    public /* synthetic */ C35720i(int i13) {
        this.f151961a = i13;
    }

    /* JADX INFO: renamed from: a */
    public static String m113188a(int i13) {
        return AbstractC31061c.m95639o("ContentScale(value=", i13, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C35720i) {
            return this.f151961a == ((C35720i) obj).f151961a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151961a);
    }

    public final String toString() {
        return m113188a(this.f151961a);
    }
}
