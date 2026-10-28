package p181h2;

import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import j93.AbstractC21478l0;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: h2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16619d {

    /* JADX INFO: renamed from: a */
    public final float f63943a;

    /* JADX INFO: renamed from: b */
    public final float f63944b;

    /* JADX INFO: renamed from: c */
    public final float f63945c;

    /* JADX INFO: renamed from: d */
    public final float f63946d;

    /* JADX INFO: renamed from: e */
    public final long f63947e;

    /* JADX INFO: renamed from: f */
    public final long f63948f;

    /* JADX INFO: renamed from: g */
    public final long f63949g;

    /* JADX INFO: renamed from: h */
    public final long f63950h;

    static {
        AbstractC21478l0.m60427d(0L, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public C16619d(float f13, float f14, float f15, float f16, long j7, long j13, long j14, long j15) {
        this.f63943a = f13;
        this.f63944b = f14;
        this.f63945c = f15;
        this.f63946d = f16;
        this.f63947e = j7;
        this.f63948f = j13;
        this.f63949g = j14;
        this.f63950h = j15;
    }

    /* JADX INFO: renamed from: a */
    public final float m47207a() {
        return this.f63946d - this.f63944b;
    }

    /* JADX INFO: renamed from: b */
    public final float m47208b() {
        return this.f63945c - this.f63943a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16619d)) {
            return false;
        }
        C16619d c16619d = (C16619d) obj;
        return Float.compare(this.f63943a, c16619d.f63943a) == 0 && Float.compare(this.f63944b, c16619d.f63944b) == 0 && Float.compare(this.f63945c, c16619d.f63945c) == 0 && Float.compare(this.f63946d, c16619d.f63946d) == 0 && AbstractC12889b.m36295y(this.f63947e, c16619d.f63947e) && AbstractC12889b.m36295y(this.f63948f, c16619d.f63948f) && AbstractC12889b.m36295y(this.f63949g, c16619d.f63949g) && AbstractC12889b.m36295y(this.f63950h, c16619d.f63950h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f63950h) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30447a(this.f63946d, AbstractC11266d.m30447a(this.f63945c, AbstractC11266d.m30447a(this.f63944b, Float.hashCode(this.f63943a) * 31, 31), 31), 31), this.f63947e, 31), this.f63948f, 31), this.f63949g, 31);
    }

    public final String toString() {
        String str = AbstractC22674j.m65711S(this.f63943a) + ", " + AbstractC22674j.m65711S(this.f63944b) + ", " + AbstractC22674j.m65711S(this.f63945c) + ", " + AbstractC22674j.m65711S(this.f63946d);
        long j7 = this.f63947e;
        long j13 = this.f63948f;
        boolean zM36295y = AbstractC12889b.m36295y(j7, j13);
        long j14 = this.f63949g;
        long j15 = this.f63950h;
        if (!zM36295y || !AbstractC12889b.m36295y(j13, j14) || !AbstractC12889b.m36295y(j14, j15)) {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("RoundRect(rect=", str, ", topLeft=");
            sbM53375p.append((Object) AbstractC12889b.m36276h0(j7));
            sbM53375p.append(", topRight=");
            sbM53375p.append((Object) AbstractC12889b.m36276h0(j13));
            sbM53375p.append(", bottomRight=");
            sbM53375p.append((Object) AbstractC12889b.m36276h0(j14));
            sbM53375p.append(", bottomLeft=");
            sbM53375p.append((Object) AbstractC12889b.m36276h0(j15));
            sbM53375p.append(')');
            return sbM53375p.toString();
        }
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i13) == Float.intBitsToFloat(i14)) {
            StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("RoundRect(rect=", str, ", radius=");
            sbM53375p2.append(AbstractC22674j.m65711S(Float.intBitsToFloat(i13)));
            sbM53375p2.append(')');
            return sbM53375p2.toString();
        }
        StringBuilder sbM53375p3 = AbstractC18489d0.m53375p("RoundRect(rect=", str, ", x=");
        sbM53375p3.append(AbstractC22674j.m65711S(Float.intBitsToFloat(i13)));
        sbM53375p3.append(", y=");
        sbM53375p3.append(AbstractC22674j.m65711S(Float.intBitsToFloat(i14)));
        sbM53375p3.append(')');
        return sbM53375p3.toString();
    }
}
