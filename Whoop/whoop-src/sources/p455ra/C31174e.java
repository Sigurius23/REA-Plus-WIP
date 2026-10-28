package p455ra;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ra.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C31174e {

    /* JADX INFO: renamed from: A */
    public static final boolean[] f128424A;

    /* JADX INFO: renamed from: B */
    public static final int[] f128425B;

    /* JADX INFO: renamed from: C */
    public static final int[] f128426C;

    /* JADX INFO: renamed from: D */
    public static final int[] f128427D;

    /* JADX INFO: renamed from: E */
    public static final int[] f128428E;

    /* JADX INFO: renamed from: v */
    public static final int f128429v = m95899c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w */
    public static final int f128430w;

    /* JADX INFO: renamed from: x */
    public static final int[] f128431x;

    /* JADX INFO: renamed from: y */
    public static final int[] f128432y;

    /* JADX INFO: renamed from: z */
    public static final int[] f128433z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f128434a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final SpannableStringBuilder f128435b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c */
    public boolean f128436c;

    /* JADX INFO: renamed from: d */
    public boolean f128437d;

    /* JADX INFO: renamed from: e */
    public int f128438e;

    /* JADX INFO: renamed from: f */
    public boolean f128439f;

    /* JADX INFO: renamed from: g */
    public int f128440g;

    /* JADX INFO: renamed from: h */
    public int f128441h;

    /* JADX INFO: renamed from: i */
    public int f128442i;

    /* JADX INFO: renamed from: j */
    public int f128443j;

    /* JADX INFO: renamed from: k */
    public int f128444k;

    /* JADX INFO: renamed from: l */
    public int f128445l;

    /* JADX INFO: renamed from: m */
    public int f128446m;

    /* JADX INFO: renamed from: n */
    public int f128447n;

    /* JADX INFO: renamed from: o */
    public int f128448o;

    /* JADX INFO: renamed from: p */
    public int f128449p;

    /* JADX INFO: renamed from: q */
    public int f128450q;

    /* JADX INFO: renamed from: r */
    public int f128451r;

    /* JADX INFO: renamed from: s */
    public int f128452s;

    /* JADX INFO: renamed from: t */
    public int f128453t;

    /* JADX INFO: renamed from: u */
    public int f128454u;

    static {
        int iM95899c = m95899c(0, 0, 0, 0);
        f128430w = iM95899c;
        int iM95899c2 = m95899c(0, 0, 0, 3);
        f128431x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f128432y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f128433z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f128424A = new boolean[]{false, false, false, true, true, true, false};
        f128425B = new int[]{iM95899c, iM95899c2, iM95899c, iM95899c, iM95899c2, iM95899c, iM95899c};
        f128426C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f128427D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f128428E = new int[]{iM95899c, iM95899c, iM95899c, iM95899c, iM95899c, iM95899c2, iM95899c2};
    }

    public C31174e() {
        m95902d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: c */
    public static int m95899c(int i13, int i14, int i15, int i16) {
        int i17;
        AbstractC35849g.m113804f(i13, 4);
        AbstractC35849g.m113804f(i14, 4);
        AbstractC35849g.m113804f(i15, 4);
        AbstractC35849g.m113804f(i16, 4);
        if (i16 == 0 || i16 == 1) {
            i17 = 255;
        } else if (i16 == 2) {
            i17 = 127;
        } else if (i16 != 3) {
            i17 = 255;
        } else {
            i17 = 0;
        }
        return Color.argb(i17, i13 > 1 ? 255 : 0, i14 > 1 ? 255 : 0, i15 <= 1 ? 0 : 255);
    }

    /* JADX INFO: renamed from: a */
    public final void m95900a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f128435b;
        if (c3 != '\n') {
            spannableStringBuilder.append(c3);
            return;
        }
        SpannableString spannableStringM95901b = m95901b();
        ArrayList arrayList = this.f128434a;
        arrayList.add(spannableStringM95901b);
        spannableStringBuilder.clear();
        if (this.f128448o != -1) {
            this.f128448o = 0;
        }
        if (this.f128449p != -1) {
            this.f128449p = 0;
        }
        if (this.f128450q != -1) {
            this.f128450q = 0;
        }
        if (this.f128452s != -1) {
            this.f128452s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f128443j && arrayList.size() < 15) {
                this.f128454u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final SpannableString m95901b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f128435b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f128448o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f128448o, length, 33);
            }
            if (this.f128449p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f128449p, length, 33);
            }
            if (this.f128450q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f128451r), this.f128450q, length, 33);
            }
            if (this.f128452s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f128453t), this.f128452s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: d */
    public final void m95902d() {
        this.f128434a.clear();
        this.f128435b.clear();
        this.f128448o = -1;
        this.f128449p = -1;
        this.f128450q = -1;
        this.f128452s = -1;
        this.f128454u = 0;
        this.f128436c = false;
        this.f128437d = false;
        this.f128438e = 4;
        this.f128439f = false;
        this.f128440g = 0;
        this.f128441h = 0;
        this.f128442i = 0;
        this.f128443j = 15;
        this.f128444k = 0;
        this.f128445l = 0;
        this.f128446m = 0;
        int i13 = f128430w;
        this.f128447n = i13;
        this.f128451r = f128429v;
        this.f128453t = i13;
    }

    /* JADX INFO: renamed from: e */
    public final void m95903e(boolean z4, boolean z13) {
        int i13 = this.f128448o;
        SpannableStringBuilder spannableStringBuilder = this.f128435b;
        if (i13 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f128448o, spannableStringBuilder.length(), 33);
                this.f128448o = -1;
            }
        } else if (z4) {
            this.f128448o = spannableStringBuilder.length();
        }
        if (this.f128449p == -1) {
            if (z13) {
                this.f128449p = spannableStringBuilder.length();
            }
        } else {
            if (z13) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f128449p, spannableStringBuilder.length(), 33);
            this.f128449p = -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m95904f(int i13, int i14) {
        int i15 = this.f128450q;
        SpannableStringBuilder spannableStringBuilder = this.f128435b;
        if (i15 != -1 && this.f128451r != i13) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f128451r), this.f128450q, spannableStringBuilder.length(), 33);
        }
        if (i13 != f128429v) {
            this.f128450q = spannableStringBuilder.length();
            this.f128451r = i13;
        }
        if (this.f128452s != -1 && this.f128453t != i14) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f128453t), this.f128452s, spannableStringBuilder.length(), 33);
        }
        if (i14 != f128430w) {
            this.f128452s = spannableStringBuilder.length();
            this.f128453t = i14;
        }
    }
}
