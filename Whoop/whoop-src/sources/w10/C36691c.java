package w10;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p266jz.C22057e;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;

/* JADX INFO: renamed from: w10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C36691c implements Parcelable, InterfaceC36692d {
    public static final Parcelable.Creator<C36691c> CREATOR = new C35467g0(13);

    /* JADX INFO: renamed from: w */
    public final String f157130w;

    /* JADX INFO: renamed from: x */
    public final String f157131x;

    /* JADX INFO: renamed from: y */
    public final C22057e f157132y;

    public C36691c(String name, String str, C22057e c22057e) {
        AbstractC22676k.m65750j(name, "name");
        this.f157130w = name;
        this.f157131x = str;
        this.f157132y = c22057e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36691c)) {
            return false;
        }
        C36691c c36691c = (C36691c) obj;
        return AbstractC22676k.m65745e(this.f157130w, c36691c.f157130w) && AbstractC22676k.m65745e(this.f157131x, c36691c.f157131x) && AbstractC22676k.m65745e(this.f157132y, c36691c.f157132y);
    }

    public final int hashCode() {
        int iHashCode = this.f157130w.hashCode() * 31;
        String str = this.f157131x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C22057e c22057e = this.f157132y;
        return iHashCode2 + (c22057e != null ? c22057e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("USBankAccountInternal(name=", this.f157130w, ", email=", this.f157131x, ", elementsSessionContext=");
        sbM32001t.append(this.f157132y);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f157130w);
        dest.writeString(this.f157131x);
        dest.writeParcelable(this.f157132y, i13);
    }
}
