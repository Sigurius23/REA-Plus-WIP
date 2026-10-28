package p576w8;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: w8.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C36932b {

    /* JADX INFO: renamed from: A */
    public static final String f158026A;

    /* JADX INFO: renamed from: B */
    public static final String f158027B;

    /* JADX INFO: renamed from: C */
    public static final String f158028C;

    /* JADX INFO: renamed from: D */
    public static final String f158029D;

    /* JADX INFO: renamed from: E */
    public static final String f158030E;

    /* JADX INFO: renamed from: F */
    public static final String f158031F;

    /* JADX INFO: renamed from: G */
    public static final String f158032G;

    /* JADX INFO: renamed from: H */
    public static final String f158033H;

    /* JADX INFO: renamed from: I */
    public static final String f158034I;

    /* JADX INFO: renamed from: J */
    public static final String f158035J;

    /* JADX INFO: renamed from: r */
    public static final String f158036r;

    /* JADX INFO: renamed from: s */
    public static final String f158037s;

    /* JADX INFO: renamed from: t */
    public static final String f158038t;

    /* JADX INFO: renamed from: u */
    public static final String f158039u;

    /* JADX INFO: renamed from: v */
    public static final String f158040v;

    /* JADX INFO: renamed from: w */
    public static final String f158041w;

    /* JADX INFO: renamed from: x */
    public static final String f158042x;

    /* JADX INFO: renamed from: y */
    public static final String f158043y;

    /* JADX INFO: renamed from: z */
    public static final String f158044z;

    /* JADX INFO: renamed from: a */
    public final CharSequence f158045a;

    /* JADX INFO: renamed from: b */
    public final Layout.Alignment f158046b;

    /* JADX INFO: renamed from: c */
    public final Layout.Alignment f158047c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f158048d;

    /* JADX INFO: renamed from: e */
    public final float f158049e;

    /* JADX INFO: renamed from: f */
    public final int f158050f;

    /* JADX INFO: renamed from: g */
    public final int f158051g;

    /* JADX INFO: renamed from: h */
    public final float f158052h;

    /* JADX INFO: renamed from: i */
    public final int f158053i;

    /* JADX INFO: renamed from: j */
    public final float f158054j;

    /* JADX INFO: renamed from: k */
    public final float f158055k;

    /* JADX INFO: renamed from: l */
    public final boolean f158056l;

    /* JADX INFO: renamed from: m */
    public final int f158057m;

    /* JADX INFO: renamed from: n */
    public final int f158058n;

    /* JADX INFO: renamed from: o */
    public final float f158059o;

    /* JADX INFO: renamed from: p */
    public final int f158060p;

    /* JADX INFO: renamed from: q */
    public final float f158061q;

    static {
        new C36932b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i13 = AbstractC38065t.f163031a;
        f158036r = Integer.toString(0, 36);
        f158037s = Integer.toString(17, 36);
        f158038t = Integer.toString(1, 36);
        f158039u = Integer.toString(2, 36);
        f158040v = Integer.toString(3, 36);
        f158041w = Integer.toString(18, 36);
        f158042x = Integer.toString(4, 36);
        f158043y = Integer.toString(5, 36);
        f158044z = Integer.toString(6, 36);
        f158026A = Integer.toString(7, 36);
        f158027B = Integer.toString(8, 36);
        f158028C = Integer.toString(9, 36);
        f158029D = Integer.toString(10, 36);
        f158030E = Integer.toString(11, 36);
        f158031F = Integer.toString(12, 36);
        f158032G = Integer.toString(13, 36);
        f158033H = Integer.toString(14, 36);
        f158034I = Integer.toString(15, 36);
        f158035J = Integer.toString(16, 36);
    }

    public C36932b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f13, int i13, int i14, float f14, int i15, int i16, float f15, float f16, float f17, boolean z4, int i17, int i18, float f18) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC35849g.m113802d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f158045a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f158045a = charSequence.toString();
        } else {
            this.f158045a = null;
        }
        this.f158046b = alignment;
        this.f158047c = alignment2;
        this.f158048d = bitmap;
        this.f158049e = f13;
        this.f158050f = i13;
        this.f158051g = i14;
        this.f158052h = f14;
        this.f158053i = i15;
        this.f158054j = f16;
        this.f158055k = f17;
        this.f158056l = z4;
        this.f158057m = i17;
        this.f158058n = i16;
        this.f158059o = f15;
        this.f158060p = i18;
        this.f158061q = f18;
    }

    /* JADX INFO: renamed from: a */
    public final C36931a m118551a() {
        C36931a c36931a = new C36931a();
        c36931a.f158009a = this.f158045a;
        c36931a.f158010b = this.f158048d;
        c36931a.f158011c = this.f158046b;
        c36931a.f158012d = this.f158047c;
        c36931a.f158013e = this.f158049e;
        c36931a.f158014f = this.f158050f;
        c36931a.f158015g = this.f158051g;
        c36931a.f158016h = this.f158052h;
        c36931a.f158017i = this.f158053i;
        c36931a.f158018j = this.f158058n;
        c36931a.f158019k = this.f158059o;
        c36931a.f158020l = this.f158054j;
        c36931a.f158021m = this.f158055k;
        c36931a.f158022n = this.f158056l;
        c36931a.f158023o = this.f158057m;
        c36931a.f158024p = this.f158060p;
        c36931a.f158025q = this.f158061q;
        return c36931a;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && C36932b.class == obj.getClass()) {
            C36932b c36932b = (C36932b) obj;
            Bitmap bitmap2 = c36932b.f158048d;
            if (TextUtils.equals(this.f158045a, c36932b.f158045a) && this.f158046b == c36932b.f158046b && this.f158047c == c36932b.f158047c && ((bitmap = this.f158048d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f158049e == c36932b.f158049e && this.f158050f == c36932b.f158050f && this.f158051g == c36932b.f158051g && this.f158052h == c36932b.f158052h && this.f158053i == c36932b.f158053i && this.f158054j == c36932b.f158054j && this.f158055k == c36932b.f158055k && this.f158056l == c36932b.f158056l && this.f158057m == c36932b.f158057m && this.f158058n == c36932b.f158058n && this.f158059o == c36932b.f158059o && this.f158060p == c36932b.f158060p && this.f158061q == c36932b.f158061q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f158045a, this.f158046b, this.f158047c, this.f158048d, Float.valueOf(this.f158049e), Integer.valueOf(this.f158050f), Integer.valueOf(this.f158051g), Float.valueOf(this.f158052h), Integer.valueOf(this.f158053i), Float.valueOf(this.f158054j), Float.valueOf(this.f158055k), Boolean.valueOf(this.f158056l), Integer.valueOf(this.f158057m), Integer.valueOf(this.f158058n), Float.valueOf(this.f158059o), Integer.valueOf(this.f158060p), Float.valueOf(this.f158061q));
    }
}
