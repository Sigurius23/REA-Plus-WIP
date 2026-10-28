package p545v6;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: v6.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C35712a {

    /* JADX INFO: renamed from: a */
    public final int f151945a;

    public /* synthetic */ C35712a(int i13) {
        this.f151945a = i13;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C35712a m113183a(int i13) {
        return new C35712a(i13);
    }

    /* JADX INFO: renamed from: b */
    public static String m113184b(int i13) {
        return AbstractC31061c.m95639o("Horizontal(value=", i13, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C35712a) {
            return this.f151945a == ((C35712a) obj).f151945a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151945a);
    }

    public final String toString() {
        return m113184b(this.f151945a);
    }
}
