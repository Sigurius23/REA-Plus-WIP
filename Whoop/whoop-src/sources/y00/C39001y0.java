package y00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent$Usage;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39001y0 implements InterfaceC39010z0 {
    public static final Parcelable.Creator<C39001y0> CREATOR = new C38992x0(0);

    /* JADX INFO: renamed from: w */
    public final String f167870w;

    /* JADX INFO: renamed from: x */
    public final StripeIntent$Usage f167871x;

    public C39001y0(String str, StripeIntent$Usage setupFutureUsage) {
        AbstractC22676k.m65750j(setupFutureUsage, "setupFutureUsage");
        this.f167870w = str;
        this.f167871x = setupFutureUsage;
    }

    @Override // y00.InterfaceC39010z0
    /* JADX INFO: renamed from: D */
    public final StripeIntent$Usage mo124401D() {
        return this.f167871x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39001y0)) {
            return false;
        }
        C39001y0 c39001y0 = (C39001y0) obj;
        return AbstractC22676k.m65745e(this.f167870w, c39001y0.f167870w) && this.f167871x == c39001y0.f167871x;
    }

    public final int hashCode() {
        String str = this.f167870w;
        return this.f167871x.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // y00.InterfaceC39010z0
    /* JADX INFO: renamed from: k0 */
    public final String mo124402k0() {
        return this.f167870w;
    }

    public final String toString() {
        return "Setup(currency=" + this.f167870w + ", setupFutureUsage=" + this.f167871x + ")";
    }

    @Override // y00.InterfaceC39010z0
    /* JADX INFO: renamed from: v */
    public final String mo124403v() {
        return "setup";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167870w);
        dest.writeString(this.f167871x.name());
    }
}
