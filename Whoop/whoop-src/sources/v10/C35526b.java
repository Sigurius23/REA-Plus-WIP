package v10;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.exception.StripeException;
import e93.AbstractC12889b;
import l83.C23465k;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;
import y00.C38899m6;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: v10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C35526b implements Parcelable {
    public static final Parcelable.Creator<C35526b> CREATOR = new C35467g0(3);

    /* JADX INFO: renamed from: E */
    public final String f151150E;

    /* JADX INFO: renamed from: F */
    public final C38899m6 f151151F;

    /* JADX INFO: renamed from: G */
    public final String f151152G;

    /* JADX INFO: renamed from: w */
    public final String f151153w;

    /* JADX INFO: renamed from: x */
    public final int f151154x;

    /* JADX INFO: renamed from: y */
    public final StripeException f151155y;

    /* JADX INFO: renamed from: z */
    public final boolean f151156z;

    public /* synthetic */ C35526b(String str, int i13, StripeException stripeException, boolean z4, String str2, String str3, int i14) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? null : stripeException, (i14 & 8) != 0 ? false : z4, (i14 & 16) != 0 ? null : str2, (C38899m6) null, (i14 & 64) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m112682b() {
        return AbstractC12889b.m36273g(new C23465k("extra_args", this));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35526b)) {
            return false;
        }
        C35526b c35526b = (C35526b) obj;
        return AbstractC22676k.m65745e(this.f151153w, c35526b.f151153w) && this.f151154x == c35526b.f151154x && AbstractC22676k.m65745e(this.f151155y, c35526b.f151155y) && this.f151156z == c35526b.f151156z && AbstractC22676k.m65745e(this.f151150E, c35526b.f151150E) && AbstractC22676k.m65745e(this.f151151F, c35526b.f151151F) && AbstractC22676k.m65745e(this.f151152G, c35526b.f151152G);
    }

    /* JADX INFO: renamed from: f */
    public final C35527c m112683f() throws StripeException {
        StripeException stripeException = this.f151155y;
        if (stripeException != null) {
            throw stripeException;
        }
        String str = this.f151153w;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            throw new IllegalArgumentException("Invalid client_secret value in result Intent.");
        }
        return new C35527c(this.f151153w, this.f151154x, this.f151156z, this.f151150E, this.f151151F, this.f151152G);
    }

    public final int hashCode() {
        String str = this.f151153w;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f151154x) * 31;
        StripeException stripeException = this.f151155y;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (stripeException == null ? 0 : stripeException.hashCode())) * 31, 31, this.f151156z);
        String str2 = this.f151150E;
        int iHashCode2 = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        C38899m6 c38899m6 = this.f151151F;
        int iHashCode3 = (iHashCode2 + (c38899m6 == null ? 0 : c38899m6.hashCode())) * 31;
        String str3 = this.f151152G;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM30467u = AbstractC11266d.m30467u(this.f151154x, "Unvalidated(clientSecret=", this.f151153w, ", flowOutcome=", ", exception=");
        sbM30467u.append(this.f151155y);
        sbM30467u.append(", canCancelSource=");
        sbM30467u.append(this.f151156z);
        sbM30467u.append(", sourceId=");
        sbM30467u.append(this.f151150E);
        sbM30467u.append(", source=");
        sbM30467u.append(this.f151151F);
        sbM30467u.append(", stripeAccountId=");
        return AbstractC25012a.m73376i(this.f151152G, ")", sbM30467u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f151153w);
        dest.writeInt(this.f151154x);
        dest.writeSerializable(this.f151155y);
        Integer num = this.f151156z ? 1 : null;
        dest.writeInt(num != null ? num.intValue() : 0);
        dest.writeString(this.f151150E);
        dest.writeParcelable(this.f151151F, i13);
        dest.writeString(this.f151152G);
    }

    public C35526b(String str, int i13, StripeException stripeException, boolean z4, String str2, C38899m6 c38899m6, String str3) {
        this.f151153w = str;
        this.f151154x = i13;
        this.f151155y = stripeException;
        this.f151156z = z4;
        this.f151150E = str2;
        this.f151151F = c38899m6;
        this.f151152G = str3;
    }
}
