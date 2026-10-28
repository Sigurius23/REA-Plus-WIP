package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l83.C23465k;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.f5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38829f5 extends AbstractC38869j5 {
    public static final Parcelable.Creator<C38829f5> CREATOR = new C38858i4(19);

    /* JADX INFO: renamed from: x */
    public final Boolean f167136x;

    /* JADX INFO: renamed from: y */
    public final String f167137y;

    public C38829f5(Boolean bool, String str) {
        super(EnumC38828f4.f167090I);
        this.f167136x = bool;
        this.f167137y = str;
    }

    @Override // y00.AbstractC38869j5
    /* JADX INFO: renamed from: b */
    public final List mo124343b() {
        Boolean bool = this.f167136x;
        return AbstractC37056f.m118958J(new C23465k("set_as_default_payment_method", bool != null ? bool.toString() : null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38829f5)) {
            return false;
        }
        C38829f5 c38829f5 = (C38829f5) obj;
        return AbstractC22676k.m65745e(this.f167136x, c38829f5.f167136x) && AbstractC22676k.m65745e(this.f167137y, c38829f5.f167137y);
    }

    public final int hashCode() {
        Boolean bool = this.f167136x;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f167137y;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Card(setAsDefault=" + this.f167136x + ", phoneNumberCountry=" + this.f167137y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Boolean bool = this.f167136x;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
        dest.writeString(this.f167137y);
    }
}
