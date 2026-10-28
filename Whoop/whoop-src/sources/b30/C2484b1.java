package b30;

import java.util.List;
import p031b9.AbstractC2875y;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: b30.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2484b1 {

    /* JADX INFO: renamed from: a */
    public final C2602q f9675a;

    /* JADX INFO: renamed from: b */
    public final boolean f9676b;

    /* JADX INFO: renamed from: c */
    public final Object f9677c;

    /* JADX INFO: renamed from: d */
    public final C2556k1 f9678d;

    public C2484b1(C2602q c2602q, boolean z4, List list, C2556k1 c2556k1) {
        this.f9675a = c2602q;
        this.f9676b = z4;
        this.f9677c = list;
        this.f9678d = c2556k1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2484b1)) {
            return false;
        }
        C2484b1 c2484b1 = (C2484b1) obj;
        return this.f9675a.equals(c2484b1.f9675a) && this.f9676b == c2484b1.f9676b && this.f9677c.equals(c2484b1.f9677c) && this.f9678d.equals(c2484b1.f9678d);
    }

    public final int hashCode() {
        return this.f9678d.hashCode() + AbstractC33745d.m106644c(AbstractC2875y.m8289b(this.f9675a.hashCode() * 31, 31, this.f9676b), 31, this.f9677c);
    }

    public final String toString() {
        return "CardDetailsState(selectedCardBrand=" + this.f9675a + ", shouldShowCardBrandDropdown=" + this.f9676b + ", availableNetworks=" + this.f9677c + ", expiryDateState=" + this.f9678d + ")";
    }
}
