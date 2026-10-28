package p654yn;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p309lo.AbstractC24543a;

/* JADX INFO: renamed from: yn.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C39665e {

    /* JADX INFO: renamed from: A */
    public static final int[] f170668A;

    /* JADX INFO: renamed from: B */
    public static final boolean[] f170669B;

    /* JADX INFO: renamed from: C */
    public static final int[] f170670C;

    /* JADX INFO: renamed from: D */
    public static final int[] f170671D;

    /* JADX INFO: renamed from: E */
    public static final int[] f170672E;

    /* JADX INFO: renamed from: F */
    public static final int[] f170673F;

    /* JADX INFO: renamed from: w */
    public static final int f170674w = m126805c(2, 2, 2, 0);

    /* JADX INFO: renamed from: x */
    public static final int f170675x;

    /* JADX INFO: renamed from: y */
    public static final int[] f170676y;

    /* JADX INFO: renamed from: z */
    public static final int[] f170677z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f170678a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final SpannableStringBuilder f170679b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c */
    public boolean f170680c;

    /* JADX INFO: renamed from: d */
    public boolean f170681d;

    /* JADX INFO: renamed from: e */
    public int f170682e;

    /* JADX INFO: renamed from: f */
    public boolean f170683f;

    /* JADX INFO: renamed from: g */
    public int f170684g;

    /* JADX INFO: renamed from: h */
    public int f170685h;

    /* JADX INFO: renamed from: i */
    public int f170686i;

    /* JADX INFO: renamed from: j */
    public int f170687j;

    /* JADX INFO: renamed from: k */
    public boolean f170688k;

    /* JADX INFO: renamed from: l */
    public int f170689l;

    /* JADX INFO: renamed from: m */
    public int f170690m;

    /* JADX INFO: renamed from: n */
    public int f170691n;

    /* JADX INFO: renamed from: o */
    public int f170692o;

    /* JADX INFO: renamed from: p */
    public int f170693p;

    /* JADX INFO: renamed from: q */
    public int f170694q;

    /* JADX INFO: renamed from: r */
    public int f170695r;

    /* JADX INFO: renamed from: s */
    public int f170696s;

    /* JADX INFO: renamed from: t */
    public int f170697t;

    /* JADX INFO: renamed from: u */
    public int f170698u;

    /* JADX INFO: renamed from: v */
    public int f170699v;

    static {
        int iM126805c = m126805c(0, 0, 0, 0);
        f170675x = iM126805c;
        int iM126805c2 = m126805c(0, 0, 0, 3);
        f170676y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f170677z = new int[]{0, 0, 0, 0, 0, 0, 2};
        f170668A = new int[]{3, 3, 3, 3, 3, 3, 1};
        f170669B = new boolean[]{false, false, false, true, true, true, false};
        f170670C = new int[]{iM126805c, iM126805c2, iM126805c, iM126805c, iM126805c2, iM126805c, iM126805c};
        f170671D = new int[]{0, 1, 2, 3, 4, 3, 4};
        f170672E = new int[]{0, 0, 0, 0, 0, 3, 3};
        f170673F = new int[]{iM126805c, iM126805c, iM126805c, iM126805c, iM126805c, iM126805c2, iM126805c2};
    }

    public C39665e() {
        m126808d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: c */
    public static int m126805c(int i13, int i14, int i15, int i16) {
        int i17;
        AbstractC24543a.m71572h(i13, 4);
        AbstractC24543a.m71572h(i14, 4);
        AbstractC24543a.m71572h(i15, 4);
        AbstractC24543a.m71572h(i16, 4);
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
    public final void m126806a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f170679b;
        if (c3 != '\n') {
            spannableStringBuilder.append(c3);
            return;
        }
        SpannableString spannableStringM126807b = m126807b();
        ArrayList arrayList = this.f170678a;
        arrayList.add(spannableStringM126807b);
        spannableStringBuilder.clear();
        if (this.f170693p != -1) {
            this.f170693p = 0;
        }
        if (this.f170694q != -1) {
            this.f170694q = 0;
        }
        if (this.f170695r != -1) {
            this.f170695r = 0;
        }
        if (this.f170697t != -1) {
            this.f170697t = 0;
        }
        while (true) {
            if ((!this.f170688k || arrayList.size() < this.f170687j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final SpannableString m126807b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f170679b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f170693p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f170693p, length, 33);
            }
            if (this.f170694q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f170694q, length, 33);
            }
            if (this.f170695r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f170696s), this.f170695r, length, 33);
            }
            if (this.f170697t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f170698u), this.f170697t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: d */
    public final void m126808d() {
        this.f170678a.clear();
        this.f170679b.clear();
        this.f170693p = -1;
        this.f170694q = -1;
        this.f170695r = -1;
        this.f170697t = -1;
        this.f170699v = 0;
        this.f170680c = false;
        this.f170681d = false;
        this.f170682e = 4;
        this.f170683f = false;
        this.f170684g = 0;
        this.f170685h = 0;
        this.f170686i = 0;
        this.f170687j = 15;
        this.f170688k = true;
        this.f170689l = 0;
        this.f170690m = 0;
        this.f170691n = 0;
        int i13 = f170675x;
        this.f170692o = i13;
        this.f170696s = f170674w;
        this.f170698u = i13;
    }

    /* JADX INFO: renamed from: e */
    public final void m126809e(boolean z4, boolean z13) {
        int i13 = this.f170693p;
        SpannableStringBuilder spannableStringBuilder = this.f170679b;
        if (i13 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f170693p, spannableStringBuilder.length(), 33);
                this.f170693p = -1;
            }
        } else if (z4) {
            this.f170693p = spannableStringBuilder.length();
        }
        if (this.f170694q == -1) {
            if (z13) {
                this.f170694q = spannableStringBuilder.length();
            }
        } else {
            if (z13) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f170694q, spannableStringBuilder.length(), 33);
            this.f170694q = -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m126810f(int i13, int i14) {
        int i15 = this.f170695r;
        SpannableStringBuilder spannableStringBuilder = this.f170679b;
        if (i15 != -1 && this.f170696s != i13) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f170696s), this.f170695r, spannableStringBuilder.length(), 33);
        }
        if (i13 != f170674w) {
            this.f170695r = spannableStringBuilder.length();
            this.f170696s = i13;
        }
        if (this.f170697t != -1 && this.f170698u != i14) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f170698u), this.f170697t, spannableStringBuilder.length(), 33);
        }
        if (i14 != f170675x) {
            this.f170697t = spannableStringBuilder.length();
            this.f170698u = i14;
        }
    }
}
