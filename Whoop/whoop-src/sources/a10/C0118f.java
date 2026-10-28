package a10;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38793c;

/* JADX INFO: renamed from: a10.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C0118f extends AbstractC0122j {
    public static final Parcelable.Creator<C0118f> CREATOR = new C0113a(4);

    /* JADX INFO: renamed from: E */
    public final C38793c f358E;

    /* JADX INFO: renamed from: x */
    public final C38793c f359x;

    /* JADX INFO: renamed from: y */
    public final String f360y;

    /* JADX INFO: renamed from: z */
    public final String f361z;

    public C0118f(C38793c c38793c, String str, String str2, C38793c c38793c2) {
        super(EnumC0120h.Masterpass);
        this.f359x = c38793c;
        this.f360y = str;
        this.f361z = str2;
        this.f358E = c38793c2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0118f)) {
            return false;
        }
        C0118f c0118f = (C0118f) obj;
        return AbstractC22676k.m65745e(this.f359x, c0118f.f359x) && AbstractC22676k.m65745e(this.f360y, c0118f.f360y) && AbstractC22676k.m65745e(this.f361z, c0118f.f361z) && AbstractC22676k.m65745e(this.f358E, c0118f.f358E);
    }

    public final int hashCode() {
        C38793c c38793c = this.f359x;
        int iHashCode = (c38793c == null ? 0 : c38793c.hashCode()) * 31;
        String str = this.f360y;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f361z;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C38793c c38793c2 = this.f358E;
        return iHashCode3 + (c38793c2 != null ? c38793c2.hashCode() : 0);
    }

    public final String toString() {
        return "MasterpassWallet(billingAddress=" + this.f359x + ", email=" + this.f360y + ", name=" + this.f361z + ", shippingAddress=" + this.f358E + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C38793c c38793c = this.f359x;
        if (c38793c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c.writeToParcel(dest, i13);
        }
        dest.writeString(this.f360y);
        dest.writeString(this.f361z);
        C38793c c38793c2 = this.f358E;
        if (c38793c2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c2.writeToParcel(dest, i13);
        }
    }
}
