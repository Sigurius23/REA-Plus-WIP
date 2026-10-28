package x20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x20.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C37843k implements Parcelable {
    public static final Parcelable.Creator<C37843k> CREATOR = new C37842j();

    /* JADX INFO: renamed from: E */
    public final int f162008E;

    /* JADX INFO: renamed from: F */
    public final String f162009F;

    /* JADX INFO: renamed from: G */
    public final String f162010G;

    /* JADX INFO: renamed from: w */
    public final String f162011w;

    /* JADX INFO: renamed from: x */
    public final Integer f162012x;

    /* JADX INFO: renamed from: y */
    public final int f162013y;

    /* JADX INFO: renamed from: z */
    public final int f162014z;

    public C37843k(String clientSecret, Integer num, int i13, int i14, int i15, String str, String str2) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f162011w = clientSecret;
        this.f162012x = num;
        this.f162013y = i13;
        this.f162014z = i14;
        this.f162008E = i15;
        this.f162009F = str;
        this.f162010G = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37843k)) {
            return false;
        }
        C37843k c37843k = (C37843k) obj;
        return AbstractC22676k.m65745e(this.f162011w, c37843k.f162011w) && AbstractC22676k.m65745e(this.f162012x, c37843k.f162012x) && this.f162013y == c37843k.f162013y && this.f162014z == c37843k.f162014z && this.f162008E == c37843k.f162008E && AbstractC22676k.m65745e(this.f162009F, c37843k.f162009F) && AbstractC22676k.m65745e(this.f162010G, c37843k.f162010G);
    }

    public final int hashCode() {
        int iHashCode = this.f162011w.hashCode() * 31;
        Integer num = this.f162012x;
        int iM30448b = AbstractC11266d.m30448b(this.f162008E, AbstractC11266d.m30448b(this.f162014z, AbstractC11266d.m30448b(this.f162013y, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
        String str = this.f162009F;
        int iHashCode2 = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f162010G;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Args(clientSecret=");
        sb4.append(this.f162011w);
        sb4.append(", statusBarColor=");
        sb4.append(this.f162012x);
        sb4.append(", timeLimitInSeconds=");
        AbstractC30802r.m94773v(sb4, this.f162013y, ", initialDelayInSeconds=", this.f162014z, ", ctaText=");
        AbstractC11895b.m31979B(this.f162008E, ", stripeAccountId=", this.f162009F, ", qrCodeUrl=", sb4);
        return AbstractC25012a.m73376i(this.f162010G, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f162011w);
        Integer num = this.f162012x;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeInt(this.f162013y);
        dest.writeInt(this.f162014z);
        dest.writeInt(this.f162008E);
        dest.writeString(this.f162009F);
        dest.writeString(this.f162010G);
    }
}
