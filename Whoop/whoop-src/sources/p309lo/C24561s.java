package p309lo;

import p607x8.AbstractC38065t;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: lo.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C24561s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95857a;

    /* JADX INFO: renamed from: b */
    public byte[] f95858b;

    /* JADX INFO: renamed from: c */
    public int f95859c;

    /* JADX INFO: renamed from: d */
    public int f95860d;

    /* JADX INFO: renamed from: e */
    public int f95861e;

    public /* synthetic */ C24561s(byte[] bArr, int i13, int i14, byte b) {
        this.f95857a = i14;
        this.f95858b = bArr;
        this.f95861e = i13;
    }

    /* JADX INFO: renamed from: a */
    public void m71624a() {
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f95857a) {
            case 0:
                int i17 = this.f95859c;
                AbstractC24543a.m71573i(i17 >= 0 && (i17 < (i13 = this.f95861e) || (i17 == i13 && this.f95860d == 0)));
                break;
            case 1:
                int i18 = this.f95860d;
                AbstractC24543a.m71573i(i18 >= 0 && (i18 < (i14 = this.f95859c) || (i18 == i14 && this.f95861e == 0)));
                break;
            case 5:
                int i19 = this.f95859c;
                AbstractC35849g.m113807i(i19 >= 0 && (i19 < (i15 = this.f95861e) || (i19 == i15 && this.f95860d == 0)));
                break;
            default:
                int i24 = this.f95860d;
                AbstractC35849g.m113807i(i24 >= 0 && (i24 < (i16 = this.f95859c) || (i24 == i16 && this.f95861e == 0)));
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m71625b() {
        int i13;
        int i14;
        switch (this.f95857a) {
            case 0:
                i13 = (this.f95861e - this.f95859c) * 8;
                i14 = this.f95860d;
                break;
            default:
                i13 = (this.f95861e - this.f95859c) * 8;
                i14 = this.f95860d;
                break;
        }
        return i13 - i14;
    }

    /* JADX INFO: renamed from: c */
    public void m71626c() {
        switch (this.f95857a) {
            case 0:
                if (this.f95860d != 0) {
                    this.f95860d = 0;
                    this.f95859c++;
                    m71624a();
                    break;
                }
                break;
            default:
                if (this.f95860d != 0) {
                    this.f95860d = 0;
                    this.f95859c++;
                    m71624a();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m71627d(int i13) {
        switch (this.f95857a) {
            case 1:
                int i14 = this.f95860d;
                int i15 = i13 / 8;
                int i16 = i14 + i15;
                int i17 = (this.f95861e + i13) - (i15 * 8);
                if (i17 > 7) {
                    i16++;
                    i17 -= 8;
                }
                while (true) {
                    i14++;
                    if (i14 <= i16 && i16 < this.f95859c) {
                        if (m71641r(i14)) {
                            i16++;
                            i14 += 2;
                        }
                    }
                }
                int i18 = this.f95859c;
                if (i16 >= i18) {
                    return i16 == i18 && i17 == 0;
                }
                return true;
            default:
                int i19 = this.f95860d;
                int i24 = i13 / 8;
                int i25 = i19 + i24;
                int i26 = (this.f95861e + i13) - (i24 * 8);
                if (i26 > 7) {
                    i25++;
                    i26 -= 8;
                }
                while (true) {
                    i19++;
                    if (i19 <= i25 && i25 < this.f95859c) {
                        if (m71641r(i19)) {
                            i25++;
                            i19 += 2;
                        }
                    }
                }
                int i27 = this.f95859c;
                if (i25 >= i27) {
                    return i25 == i27 && i26 == 0;
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m71628e() {
        switch (this.f95857a) {
            case 1:
                int i13 = this.f95860d;
                int i14 = this.f95861e;
                int i15 = 0;
                while (this.f95860d < this.f95859c && !m71631h()) {
                    i15++;
                }
                boolean z4 = this.f95860d == this.f95859c;
                this.f95860d = i13;
                this.f95861e = i14;
                return !z4 && m71627d((i15 * 2) + 1);
            default:
                int i16 = this.f95860d;
                int i17 = this.f95861e;
                int i18 = 0;
                while (this.f95860d < this.f95859c && !m71631h()) {
                    i18++;
                }
                boolean z13 = this.f95860d == this.f95859c;
                this.f95860d = i16;
                this.f95861e = i17;
                return !z13 && m71627d((i18 * 2) + 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public int m71629f() {
        switch (this.f95857a) {
            case 0:
                AbstractC24543a.m71573i(this.f95860d == 0);
                break;
            default:
                AbstractC35849g.m113807i(this.f95860d == 0);
                break;
        }
        return this.f95859c;
    }

    /* JADX INFO: renamed from: g */
    public int m71630g() {
        int i13;
        int i14;
        switch (this.f95857a) {
            case 0:
                i13 = this.f95859c * 8;
                i14 = this.f95860d;
                break;
            default:
                i13 = this.f95859c * 8;
                i14 = this.f95860d;
                break;
        }
        return i13 + i14;
    }

    /* JADX INFO: renamed from: h */
    public boolean m71631h() {
        switch (this.f95857a) {
            case 0:
                boolean z4 = (this.f95858b[this.f95859c] & (128 >> this.f95860d)) != 0;
                m71642s();
                return z4;
            case 1:
                boolean z13 = (this.f95858b[this.f95860d] & (128 >> this.f95861e)) != 0;
                m71642s();
                return z13;
            case 2:
            default:
                boolean z14 = (this.f95858b[this.f95860d] & (128 >> this.f95861e)) != 0;
                m71642s();
                return z14;
            case 3:
                boolean z15 = (((this.f95858b[this.f95860d] & 255) >> this.f95861e) & 1) == 1;
                m71643t(1);
                return z15;
            case 4:
                boolean z16 = (((this.f95858b[this.f95860d] & 255) >> this.f95861e) & 1) == 1;
                m71643t(1);
                return z16;
            case 5:
                boolean z17 = (this.f95858b[this.f95859c] & (128 >> this.f95860d)) != 0;
                m71642s();
                return z17;
        }
    }

    /* JADX INFO: renamed from: i */
    public int m71632i(int i13) {
        switch (this.f95857a) {
            case 0:
                if (i13 == 0) {
                    return 0;
                }
                this.f95860d += i13;
                int i14 = 0;
                while (true) {
                    int i15 = this.f95860d;
                    if (i15 <= 8) {
                        byte[] bArr = this.f95858b;
                        int i16 = this.f95859c;
                        int i17 = ((-1) >>> (32 - i13)) & (i14 | ((bArr[i16] & 255) >> (8 - i15)));
                        if (i15 == 8) {
                            this.f95860d = 0;
                            this.f95859c = i16 + 1;
                        }
                        m71624a();
                        return i17;
                    }
                    int i18 = i15 - 8;
                    this.f95860d = i18;
                    byte[] bArr2 = this.f95858b;
                    int i19 = this.f95859c;
                    this.f95859c = i19 + 1;
                    i14 |= (bArr2[i19] & 255) << i18;
                }
                break;
            case 1:
                this.f95861e += i13;
                int i24 = 0;
                while (true) {
                    int i25 = this.f95861e;
                    int i26 = 2;
                    if (i25 <= 8) {
                        byte[] bArr3 = this.f95858b;
                        int i27 = this.f95860d;
                        int i28 = ((-1) >>> (32 - i13)) & (i24 | ((bArr3[i27] & 255) >> (8 - i25)));
                        if (i25 == 8) {
                            this.f95861e = 0;
                            this.f95860d = i27 + (m71641r(i27 + 1) ? 2 : 1);
                        }
                        m71624a();
                        return i28;
                    }
                    int i29 = i25 - 8;
                    this.f95861e = i29;
                    byte[] bArr4 = this.f95858b;
                    int i34 = this.f95860d;
                    i24 |= (bArr4[i34] & 255) << i29;
                    if (!m71641r(i34 + 1)) {
                        i26 = 1;
                    }
                    this.f95860d = i34 + i26;
                }
                break;
            case 2:
            default:
                this.f95861e += i13;
                int i35 = 0;
                while (true) {
                    int i36 = this.f95861e;
                    int i37 = 2;
                    if (i36 <= 8) {
                        byte[] bArr5 = this.f95858b;
                        int i38 = this.f95860d;
                        int i39 = ((-1) >>> (32 - i13)) & (i35 | ((bArr5[i38] & 255) >> (8 - i36)));
                        if (i36 == 8) {
                            this.f95861e = 0;
                            this.f95860d = i38 + (m71641r(i38 + 1) ? 2 : 1);
                        }
                        m71624a();
                        return i39;
                    }
                    int i44 = i36 - 8;
                    this.f95861e = i44;
                    byte[] bArr6 = this.f95858b;
                    int i45 = this.f95860d;
                    i35 |= (bArr6[i45] & 255) << i44;
                    if (!m71641r(i45 + 1)) {
                        i37 = 1;
                    }
                    this.f95860d = i45 + i37;
                }
                break;
            case 3:
                int i46 = this.f95860d;
                int iMin = Math.min(i13, 8 - this.f95861e);
                byte[] bArr7 = this.f95858b;
                int i47 = i46 + 1;
                int i48 = ((bArr7[i46] & 255) >> this.f95861e) & (255 >> (8 - iMin));
                while (iMin < i13) {
                    i48 |= (bArr7[i47] & 255) << iMin;
                    iMin += 8;
                    i47++;
                }
                int i49 = i48 & ((-1) >>> (32 - i13));
                m71643t(i13);
                return i49;
            case 4:
                int i54 = this.f95860d;
                int iMin2 = Math.min(i13, 8 - this.f95861e);
                byte[] bArr8 = this.f95858b;
                int i55 = i54 + 1;
                int i56 = ((bArr8[i54] & 255) >> this.f95861e) & (255 >> (8 - iMin2));
                while (iMin2 < i13) {
                    i56 |= (bArr8[i55] & 255) << iMin2;
                    iMin2 += 8;
                    i55++;
                }
                int i57 = i56 & ((-1) >>> (32 - i13));
                m71643t(i13);
                return i57;
            case 5:
                if (i13 == 0) {
                    return 0;
                }
                this.f95860d += i13;
                int i58 = 0;
                while (true) {
                    int i59 = this.f95860d;
                    if (i59 <= 8) {
                        byte[] bArr9 = this.f95858b;
                        int i64 = this.f95859c;
                        int i65 = ((-1) >>> (32 - i13)) & (i58 | ((bArr9[i64] & 255) >> (8 - i59)));
                        if (i59 == 8) {
                            this.f95860d = 0;
                            this.f95859c = i64 + 1;
                        }
                        m71624a();
                        return i65;
                    }
                    int i66 = i59 - 8;
                    this.f95860d = i66;
                    byte[] bArr10 = this.f95858b;
                    int i67 = this.f95859c;
                    this.f95859c = i67 + 1;
                    i58 |= (bArr10[i67] & 255) << i66;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m71633j(int i13, byte[] bArr) {
        switch (this.f95857a) {
            case 0:
                int i14 = i13 >> 3;
                for (int i15 = 0; i15 < i14; i15++) {
                    byte[] bArr2 = this.f95858b;
                    int i16 = this.f95859c;
                    int i17 = i16 + 1;
                    this.f95859c = i17;
                    byte b = bArr2[i16];
                    int i18 = this.f95860d;
                    byte b6 = (byte) (b << i18);
                    bArr[i15] = b6;
                    bArr[i15] = (byte) (((255 & bArr2[i17]) >> (8 - i18)) | b6);
                }
                int i19 = i13 & 7;
                if (i19 != 0) {
                    byte b8 = (byte) (bArr[i14] & (255 >> i19));
                    bArr[i14] = b8;
                    int i24 = this.f95860d;
                    if (i24 + i19 > 8) {
                        byte[] bArr3 = this.f95858b;
                        int i25 = this.f95859c;
                        this.f95859c = i25 + 1;
                        bArr[i14] = (byte) (b8 | ((bArr3[i25] & 255) << i24));
                        this.f95860d = i24 - 8;
                    }
                    int i26 = this.f95860d + i19;
                    this.f95860d = i26;
                    byte[] bArr4 = this.f95858b;
                    int i27 = this.f95859c;
                    bArr[i14] = (byte) (((byte) (((255 & bArr4[i27]) >> (8 - i26)) << (8 - i19))) | bArr[i14]);
                    if (i26 == 8) {
                        this.f95860d = 0;
                        this.f95859c = i27 + 1;
                    }
                    m71624a();
                    break;
                }
                break;
            default:
                int i28 = i13 >> 3;
                for (int i29 = 0; i29 < i28; i29++) {
                    byte[] bArr5 = this.f95858b;
                    int i34 = this.f95859c;
                    int i35 = i34 + 1;
                    this.f95859c = i35;
                    byte b14 = bArr5[i34];
                    int i36 = this.f95860d;
                    byte b15 = (byte) (b14 << i36);
                    bArr[i29] = b15;
                    bArr[i29] = (byte) (((255 & bArr5[i35]) >> (8 - i36)) | b15);
                }
                int i37 = i13 & 7;
                if (i37 != 0) {
                    byte b16 = (byte) (bArr[i28] & (255 >> i37));
                    bArr[i28] = b16;
                    int i38 = this.f95860d;
                    if (i38 + i37 > 8) {
                        byte[] bArr6 = this.f95858b;
                        int i39 = this.f95859c;
                        this.f95859c = i39 + 1;
                        bArr[i28] = (byte) (b16 | ((bArr6[i39] & 255) << i38));
                        this.f95860d = i38 - 8;
                    }
                    int i44 = this.f95860d + i37;
                    this.f95860d = i44;
                    byte[] bArr7 = this.f95858b;
                    int i45 = this.f95859c;
                    bArr[i28] = (byte) (((byte) (((255 & bArr7[i45]) >> (8 - i44)) << (8 - i37))) | bArr[i28]);
                    if (i44 == 8) {
                        this.f95860d = 0;
                        this.f95859c = i45 + 1;
                    }
                    m71624a();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public long m71634k(int i13) {
        if (i13 <= 32) {
            int iM71632i = m71632i(i13);
            int i14 = AbstractC38065t.f163031a;
            return 4294967295L & ((long) iM71632i);
        }
        int iM71632i2 = m71632i(i13 - 32);
        int iM71632i3 = m71632i(32);
        int i15 = AbstractC38065t.f163031a;
        return (4294967295L & ((long) iM71632i3)) | ((((long) iM71632i2) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: l */
    public void m71635l(int i13, byte[] bArr) {
        switch (this.f95857a) {
            case 0:
                AbstractC24543a.m71573i(this.f95860d == 0);
                System.arraycopy(this.f95858b, this.f95859c, bArr, 0, i13);
                this.f95859c += i13;
                m71624a();
                break;
            default:
                AbstractC35849g.m113807i(this.f95860d == 0);
                System.arraycopy(this.f95858b, this.f95859c, bArr, 0, i13);
                this.f95859c += i13;
                m71624a();
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public int m71636m() {
        switch (this.f95857a) {
            case 1:
                int i13 = 0;
                while (!m71631h()) {
                    i13++;
                }
                return ((1 << i13) - 1) + (i13 > 0 ? m71632i(i13) : 0);
            default:
                int i14 = 0;
                while (!m71631h()) {
                    i14++;
                }
                return ((1 << i14) - 1) + (i14 > 0 ? m71632i(i14) : 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public int m71637n() {
        int i13;
        int i14;
        switch (this.f95857a) {
            case 1:
                int iM71636m = m71636m();
                i13 = iM71636m % 2 == 0 ? -1 : 1;
                i14 = (iM71636m + 1) / 2;
                break;
            default:
                int iM71636m2 = m71636m();
                i13 = iM71636m2 % 2 == 0 ? -1 : 1;
                i14 = (iM71636m2 + 1) / 2;
                break;
        }
        return i14 * i13;
    }

    /* JADX INFO: renamed from: o */
    public void m71638o(int i13, byte[] bArr) {
        switch (this.f95857a) {
            case 0:
                this.f95858b = bArr;
                this.f95859c = 0;
                this.f95860d = 0;
                this.f95861e = i13;
                break;
            default:
                this.f95858b = bArr;
                this.f95859c = 0;
                this.f95860d = 0;
                this.f95861e = i13;
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m71639p(C38059n c38059n) {
        m71638o(c38059n.f163019c, c38059n.f163017a);
        m71640q(c38059n.f163018b * 8);
    }

    /* JADX INFO: renamed from: q */
    public void m71640q(int i13) {
        switch (this.f95857a) {
            case 0:
                int i14 = i13 / 8;
                this.f95859c = i14;
                this.f95860d = i13 - (i14 * 8);
                m71624a();
                break;
            default:
                int i15 = i13 / 8;
                this.f95859c = i15;
                this.f95860d = i13 - (i15 * 8);
                m71624a();
                break;
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m71641r(int i13) {
        switch (this.f95857a) {
            case 1:
                if (2 <= i13 && i13 < this.f95859c) {
                    byte[] bArr = this.f95858b;
                    if (bArr[i13] == 3 && bArr[i13 - 2] == 0 && bArr[i13 - 1] == 0) {
                        return true;
                    }
                }
                return false;
            default:
                if (2 <= i13 && i13 < this.f95859c) {
                    byte[] bArr2 = this.f95858b;
                    if (bArr2[i13] == 3 && bArr2[i13 - 2] == 0 && bArr2[i13 - 1] == 0) {
                        return true;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m71642s() {
        switch (this.f95857a) {
            case 0:
                int i13 = this.f95860d + 1;
                this.f95860d = i13;
                if (i13 == 8) {
                    this.f95860d = 0;
                    this.f95859c++;
                }
                m71624a();
                break;
            case 1:
                int i14 = this.f95861e + 1;
                this.f95861e = i14;
                if (i14 == 8) {
                    this.f95861e = 0;
                    int i15 = this.f95860d;
                    this.f95860d = i15 + (m71641r(i15 + 1) ? 2 : 1);
                }
                m71624a();
                break;
            case 5:
                int i16 = this.f95860d + 1;
                this.f95860d = i16;
                if (i16 == 8) {
                    this.f95860d = 0;
                    this.f95859c++;
                }
                m71624a();
                break;
            default:
                int i17 = this.f95861e + 1;
                this.f95861e = i17;
                if (i17 == 8) {
                    this.f95861e = 0;
                    int i18 = this.f95860d;
                    this.f95860d = i18 + (m71641r(i18 + 1) ? 2 : 1);
                }
                m71624a();
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m71643t(int i13) {
        int i14;
        int i15;
        switch (this.f95857a) {
            case 0:
                int i16 = i13 / 8;
                int i17 = this.f95859c + i16;
                this.f95859c = i17;
                int i18 = (i13 - (i16 * 8)) + this.f95860d;
                this.f95860d = i18;
                if (i18 > 7) {
                    this.f95859c = i17 + 1;
                    this.f95860d = i18 - 8;
                }
                m71624a();
                break;
            case 1:
                int i19 = this.f95860d;
                int i24 = i13 / 8;
                int i25 = i19 + i24;
                this.f95860d = i25;
                int i26 = (i13 - (i24 * 8)) + this.f95861e;
                this.f95861e = i26;
                if (i26 > 7) {
                    this.f95860d = i25 + 1;
                    this.f95861e = i26 - 8;
                }
                while (true) {
                    i19++;
                    if (i19 > this.f95860d) {
                        m71624a();
                        break;
                    } else if (m71641r(i19)) {
                        this.f95860d++;
                        i19 += 2;
                    }
                }
                break;
            case 2:
            default:
                int i27 = this.f95860d;
                int i28 = i13 / 8;
                int i29 = i27 + i28;
                this.f95860d = i29;
                int i34 = (i13 - (i28 * 8)) + this.f95861e;
                this.f95861e = i34;
                if (i34 > 7) {
                    this.f95860d = i29 + 1;
                    this.f95861e = i34 - 8;
                }
                while (true) {
                    i27++;
                    if (i27 > this.f95860d) {
                        m71624a();
                        break;
                    } else if (m71641r(i27)) {
                        this.f95860d++;
                        i27 += 2;
                    }
                }
                break;
            case 3:
                int i35 = i13 / 8;
                int i36 = this.f95860d + i35;
                this.f95860d = i36;
                int i37 = (i13 - (i35 * 8)) + this.f95861e;
                this.f95861e = i37;
                boolean z4 = true;
                if (i37 > 7) {
                    this.f95860d = i36 + 1;
                    this.f95861e = i37 - 8;
                }
                int i38 = this.f95860d;
                if (i38 < 0 || (i38 >= (i14 = this.f95859c) && (i38 != i14 || this.f95861e != 0))) {
                    z4 = false;
                }
                AbstractC35849g.m113807i(z4);
                break;
            case 4:
                int i39 = i13 / 8;
                int i44 = this.f95860d + i39;
                this.f95860d = i44;
                int i45 = (i13 - (i39 * 8)) + this.f95861e;
                this.f95861e = i45;
                boolean z13 = true;
                if (i45 > 7) {
                    this.f95860d = i44 + 1;
                    this.f95861e = i45 - 8;
                }
                int i46 = this.f95860d;
                if (i46 < 0 || (i46 >= (i15 = this.f95859c) && (i46 != i15 || this.f95861e != 0))) {
                    z13 = false;
                }
                AbstractC24543a.m71573i(z13);
                break;
            case 5:
                int i47 = i13 / 8;
                int i48 = this.f95859c + i47;
                this.f95859c = i48;
                int i49 = (i13 - (i47 * 8)) + this.f95860d;
                this.f95860d = i49;
                if (i49 > 7) {
                    this.f95859c = i48 + 1;
                    this.f95860d = i49 - 8;
                }
                m71624a();
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m71644u(int i13) {
        switch (this.f95857a) {
            case 0:
                AbstractC24543a.m71573i(this.f95860d == 0);
                this.f95859c += i13;
                m71624a();
                break;
            default:
                AbstractC35849g.m113807i(this.f95860d == 0);
                this.f95859c += i13;
                m71624a();
                break;
        }
    }

    public C24561s(int i13) {
        this.f95857a = i13;
        switch (i13) {
            case 5:
                this.f95858b = AbstractC38065t.f163033c;
                break;
            default:
                this.f95858b = AbstractC24567y.f95880f;
                break;
        }
    }

    public C24561s(int i13, int i14, int i15, byte[] bArr) {
        this.f95857a = i15;
        switch (i15) {
            case 6:
                this.f95858b = bArr;
                this.f95860d = i13;
                this.f95859c = i14;
                this.f95861e = 0;
                m71624a();
                break;
            default:
                this.f95858b = bArr;
                this.f95860d = i13;
                this.f95859c = i14;
                this.f95861e = 0;
                m71624a();
                break;
        }
    }

    public C24561s(byte[] bArr, int i13) {
        this.f95857a = i13;
        switch (i13) {
            case 4:
                this.f95858b = bArr;
                this.f95859c = bArr.length;
                break;
            default:
                this.f95858b = bArr;
                this.f95859c = bArr.length;
                break;
        }
    }

    public C24561s(int i13, int i14, int i15) {
        this.f95857a = i15;
        switch (i15) {
            case 7:
                this.f95859c = i13;
                this.f95860d = i14;
                this.f95858b = new byte[(i14 * 2) - 1];
                this.f95861e = 0;
                break;
            default:
                this.f95859c = i13;
                this.f95860d = i14;
                this.f95858b = new byte[(i14 * 2) - 1];
                this.f95861e = 0;
                break;
        }
    }
}
