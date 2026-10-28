package p199ho;

import android.text.Layout;
import p576w8.C36931a;
import p621xn.C38464a;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ho.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C17527h {

    /* JADX INFO: renamed from: c */
    public CharSequence f67793c;

    /* JADX INFO: renamed from: a */
    public long f67791a = 0;

    /* JADX INFO: renamed from: b */
    public long f67792b = 0;

    /* JADX INFO: renamed from: d */
    public int f67794d = 2;

    /* JADX INFO: renamed from: e */
    public float f67795e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public int f67796f = 1;

    /* JADX INFO: renamed from: g */
    public int f67797g = 0;

    /* JADX INFO: renamed from: h */
    public float f67798h = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public int f67799i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public float f67800j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f67801k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX INFO: renamed from: a */
    public C36931a m49766a() {
        Layout.Alignment alignment;
        float f13 = this.f67798h;
        float f14 = -3.4028235E38f;
        if (f13 == -3.4028235E38f) {
            int i13 = this.f67794d;
            if (i13 != 4) {
                f13 = i13 != 5 ? 0.5f : 1.0f;
            } else {
                f13 = 0.0f;
            }
        }
        int i14 = this.f67799i;
        if (i14 == Integer.MIN_VALUE) {
            int i15 = this.f67794d;
            if (i15 == 1) {
                i14 = 0;
            } else if (i15 == 3) {
                i14 = 2;
            } else if (i15 == 4) {
                i14 = 0;
            } else if (i15 != 5) {
                i14 = 1;
            } else {
                i14 = 2;
            }
        }
        C36931a c36931a = new C36931a();
        int i16 = this.f67794d;
        if (i16 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i16 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i16 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i16 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i16 != 5) {
            AbstractC38963t7.m124388r(i16, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c36931a.f158011c = alignment;
        float f15 = this.f67795e;
        int i17 = this.f67796f;
        if (f15 != -3.4028235E38f && i17 == 0 && (f15 < 0.0f || f15 > 1.0f)) {
            f14 = 1.0f;
        } else if (f15 != -3.4028235E38f) {
            f14 = f15;
        } else if (i17 == 0) {
            f14 = 1.0f;
        }
        c36931a.f158013e = f14;
        c36931a.f158014f = i17;
        c36931a.f158015g = this.f67797g;
        c36931a.f158016h = f13;
        c36931a.f158017i = i14;
        float f16 = this.f67800j;
        if (i14 == 0) {
            f13 = 1.0f - f13;
        } else if (i14 == 1) {
            f13 = f13 <= 0.5f ? f13 * 2.0f : (1.0f - f13) * 2.0f;
        } else if (i14 != 2) {
            throw new IllegalStateException(String.valueOf(i14));
        }
        c36931a.f158020l = Math.min(f16, f13);
        c36931a.f158024p = this.f67801k;
        CharSequence charSequence = this.f67793c;
        if (charSequence != null) {
            c36931a.f158009a = charSequence;
        }
        return c36931a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX INFO: renamed from: b */
    public C38464a m49767b() {
        Layout.Alignment alignment;
        float f13 = this.f67798h;
        float f14 = -3.4028235E38f;
        if (f13 == -3.4028235E38f) {
            int i13 = this.f67794d;
            if (i13 != 4) {
                f13 = i13 != 5 ? 0.5f : 1.0f;
            } else {
                f13 = 0.0f;
            }
        }
        int i14 = this.f67799i;
        if (i14 == Integer.MIN_VALUE) {
            int i15 = this.f67794d;
            if (i15 == 1) {
                i14 = 0;
            } else if (i15 == 3) {
                i14 = 2;
            } else if (i15 == 4) {
                i14 = 0;
            } else if (i15 != 5) {
                i14 = 1;
            } else {
                i14 = 2;
            }
        }
        C38464a c38464a = new C38464a();
        int i16 = this.f67794d;
        if (i16 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i16 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i16 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i16 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i16 != 5) {
            AbstractC30007c.m91850t(34, i16, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c38464a.f164708c = alignment;
        float f15 = this.f67795e;
        int i17 = this.f67796f;
        if (f15 != -3.4028235E38f && i17 == 0 && (f15 < 0.0f || f15 > 1.0f)) {
            f14 = 1.0f;
        } else if (f15 != -3.4028235E38f) {
            f14 = f15;
        } else if (i17 == 0) {
            f14 = 1.0f;
        }
        c38464a.f164710e = f14;
        c38464a.f164711f = i17;
        c38464a.f164712g = this.f67797g;
        c38464a.f164713h = f13;
        c38464a.f164714i = i14;
        float f16 = this.f67800j;
        if (i14 == 0) {
            f13 = 1.0f - f13;
        } else if (i14 == 1) {
            f13 = f13 <= 0.5f ? f13 * 2.0f : (1.0f - f13) * 2.0f;
        } else if (i14 != 2) {
            throw new IllegalStateException(String.valueOf(i14));
        }
        c38464a.f164717l = Math.min(f16, f13);
        c38464a.f164721p = this.f67801k;
        CharSequence charSequence = this.f67793c;
        if (charSequence != null) {
            c38464a.f164706a = charSequence;
        }
        return c38464a;
    }
}
