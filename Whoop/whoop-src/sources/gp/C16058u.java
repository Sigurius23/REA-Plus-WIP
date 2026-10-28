package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p319m4.AbstractC25012a;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C16058u extends AbstractC36219a {
    public static final Parcelable.Creator<C16058u> CREATOR = new C16040k0(4);

    /* JADX INFO: renamed from: w */
    public final String f60731w;

    /* JADX INFO: renamed from: x */
    public final String f60732x;

    /* JADX INFO: renamed from: y */
    public final String f60733y;

    public C16058u(String str, String str2, String str3) {
        AbstractC35135w.m111094f(str);
        this.f60731w = str;
        AbstractC35135w.m111094f(str2);
        this.f60732x = str2;
        this.f60733y = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16058u)) {
            return false;
        }
        C16058u c16058u = (C16058u) obj;
        return AbstractC35135w.m111097i(this.f60731w, c16058u.f60731w) && AbstractC35135w.m111097i(this.f60732x, c16058u.f60732x) && AbstractC35135w.m111097i(this.f60733y, c16058u.f60733y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60731w, this.f60732x, this.f60733y});
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb4.append(this.f60731w);
        sb4.append("', \n name='");
        sb4.append(this.f60732x);
        sb4.append("', \n icon='");
        return AbstractC25012a.m73376i(this.f60733y, "'}", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f60731w);
        AbstractC36221c.m115332m(parcel, 3, this.f60732x);
        AbstractC36221c.m115332m(parcel, 4, this.f60733y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
