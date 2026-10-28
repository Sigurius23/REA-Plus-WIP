package u10;

import a30.C0273a;
import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import v00.C35459c0;

/* JADX INFO: renamed from: u10.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C34421i implements Parcelable {
    public static final Parcelable.Creator<C34421i> CREATOR = new C32854e(14);

    /* JADX INFO: renamed from: w */
    public final C35459c0 f144656w;

    /* JADX INFO: renamed from: x */
    public final C0273a f144657x;

    /* JADX INFO: renamed from: y */
    public final AbstractC29840y f144658y;

    /* JADX INFO: renamed from: z */
    public final String f144659z;

    public C34421i(C35459c0 paymentMethodMetadata, C0273a customerState, AbstractC29840y abstractC29840y, String paymentElementCallbackIdentifier) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(customerState, "customerState");
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.f144656w = paymentMethodMetadata;
        this.f144657x = customerState;
        this.f144658y = abstractC29840y;
        this.f144659z = paymentElementCallbackIdentifier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34421i)) {
            return false;
        }
        C34421i c34421i = (C34421i) obj;
        return AbstractC22676k.m65745e(this.f144656w, c34421i.f144656w) && AbstractC22676k.m65745e(this.f144657x, c34421i.f144657x) && AbstractC22676k.m65745e(this.f144658y, c34421i.f144658y) && AbstractC22676k.m65745e(this.f144659z, c34421i.f144659z);
    }

    public final int hashCode() {
        int iHashCode = (this.f144657x.hashCode() + (this.f144656w.hashCode() * 31)) * 31;
        AbstractC29840y abstractC29840y = this.f144658y;
        return this.f144659z.hashCode() + ((iHashCode + (abstractC29840y == null ? 0 : abstractC29840y.hashCode())) * 31);
    }

    public final String toString() {
        return "Args(paymentMethodMetadata=" + this.f144656w + ", customerState=" + this.f144657x + ", selection=" + this.f144658y + ", paymentElementCallbackIdentifier=" + this.f144659z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f144656w, i13);
        dest.writeParcelable(this.f144657x, i13);
        dest.writeParcelable(this.f144658y, i13);
        dest.writeString(this.f144659z);
    }
}
