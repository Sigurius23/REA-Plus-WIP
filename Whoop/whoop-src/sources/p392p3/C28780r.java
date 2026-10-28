package p392p3;

import p088dc.AbstractC11895b;
import p448r3.AbstractC30895a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: p3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C28780r implements Comparable {

    /* JADX INFO: renamed from: E */
    public static final C28780r f116538E;

    /* JADX INFO: renamed from: F */
    public static final C28780r f116539F;

    /* JADX INFO: renamed from: G */
    public static final C28780r f116540G;

    /* JADX INFO: renamed from: H */
    public static final C28780r f116541H;

    /* JADX INFO: renamed from: I */
    public static final C28780r f116542I;

    /* JADX INFO: renamed from: J */
    public static final C28780r f116543J;

    /* JADX INFO: renamed from: x */
    public static final C28780r f116544x;

    /* JADX INFO: renamed from: y */
    public static final C28780r f116545y;

    /* JADX INFO: renamed from: z */
    public static final C28780r f116546z;

    /* JADX INFO: renamed from: w */
    public final int f116547w;

    static {
        C28780r c28780r = new C28780r(100);
        C28780r c28780r2 = new C28780r(200);
        C28780r c28780r3 = new C28780r(300);
        C28780r c28780r4 = new C28780r(400);
        f116544x = c28780r4;
        C28780r c28780r5 = new C28780r(500);
        f116545y = c28780r5;
        C28780r c28780r6 = new C28780r(600);
        f116546z = c28780r6;
        C28780r c28780r7 = new C28780r(700);
        C28780r c28780r8 = new C28780r(800);
        C28780r c28780r9 = new C28780r(900);
        f116538E = c28780r3;
        f116539F = c28780r4;
        f116540G = c28780r5;
        f116541H = c28780r6;
        f116542I = c28780r7;
        f116543J = c28780r9;
        AbstractC37056f.m118959K(c28780r, c28780r2, c28780r3, c28780r4, c28780r5, c28780r6, c28780r7, c28780r8, c28780r9);
    }

    public C28780r(int i13) {
        this.f116547w = i13;
        boolean z4 = false;
        if (1 <= i13 && i13 < 1001) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        AbstractC30895a.m95015a("Font weight can be in range [1, 1000]. Current value: " + i13);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C28780r c28780r) {
        return AbstractC22676k.m65751k(this.f116547w, c28780r.f116547w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28780r) {
            return this.f116547w == ((C28780r) obj).f116547w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f116547w;
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("FontWeight(weight="), this.f116547w, ')');
    }
}
