package p136f4;

import ih0.AbstractC18489d0;
import java.util.Arrays;
import p005a3.C0237p;
import p031b9.AbstractC2875y;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: f4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14049a {

    /* JADX INFO: renamed from: b */
    public final C14050b f50139b;

    /* JADX INFO: renamed from: c */
    public final C0237p f50140c;

    /* JADX INFO: renamed from: a */
    public int f50138a = 0;

    /* JADX INFO: renamed from: d */
    public int f50141d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f50142e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f50143f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f50144g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f50145h = -1;

    /* JADX INFO: renamed from: i */
    public int f50146i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f50147j = false;

    public C14049a(C14050b c14050b, C0237p c0237p) {
        this.f50139b = c14050b;
        this.f50140c = c0237p;
    }

    /* JADX INFO: renamed from: a */
    public final void m39977a(C14054f c14054f, float f13, boolean z4) {
        if (f13 <= -0.001f || f13 >= 0.001f) {
            int i13 = this.f50145h;
            C14050b c14050b = this.f50139b;
            if (i13 == -1) {
                this.f50145h = 0;
                this.f50144g[0] = f13;
                this.f50142e[0] = c14054f.f50182x;
                this.f50143f[0] = -1;
                c14054f.f50179K++;
                c14054f.m40016a(c14050b);
                this.f50138a++;
                if (this.f50147j) {
                    return;
                }
                int i14 = this.f50146i + 1;
                this.f50146i = i14;
                int[] iArr = this.f50142e;
                if (i14 >= iArr.length) {
                    this.f50147j = true;
                    this.f50146i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i15 = -1;
            for (int i16 = 0; i13 != -1 && i16 < this.f50138a; i16++) {
                int i17 = this.f50142e[i13];
                int i18 = c14054f.f50182x;
                if (i17 == i18) {
                    float[] fArr = this.f50144g;
                    float f14 = fArr[i13] + f13;
                    if (f14 > -0.001f && f14 < 0.001f) {
                        f14 = 0.0f;
                    }
                    fArr[i13] = f14;
                    if (f14 == 0.0f) {
                        if (i13 == this.f50145h) {
                            this.f50145h = this.f50143f[i13];
                        } else {
                            int[] iArr2 = this.f50143f;
                            iArr2[i15] = iArr2[i13];
                        }
                        if (z4) {
                            c14054f.m40017b(c14050b);
                        }
                        if (this.f50147j) {
                            this.f50146i = i13;
                        }
                        c14054f.f50179K--;
                        this.f50138a--;
                        return;
                    }
                    return;
                }
                if (i17 < i18) {
                    i15 = i13;
                }
                i13 = this.f50143f[i13];
            }
            int length = this.f50146i;
            int i19 = length + 1;
            if (this.f50147j) {
                int[] iArr3 = this.f50142e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i19;
            }
            int[] iArr4 = this.f50142e;
            if (length >= iArr4.length && this.f50138a < iArr4.length) {
                int i24 = 0;
                while (true) {
                    int[] iArr5 = this.f50142e;
                    if (i24 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i24] == -1) {
                        length = i24;
                        break;
                    }
                    i24++;
                }
            }
            int[] iArr6 = this.f50142e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i25 = this.f50141d * 2;
                this.f50141d = i25;
                this.f50147j = false;
                this.f50146i = length - 1;
                this.f50144g = Arrays.copyOf(this.f50144g, i25);
                this.f50142e = Arrays.copyOf(this.f50142e, this.f50141d);
                this.f50143f = Arrays.copyOf(this.f50143f, this.f50141d);
            }
            this.f50142e[length] = c14054f.f50182x;
            this.f50144g[length] = f13;
            if (i15 != -1) {
                int[] iArr7 = this.f50143f;
                iArr7[length] = iArr7[i15];
                iArr7[i15] = length;
            } else {
                this.f50143f[length] = this.f50145h;
                this.f50145h = length;
            }
            c14054f.f50179K++;
            c14054f.m40016a(c14050b);
            this.f50138a++;
            if (!this.f50147j) {
                this.f50146i++;
            }
            int i26 = this.f50146i;
            int[] iArr8 = this.f50142e;
            if (i26 >= iArr8.length) {
                this.f50147j = true;
                this.f50146i = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m39978b() {
        int i13 = this.f50145h;
        for (int i14 = 0; i13 != -1 && i14 < this.f50138a; i14++) {
            C14054f c14054f = ((C14054f[]) this.f50140c.f814z)[this.f50142e[i13]];
            if (c14054f != null) {
                c14054f.m40017b(this.f50139b);
            }
            i13 = this.f50143f[i13];
        }
        this.f50145h = -1;
        this.f50146i = -1;
        this.f50147j = false;
        this.f50138a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final float m39979c(C14054f c14054f) {
        int i13 = this.f50145h;
        for (int i14 = 0; i13 != -1 && i14 < this.f50138a; i14++) {
            if (this.f50142e[i13] == c14054f.f50182x) {
                return this.f50144g[i13];
            }
            i13 = this.f50143f[i13];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final int m39980d() {
        return this.f50138a;
    }

    /* JADX INFO: renamed from: e */
    public final C14054f m39981e(int i13) {
        int i14 = this.f50145h;
        for (int i15 = 0; i14 != -1 && i15 < this.f50138a; i15++) {
            if (i15 == i13) {
                return ((C14054f[]) this.f50140c.f814z)[this.f50142e[i14]];
            }
            i14 = this.f50143f[i14];
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final float m39982f(int i13) {
        int i14 = this.f50145h;
        for (int i15 = 0; i14 != -1 && i15 < this.f50138a; i15++) {
            if (i15 == i13) {
                return this.f50144g[i14];
            }
            i14 = this.f50143f[i14];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public final void m39983g(C14054f c14054f, float f13) {
        if (f13 == 0.0f) {
            m39984h(c14054f, true);
            return;
        }
        int i13 = this.f50145h;
        C14050b c14050b = this.f50139b;
        if (i13 == -1) {
            this.f50145h = 0;
            this.f50144g[0] = f13;
            this.f50142e[0] = c14054f.f50182x;
            this.f50143f[0] = -1;
            c14054f.f50179K++;
            c14054f.m40016a(c14050b);
            this.f50138a++;
            if (this.f50147j) {
                return;
            }
            int i14 = this.f50146i + 1;
            this.f50146i = i14;
            int[] iArr = this.f50142e;
            if (i14 >= iArr.length) {
                this.f50147j = true;
                this.f50146i = iArr.length - 1;
                return;
            }
            return;
        }
        int i15 = -1;
        for (int i16 = 0; i13 != -1 && i16 < this.f50138a; i16++) {
            int i17 = this.f50142e[i13];
            int i18 = c14054f.f50182x;
            if (i17 == i18) {
                this.f50144g[i13] = f13;
                return;
            }
            if (i17 < i18) {
                i15 = i13;
            }
            i13 = this.f50143f[i13];
        }
        int length = this.f50146i;
        int i19 = length + 1;
        if (this.f50147j) {
            int[] iArr2 = this.f50142e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i19;
        }
        int[] iArr3 = this.f50142e;
        if (length >= iArr3.length && this.f50138a < iArr3.length) {
            int i24 = 0;
            while (true) {
                int[] iArr4 = this.f50142e;
                if (i24 >= iArr4.length) {
                    break;
                }
                if (iArr4[i24] == -1) {
                    length = i24;
                    break;
                }
                i24++;
            }
        }
        int[] iArr5 = this.f50142e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i25 = this.f50141d * 2;
            this.f50141d = i25;
            this.f50147j = false;
            this.f50146i = length - 1;
            this.f50144g = Arrays.copyOf(this.f50144g, i25);
            this.f50142e = Arrays.copyOf(this.f50142e, this.f50141d);
            this.f50143f = Arrays.copyOf(this.f50143f, this.f50141d);
        }
        this.f50142e[length] = c14054f.f50182x;
        this.f50144g[length] = f13;
        if (i15 != -1) {
            int[] iArr6 = this.f50143f;
            iArr6[length] = iArr6[i15];
            iArr6[i15] = length;
        } else {
            this.f50143f[length] = this.f50145h;
            this.f50145h = length;
        }
        c14054f.f50179K++;
        c14054f.m40016a(c14050b);
        int i26 = this.f50138a + 1;
        this.f50138a = i26;
        if (!this.f50147j) {
            this.f50146i++;
        }
        int[] iArr7 = this.f50142e;
        if (i26 >= iArr7.length) {
            this.f50147j = true;
        }
        if (this.f50146i >= iArr7.length) {
            this.f50147j = true;
            this.f50146i = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final float m39984h(C14054f c14054f, boolean z4) {
        int i13 = this.f50145h;
        if (i13 == -1) {
            return 0.0f;
        }
        int i14 = 0;
        int i15 = -1;
        while (i13 != -1 && i14 < this.f50138a) {
            if (this.f50142e[i13] == c14054f.f50182x) {
                if (i13 == this.f50145h) {
                    this.f50145h = this.f50143f[i13];
                } else {
                    int[] iArr = this.f50143f;
                    iArr[i15] = iArr[i13];
                }
                if (z4) {
                    c14054f.m40017b(this.f50139b);
                }
                c14054f.f50179K--;
                this.f50138a--;
                this.f50142e[i13] = -1;
                if (this.f50147j) {
                    this.f50146i = i13;
                }
                return this.f50144g[i13];
            }
            i14++;
            i15 = i13;
            i13 = this.f50143f[i13];
        }
        return 0.0f;
    }

    public final String toString() {
        int i13 = this.f50145h;
        String string = "";
        for (int i14 = 0; i13 != -1 && i14 < this.f50138a; i14++) {
            StringBuilder sbM53374o = AbstractC18489d0.m53374o(AbstractC30007c.m91837g(this.f50144g[i13], " : ", AbstractC18489d0.m53374o(AbstractC2875y.m8299l(string, " -> "))));
            sbM53374o.append(((C14054f[]) this.f50140c.f814z)[this.f50142e[i13]]);
            string = sbM53374o.toString();
            i13 = this.f50143f[i13];
        }
        return string;
    }
}
