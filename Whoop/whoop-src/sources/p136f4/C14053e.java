package p136f4;

import com.google.crypto.tink.internal.C5101l0;
import java.util.Arrays;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: f4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C14053e extends C14050b {

    /* JADX INFO: renamed from: f */
    public C14054f[] f50170f;

    /* JADX INFO: renamed from: g */
    public int f50171g;

    /* JADX INFO: renamed from: h */
    public C5101l0 f50172h;

    @Override // p136f4.C14050b
    /* JADX INFO: renamed from: d */
    public final C14054f mo39988d(boolean[] zArr) {
        int i13 = -1;
        for (int i14 = 0; i14 < this.f50171g; i14++) {
            C14054f[] c14054fArr = this.f50170f;
            C14054f c14054f = c14054fArr[i14];
            if (!zArr[c14054f.f50182x]) {
                C5101l0 c5101l0 = this.f50172h;
                c5101l0.f21443x = c14054f;
                int i15 = 8;
                if (i13 != -1) {
                    C14054f c14054f2 = c14054fArr[i13];
                    while (i15 >= 0) {
                        float f13 = c14054f2.f50176H[i15];
                        float f14 = ((C14054f) c5101l0.f21443x).f50176H[i15];
                        if (f14 != f13) {
                            if (f14 >= f13) {
                                break;
                            }
                            i13 = i14;
                            break;
                            break;
                        }
                        i15--;
                    }
                } else {
                    while (i15 >= 0) {
                        float f15 = ((C14054f) c5101l0.f21443x).f50176H[i15];
                        if (f15 > 0.0f) {
                            break;
                        }
                        if (f15 < 0.0f) {
                            i13 = i14;
                            break;
                        }
                        i15--;
                    }
                }
            }
        }
        if (i13 == -1) {
            return null;
        }
        return this.f50170f[i13];
    }

    @Override // p136f4.C14050b
    /* JADX INFO: renamed from: e */
    public final boolean mo39989e() {
        return this.f50171g == 0;
    }

    @Override // p136f4.C14050b
    /* JADX INFO: renamed from: i */
    public final void mo39993i(C14051c c14051c, C14050b c14050b, boolean z4) {
        C14054f c14054f = c14050b.f50148a;
        if (c14054f == null) {
            return;
        }
        float[] fArr = c14054f.f50176H;
        C14049a c14049a = c14050b.f50151d;
        int iM39980d = c14049a.m39980d();
        for (int i13 = 0; i13 < iM39980d; i13++) {
            C14054f c14054fM39981e = c14049a.m39981e(i13);
            float fM39982f = c14049a.m39982f(i13);
            C5101l0 c5101l0 = this.f50172h;
            c5101l0.f21443x = c14054fM39981e;
            if (c14054fM39981e.f50181w) {
                boolean z13 = true;
                for (int i14 = 0; i14 < 9; i14++) {
                    float[] fArr2 = ((C14054f) c5101l0.f21443x).f50176H;
                    float f13 = (fArr[i14] * fM39982f) + fArr2[i14];
                    fArr2[i14] = f13;
                    if (Math.abs(f13) < 1.0E-4f) {
                        ((C14054f) c5101l0.f21443x).f50176H[i14] = 0.0f;
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    ((C14053e) c5101l0.f21444y).m40015k((C14054f) c5101l0.f21443x);
                }
            } else {
                for (int i15 = 0; i15 < 9; i15++) {
                    float f14 = fArr[i15];
                    if (f14 != 0.0f) {
                        float f15 = f14 * fM39982f;
                        if (Math.abs(f15) < 1.0E-4f) {
                            f15 = 0.0f;
                        }
                        ((C14054f) c5101l0.f21443x).f50176H[i15] = f15;
                    } else {
                        ((C14054f) c5101l0.f21443x).f50176H[i15] = 0.0f;
                    }
                }
                m40014j(c14054fM39981e);
            }
            this.f50149b = (c14050b.f50149b * fM39982f) + this.f50149b;
        }
        m40015k(c14054f);
    }

    /* JADX INFO: renamed from: j */
    public final void m40014j(C14054f c14054f) {
        int i13 = this.f50171g + 1;
        C14054f[] c14054fArr = this.f50170f;
        if (i13 > c14054fArr.length) {
            C14054f[] c14054fArr2 = (C14054f[]) Arrays.copyOf(c14054fArr, c14054fArr.length * 2);
            this.f50170f = c14054fArr2;
        }
        C14054f[] c14054fArr3 = this.f50170f;
        int i14 = this.f50171g;
        c14054fArr3[i14] = c14054f;
        int i15 = i14 + 1;
        this.f50171g = i15;
        if (i15 > 1) {
            int i16 = c14054f.f50182x;
        }
        c14054f.f50181w = true;
        c14054f.m40016a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m40015k(C14054f c14054f) {
        int i13 = 0;
        while (i13 < this.f50171g) {
            if (this.f50170f[i13] == c14054f) {
                while (true) {
                    int i14 = this.f50171g;
                    if (i13 >= i14 - 1) {
                        this.f50171g = i14 - 1;
                        c14054f.f50181w = false;
                        return;
                    } else {
                        C14054f[] c14054fArr = this.f50170f;
                        int i15 = i13 + 1;
                        c14054fArr[i13] = c14054fArr[i15];
                        i13 = i15;
                    }
                }
            } else {
                i13++;
            }
        }
    }

    @Override // p136f4.C14050b
    public final String toString() {
        C5101l0 c5101l0 = this.f50172h;
        String strM91837g = AbstractC30007c.m91837g(this.f50149b, ") : ", new StringBuilder(" goal -> ("));
        for (int i13 = 0; i13 < this.f50171g; i13++) {
            c5101l0.f21443x = this.f50170f[i13];
            strM91837g = strM91837g + c5101l0 + " ";
        }
        return strM91837g;
    }
}
