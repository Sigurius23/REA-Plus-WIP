package p023ay;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ay.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2127c implements InterfaceC36562b {
    public static final Parcelable.Creator<C2127c> CREATOR = new C2125b(0);

    /* JADX INFO: renamed from: w */
    public final String f8510w;

    /* JADX INFO: renamed from: x */
    public final String f8511x;

    /* JADX INFO: renamed from: y */
    public final String f8512y;

    public C2127c(String str, String str2, String str3) {
        this.f8510w = str;
        this.f8511x = str2;
        this.f8512y = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2127c)) {
            return false;
        }
        C2127c c2127c = (C2127c) obj;
        return AbstractC22676k.m65745e(this.f8510w, c2127c.f8510w) && AbstractC22676k.m65745e(this.f8511x, c2127c.f8511x) && AbstractC22676k.m65745e(this.f8512y, c2127c.f8512y);
    }

    public final int hashCode() {
        String str = this.f8510w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8511x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8512y;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f8512y, ")", AbstractC11895b.m32001t("BridgeErrorParams(message=", this.f8510w, ", type=", this.f8511x, ", code="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f8510w);
        dest.writeString(this.f8511x);
        dest.writeString(this.f8512y);
    }
}
