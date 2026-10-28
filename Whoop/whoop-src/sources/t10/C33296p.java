package t10;

import android.os.Parcel;
import android.os.Parcelable;
import c10.C3831n;
import c13.AbstractC3855a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q63.AbstractC30007c;
import v00.C35459c0;

/* JADX INFO: renamed from: t10.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C33296p implements Parcelable {
    public static final Parcelable.Creator<C33296p> CREATOR = new C32854e(3);

    /* JADX INFO: renamed from: E */
    public final String f138857E;

    /* JADX INFO: renamed from: F */
    public final Integer f138858F;

    /* JADX INFO: renamed from: G */
    public final AbstractC29840y f138859G;

    /* JADX INFO: renamed from: w */
    public final String f138860w;

    /* JADX INFO: renamed from: x */
    public final C35459c0 f138861x;

    /* JADX INFO: renamed from: y */
    public final boolean f138862y;

    /* JADX INFO: renamed from: z */
    public final C3831n f138863z;

    public C33296p(String selectedPaymentMethodCode, C35459c0 paymentMethodMetadata, boolean z4, C3831n configuration, String paymentElementCallbackIdentifier, Integer num, AbstractC29840y abstractC29840y) {
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.f138860w = selectedPaymentMethodCode;
        this.f138861x = paymentMethodMetadata;
        this.f138862y = z4;
        this.f138863z = configuration;
        this.f138857E = paymentElementCallbackIdentifier;
        this.f138858F = num;
        this.f138859G = abstractC29840y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33296p)) {
            return false;
        }
        C33296p c33296p = (C33296p) obj;
        return AbstractC22676k.m65745e(this.f138860w, c33296p.f138860w) && AbstractC22676k.m65745e(this.f138861x, c33296p.f138861x) && this.f138862y == c33296p.f138862y && AbstractC22676k.m65745e(this.f138863z, c33296p.f138863z) && AbstractC22676k.m65745e(this.f138857E, c33296p.f138857E) && AbstractC22676k.m65745e(this.f138858F, c33296p.f138858F) && AbstractC22676k.m65745e(this.f138859G, c33296p.f138859G);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.f138863z.hashCode() + AbstractC2875y.m8289b((this.f138861x.hashCode() + (this.f138860w.hashCode() * 31)) * 31, 31, this.f138862y)) * 31, 31, this.f138857E);
        Integer num = this.f138858F;
        int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
        AbstractC29840y abstractC29840y = this.f138859G;
        return iHashCode + (abstractC29840y != null ? abstractC29840y.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Args(selectedPaymentMethodCode=");
        sb4.append(this.f138860w);
        sb4.append(", paymentMethodMetadata=");
        sb4.append(this.f138861x);
        sb4.append(", hasSavedPaymentMethods=");
        sb4.append(this.f138862y);
        sb4.append(", configuration=");
        sb4.append(this.f138863z);
        sb4.append(", paymentElementCallbackIdentifier=");
        AbstractC30007c.m91853w(this.f138858F, this.f138857E, ", statusBarColor=", ", paymentSelection=", sb4);
        sb4.append(this.f138859G);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f138860w);
        dest.writeParcelable(this.f138861x, i13);
        dest.writeInt(this.f138862y ? 1 : 0);
        dest.writeParcelable(this.f138863z, i13);
        dest.writeString(this.f138857E);
        Integer num = this.f138858F;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeParcelable(this.f138859G, i13);
    }
}
