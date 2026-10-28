package p002a0;

import e93.AbstractC12889b;
import i93.C18284j;
import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0032j0 {

    /* JADX INFO: renamed from: a */
    public long[] f94a;

    /* JADX INFO: renamed from: b */
    public int f95b;

    public C0032j0(int i13) {
        this.f94a = i13 == 0 ? AbstractC0060x.f182a : new long[i13];
    }

    /* JADX INFO: renamed from: a */
    public final void m76a(long j7) {
        int i13 = this.f95b + 1;
        long[] jArr = this.f94a;
        if (jArr.length < i13) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i13, (jArr.length * 3) / 2));
            AbstractC22676k.m65749i(jArrCopyOf, "copyOf(...)");
            this.f94a = jArrCopyOf;
        }
        long[] jArr2 = this.f94a;
        int i14 = this.f95b;
        jArr2[i14] = j7;
        this.f95b = i14 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0032j0) {
            C0032j0 c0032j0 = (C0032j0) obj;
            int i13 = c0032j0.f95b;
            int i14 = this.f95b;
            if (i13 == i14) {
                long[] jArr = this.f94a;
                long[] jArr2 = c0032j0.f94a;
                C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, i14);
                int i15 = c18284jM36278i0.f71133w;
                int i16 = c18284jM36278i0.f71134x;
                if (i15 > i16) {
                    return true;
                }
                while (jArr[i15] == jArr2[i15]) {
                    if (i15 == i16) {
                        return true;
                    }
                    i15++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f94a;
        int i13 = this.f95b;
        int iHashCode = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode += Long.hashCode(jArr[i14]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) "[");
        long[] jArr = this.f94a;
        int i13 = this.f95b;
        for (int i14 = 0; i14 < i13; i14++) {
            long j7 = jArr[i14];
            if (i14 == -1) {
                sb4.append((CharSequence) "...");
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                return string;
            }
            if (i14 != 0) {
                sb4.append((CharSequence) ", ");
            }
            sb4.append(j7);
        }
        sb4.append((CharSequence) "]");
        String string2 = sb4.toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        return string2;
    }
}
