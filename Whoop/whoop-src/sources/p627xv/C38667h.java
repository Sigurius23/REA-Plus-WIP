package p627xv;

import hc3.AbstractC17176i;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xv.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C38667h {

    /* JADX INFO: renamed from: a */
    public float f166435a;

    /* JADX INFO: renamed from: b */
    public float f166436b;

    /* JADX INFO: renamed from: c */
    public int f166437c;

    /* JADX INFO: renamed from: d */
    public List f166438d;

    /* JADX INFO: renamed from: e */
    public List f166439e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38667h)) {
            return false;
        }
        C38667h c38667h = (C38667h) obj;
        return Float.compare(this.f166435a, c38667h.f166435a) == 0 && Float.compare(this.f166436b, c38667h.f166436b) == 0 && this.f166437c == c38667h.f166437c && AbstractC22676k.m65745e(this.f166438d, c38667h.f166438d) && AbstractC22676k.m65745e(this.f166439e, c38667h.f166439e);
    }

    public final int hashCode() {
        return this.f166439e.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.f166437c, AbstractC11266d.m30447a(this.f166436b, Float.hashCode(this.f166435a) * 31, 31), 31), 31, this.f166438d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SegmentsConfiguration(unitDistance=");
        sb4.append(this.f166435a);
        sb4.append(", unitBarWidth=");
        sb4.append(this.f166436b);
        sb4.append(", rectCount=");
        sb4.append(this.f166437c);
        sb4.append(", labelTexts=");
        sb4.append(this.f166438d);
        sb4.append(", labelMarginsAndAnchor=");
        return AbstractC17176i.m48506h(sb4, this.f166439e, ')');
    }
}
