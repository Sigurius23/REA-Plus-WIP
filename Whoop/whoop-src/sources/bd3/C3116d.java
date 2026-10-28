package bd3;

import yb3.AbstractC39421y;

/* JADX INFO: renamed from: bd3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3116d implements CharSequence {

    /* JADX INFO: renamed from: w */
    public final char[] f12235w;

    /* JADX INFO: renamed from: x */
    public int f12236x;

    public C3116d(char[] cArr) {
        this.f12235w = cArr;
        this.f12236x = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i13) {
        return this.f12235w[i13];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12236x;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i13, int i14) {
        return AbstractC39421y.m125934z(this.f12235w, i13, Math.min(i14, this.f12236x));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i13 = this.f12236x;
        return AbstractC39421y.m125934z(this.f12235w, 0, Math.min(i13, i13));
    }
}
