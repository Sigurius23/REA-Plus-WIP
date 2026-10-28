package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C22055c implements Parcelable {
    public static final Parcelable.Creator<C22055c> CREATOR = new C16054r0(25);

    /* JADX INFO: renamed from: w */
    public final String f85554w;

    /* JADX INFO: renamed from: x */
    public final String f85555x;

    /* JADX INFO: renamed from: y */
    public final String f85556y;

    /* JADX INFO: renamed from: z */
    public final C22054b f85557z;

    public C22055c(String str, String str2, String str3, C22054b c22054b) {
        this.f85554w = str;
        this.f85555x = str2;
        this.f85556y = str3;
        this.f85557z = c22054b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22055c)) {
            return false;
        }
        C22055c c22055c = (C22055c) obj;
        return AbstractC22676k.m65745e(this.f85554w, c22055c.f85554w) && AbstractC22676k.m65745e(this.f85555x, c22055c.f85555x) && AbstractC22676k.m65745e(this.f85556y, c22055c.f85556y) && AbstractC22676k.m65745e(this.f85557z, c22055c.f85557z);
    }

    public final int hashCode() {
        String str = this.f85554w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f85555x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85556y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C22054b c22054b = this.f85557z;
        return iHashCode3 + (c22054b != null ? c22054b.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BillingDetails(name=", this.f85554w, ", phone=", this.f85555x, ", email=");
        sbM32001t.append(this.f85556y);
        sbM32001t.append(", address=");
        sbM32001t.append(this.f85557z);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f85554w);
        dest.writeString(this.f85555x);
        dest.writeString(this.f85556y);
        C22054b c22054b = this.f85557z;
        if (c22054b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c22054b.writeToParcel(dest, i13);
        }
    }
}
