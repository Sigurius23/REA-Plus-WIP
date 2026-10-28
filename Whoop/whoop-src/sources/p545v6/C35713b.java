package p545v6;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: v6.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C35713b {

    /* JADX INFO: renamed from: a */
    public final int f151946a;

    public /* synthetic */ C35713b(int i13) {
        this.f151946a = i13;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C35713b m113185a(int i13) {
        return new C35713b(i13);
    }

    /* JADX INFO: renamed from: b */
    public static String m113186b(int i13) {
        return AbstractC31061c.m95639o("Vertical(value=", i13, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C35713b) {
            return this.f151946a == ((C35713b) obj).f151946a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151946a);
    }

    public final String toString() {
        return m113186b(this.f151946a);
    }
}
