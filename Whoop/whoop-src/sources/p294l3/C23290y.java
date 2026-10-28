package p294l3;

import e93.AbstractC12889b;
import j93.AbstractC21478l0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p181h2.C16618c;

/* JADX INFO: renamed from: l3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C23290y {

    /* JADX INFO: renamed from: a */
    public final C23242a f92270a;

    /* JADX INFO: renamed from: b */
    public final int f92271b;

    /* JADX INFO: renamed from: c */
    public final int f92272c;

    /* JADX INFO: renamed from: d */
    public final int f92273d;

    /* JADX INFO: renamed from: e */
    public final int f92274e;

    /* JADX INFO: renamed from: f */
    public final float f92275f;

    /* JADX INFO: renamed from: g */
    public final float f92276g;

    public C23290y(C23242a c23242a, int i13, int i14, int i15, int i16, float f13, float f14) {
        this.f92270a = c23242a;
        this.f92271b = i13;
        this.f92272c = i14;
        this.f92273d = i15;
        this.f92274e = i16;
        this.f92275f = f13;
        this.f92276g = f14;
    }

    /* JADX INFO: renamed from: a */
    public final C16618c m67384a(C16618c c16618c) {
        return c16618c.m47206l((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f92275f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public final long m67385b(long j7, boolean z4) {
        if (z4) {
            long j13 = C23283u0.f92251b;
            if (C23283u0.m67356b(j7, j13)) {
                return j13;
            }
        }
        int i13 = C23283u0.f92252c;
        int i14 = (int) (j7 >> 32);
        int i15 = this.f92271b;
        return AbstractC21478l0.m60431f(i14 + i15, ((int) (j7 & 4294967295L)) + i15);
    }

    /* JADX INFO: renamed from: c */
    public final C16618c m67386c(C16618c c16618c) {
        float f13 = -this.f92275f;
        return c16618c.m47206l((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public final int m67387d(int i13) {
        int i14 = this.f92272c;
        int i15 = this.f92271b;
        return AbstractC12889b.m36284n(i13, i15, i14) - i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23290y)) {
            return false;
        }
        C23290y c23290y = (C23290y) obj;
        return this.f92270a.equals(c23290y.f92270a) && this.f92271b == c23290y.f92271b && this.f92272c == c23290y.f92272c && this.f92273d == c23290y.f92273d && this.f92274e == c23290y.f92274e && Float.compare(this.f92275f, c23290y.f92275f) == 0 && Float.compare(this.f92276g, c23290y.f92276g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f92276g) + AbstractC11266d.m30447a(this.f92275f, AbstractC11266d.m30448b(this.f92274e, AbstractC11266d.m30448b(this.f92273d, AbstractC11266d.m30448b(this.f92272c, AbstractC11266d.m30448b(this.f92271b, this.f92270a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ParagraphInfo(paragraph=");
        sb4.append(this.f92270a);
        sb4.append(", startIndex=");
        sb4.append(this.f92271b);
        sb4.append(", endIndex=");
        sb4.append(this.f92272c);
        sb4.append(", startLineIndex=");
        sb4.append(this.f92273d);
        sb4.append(", endLineIndex=");
        sb4.append(this.f92274e);
        sb4.append(", top=");
        sb4.append(this.f92275f);
        sb4.append(", bottom=");
        return AbstractC30802r.m94763l(sb4, this.f92276g, ')');
    }
}
