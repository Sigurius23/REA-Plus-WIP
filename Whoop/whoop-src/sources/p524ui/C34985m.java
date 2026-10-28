package p524ui;

import e93.AbstractC12889b;
import p031b9.AbstractC2875y;
import p426qi.C30387i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ui.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C34985m extends AbstractC34987o {

    /* JADX INFO: renamed from: a */
    public final Integer f148037a;

    /* JADX INFO: renamed from: b */
    public final Integer f148038b;

    /* JADX INFO: renamed from: c */
    public final boolean f148039c;

    /* JADX INFO: renamed from: d */
    public final Integer f148040d;

    public C34985m(Integer num, Integer num2, boolean z4) {
        this.f148037a = num;
        this.f148038b = num2;
        this.f148039c = z4;
        if (num2 == null) {
            num2 = null;
        } else if (!z4) {
            num2 = Integer.valueOf(num2.intValue() - 1);
        }
        this.f148040d = num2;
    }

    @Override // p524ui.AbstractC34987o
    /* JADX INFO: renamed from: a */
    public final float mo110477a(C30387i composition) {
        AbstractC22676k.m65750j(composition, "composition");
        Integer num = this.f148040d;
        if (num == null) {
            return 1.0f;
        }
        return AbstractC12889b.m36283m(num.intValue() / composition.f124693m, 0.0f, 1.0f);
    }

    @Override // p524ui.AbstractC34987o
    /* JADX INFO: renamed from: b */
    public final float mo110478b(C30387i composition) {
        AbstractC22676k.m65750j(composition, "composition");
        Integer num = this.f148037a;
        if (num == null) {
            return 0.0f;
        }
        return AbstractC12889b.m36283m(num.intValue() / composition.f124693m, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34985m)) {
            return false;
        }
        C34985m c34985m = (C34985m) obj;
        return AbstractC22676k.m65745e(this.f148037a, c34985m.f148037a) && AbstractC22676k.m65745e(this.f148038b, c34985m.f148038b) && this.f148039c == c34985m.f148039c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public final int hashCode() {
        Integer num = this.f148037a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f148038b;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z4 = this.f148039c;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        return iHashCode2 + r10;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Frame(min=");
        sb4.append(this.f148037a);
        sb4.append(", max=");
        sb4.append(this.f148038b);
        sb4.append(", maxInclusive=");
        return AbstractC2875y.m8305r(sb4, this.f148039c, ')');
    }
}
