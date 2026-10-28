package vg;

import g93.AbstractC15612d;
import g93.C15611c;
import p715kotlin.jvm.internal.AbstractC22676k;
import sb3.AbstractC32350a;

/* JADX INFO: renamed from: vg.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C35973t {

    /* JADX INFO: renamed from: d */
    public static final char[] f153162d;

    /* JADX INFO: renamed from: e */
    public static final C15611c f153163e;

    /* JADX INFO: renamed from: f */
    public static final long f153164f;

    /* JADX INFO: renamed from: g */
    public static final long f153165g;

    /* JADX INFO: renamed from: h */
    public static final long f153166h;

    /* JADX INFO: renamed from: i */
    public static final long f153167i;

    /* JADX INFO: renamed from: a */
    public final long f153168a;

    /* JADX INFO: renamed from: b */
    public final long f153169b;

    /* JADX INFO: renamed from: c */
    public final String f153170c;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        AbstractC22676k.m65749i(charArray, "toCharArray(...)");
        f153162d = charArray;
        f153163e = AbstractC15612d.f58612w;
        f153164f = 61440L;
        f153165g = 16384L;
        f153166h = -4611686018427387904L;
        f153167i = Long.MIN_VALUE;
    }

    public C35973t(long j7, long j13) {
        this.f153168a = j7;
        this.f153169b = j13;
        char[] cArr = new char[36];
        AbstractC32350a.m100715w(j7, 0, cArr, 0, 4);
        cArr[8] = '-';
        AbstractC32350a.m100715w(j7, 4, cArr, 9, 2);
        cArr[13] = '-';
        AbstractC32350a.m100715w(j7, 6, cArr, 14, 2);
        cArr[18] = '-';
        AbstractC32350a.m100715w(j13, 0, cArr, 19, 2);
        cArr[23] = '-';
        AbstractC32350a.m100715w(j13, 2, cArr, 24, 6);
        this.f153170c = new String(cArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35973t)) {
            return false;
        }
        C35973t c35973t = (C35973t) obj;
        return this.f153168a == c35973t.f153168a && this.f153169b == c35973t.f153169b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f153169b) + (Long.hashCode(this.f153168a) * 31);
    }

    public final String toString() {
        return this.f153170c;
    }
}
