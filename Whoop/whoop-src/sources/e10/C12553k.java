package e10;

import android.os.Parcel;
import android.os.Parcelable;
import p096dq.C12280x;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: e10.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C12553k implements Parcelable {
    public static final Parcelable.Creator<C12553k> CREATOR = new C12280x(18);

    /* JADX INFO: renamed from: w */
    public final InterfaceC12555l f42877w;

    /* JADX INFO: renamed from: x */
    public final C35459c0 f42878x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC38802c8 f42879y;

    public C12553k(InterfaceC12555l confirmationOption, C35459c0 paymentMethodMetadata) {
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        this.f42877w = confirmationOption;
        this.f42878x = paymentMethodMetadata;
        this.f42879y = paymentMethodMetadata.f150996w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12553k)) {
            return false;
        }
        C12553k c12553k = (C12553k) obj;
        return AbstractC22676k.m65745e(this.f42877w, c12553k.f42877w) && AbstractC22676k.m65745e(this.f42878x, c12553k.f42878x);
    }

    public final int hashCode() {
        return this.f42878x.hashCode() + (this.f42877w.hashCode() * 31);
    }

    public final String toString() {
        return "Args(confirmationOption=" + this.f42877w + ", paymentMethodMetadata=" + this.f42878x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f42877w, i13);
        dest.writeParcelable(this.f42878x, i13);
    }
}
