package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import d10.C11465b;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.AbstractC35455a0;
import v00.C35498z;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: a30.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0322r0 extends AbstractC0326t0 {
    public static final Parcelable.Creator<C0322r0> CREATOR = new C0113a(16);

    /* JADX INFO: renamed from: w */
    public final String f1117w;

    public C0322r0(String clientSecret) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f1117w = clientSecret;
    }

    @Override // a30.AbstractC0326t0
    /* JADX INFO: renamed from: b */
    public final AbstractC35455a0 mo828b(C11465b c11465b) {
        return new C35498z(this.f1117w);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0322r0) && AbstractC22676k.m65745e(this.f1117w, ((C0322r0) obj).f1117w);
    }

    @Override // a30.AbstractC0326t0
    /* JADX INFO: renamed from: f */
    public final void mo829f() {
        String value = this.f1117w;
        AbstractC22676k.m65750j(value, "value");
        if (AbstractC39414r.m125890i0(value)) {
            throw new IllegalArgumentException("The PaymentIntent client_secret cannot be an empty string.");
        }
    }

    public final int hashCode() {
        return this.f1117w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("PaymentIntent(clientSecret=", this.f1117w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f1117w);
    }
}
