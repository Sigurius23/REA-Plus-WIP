package p664yy;

import android.os.Parcel;
import android.os.Parcelable;
import c93.InterfaceC4339a;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yy.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C39857f implements Parcelable {
    public static final Parcelable.Creator<C39857f> CREATOR = new C39855e();

    /* JADX INFO: renamed from: w */
    public final String f172128w;

    /* JADX INFO: renamed from: x */
    public final String f172129x;

    /* JADX INFO: renamed from: y */
    public final String f172130y;

    public /* synthetic */ C39857f(String str, String str2, int i13) {
        this(str, (i13 & 2) != 0 ? null : str2, (String) null);
    }

    /* JADX INFO: renamed from: b */
    public static C39857f m127933b(C39857f c39857f, String apiKey, int i13) {
        if ((i13 & 1) != 0) {
            apiKey = c39857f.f172128w;
        }
        String str = (i13 & 2) != 0 ? c39857f.f172129x : null;
        String str2 = c39857f.f172130y;
        c39857f.getClass();
        AbstractC22676k.m65750j(apiKey, "apiKey");
        return new C39857f(apiKey, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39857f)) {
            return false;
        }
        C39857f c39857f = (C39857f) obj;
        return AbstractC22676k.m65745e(this.f172128w, c39857f.f172128w) && AbstractC22676k.m65745e(this.f172129x, c39857f.f172129x) && AbstractC22676k.m65745e(this.f172130y, c39857f.f172130y);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m127934f() {
        return !AbstractC39414r.m125876U(this.f172128w, "test", false);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m127935h() {
        return AbstractC39421y.m125930O(this.f172128w, "uk_", false);
    }

    public final int hashCode() {
        int iHashCode = this.f172128w.hashCode() * 31;
        String str = this.f172129x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f172130y;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f172130y, ")", AbstractC11895b.m32001t("Options(apiKey=", this.f172128w, ", stripeAccount=", this.f172129x, ", idempotencyKey="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f172128w);
        dest.writeString(this.f172129x);
        dest.writeString(this.f172130y);
    }

    public C39857f(String apiKey, String str, String str2) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        this.f172128w = apiKey;
        this.f172129x = str;
        this.f172130y = str2;
        if (AbstractC39414r.m125890i0(apiKey)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys");
        }
        if (AbstractC39421y.m125930O(apiKey, "sk_", false)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
        }
        if (AbstractC39421y.m125930O(apiKey, "rk_", false)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39857f(InterfaceC4339a publishableKeyProvider, InterfaceC4339a stripeAccountIdProvider) {
        this((String) publishableKeyProvider.invoke(), (String) stripeAccountIdProvider.invoke(), 4);
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(stripeAccountIdProvider, "stripeAccountIdProvider");
    }
}
