package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38864j0 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38864j0> CREATOR = new C38873k(22);

    /* JADX INFO: renamed from: w */
    public final String f167294w;

    /* JADX INFO: renamed from: x */
    public final boolean f167295x;

    /* JADX INFO: renamed from: y */
    public final C39000y f167296y;

    /* JADX INFO: renamed from: z */
    public final String f167297z;

    public C38864j0(String id4, boolean z4, C39000y address, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(address, "address");
        this.f167294w = id4;
        this.f167295x = z4;
        this.f167296y = address;
        this.f167297z = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38864j0)) {
            return false;
        }
        C38864j0 c38864j0 = (C38864j0) obj;
        return AbstractC22676k.m65745e(this.f167294w, c38864j0.f167294w) && this.f167295x == c38864j0.f167295x && AbstractC22676k.m65745e(this.f167296y, c38864j0.f167296y) && AbstractC22676k.m65745e(this.f167297z, c38864j0.f167297z);
    }

    public final int hashCode() {
        int iHashCode = (this.f167296y.hashCode() + AbstractC2875y.m8289b(this.f167294w.hashCode() * 31, 31, this.f167295x)) * 31;
        String str = this.f167297z;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ConsumerShippingAddress(id=", this.f167294w, ", isDefault=", ", address=", this.f167295x);
        sbM73379l.append(this.f167296y);
        sbM73379l.append(", unredactedPhoneNumber=");
        sbM73379l.append(this.f167297z);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167294w);
        dest.writeInt(this.f167295x ? 1 : 0);
        this.f167296y.writeToParcel(dest, i13);
        dest.writeString(this.f167297z);
    }
}
