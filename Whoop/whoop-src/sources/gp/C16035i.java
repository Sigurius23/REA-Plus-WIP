package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import gm.C15990r;
import java.util.Arrays;
import mp.C25759d;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C16035i extends AbstractC16037j {
    public static final Parcelable.Creator<C16035i> CREATOR = new C16040k0(23);

    /* JADX INFO: renamed from: w */
    public final EnumC16045n f60660w;

    /* JADX INFO: renamed from: x */
    public final String f60661x;

    /* JADX INFO: renamed from: y */
    public final int f60662y;

    public C16035i(int i13, int i14, String str) {
        try {
            this.f60660w = EnumC16045n.m45353b(i13);
            this.f60661x = str;
            this.f60662y = i14;
        } catch (ErrorCode$UnsupportedErrorCodeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16035i)) {
            return false;
        }
        C16035i c16035i = (C16035i) obj;
        return AbstractC35135w.m111097i(this.f60660w, c16035i.f60660w) && AbstractC35135w.m111097i(this.f60661x, c16035i.f60661x) && AbstractC35135w.m111097i(Integer.valueOf(this.f60662y), Integer.valueOf(c16035i.f60662y));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60660w, this.f60661x, Integer.valueOf(this.f60662y)});
    }

    public final String toString() {
        C15990r c15990r = new C15990r(getClass().getSimpleName());
        String strValueOf = String.valueOf(this.f60660w.f60693w);
        C25759d c25759d = new C25759d(19, false);
        ((C15990r) c15990r.f60514z).f60514z = c25759d;
        c15990r.f60514z = c25759d;
        c25759d.f60513y = strValueOf;
        c25759d.f60512x = "errorCode";
        String str = this.f60661x;
        if (str != null) {
            c15990r.m45157W(str, "errorMessage");
        }
        return c15990r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = this.f60660w.f60693w;
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115332m(parcel, 3, this.f60661x);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f60662y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
