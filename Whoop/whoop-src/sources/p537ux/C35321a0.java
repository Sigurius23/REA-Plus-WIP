package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.exception.StripeException;
import p715kotlin.jvm.internal.AbstractC22676k;
import v10.C35526b;

/* JADX INFO: renamed from: ux.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35321a0 extends AbstractC35327d0 {
    public static final Parcelable.Creator<C35321a0> CREATOR = new C35332g(9);

    /* JADX INFO: renamed from: w */
    public final StripeException f150520w;

    /* JADX INFO: renamed from: x */
    public final int f150521x;

    public C35321a0(StripeException stripeException, int i13) {
        this.f150520w = stripeException;
        this.f150521x = i13;
    }

    @Override // p537ux.AbstractC35327d0
    /* JADX INFO: renamed from: b */
    public final int mo112180b() {
        return this.f150521x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35321a0)) {
            return false;
        }
        C35321a0 c35321a0 = (C35321a0) obj;
        return AbstractC22676k.m65745e(this.f150520w, c35321a0.f150520w) && this.f150521x == c35321a0.f150521x;
    }

    @Override // p537ux.AbstractC35327d0
    /* JADX INFO: renamed from: f */
    public final C35526b mo112181f() {
        return new C35526b((String) null, 0, this.f150520w, false, (String) null, (String) null, 123);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150521x) + (this.f150520w.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorArgs(exception=" + this.f150520w + ", requestCode=" + this.f150521x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f150520w);
        dest.writeInt(this.f150521x);
    }
}
