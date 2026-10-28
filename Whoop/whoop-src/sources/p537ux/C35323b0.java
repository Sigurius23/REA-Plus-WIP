package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.exception.StripeException;
import p715kotlin.jvm.internal.AbstractC22676k;
import v10.C35526b;
import y00.C38887l3;

/* JADX INFO: renamed from: ux.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35323b0 extends AbstractC35327d0 {
    public static final Parcelable.Creator<C35323b0> CREATOR = new C35332g(10);

    /* JADX INFO: renamed from: w */
    public final C38887l3 f150522w;

    /* JADX INFO: renamed from: x */
    public final String f150523x;

    public C35323b0(C38887l3 paymentIntent, String str) {
        AbstractC22676k.m65750j(paymentIntent, "paymentIntent");
        this.f150522w = paymentIntent;
        this.f150523x = str;
    }

    @Override // p537ux.AbstractC35327d0
    /* JADX INFO: renamed from: b */
    public final int mo112180b() {
        return 50000;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35323b0)) {
            return false;
        }
        C35323b0 c35323b0 = (C35323b0) obj;
        return AbstractC22676k.m65745e(this.f150522w, c35323b0.f150522w) && AbstractC22676k.m65745e(this.f150523x, c35323b0.f150523x);
    }

    @Override // p537ux.AbstractC35327d0
    /* JADX INFO: renamed from: f */
    public final C35526b mo112181f() {
        return new C35526b(this.f150522w.f167372G, 0, (StripeException) null, false, (String) null, this.f150523x, 62);
    }

    public final int hashCode() {
        int iHashCode = this.f150522w.hashCode() * 31;
        String str = this.f150523x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PaymentIntentArgs(paymentIntent=" + this.f150522w + ", stripeAccountId=" + this.f150523x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f150522w.writeToParcel(dest, i13);
        dest.writeString(this.f150523x);
    }
}
