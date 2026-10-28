package p682zi;

import b30.C2570m;
import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Locale;
import p426qi.C30387i;
import p508ty.C34249c;
import p616xi.C38314b;
import p616xi.C38316d;
import p616xi.C38317e;
import so.C32800q;

/* JADX INFO: renamed from: zi.e */
/* JADX INFO: loaded from: classes.dex */
public final class C40655e {

    /* JADX INFO: renamed from: a */
    public final List f175509a;

    /* JADX INFO: renamed from: b */
    public final C30387i f175510b;

    /* JADX INFO: renamed from: c */
    public final String f175511c;

    /* JADX INFO: renamed from: d */
    public final long f175512d;

    /* JADX INFO: renamed from: e */
    public final int f175513e;

    /* JADX INFO: renamed from: f */
    public final long f175514f;

    /* JADX INFO: renamed from: g */
    public final String f175515g;

    /* JADX INFO: renamed from: h */
    public final List f175516h;

    /* JADX INFO: renamed from: i */
    public final C38317e f175517i;

    /* JADX INFO: renamed from: j */
    public final int f175518j;

    /* JADX INFO: renamed from: k */
    public final int f175519k;

    /* JADX INFO: renamed from: l */
    public final int f175520l;

    /* JADX INFO: renamed from: m */
    public final float f175521m;

    /* JADX INFO: renamed from: n */
    public final float f175522n;

    /* JADX INFO: renamed from: o */
    public final float f175523o;

    /* JADX INFO: renamed from: p */
    public final float f175524p;

    /* JADX INFO: renamed from: q */
    public final C38316d f175525q;

    /* JADX INFO: renamed from: r */
    public final C32800q f175526r;

    /* JADX INFO: renamed from: s */
    public final C38314b f175527s;

    /* JADX INFO: renamed from: t */
    public final List f175528t;

    /* JADX INFO: renamed from: u */
    public final int f175529u;

    /* JADX INFO: renamed from: v */
    public final boolean f175530v;

    /* JADX INFO: renamed from: w */
    public final C34249c f175531w;

    /* JADX INFO: renamed from: x */
    public final C2570m f175532x;

    /* JADX INFO: renamed from: y */
    public final int f175533y;

    public C40655e(List list, C30387i c30387i, String str, long j7, int i13, long j13, String str2, List list2, C38317e c38317e, int i14, int i15, int i16, float f13, float f14, float f15, float f16, C38316d c38316d, C32800q c32800q, List list3, int i17, C38314b c38314b, boolean z4, C34249c c34249c, C2570m c2570m, int i18) {
        this.f175509a = list;
        this.f175510b = c30387i;
        this.f175511c = str;
        this.f175512d = j7;
        this.f175513e = i13;
        this.f175514f = j13;
        this.f175515g = str2;
        this.f175516h = list2;
        this.f175517i = c38317e;
        this.f175518j = i14;
        this.f175519k = i15;
        this.f175520l = i16;
        this.f175521m = f13;
        this.f175522n = f14;
        this.f175523o = f15;
        this.f175524p = f16;
        this.f175525q = c38316d;
        this.f175526r = c32800q;
        this.f175528t = list3;
        this.f175529u = i17;
        this.f175527s = c38314b;
        this.f175530v = z4;
        this.f175531w = c34249c;
        this.f175532x = c2570m;
        this.f175533y = i18;
    }

    /* JADX INFO: renamed from: a */
    public final String m131937a(String str) {
        int i13;
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        sbM53374o.append(this.f175511c);
        sbM53374o.append("\n");
        long j7 = this.f175514f;
        C30387i c30387i = this.f175510b;
        C40655e c40655e = (C40655e) c30387i.f124689i.m151c(j7);
        if (c40655e != null) {
            sbM53374o.append("\t\tParents: ");
            sbM53374o.append(c40655e.f175511c);
            for (C40655e c40655e2 = (C40655e) c30387i.f124689i.m151c(c40655e.f175514f); c40655e2 != null; c40655e2 = (C40655e) c30387i.f124689i.m151c(c40655e2.f175514f)) {
                sbM53374o.append("->");
                sbM53374o.append(c40655e2.f175511c);
            }
            sbM53374o.append(str);
            sbM53374o.append("\n");
        }
        List list = this.f175516h;
        if (!list.isEmpty()) {
            sbM53374o.append(str);
            sbM53374o.append("\tMasks: ");
            sbM53374o.append(list.size());
            sbM53374o.append("\n");
        }
        int i14 = this.f175518j;
        if (i14 != 0 && (i13 = this.f175519k) != 0) {
            sbM53374o.append(str);
            sbM53374o.append("\tBackground: ");
            sbM53374o.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(this.f175520l)));
        }
        List list2 = this.f175509a;
        if (!list2.isEmpty()) {
            sbM53374o.append(str);
            sbM53374o.append("\tShapes:\n");
            for (Object obj : list2) {
                sbM53374o.append(str);
                sbM53374o.append("\t\t");
                sbM53374o.append(obj);
                sbM53374o.append("\n");
            }
        }
        return sbM53374o.toString();
    }

    public final String toString() {
        return m131937a("");
    }
}
