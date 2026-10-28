package gu;

import com.whoop.service.network.model.UserSessionDto;

/* JADX INFO: renamed from: gu.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16208b {

    /* JADX INFO: renamed from: a */
    public final C16207a f61555a;

    /* JADX INFO: renamed from: b */
    public final int[] f61556b;

    public C16208b(C16207a c16207a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f61555a = c16207a;
        int length = iArr.length;
        int i13 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f61556b = iArr;
            return;
        }
        while (i13 < length && iArr[i13] == 0) {
            i13++;
        }
        if (i13 == length) {
            this.f61556b = new int[]{0};
            return;
        }
        int i14 = length - i13;
        int[] iArr2 = new int[i14];
        this.f61556b = iArr2;
        System.arraycopy(iArr, i13, iArr2, 0, i14);
    }

    /* JADX INFO: renamed from: a */
    public final C16208b m45880a(C16208b c16208b) {
        C16207a c16207a = c16208b.f61555a;
        C16207a c16207a2 = this.f61555a;
        if (!c16207a2.equals(c16207a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m45882c()) {
            return c16208b;
        }
        if (c16208b.m45882c()) {
            return this;
        }
        int[] iArr = c16208b.f61556b;
        int[] iArr2 = this.f61556b;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i13 = length; i13 < iArr.length; i13++) {
            iArr3[i13] = iArr2[i13 - length] ^ iArr[i13];
        }
        return new C16208b(c16207a2, iArr3);
    }

    /* JADX INFO: renamed from: b */
    public final int m45881b() {
        return this.f61556b.length - 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m45882c() {
        return this.f61556b[0] == 0;
    }

    public final String toString() {
        if (m45882c()) {
            return UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE;
        }
        StringBuilder sb4 = new StringBuilder(m45881b() * 8);
        for (int iM45881b = m45881b(); iM45881b >= 0; iM45881b--) {
            int[] iArr = this.f61556b;
            int i13 = iArr[(iArr.length - 1) - iM45881b];
            if (i13 != 0) {
                if (i13 < 0) {
                    if (iM45881b == m45881b()) {
                        sb4.append("-");
                    } else {
                        sb4.append(" - ");
                    }
                    i13 = -i13;
                } else if (sb4.length() > 0) {
                    sb4.append(" + ");
                }
                if (iM45881b == 0 || i13 != 1) {
                    C16207a c16207a = this.f61555a;
                    if (i13 == 0) {
                        c16207a.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i14 = c16207a.f61550b[i13];
                    if (i14 == 0) {
                        sb4.append('1');
                    } else if (i14 == 1) {
                        sb4.append('a');
                    } else {
                        sb4.append("a^");
                        sb4.append(i14);
                    }
                }
                if (iM45881b != 0) {
                    if (iM45881b == 1) {
                        sb4.append('x');
                    } else {
                        sb4.append("x^");
                        sb4.append(iM45881b);
                    }
                }
            }
        }
        return sb4.toString();
    }
}
