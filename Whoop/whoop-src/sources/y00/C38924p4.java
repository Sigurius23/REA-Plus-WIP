package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.p4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38924p4 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38924p4> CREATOR = new C38858i4(3);

    /* JADX INFO: renamed from: w */
    public String f167551w;

    /* JADX INFO: renamed from: x */
    public String f167552x;

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        return AbstractC25247g0.m73990Y(new C23465k("bsb_number", this.f167551w), new C23465k("account_number", this.f167552x));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38924p4)) {
            return false;
        }
        C38924p4 c38924p4 = (C38924p4) obj;
        return AbstractC22676k.m65745e(this.f167551w, c38924p4.f167551w) && AbstractC22676k.m65745e(this.f167552x, c38924p4.f167552x);
    }

    public final int hashCode() {
        return this.f167552x.hashCode() + (this.f167551w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("AuBecsDebit(bsbNumber=", this.f167551w, ", accountNumber=", this.f167552x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167551w);
        dest.writeString(this.f167552x);
    }
}
