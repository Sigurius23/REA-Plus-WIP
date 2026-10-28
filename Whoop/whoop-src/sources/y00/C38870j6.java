package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Currency;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.j6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38870j6 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38870j6> CREATOR = new C38943r5(11);

    /* JADX INFO: renamed from: E */
    public final String f167313E;

    /* JADX INFO: renamed from: w */
    public final String f167314w;

    /* JADX INFO: renamed from: x */
    public final String f167315x;

    /* JADX INFO: renamed from: y */
    public final long f167316y;

    /* JADX INFO: renamed from: z */
    public final Currency f167317z;

    public C38870j6(String label, String identifier, long j7, Currency currency, String str) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(currency, "currency");
        this.f167314w = label;
        this.f167315x = identifier;
        this.f167316y = j7;
        this.f167317z = currency;
        this.f167313E = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38870j6)) {
            return false;
        }
        C38870j6 c38870j6 = (C38870j6) obj;
        return AbstractC22676k.m65745e(this.f167314w, c38870j6.f167314w) && AbstractC22676k.m65745e(this.f167315x, c38870j6.f167315x) && this.f167316y == c38870j6.f167316y && AbstractC22676k.m65745e(this.f167317z, c38870j6.f167317z) && AbstractC22676k.m65745e(this.f167313E, c38870j6.f167313E);
    }

    public final int hashCode() {
        int iHashCode = (this.f167317z.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30450d(this.f167314w.hashCode() * 31, 31, this.f167315x), this.f167316y, 31)) * 31;
        String str = this.f167313E;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShippingMethod(label=", this.f167314w, ", identifier=", this.f167315x, ", amount=");
        sbM32001t.append(this.f167316y);
        sbM32001t.append(", currency=");
        sbM32001t.append(this.f167317z);
        return AbstractC2875y.m8304q(sbM32001t, ", detail=", this.f167313E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167314w);
        dest.writeString(this.f167315x);
        dest.writeLong(this.f167316y);
        dest.writeSerializable(this.f167317z);
        dest.writeString(this.f167313E);
    }
}
