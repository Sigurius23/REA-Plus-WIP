package b30;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C2616s {

    /* JADX INFO: renamed from: a */
    public final C2602q f10192a;

    /* JADX INFO: renamed from: b */
    public final C2556k1 f10193b;

    public C2616s(C2602q c2602q, C2556k1 c2556k1) {
        this.f10192a = c2602q;
        this.f10193b = c2556k1;
    }

    /* JADX INFO: renamed from: a */
    public static C2616s m7520a(C2616s c2616s, C2602q cardBrandChoice, C2556k1 c2556k1, int i13) {
        if ((i13 & 1) != 0) {
            cardBrandChoice = c2616s.f10192a;
        }
        if ((i13 & 2) != 0) {
            c2556k1 = c2616s.f10193b;
        }
        AbstractC22676k.m65750j(cardBrandChoice, "cardBrandChoice");
        return new C2616s(cardBrandChoice, c2556k1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2616s)) {
            return false;
        }
        C2616s c2616s = (C2616s) obj;
        return AbstractC22676k.m65745e(this.f10192a, c2616s.f10192a) && AbstractC22676k.m65745e(this.f10193b, c2616s.f10193b);
    }

    public final int hashCode() {
        return this.f10193b.hashCode() + (this.f10192a.hashCode() * 31);
    }

    public final String toString() {
        return "CardDetailsEntry(cardBrandChoice=" + this.f10192a + ", expiryDateState=" + this.f10193b + ")";
    }
}
