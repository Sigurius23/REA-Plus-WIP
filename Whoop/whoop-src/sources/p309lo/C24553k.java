package p309lo;

import java.util.Arrays;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lo.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C24553k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95824a;

    /* JADX INFO: renamed from: b */
    public int f95825b;

    /* JADX INFO: renamed from: c */
    public long[] f95826c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24553k(int i13, byte b) {
        this(32);
        this.f95824a = i13;
        switch (i13) {
            case 1:
                this.f95826c = new long[2];
                break;
            case 2:
                break;
            default:
                this.f95826c = new long[32];
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m71597a(long j7) {
        switch (this.f95824a) {
            case 0:
                int i13 = this.f95825b;
                long[] jArr = this.f95826c;
                if (i13 == jArr.length) {
                    this.f95826c = Arrays.copyOf(jArr, i13 * 2);
                }
                long[] jArr2 = this.f95826c;
                int i14 = this.f95825b;
                this.f95825b = i14 + 1;
                jArr2[i14] = j7;
                break;
            case 1:
                if (!m71600d(j7)) {
                    int i15 = this.f95825b;
                    long[] jArrCopyOf = this.f95826c;
                    if (i15 >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i15 + 1, jArrCopyOf.length * 2));
                        AbstractC22676k.m65749i(jArrCopyOf, "copyOf(...)");
                        this.f95826c = jArrCopyOf;
                    }
                    jArrCopyOf[i15] = j7;
                    if (i15 >= this.f95825b) {
                        this.f95825b = i15 + 1;
                    }
                }
                break;
            default:
                int i16 = this.f95825b;
                long[] jArr3 = this.f95826c;
                if (i16 == jArr3.length) {
                    this.f95826c = Arrays.copyOf(jArr3, i16 * 2);
                }
                long[] jArr4 = this.f95826c;
                int i17 = this.f95825b;
                this.f95825b = i17 + 1;
                jArr4[i17] = j7;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m71598b(long[] jArr) {
        int length = this.f95825b + jArr.length;
        long[] jArr2 = this.f95826c;
        if (length > jArr2.length) {
            this.f95826c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f95826c, this.f95825b, jArr.length);
        this.f95825b = length;
    }

    /* JADX INFO: renamed from: c */
    public void m71599c() {
        this.f95825b = 0;
    }

    /* JADX INFO: renamed from: d */
    public boolean m71600d(long j7) {
        int i13 = this.f95825b;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f95826c[i14] == j7) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public long m71601e(int i13) {
        switch (this.f95824a) {
            case 0:
                if (i13 >= 0 && i13 < this.f95825b) {
                    return this.f95826c[i13];
                }
                int i14 = this.f95825b;
                StringBuilder sb4 = new StringBuilder(46);
                sb4.append("Invalid index ");
                sb4.append(i13);
                sb4.append(", size is ");
                sb4.append(i14);
                throw new IndexOutOfBoundsException(sb4.toString());
            default:
                if (i13 >= 0 && i13 < this.f95825b) {
                    return this.f95826c[i13];
                }
                StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Invalid index ", ", size is ");
                sbM30466t.append(this.f95825b);
                throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public long m71602f(int i13) {
        return this.f95826c[i13];
    }

    /* JADX INFO: renamed from: g */
    public int m71603g() {
        return this.f95825b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m71604h() {
        return this.f95825b == 0;
    }

    /* JADX INFO: renamed from: i */
    public void m71605i(long j7) {
        int i13 = this.f95825b;
        int i14 = 0;
        while (i14 < i13) {
            if (j7 == this.f95826c[i14]) {
                int i15 = this.f95825b - 1;
                while (i14 < i15) {
                    long[] jArr = this.f95826c;
                    int i16 = i14 + 1;
                    jArr[i14] = jArr[i16];
                    i14 = i16;
                }
                this.f95825b--;
                return;
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m71606j(int i13) {
        int i14 = this.f95825b;
        if (i13 < i14) {
            int i15 = i14 - 1;
            while (i13 < i15) {
                long[] jArr = this.f95826c;
                int i16 = i13 + 1;
                jArr[i13] = jArr[i16];
                i13 = i16;
            }
            this.f95825b--;
        }
    }

    public C24553k(int i13) {
        this.f95824a = 2;
        this.f95826c = new long[i13];
    }
}
