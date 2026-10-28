package vz2;

/* JADX INFO: renamed from: vz2.h */
/* JADX INFO: loaded from: classes11.dex */
public class C36622h implements Comparable<C36622h> {

    /* JADX INFO: renamed from: w */
    private final int f156935w;

    /* JADX INFO: renamed from: x */
    private final int f156936x;

    public C36622h(int i13, int i14) {
        this.f156935w = i13;
        this.f156936x = i14;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C36622h c36622h) {
        return (this.f156935w * this.f156936x) - (c36622h.f156935w * c36622h.f156936x);
    }

    /* JADX INFO: renamed from: b */
    public int m117692b() {
        return this.f156936x;
    }

    /* JADX INFO: renamed from: c */
    public int m117693c() {
        return this.f156935w;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36622h) {
            C36622h c36622h = (C36622h) obj;
            if (this.f156935w == c36622h.f156935w && this.f156936x == c36622h.f156936x) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i13 = this.f156936x;
        int i14 = this.f156935w;
        return i13 ^ ((i14 >>> 16) | (i14 << 16));
    }

    public String toString() {
        return this.f156935w + "x" + this.f156936x;
    }
}
