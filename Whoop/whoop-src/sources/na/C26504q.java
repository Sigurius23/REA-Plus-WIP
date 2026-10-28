package na;

import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: na.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C26504q {

    /* JADX INFO: renamed from: a */
    public final C26502o f105328a;

    /* JADX INFO: renamed from: b */
    public final int f105329b;

    /* JADX INFO: renamed from: c */
    public final long[] f105330c;

    /* JADX INFO: renamed from: d */
    public final int[] f105331d;

    /* JADX INFO: renamed from: e */
    public final int f105332e;

    /* JADX INFO: renamed from: f */
    public final long[] f105333f;

    /* JADX INFO: renamed from: g */
    public final int[] f105334g;

    /* JADX INFO: renamed from: h */
    public final long f105335h;

    public C26504q(C26502o c26502o, long[] jArr, int[] iArr, int i13, long[] jArr2, int[] iArr2, long j7) {
        AbstractC35849g.m113802d(iArr.length == jArr2.length);
        AbstractC35849g.m113802d(jArr.length == jArr2.length);
        AbstractC35849g.m113802d(iArr2.length == jArr2.length);
        this.f105328a = c26502o;
        this.f105330c = jArr;
        this.f105331d = iArr;
        this.f105332e = i13;
        this.f105333f = jArr2;
        this.f105334g = iArr2;
        this.f105335h = j7;
        this.f105329b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m78566a(long j7) {
        long[] jArr = this.f105333f;
        for (int iM121908a = AbstractC38065t.m121908a(jArr, j7, true); iM121908a < jArr.length; iM121908a++) {
            if ((this.f105334g[iM121908a] & 1) != 0) {
                return iM121908a;
            }
        }
        return -1;
    }
}
