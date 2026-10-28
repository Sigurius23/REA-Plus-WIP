package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;
import y00.C38809d5;

/* JADX INFO: renamed from: wz.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37742o0 extends AbstractC37748q0 {
    public static final Parcelable.Creator<C37742o0> CREATOR = new C37677f(19);

    /* JADX INFO: renamed from: w */
    public final AbstractC38794c0 f161703w;

    /* JADX INFO: renamed from: x */
    public final C38809d5 f161704x;

    /* JADX INFO: renamed from: y */
    public final C38809d5 f161705y;

    public C37742o0(AbstractC38794c0 paymentDetails, C38809d5 paymentMethodCreateParams, C38809d5 originalParams) {
        AbstractC22676k.m65750j(paymentDetails, "paymentDetails");
        AbstractC22676k.m65750j(paymentMethodCreateParams, "paymentMethodCreateParams");
        AbstractC22676k.m65750j(originalParams, "originalParams");
        this.f161703w = paymentDetails;
        this.f161704x = paymentMethodCreateParams;
        this.f161705y = originalParams;
    }

    @Override // p599wz.AbstractC37748q0
    /* JADX INFO: renamed from: b */
    public final AbstractC38794c0 mo121157b() {
        return this.f161703w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161703w, i13);
        dest.writeParcelable(this.f161704x, i13);
        dest.writeParcelable(this.f161705y, i13);
    }
}
