package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C22054b implements Parcelable {
    public static final Parcelable.Creator<C22054b> CREATOR = new C16054r0(24);

    /* JADX INFO: renamed from: E */
    public final String f85548E;

    /* JADX INFO: renamed from: F */
    public final String f85549F;

    /* JADX INFO: renamed from: w */
    public final String f85550w;

    /* JADX INFO: renamed from: x */
    public final String f85551x;

    /* JADX INFO: renamed from: y */
    public final String f85552y;

    /* JADX INFO: renamed from: z */
    public final String f85553z;

    public C22054b(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f85550w = str;
        this.f85551x = str2;
        this.f85552y = str3;
        this.f85553z = str4;
        this.f85548E = str5;
        this.f85549F = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22054b)) {
            return false;
        }
        C22054b c22054b = (C22054b) obj;
        return AbstractC22676k.m65745e(this.f85550w, c22054b.f85550w) && AbstractC22676k.m65745e(this.f85551x, c22054b.f85551x) && AbstractC22676k.m65745e(this.f85552y, c22054b.f85552y) && AbstractC22676k.m65745e(this.f85553z, c22054b.f85553z) && AbstractC22676k.m65745e(this.f85548E, c22054b.f85548E) && AbstractC22676k.m65745e(this.f85549F, c22054b.f85549F);
    }

    public final int hashCode() {
        String str = this.f85550w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f85551x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85552y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f85553z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f85548E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f85549F;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Address(line1=", this.f85550w, ", line2=", this.f85551x, ", postalCode=");
        AbstractC11266d.m30444B(sbM32001t, this.f85552y, ", city=", this.f85553z, ", state=");
        return AbstractC11266d.m30464r(sbM32001t, this.f85548E, ", country=", this.f85549F, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f85550w);
        dest.writeString(this.f85551x);
        dest.writeString(this.f85552y);
        dest.writeString(this.f85553z);
        dest.writeString(this.f85548E);
        dest.writeString(this.f85549F);
    }
}
