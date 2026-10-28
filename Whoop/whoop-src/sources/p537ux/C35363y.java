package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ux.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C35363y implements Parcelable {
    public static final Parcelable.Creator<C35363y> CREATOR = new C35332g(7);

    /* JADX INFO: renamed from: y */
    public static C35363y f150632y;

    /* JADX INFO: renamed from: w */
    public final String f150633w;

    /* JADX INFO: renamed from: x */
    public final String f150634x;

    public C35363y(String publishableKey, String str) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        this.f150633w = publishableKey;
        this.f150634x = str;
        if (AbstractC39414r.m125890i0(publishableKey)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys");
        }
        if (AbstractC39421y.m125930O(publishableKey, "sk_", false)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
        }
        if (AbstractC39421y.m125930O(publishableKey, "rk_", false)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35363y)) {
            return false;
        }
        C35363y c35363y = (C35363y) obj;
        return AbstractC22676k.m65745e(this.f150633w, c35363y.f150633w) && AbstractC22676k.m65745e(this.f150634x, c35363y.f150634x);
    }

    public final int hashCode() {
        int iHashCode = this.f150633w.hashCode() * 31;
        String str = this.f150634x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC2875y.m8300m("PaymentConfiguration(publishableKey=", this.f150633w, ", stripeAccountId=", this.f150634x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f150633w);
        dest.writeString(this.f150634x);
    }
}
