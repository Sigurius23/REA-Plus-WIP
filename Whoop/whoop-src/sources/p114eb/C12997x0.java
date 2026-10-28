package p114eb;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12997x0 {

    /* JADX INFO: renamed from: a */
    public final boolean f44903a;

    /* JADX INFO: renamed from: b */
    public final boolean f44904b;

    /* JADX INFO: renamed from: c */
    public final int f44905c;

    /* JADX INFO: renamed from: d */
    public final boolean f44906d;

    /* JADX INFO: renamed from: e */
    public final boolean f44907e;

    /* JADX INFO: renamed from: f */
    public final int f44908f;

    /* JADX INFO: renamed from: g */
    public final int f44909g;

    /* JADX INFO: renamed from: h */
    public final int f44910h;

    /* JADX INFO: renamed from: i */
    public final int f44911i;

    /* JADX INFO: renamed from: j */
    public String f44912j;

    public C12997x0(boolean z4, boolean z13, int i13, boolean z14, boolean z15, int i14, int i15, int i16, int i17) {
        this.f44903a = z4;
        this.f44904b = z13;
        this.f44905c = i13;
        this.f44906d = z14;
        this.f44907e = z15;
        this.f44908f = i14;
        this.f44909g = i15;
        this.f44910h = i16;
        this.f44911i = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C12997x0)) {
            return false;
        }
        C12997x0 c12997x0 = (C12997x0) obj;
        return this.f44903a == c12997x0.f44903a && this.f44904b == c12997x0.f44904b && this.f44905c == c12997x0.f44905c && AbstractC22676k.m65745e(this.f44912j, c12997x0.f44912j) && this.f44906d == c12997x0.f44906d && this.f44907e == c12997x0.f44907e && this.f44908f == c12997x0.f44908f && this.f44909g == c12997x0.f44909g && this.f44910h == c12997x0.f44910h && this.f44911i == c12997x0.f44911i;
    }

    public final int hashCode() {
        int i13 = (((((this.f44903a ? 1 : 0) * 31) + (this.f44904b ? 1 : 0)) * 31) + this.f44905c) * 31;
        String str = this.f44912j;
        return ((((((((((((i13 + (str != null ? str.hashCode() : 0)) * 29791) + (this.f44906d ? 1 : 0)) * 31) + (this.f44907e ? 1 : 0)) * 31) + this.f44908f) * 31) + this.f44909g) * 31) + this.f44910h) * 31) + this.f44911i;
    }

    public final String toString() {
        String str = this.f44912j;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C12997x0.class.getSimpleName());
        sb4.append("(");
        if (this.f44903a) {
            sb4.append("launchSingleTop ");
        }
        if (this.f44904b) {
            sb4.append("restoreState ");
        }
        if ((str != null || this.f44905c != -1) && str != null) {
            sb4.append("popUpTo(");
            sb4.append(str);
            if (this.f44906d) {
                sb4.append(" inclusive");
            }
            if (this.f44907e) {
                sb4.append(" saveState");
            }
            sb4.append(")");
        }
        int i13 = this.f44911i;
        int i14 = this.f44910h;
        int i15 = this.f44909g;
        int i16 = this.f44908f;
        if (i16 != -1 || i15 != -1 || i14 != -1 || i13 != -1) {
            sb4.append("anim(enterAnim=0x");
            sb4.append(Integer.toHexString(i16));
            sb4.append(" exitAnim=0x");
            sb4.append(Integer.toHexString(i15));
            sb4.append(" popEnterAnim=0x");
            sb4.append(Integer.toHexString(i14));
            sb4.append(" popExitAnim=0x");
            sb4.append(Integer.toHexString(i13));
            sb4.append(")");
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }
}
