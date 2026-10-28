package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.q4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38933q4 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38933q4> CREATOR = new C38858i4(4);

    /* JADX INFO: renamed from: w */
    public final String f167601w;

    /* JADX INFO: renamed from: x */
    public final String f167602x;

    public C38933q4(String accountNumber, String sortCode) {
        AbstractC22676k.m65750j(accountNumber, "accountNumber");
        AbstractC22676k.m65750j(sortCode, "sortCode");
        this.f167601w = accountNumber;
        this.f167602x = sortCode;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        return AbstractC25247g0.m73990Y(new C23465k("account_number", this.f167601w), new C23465k("sort_code", this.f167602x));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38933q4)) {
            return false;
        }
        C38933q4 c38933q4 = (C38933q4) obj;
        return AbstractC22676k.m65745e(this.f167601w, c38933q4.f167601w) && AbstractC22676k.m65745e(this.f167602x, c38933q4.f167602x);
    }

    public final int hashCode() {
        return this.f167602x.hashCode() + (this.f167601w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("BacsDebit(accountNumber=", this.f167601w, ", sortCode=", this.f167602x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167601w);
        dest.writeString(this.f167602x);
    }
}
