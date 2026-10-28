package b30;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p537ux.InterfaceC35320a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C2658y {

    /* JADX INFO: renamed from: a */
    public final InterfaceC35320a f10380a;

    /* JADX INFO: renamed from: b */
    public final boolean f10381b;

    /* JADX INFO: renamed from: c */
    public final boolean f10382c;

    public C2658y(InterfaceC35320a cardBrandFilter, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        this.f10380a = cardBrandFilter;
        this.f10381b = z4;
        this.f10382c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2658y)) {
            return false;
        }
        C2658y c2658y = (C2658y) obj;
        return AbstractC22676k.m65745e(this.f10380a, c2658y.f10380a) && this.f10381b == c2658y.f10381b && this.f10382c == c2658y.f10382c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10382c) + AbstractC2875y.m8289b(this.f10380a.hashCode() * 31, 31, this.f10381b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CardEditConfiguration(cardBrandFilter=");
        sb4.append(this.f10380a);
        sb4.append(", isCbcModifiable=");
        sb4.append(this.f10381b);
        sb4.append(", areExpiryDateAndAddressModificationSupported=");
        return AbstractC18489d0.m53372m(sb4, this.f10382c, ")");
    }
}
