package p166g4;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: g4.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C15316a {

    /* JADX INFO: renamed from: a */
    public String f57546a;

    /* JADX INFO: renamed from: b */
    public int f57547b;

    /* JADX INFO: renamed from: c */
    public int f57548c;

    /* JADX INFO: renamed from: d */
    public float f57549d;

    public C15316a(String str, int i13) {
        this.f57549d = Float.NaN;
        this.f57546a = str;
        this.f57547b = 902;
        this.f57548c = i13;
    }

    /* JADX INFO: renamed from: a */
    public final C15316a m43524a() {
        C15316a c15316a = new C15316a();
        c15316a.f57548c = Integer.MIN_VALUE;
        c15316a.f57549d = Float.NaN;
        c15316a.f57546a = this.f57546a;
        c15316a.f57547b = this.f57547b;
        c15316a.f57548c = this.f57548c;
        c15316a.f57549d = this.f57549d;
        return c15316a;
    }

    /* JADX INFO: renamed from: b */
    public final String m43525b() {
        return this.f57546a;
    }

    /* JADX INFO: renamed from: c */
    public final void m43526c(float f13) {
        this.f57549d = f13;
    }

    /* JADX INFO: renamed from: d */
    public final void m43527d(int i13) {
        this.f57548c = i13;
    }

    public final String toString() {
        String strM73377j = AbstractC25012a.m73377j(new StringBuilder(), this.f57546a, ':');
        switch (this.f57547b) {
            case 900:
                StringBuilder sbM53374o = AbstractC18489d0.m53374o(strM73377j);
                sbM53374o.append(this.f57548c);
                return sbM53374o.toString();
            case 901:
                StringBuilder sbM53374o2 = AbstractC18489d0.m53374o(strM73377j);
                sbM53374o2.append(this.f57549d);
                return sbM53374o2.toString();
            case 902:
                StringBuilder sbM53374o3 = AbstractC18489d0.m53374o(strM73377j);
                String str = "00000000" + Integer.toHexString(this.f57548c);
                sbM53374o3.append("#" + str.substring(str.length() - 8));
                return sbM53374o3.toString();
            case 903:
                return AbstractC2875y.m8299l(strM73377j, null);
            default:
                return AbstractC2875y.m8299l(strM73377j, "????");
        }
    }

    public C15316a(String str, float f13) {
        this.f57548c = Integer.MIN_VALUE;
        this.f57546a = str;
        this.f57547b = 901;
        this.f57549d = f13;
    }
}
