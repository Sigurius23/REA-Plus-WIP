package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.exception.StripeException;
import p715kotlin.jvm.internal.AbstractC22676k;
import v10.C35526b;
import y00.C38840g6;

/* JADX INFO: renamed from: ux.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35325c0 extends AbstractC35327d0 {
    public static final Parcelable.Creator<C35325c0> CREATOR = new C35332g(11);

    /* JADX INFO: renamed from: w */
    public final C38840g6 f150527w;

    /* JADX INFO: renamed from: x */
    public final String f150528x;

    public C35325c0(String str, C38840g6 setupIntent) {
        AbstractC22676k.m65750j(setupIntent, "setupIntent");
        this.f150527w = setupIntent;
        this.f150528x = str;
    }

    @Override // p537ux.AbstractC35327d0
    /* JADX INFO: renamed from: b */
    public final int mo112180b() {
        return 50001;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35325c0)) {
            return false;
        }
        C35325c0 c35325c0 = (C35325c0) obj;
        return AbstractC22676k.m65745e(this.f150527w, c35325c0.f150527w) && AbstractC22676k.m65745e(this.f150528x, c35325c0.f150528x);
    }

    @Override // p537ux.AbstractC35327d0
    /* JADX INFO: renamed from: f */
    public final C35526b mo112181f() {
        return new C35526b(this.f150527w.f167166E, 0, (StripeException) null, false, (String) null, this.f150528x, 62);
    }

    public final int hashCode() {
        int iHashCode = this.f150527w.hashCode() * 31;
        String str = this.f150528x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SetupIntentArgs(setupIntent=" + this.f150527w + ", stripeAccountId=" + this.f150528x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f150527w.writeToParcel(dest, i13);
        dest.writeString(this.f150528x);
    }
}
