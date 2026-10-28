package p002a0;

import e93.AbstractC12889b;
import i93.C18284j;
import java.util.Arrays;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0020f0 {

    /* JADX INFO: renamed from: a */
    public int[] f46a;

    /* JADX INFO: renamed from: b */
    public int f47b;

    public C0020f0(int i13) {
        this.f46a = i13 == 0 ? AbstractC0054u.f166a : new int[i13];
    }

    /* JADX INFO: renamed from: a */
    public final void m26a(int i13) {
        m27b(this.f47b + 1);
        int[] iArr = this.f46a;
        int i14 = this.f47b;
        iArr[i14] = i13;
        this.f47b = i14 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m27b(int i13) {
        int[] iArr = this.f46a;
        if (iArr.length < i13) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i13, (iArr.length * 3) / 2));
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.f46a = iArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m28c(int i13) {
        if (i13 >= 0 && i13 < this.f47b) {
            return this.f46a[i13];
        }
        AbstractC34924m.m110135Q("Index must be between 0 and size");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final int m29d() {
        int i13 = this.f47b;
        if (i13 != 0) {
            return this.f46a[i13 - 1];
        }
        AbstractC34924m.m110136R("IntList is empty.");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m30e(int i13) {
        int[] iArr = this.f46a;
        int i14 = this.f47b;
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                i15 = -1;
                break;
            } else if (i13 == iArr[i15]) {
                break;
            } else {
                i15++;
            }
        }
        if (i15 >= 0) {
            m31f(i15);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0020f0) {
            C0020f0 c0020f0 = (C0020f0) obj;
            int i13 = c0020f0.f47b;
            int i14 = this.f47b;
            if (i13 == i14) {
                int[] iArr = this.f46a;
                int[] iArr2 = c0020f0.f46a;
                C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, i14);
                int i15 = c18284jM36278i0.f71133w;
                int i16 = c18284jM36278i0.f71134x;
                if (i15 > i16) {
                    return true;
                }
                while (iArr[i15] == iArr2[i15]) {
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

    /* JADX INFO: renamed from: f */
    public final void m31f(int i13) {
        int i14;
        if (i13 < 0 || i13 >= (i14 = this.f47b)) {
            AbstractC34924m.m110135Q("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f46a;
        int i15 = iArr[i13];
        if (i13 != i14 - 1) {
            AbstractC25260n.m74064e0(i13, i13 + 1, iArr, iArr, i14);
        }
        this.f47b--;
    }

    /* JADX INFO: renamed from: g */
    public final void m32g(int i13, int i14) {
        if (i13 < 0 || i13 >= this.f47b) {
            AbstractC34924m.m110135Q("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f46a;
        int i15 = iArr[i13];
        iArr[i13] = i14;
    }

    public final int hashCode() {
        int[] iArr = this.f46a;
        int i13 = this.f47b;
        int iHashCode = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode += Integer.hashCode(iArr[i14]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) "[");
        int[] iArr = this.f46a;
        int i13 = this.f47b;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            if (i14 == -1) {
                sb4.append((CharSequence) "...");
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                return string;
            }
            if (i14 != 0) {
                sb4.append((CharSequence) ", ");
            }
            sb4.append(i15);
        }
        sb4.append((CharSequence) "]");
        String string2 = sb4.toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        return string2;
    }

    public /* synthetic */ C0020f0() {
        this(16);
    }
}
