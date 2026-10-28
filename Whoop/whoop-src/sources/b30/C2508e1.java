package b30;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2508e1 implements InterfaceC2532h1 {

    /* JADX INFO: renamed from: a */
    public final C2602q f9764a;

    public C2508e1(C2602q cardBrandChoice) {
        AbstractC22676k.m65750j(cardBrandChoice, "cardBrandChoice");
        this.f9764a = cardBrandChoice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2508e1) && AbstractC22676k.m65745e(this.f9764a, ((C2508e1) obj).f9764a);
    }

    public final int hashCode() {
        return this.f9764a.hashCode();
    }

    public final String toString() {
        return "BrandChoiceChanged(cardBrandChoice=" + this.f9764a + ")";
    }
}
