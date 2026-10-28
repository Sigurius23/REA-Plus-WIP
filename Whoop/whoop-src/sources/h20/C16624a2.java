package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.a2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16624a2 implements InterfaceC16630b2 {
    public static final Parcelable.Creator<C16624a2> CREATOR = new C16699n(28);

    /* JADX INFO: renamed from: w */
    public final String f63959w;

    public C16624a2(String ephemeralKeySecret) {
        AbstractC22676k.m65750j(ephemeralKeySecret, "ephemeralKeySecret");
        this.f63959w = ephemeralKeySecret;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // h20.InterfaceC16630b2
    /* JADX INFO: renamed from: e */
    public final String mo47222e() {
        return "legacy";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16624a2) && AbstractC22676k.m65745e(this.f63959w, ((C16624a2) obj).f63959w);
    }

    public final int hashCode() {
        return this.f63959w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("LegacyCustomerEphemeralKey(ephemeralKeySecret=", this.f63959w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f63959w);
    }
}
