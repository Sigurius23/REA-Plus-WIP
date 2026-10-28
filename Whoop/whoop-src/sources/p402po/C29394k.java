package p402po;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C29394k extends AbstractC36219a {
    public static final Parcelable.Creator<C29394k> CREATOR = new C29367a(15);

    /* JADX INFO: renamed from: w */
    public final String f119239w;

    /* JADX INFO: renamed from: x */
    public final String f119240x;

    public C29394k(String str, String str2) {
        AbstractC35135w.m111095g(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        AbstractC35135w.m111093e(strTrim, "Account identifier cannot be empty");
        this.f119239w = strTrim;
        AbstractC35135w.m111092d(str2);
        this.f119240x = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29394k)) {
            return false;
        }
        C29394k c29394k = (C29394k) obj;
        return AbstractC35135w.m111097i(this.f119239w, c29394k.f119239w) && AbstractC35135w.m111097i(this.f119240x, c29394k.f119240x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119239w, this.f119240x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f119239w);
        AbstractC36221c.m115332m(parcel, 2, this.f119240x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
