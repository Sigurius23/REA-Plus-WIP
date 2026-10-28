package p136f4;

import com.whoop.service.network.model.UserSessionDto;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import p005a3.C0237p;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: f4.b */
/* JADX INFO: loaded from: classes.dex */
public class C14050b {

    /* JADX INFO: renamed from: d */
    public final C14049a f50151d;

    /* JADX INFO: renamed from: a */
    public C14054f f50148a = null;

    /* JADX INFO: renamed from: b */
    public float f50149b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList f50150c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f50152e = false;

    public C14050b(C0237p c0237p) {
        this.f50151d = new C14049a(this, c0237p);
    }

    /* JADX INFO: renamed from: a */
    public final void m39985a(C14051c c14051c, int i13) {
        this.f50151d.m39983g(c14051c.m40004j(i13), 1.0f);
        this.f50151d.m39983g(c14051c.m40004j(i13), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m39986b(C14054f c14054f, C14054f c14054f2, C14054f c14054f3, int i13) {
        boolean z4 = false;
        if (i13 != 0) {
            if (i13 < 0) {
                i13 *= -1;
                z4 = true;
            }
            this.f50149b = i13;
        }
        if (z4) {
            this.f50151d.m39983g(c14054f, 1.0f);
            this.f50151d.m39983g(c14054f2, -1.0f);
            this.f50151d.m39983g(c14054f3, -1.0f);
        } else {
            this.f50151d.m39983g(c14054f, -1.0f);
            this.f50151d.m39983g(c14054f2, 1.0f);
            this.f50151d.m39983g(c14054f3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m39987c(C14054f c14054f, C14054f c14054f2, C14054f c14054f3, int i13) {
        boolean z4 = false;
        if (i13 != 0) {
            if (i13 < 0) {
                i13 *= -1;
                z4 = true;
            }
            this.f50149b = i13;
        }
        if (z4) {
            this.f50151d.m39983g(c14054f, 1.0f);
            this.f50151d.m39983g(c14054f2, -1.0f);
            this.f50151d.m39983g(c14054f3, 1.0f);
        } else {
            this.f50151d.m39983g(c14054f, -1.0f);
            this.f50151d.m39983g(c14054f2, 1.0f);
            this.f50151d.m39983g(c14054f3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public C14054f mo39988d(boolean[] zArr) {
        return m39990f(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo39989e() {
        return this.f50148a == null && this.f50149b == 0.0f && this.f50151d.m39980d() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final C14054f m39990f(boolean[] zArr, C14054f c14054f) {
        int i13;
        int iM39980d = this.f50151d.m39980d();
        C14054f c14054f2 = null;
        float f13 = 0.0f;
        for (int i14 = 0; i14 < iM39980d; i14++) {
            float fM39982f = this.f50151d.m39982f(i14);
            if (fM39982f < 0.0f) {
                C14054f c14054fM39981e = this.f50151d.m39981e(i14);
                if ((zArr == null || !zArr[c14054fM39981e.f50182x]) && c14054fM39981e != c14054f && (((i13 = c14054fM39981e.f50180L) == 3 || i13 == 4) && fM39982f < f13)) {
                    f13 = fM39982f;
                    c14054f2 = c14054fM39981e;
                }
            }
        }
        return c14054f2;
    }

    /* JADX INFO: renamed from: g */
    public final void m39991g(C14054f c14054f) {
        C14054f c14054f2 = this.f50148a;
        if (c14054f2 != null) {
            this.f50151d.m39983g(c14054f2, -1.0f);
            this.f50148a.f50183y = -1;
            this.f50148a = null;
        }
        float fM39984h = this.f50151d.m39984h(c14054f, true) * (-1.0f);
        this.f50148a = c14054f;
        if (fM39984h == 1.0f) {
            return;
        }
        this.f50149b /= fM39984h;
        C14049a c14049a = this.f50151d;
        int i13 = c14049a.f50145h;
        for (int i14 = 0; i13 != -1 && i14 < c14049a.f50138a; i14++) {
            float[] fArr = c14049a.f50144g;
            fArr[i13] = fArr[i13] / fM39984h;
            i13 = c14049a.f50143f[i13];
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m39992h(C14051c c14051c, C14054f c14054f, boolean z4) {
        if (c14054f.f50174F) {
            float fM39979c = this.f50151d.m39979c(c14054f);
            this.f50149b = (c14054f.f50173E * fM39979c) + this.f50149b;
            this.f50151d.m39984h(c14054f, z4);
            if (z4) {
                c14054f.m40017b(this);
            }
            if (this.f50151d.m39980d() == 0) {
                this.f50152e = true;
                c14051c.f50155b = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo39993i(C14051c c14051c, C14050b c14050b, boolean z4) {
        C14049a c14049a = this.f50151d;
        c14049a.getClass();
        float fM39979c = c14049a.m39979c(c14050b.f50148a);
        c14049a.m39984h(c14050b.f50148a, z4);
        C14049a c14049a2 = c14050b.f50151d;
        int iM39980d = c14049a2.m39980d();
        for (int i13 = 0; i13 < iM39980d; i13++) {
            C14054f c14054fM39981e = c14049a2.m39981e(i13);
            c14049a.m39977a(c14054fM39981e, c14049a2.m39979c(c14054fM39981e) * fM39979c, z4);
        }
        this.f50149b = (c14050b.f50149b * fM39979c) + this.f50149b;
        if (z4) {
            c14050b.f50148a.m40017b(this);
        }
        if (this.f50148a == null || this.f50151d.m39980d() != 0) {
            return;
        }
        this.f50152e = true;
        c14051c.f50155b = true;
    }

    public String toString() {
        boolean z4;
        String strM8299l = AbstractC2875y.m8299l(this.f50148a == null ? UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE : "" + this.f50148a, " = ");
        if (this.f50149b != 0.0f) {
            StringBuilder sbM53374o = AbstractC18489d0.m53374o(strM8299l);
            sbM53374o.append(this.f50149b);
            strM8299l = sbM53374o.toString();
            z4 = true;
        } else {
            z4 = false;
        }
        int iM39980d = this.f50151d.m39980d();
        for (int i13 = 0; i13 < iM39980d; i13++) {
            C14054f c14054fM39981e = this.f50151d.m39981e(i13);
            if (c14054fM39981e != null) {
                float fM39982f = this.f50151d.m39982f(i13);
                if (fM39982f != 0.0f) {
                    String string = c14054fM39981e.toString();
                    if (z4) {
                        if (fM39982f > 0.0f) {
                            strM8299l = AbstractC2875y.m8299l(strM8299l, " + ");
                        } else {
                            strM8299l = AbstractC2875y.m8299l(strM8299l, " - ");
                            fM39982f *= -1.0f;
                        }
                    } else if (fM39982f < 0.0f) {
                        strM8299l = AbstractC2875y.m8299l(strM8299l, "- ");
                        fM39982f *= -1.0f;
                    }
                    strM8299l = fM39982f == 1.0f ? AbstractC2875y.m8299l(strM8299l, string) : strM8299l + fM39982f + " " + string;
                    z4 = true;
                }
            }
        }
        return !z4 ? AbstractC2875y.m8299l(strM8299l, "0.0") : strM8299l;
    }
}
