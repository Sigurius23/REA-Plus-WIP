package p455ra;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p576w8.C36932b;

/* JADX INFO: renamed from: ra.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C31171b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f128387a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f128388b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f128389c;

    /* JADX INFO: renamed from: d */
    public int f128390d;

    /* JADX INFO: renamed from: e */
    public int f128391e;

    /* JADX INFO: renamed from: f */
    public int f128392f;

    /* JADX INFO: renamed from: g */
    public int f128393g;

    /* JADX INFO: renamed from: h */
    public int f128394h;

    public C31171b(int i13, int i14) {
        ArrayList arrayList = new ArrayList();
        this.f128387a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f128388b = arrayList2;
        StringBuilder sb4 = new StringBuilder();
        this.f128389c = sb4;
        this.f128393g = i13;
        arrayList.clear();
        arrayList2.clear();
        sb4.setLength(0);
        this.f128390d = 15;
        this.f128391e = 0;
        this.f128392f = 0;
        this.f128394h = i14;
    }

    /* JADX INFO: renamed from: a */
    public final void m95887a(char c3) {
        StringBuilder sb4 = this.f128389c;
        if (sb4.length() < 32) {
            sb4.append(c3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m95888b() {
        StringBuilder sb4 = this.f128389c;
        int length = sb4.length();
        if (length > 0) {
            sb4.delete(length - 1, length);
            ArrayList arrayList = this.f128387a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C31170a c31170a = (C31170a) arrayList.get(size);
                int i13 = c31170a.f128386c;
                if (i13 != length) {
                    return;
                }
                c31170a.f128386c = i13 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C36932b m95889c(int i13) {
        int i14;
        float f13;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i15 = 0;
        while (true) {
            ArrayList arrayList = this.f128388b;
            if (i15 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i15));
            spannableStringBuilder.append('\n');
            i15++;
        }
        spannableStringBuilder.append((CharSequence) m95890d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i16 = this.f128391e + this.f128392f;
        int length = (32 - i16) - spannableStringBuilder.length();
        int i17 = i16 - length;
        if (i13 != Integer.MIN_VALUE) {
            i14 = i13;
        } else if (this.f128393g != 2 || (Math.abs(i17) >= 3 && length >= 0)) {
            i14 = (this.f128393g != 2 || i17 <= 0) ? 0 : 2;
        } else {
            i14 = 1;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                i16 = 32 - length;
            }
            f13 = ((i16 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f13 = 0.5f;
        }
        float f14 = f13;
        int i18 = this.f128390d;
        if (i18 > 7) {
            i18 -= 17;
        } else if (this.f128393g == 1) {
            i18 -= this.f128394h - 1;
        }
        return new C36932b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, Integer.MIN_VALUE, f14, i14, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableString m95890d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f128389c);
        int length = spannableStringBuilder.length();
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f128387a;
            if (i17 >= arrayList.size()) {
                break;
            }
            C31170a c31170a = (C31170a) arrayList.get(i17);
            boolean z13 = c31170a.f128385b;
            int i19 = c31170a.f128384a;
            if (i19 != 8) {
                boolean z14 = i19 == 7;
                if (i19 != 7) {
                    i16 = C31172c.f128396B[i19];
                }
                z4 = z14;
            }
            int i24 = c31170a.f128386c;
            i17++;
            if (i24 != (i17 < arrayList.size() ? ((C31170a) arrayList.get(i17)).f128386c : length)) {
                if (i13 != -1 && !z13) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i24, 33);
                    i13 = -1;
                } else if (i13 == -1 && z13) {
                    i13 = i24;
                }
                if (i14 != -1 && !z4) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i14, i24, 33);
                    i14 = -1;
                } else if (i14 == -1 && z4) {
                    i14 = i24;
                }
                if (i16 != i15) {
                    if (i15 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i18, i24, 33);
                    }
                    i15 = i16;
                    i18 = i24;
                }
            }
        }
        if (i13 != -1 && i13 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
        }
        if (i14 != -1 && i14 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i14, length, 33);
        }
        if (i18 != length && i15 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i18, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95891e() {
        return this.f128387a.isEmpty() && this.f128388b.isEmpty() && this.f128389c.length() == 0;
    }
}
