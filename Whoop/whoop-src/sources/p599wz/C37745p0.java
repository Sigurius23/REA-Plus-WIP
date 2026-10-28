package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;
import y00.C38784b0;
import y00.C38809d5;
import y00.C38915o4;

/* JADX INFO: renamed from: wz.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37745p0 extends AbstractC37748q0 {
    public static final Parcelable.Creator<C37745p0> CREATOR = new C37677f(20);

    /* JADX INFO: renamed from: w */
    public final C38784b0 f161708w;

    /* JADX INFO: renamed from: x */
    public final C38809d5 f161709x;

    /* JADX INFO: renamed from: y */
    public final C38915o4 f161710y;

    public C37745p0(C38784b0 paymentDetails, C38809d5 paymentMethodCreateParams, C38915o4 paymentMethod) {
        AbstractC22676k.m65750j(paymentDetails, "paymentDetails");
        AbstractC22676k.m65750j(paymentMethodCreateParams, "paymentMethodCreateParams");
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f161708w = paymentDetails;
        this.f161709x = paymentMethodCreateParams;
        this.f161710y = paymentMethod;
    }

    @Override // p599wz.AbstractC37748q0
    /* JADX INFO: renamed from: b */
    public final AbstractC38794c0 mo121157b() {
        return this.f161708w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161708w, i13);
        dest.writeParcelable(this.f161709x, i13);
        dest.writeParcelable(this.f161710y, i13);
    }
}
