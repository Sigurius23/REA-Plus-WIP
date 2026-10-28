package p571w3;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: w3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C36773i {

    /* JADX INFO: renamed from: c */
    public static final C36773i f157344c = new C36773i(C36770f.f157340c, 17);

    /* JADX INFO: renamed from: a */
    public final float f157345a;

    /* JADX INFO: renamed from: b */
    public final int f157346b;

    public C36773i(float f13, int i13) {
        this.f157345a = f13;
        this.f157346b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36773i)) {
            return false;
        }
        C36773i c36773i = (C36773i) obj;
        float f13 = c36773i.f157345a;
        float f14 = C36770f.f157339b;
        return Float.compare(this.f157345a, f13) == 0 && this.f157346b == c36773i.f157346b;
    }

    public final int hashCode() {
        float f13 = C36770f.f157339b;
        return Integer.hashCode(0) + AbstractC11266d.m30448b(this.f157346b, Float.hashCode(this.f157345a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("LineHeightStyle(alignment=");
        sb4.append((Object) C36770f.m117880b(this.f157345a));
        sb4.append(", trim=");
        int i13 = this.f157346b;
        if (i13 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i13 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i13 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i13 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb4.append((Object) str);
        sb4.append(",mode=Mode(value=0))");
        return sb4.toString();
    }
}
