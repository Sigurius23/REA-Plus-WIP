package p571w3;

import p448r3.AbstractC30895a;

/* JADX INFO: renamed from: w3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C36770f {

    /* JADX INFO: renamed from: b */
    public static final float f157339b;

    /* JADX INFO: renamed from: c */
    public static final float f157340c;

    /* JADX INFO: renamed from: d */
    public static final float f157341d;

    /* JADX INFO: renamed from: a */
    public final float f157342a;

    static {
        m117879a(0.0f);
        m117879a(0.5f);
        f157339b = 0.5f;
        m117879a(-1.0f);
        f157340c = -1.0f;
        m117879a(1.0f);
        f157341d = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public static void m117879a(float f13) {
        if ((0.0f > f13 || f13 > 1.0f) && f13 != -1.0f) {
            AbstractC30895a.m95017c("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m117880b(float f13) {
        if (f13 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f13 == f157339b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f13 == f157340c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f13 == f157341d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f13 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36770f) {
            return Float.compare(this.f157342a, ((C36770f) obj).f157342a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f157342a);
    }

    public final String toString() {
        return m117880b(this.f157342a);
    }
}
