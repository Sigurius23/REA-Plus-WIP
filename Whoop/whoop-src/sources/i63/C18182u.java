package i63;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: i63.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C18182u {

    /* JADX INFO: renamed from: d */
    public static final C18182u f70516d = new C18182u("HTTP", 2, 0);

    /* JADX INFO: renamed from: e */
    public static final C18182u f70517e = new C18182u("HTTP", 1, 1);

    /* JADX INFO: renamed from: f */
    public static final C18182u f70518f = new C18182u("HTTP", 1, 0);

    /* JADX INFO: renamed from: g */
    public static final C18182u f70519g = new C18182u("SPDY", 3, 0);

    /* JADX INFO: renamed from: h */
    public static final C18182u f70520h = new C18182u("QUIC", 1, 0);

    /* JADX INFO: renamed from: a */
    public final String f70521a;

    /* JADX INFO: renamed from: b */
    public final int f70522b;

    /* JADX INFO: renamed from: c */
    public final int f70523c;

    public C18182u(String str, int i13, int i14) {
        this.f70521a = str;
        this.f70522b = i13;
        this.f70523c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18182u)) {
            return false;
        }
        C18182u c18182u = (C18182u) obj;
        return this.f70521a.equals(c18182u.f70521a) && this.f70522b == c18182u.f70522b && this.f70523c == c18182u.f70523c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70523c) + AbstractC11266d.m30448b(this.f70522b, this.f70521a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.f70521a + '/' + this.f70522b + '.' + this.f70523c;
    }
}
