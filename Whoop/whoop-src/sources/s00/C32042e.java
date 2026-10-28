package s00;

import android.os.Parcel;
import android.os.Parcelable;
import p00.C28580q;
import p599wz.C37718g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;
import v00.C35459c0;

/* JADX INFO: renamed from: s00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C32042e extends AbstractC32044g {
    public static final Parcelable.Creator<C32042e> CREATOR = new C29912j0(20);

    /* JADX INFO: renamed from: w */
    public final C28580q f132916w;

    /* JADX INFO: renamed from: x */
    public final C37718g0 f132917x;

    /* JADX INFO: renamed from: y */
    public final C35459c0 f132918y;

    public C32042e(C28580q viewState, C37718g0 linkConfiguration, C35459c0 paymentMethodMetadata) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(linkConfiguration, "linkConfiguration");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        this.f132916w = viewState;
        this.f132917x = linkConfiguration;
        this.f132918y = paymentMethodMetadata;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32042e)) {
            return false;
        }
        C32042e c32042e = (C32042e) obj;
        return AbstractC22676k.m65745e(this.f132916w, c32042e.f132916w) && AbstractC22676k.m65745e(this.f132917x, c32042e.f132917x) && AbstractC22676k.m65745e(this.f132918y, c32042e.f132918y);
    }

    public final int hashCode() {
        return this.f132918y.hashCode() + ((this.f132917x.hashCode() + (this.f132916w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Render2FA(viewState=" + this.f132916w + ", linkConfiguration=" + this.f132917x + ", paymentMethodMetadata=" + this.f132918y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f132916w, i13);
        dest.writeParcelable(this.f132917x, i13);
        dest.writeParcelable(this.f132918y, i13);
    }
}
