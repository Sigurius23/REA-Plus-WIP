package p395p6;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: p6.n1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28902n1 {

    /* JADX INFO: renamed from: a */
    public final EnumC28881g1 f116990a;

    /* JADX INFO: renamed from: b */
    public final boolean f116991b;

    /* JADX INFO: renamed from: c */
    public final boolean f116992c;

    public C28902n1(EnumC28881g1 enumC28881g1, boolean z4, boolean z13) {
        this.f116990a = enumC28881g1;
        this.f116991b = z4;
        this.f116992c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28902n1)) {
            return false;
        }
        C28902n1 c28902n1 = (C28902n1) obj;
        return this.f116990a == c28902n1.f116990a && this.f116991b == c28902n1.f116991b && this.f116992c == c28902n1.f116992c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116992c) + AbstractC2875y.m8289b(this.f116990a.hashCode() * 31, 31, this.f116991b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RowColumnChildSelector(type=");
        sb4.append(this.f116990a);
        sb4.append(", expandWidth=");
        sb4.append(this.f116991b);
        sb4.append(", expandHeight=");
        return AbstractC2875y.m8305r(sb4, this.f116992c, ')');
    }
}
