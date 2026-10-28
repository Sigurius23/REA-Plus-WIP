package w20;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: w20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36708a {

    /* JADX INFO: renamed from: a */
    public final String f157185a;

    /* JADX INFO: renamed from: b */
    public final EnumC38853i f157186b;

    /* JADX INFO: renamed from: c */
    public final boolean f157187c;

    public C36708a(String lastFour, EnumC38853i cardBrand, boolean z4) {
        AbstractC22676k.m65750j(lastFour, "lastFour");
        AbstractC22676k.m65750j(cardBrand, "cardBrand");
        this.f157185a = lastFour;
        this.f157186b = cardBrand;
        this.f157187c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36708a)) {
            return false;
        }
        C36708a c36708a = (C36708a) obj;
        return AbstractC22676k.m65745e(this.f157185a, c36708a.f157185a) && this.f157186b == c36708a.f157186b && this.f157187c == c36708a.f157187c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157187c) + ((this.f157186b.hashCode() + (this.f157185a.hashCode() * 31)) * 961);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Args(lastFour=");
        sb4.append(this.f157185a);
        sb4.append(", cardBrand=");
        sb4.append(this.f157186b);
        sb4.append(", cvc=, isTestMode=");
        return AbstractC18489d0.m53372m(sb4, this.f157187c, ")");
    }
}
