package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import d10.C11465b;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.AbstractC35455a0;
import v00.C35488r;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: a30.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0316o0 extends AbstractC0326t0 {
    public static final Parcelable.Creator<C0316o0> CREATOR = new C0113a(13);

    /* JADX INFO: renamed from: w */
    public final String f1091w;

    public C0316o0(String clientSecret) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f1091w = clientSecret;
    }

    @Override // a30.AbstractC0326t0
    /* JADX INFO: renamed from: b */
    public final AbstractC35455a0 mo828b(C11465b c11465b) {
        return new C35488r(AbstractC39414r.m125863I0(this.f1091w, "_secret_"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0316o0) && AbstractC22676k.m65745e(this.f1091w, ((C0316o0) obj).f1091w);
    }

    @Override // a30.AbstractC0326t0
    /* JADX INFO: renamed from: f */
    public final void mo829f() {
        String str = this.f1091w;
        if (!AbstractC39421y.m125930O(str, "cs_", false) || !AbstractC39414r.m125876U(str, "_secret_", false)) {
            throw new IllegalArgumentException("Must use a checkout session client secret.");
        }
    }

    public final int hashCode() {
        return this.f1091w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("CheckoutSession(clientSecret=", this.f1091w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f1091w);
    }
}
