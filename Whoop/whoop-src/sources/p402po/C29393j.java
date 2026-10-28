package p402po;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import gp.C16051q;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C29393j extends AbstractC36219a {
    public static final Parcelable.Creator<C29393j> CREATOR = new C29367a(14);

    /* JADX INFO: renamed from: E */
    public final Uri f119230E;

    /* JADX INFO: renamed from: F */
    public final String f119231F;

    /* JADX INFO: renamed from: G */
    public final String f119232G;

    /* JADX INFO: renamed from: H */
    public final String f119233H;

    /* JADX INFO: renamed from: I */
    public final C16051q f119234I;

    /* JADX INFO: renamed from: w */
    public final String f119235w;

    /* JADX INFO: renamed from: x */
    public final String f119236x;

    /* JADX INFO: renamed from: y */
    public final String f119237y;

    /* JADX INFO: renamed from: z */
    public final String f119238z;

    public C29393j(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C16051q c16051q) {
        AbstractC35135w.m111094f(str);
        this.f119235w = str;
        this.f119236x = str2;
        this.f119237y = str3;
        this.f119238z = str4;
        this.f119230E = uri;
        this.f119231F = str5;
        this.f119232G = str6;
        this.f119233H = str7;
        this.f119234I = c16051q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29393j)) {
            return false;
        }
        C29393j c29393j = (C29393j) obj;
        return AbstractC35135w.m111097i(this.f119235w, c29393j.f119235w) && AbstractC35135w.m111097i(this.f119236x, c29393j.f119236x) && AbstractC35135w.m111097i(this.f119237y, c29393j.f119237y) && AbstractC35135w.m111097i(this.f119238z, c29393j.f119238z) && AbstractC35135w.m111097i(this.f119230E, c29393j.f119230E) && AbstractC35135w.m111097i(this.f119231F, c29393j.f119231F) && AbstractC35135w.m111097i(this.f119232G, c29393j.f119232G) && AbstractC35135w.m111097i(this.f119233H, c29393j.f119233H) && AbstractC35135w.m111097i(this.f119234I, c29393j.f119234I);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119235w, this.f119236x, this.f119237y, this.f119238z, this.f119230E, this.f119231F, this.f119232G, this.f119233H, this.f119234I});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f119235w);
        AbstractC36221c.m115332m(parcel, 2, this.f119236x);
        AbstractC36221c.m115332m(parcel, 3, this.f119237y);
        AbstractC36221c.m115332m(parcel, 4, this.f119238z);
        AbstractC36221c.m115331l(parcel, 5, this.f119230E, i13);
        AbstractC36221c.m115332m(parcel, 6, this.f119231F);
        AbstractC36221c.m115332m(parcel, 7, this.f119232G);
        AbstractC36221c.m115332m(parcel, 8, this.f119233H);
        AbstractC36221c.m115331l(parcel, 9, this.f119234I, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
