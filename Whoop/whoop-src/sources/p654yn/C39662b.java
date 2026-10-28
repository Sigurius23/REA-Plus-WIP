package p654yn;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p309lo.AbstractC24567y;
import p621xn.C38465b;

/* JADX INFO: renamed from: yn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39662b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f170631a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f170632b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f170633c;

    /* JADX INFO: renamed from: d */
    public int f170634d;

    /* JADX INFO: renamed from: e */
    public int f170635e;

    /* JADX INFO: renamed from: f */
    public int f170636f;

    /* JADX INFO: renamed from: g */
    public int f170637g;

    /* JADX INFO: renamed from: h */
    public int f170638h;

    public C39662b(int i13, int i14) {
        ArrayList arrayList = new ArrayList();
        this.f170631a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f170632b = arrayList2;
        StringBuilder sb4 = new StringBuilder();
        this.f170633c = sb4;
        this.f170637g = i13;
        arrayList.clear();
        arrayList2.clear();
        sb4.setLength(0);
        this.f170634d = 15;
        this.f170635e = 0;
        this.f170636f = 0;
        this.f170638h = i14;
    }

    /* JADX INFO: renamed from: a */
    public final void m126793a(char c3) {
        StringBuilder sb4 = this.f170633c;
        if (sb4.length() < 32) {
            sb4.append(c3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m126794b() {
        StringBuilder sb4 = this.f170633c;
        int length = sb4.length();
        if (length > 0) {
            sb4.delete(length - 1, length);
            ArrayList arrayList = this.f170631a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C39661a c39661a = (C39661a) arrayList.get(size);
                int i13 = c39661a.f170630c;
                if (i13 != length) {
                    return;
                }
                c39661a.f170630c = i13 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C38465b m126795c(int i13) {
        int i14;
        float f13;
        int i15 = this.f170635e + this.f170636f;
        int i16 = 32 - i15;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i17 = 0;
        while (true) {
            ArrayList arrayList = this.f170632b;
            if (i17 >= arrayList.size()) {
                break;
            }
            CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i17);
            int i18 = AbstractC24567y.f95875a;
            if (charSequenceSubSequence.length() > i16) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i16);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
            i17++;
        }
        SpannableString spannableStringM126796d = m126796d();
        int i19 = AbstractC24567y.f95875a;
        int length = spannableStringM126796d.length();
        SpannableString spannableStringSubSequence = spannableStringM126796d;
        if (length > i16) {
            spannableStringSubSequence = spannableStringM126796d.subSequence(0, i16);
        }
        spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i16 - spannableStringBuilder.length();
        int i24 = i15 - length2;
        if (i13 != Integer.MIN_VALUE) {
            i14 = i13;
        } else if (this.f170637g != 2 || (Math.abs(i24) >= 3 && length2 >= 0)) {
            i14 = (this.f170637g != 2 || i24 <= 0) ? 0 : 2;
        } else {
            i14 = 1;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                i15 = 32 - length2;
            }
            f13 = ((i15 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f13 = 0.5f;
        }
        float f14 = f13;
        int i25 = this.f170634d;
        if (i25 > 7) {
            i25 -= 17;
        } else if (this.f170637g == 1) {
            i25 -= this.f170638h - 1;
        }
        return new C38465b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i25, 1, Integer.MIN_VALUE, f14, i14, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableString m126796d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f170633c);
        int length = spannableStringBuilder.length();
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f170631a;
            if (i17 >= arrayList.size()) {
                break;
            }
            C39661a c39661a = (C39661a) arrayList.get(i17);
            boolean z13 = c39661a.f170629b;
            int i19 = c39661a.f170628a;
            if (i19 != 8) {
                boolean z14 = i19 == 7;
                if (i19 != 7) {
                    i16 = C39663c.f170639A[i19];
                }
                z4 = z14;
            }
            int i24 = c39661a.f170630c;
            i17++;
            if (i24 != (i17 < arrayList.size() ? ((C39661a) arrayList.get(i17)).f170630c : length)) {
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
    public final boolean m126797e() {
        return this.f170631a.isEmpty() && this.f170632b.isEmpty() && this.f170633c.length() == 0;
    }
}
