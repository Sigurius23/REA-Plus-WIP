package h30;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import h20.C16661g3;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;

/* JADX INFO: renamed from: h30.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C16805j implements Parcelable {
    public static final Parcelable.Creator<C16805j> CREATOR = new C16054r0(13);

    /* JADX INFO: renamed from: E */
    public final String f64567E;

    /* JADX INFO: renamed from: F */
    public final String f64568F;

    /* JADX INFO: renamed from: G */
    public final String f64569G;

    /* JADX INFO: renamed from: w */
    public final C35459c0 f64570w;

    /* JADX INFO: renamed from: x */
    public final C16661g3 f64571x;

    /* JADX INFO: renamed from: y */
    public final String f64572y;

    /* JADX INFO: renamed from: z */
    public final String f64573z;

    public C16805j(C35459c0 paymentMethodMetadata, C16661g3 shopPayConfiguration, String publishableKey, String str, String paymentElementCallbackIdentifier, String customerSessionClientSecret, String businessName) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(shopPayConfiguration, "shopPayConfiguration");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        AbstractC22676k.m65750j(customerSessionClientSecret, "customerSessionClientSecret");
        AbstractC22676k.m65750j(businessName, "businessName");
        this.f64570w = paymentMethodMetadata;
        this.f64571x = shopPayConfiguration;
        this.f64572y = publishableKey;
        this.f64573z = str;
        this.f64567E = paymentElementCallbackIdentifier;
        this.f64568F = customerSessionClientSecret;
        this.f64569G = businessName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16805j)) {
            return false;
        }
        C16805j c16805j = (C16805j) obj;
        return AbstractC22676k.m65745e(this.f64570w, c16805j.f64570w) && AbstractC22676k.m65745e(this.f64571x, c16805j.f64571x) && AbstractC22676k.m65745e(this.f64572y, c16805j.f64572y) && AbstractC22676k.m65745e(this.f64573z, c16805j.f64573z) && AbstractC22676k.m65745e(this.f64567E, c16805j.f64567E) && AbstractC22676k.m65745e(this.f64568F, c16805j.f64568F) && AbstractC22676k.m65745e(this.f64569G, c16805j.f64569G);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.f64571x.hashCode() + (this.f64570w.hashCode() * 31)) * 31, 31, this.f64572y);
        String str = this.f64573z;
        return this.f64569G.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f64567E), 31, this.f64568F);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ShopPayArgs(paymentMethodMetadata=");
        sb4.append(this.f64570w);
        sb4.append(", shopPayConfiguration=");
        sb4.append(this.f64571x);
        sb4.append(", publishableKey=");
        AbstractC11266d.m30444B(sb4, this.f64572y, ", stripeAccountId=", this.f64573z, ", paymentElementCallbackIdentifier=");
        AbstractC11266d.m30444B(sb4, this.f64567E, ", customerSessionClientSecret=", this.f64568F, ", businessName=");
        return AbstractC25012a.m73376i(this.f64569G, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f64570w, i13);
        dest.writeParcelable(this.f64571x, i13);
        dest.writeString(this.f64572y);
        dest.writeString(this.f64573z);
        dest.writeString(this.f64567E);
        dest.writeString(this.f64568F);
        dest.writeString(this.f64569G);
    }
}
