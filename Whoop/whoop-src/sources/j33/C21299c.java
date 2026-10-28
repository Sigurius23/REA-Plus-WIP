package j33;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C21299c {

    /* JADX INFO: renamed from: a */
    public final boolean f81376a;

    /* JADX INFO: renamed from: b */
    public final String f81377b;

    /* JADX INFO: renamed from: c */
    public final int f81378c;

    /* JADX INFO: renamed from: d */
    public final int f81379d;

    /* JADX INFO: renamed from: e */
    public final int f81380e;

    /* JADX INFO: renamed from: f */
    public final Integer f81381f;

    /* JADX INFO: renamed from: g */
    public String f81382g;

    /* JADX INFO: renamed from: h */
    public Double f81383h;

    /* JADX INFO: renamed from: i */
    public final boolean f81384i;

    public C21299c(boolean z4, String rid, int i13, int i14, int i15, Integer num, String str, Double d3, boolean z13) {
        AbstractC22676k.m65750j(rid, "rid");
        this.f81376a = z4;
        this.f81377b = rid;
        this.f81378c = i13;
        this.f81379d = i14;
        this.f81380e = i15;
        this.f81381f = num;
        this.f81382g = str;
        this.f81383h = d3;
        this.f81384i = z13;
    }

    /* JADX INFO: renamed from: a */
    public static C21299c m59803a(C21299c c21299c, String str, int i13) {
        boolean z4 = c21299c.f81376a;
        if ((i13 & 2) != 0) {
            str = c21299c.f81377b;
        }
        String rid = str;
        int i14 = c21299c.f81378c;
        int i15 = c21299c.f81379d;
        int i16 = c21299c.f81380e;
        Integer num = c21299c.f81381f;
        String str2 = c21299c.f81382g;
        Double d3 = c21299c.f81383h;
        boolean z13 = (i13 & 256) != 0 ? c21299c.f81384i : true;
        c21299c.getClass();
        AbstractC22676k.m65750j(rid, "rid");
        return new C21299c(z4, rid, i14, i15, i16, num, str2, d3, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21299c)) {
            return false;
        }
        C21299c c21299c = (C21299c) obj;
        return this.f81376a == c21299c.f81376a && AbstractC22676k.m65745e(this.f81377b, c21299c.f81377b) && this.f81378c == c21299c.f81378c && this.f81379d == c21299c.f81379d && this.f81380e == c21299c.f81380e && AbstractC22676k.m65745e(this.f81381f, c21299c.f81381f) && AbstractC22676k.m65745e(this.f81382g, c21299c.f81382g) && AbstractC22676k.m65745e(this.f81383h, c21299c.f81383h) && this.f81384i == c21299c.f81384i;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f81380e, AbstractC11266d.m30448b(this.f81379d, AbstractC11266d.m30448b(this.f81378c, AbstractC11266d.m30450d(Boolean.hashCode(this.f81376a) * 31, 31, this.f81377b), 31), 31), 31);
        Integer num = this.f81381f;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f81382g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d3 = this.f81383h;
        return Boolean.hashCode(this.f81384i) + ((iHashCode2 + (d3 != null ? d3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f81382g;
        Double d3 = this.f81383h;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("OptimalVideoLayer(active=", ", rid=", this.f81377b, ", width=", this.f81376a);
        AbstractC30802r.m94773v(sbM38567n, this.f81378c, ", height=", this.f81379d, ", maxBitrate=");
        sbM38567n.append(this.f81380e);
        sbM38567n.append(", maxFramerate=");
        sbM38567n.append(this.f81381f);
        sbM38567n.append(", scalabilityMode=");
        sbM38567n.append(str);
        sbM38567n.append(", scaleResolutionDownBy=");
        sbM38567n.append(d3);
        sbM38567n.append(", svc=");
        return AbstractC18489d0.m53372m(sbM38567n, this.f81384i, ")");
    }
}
