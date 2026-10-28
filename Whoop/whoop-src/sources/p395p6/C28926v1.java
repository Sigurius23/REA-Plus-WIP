package p395p6;

/* JADX INFO: renamed from: p6.v1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28926v1 {

    /* JADX INFO: renamed from: a */
    public final EnumC28872d1 f117040a;

    /* JADX INFO: renamed from: b */
    public final EnumC28872d1 f117041b;

    public C28926v1(EnumC28872d1 enumC28872d1, EnumC28872d1 enumC28872d2) {
        this.f117040a = enumC28872d1;
        this.f117041b = enumC28872d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28926v1)) {
            return false;
        }
        C28926v1 c28926v1 = (C28926v1) obj;
        return this.f117040a == c28926v1.f117040a && this.f117041b == c28926v1.f117041b;
    }

    public final int hashCode() {
        return this.f117041b.hashCode() + (this.f117040a.hashCode() * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + this.f117040a + ", height=" + this.f117041b + ')';
    }
}
