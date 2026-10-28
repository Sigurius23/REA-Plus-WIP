package vn;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: vn.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C36188s implements Parcelable {
    public static final Parcelable.Creator<C36188s> CREATOR = new C36187r(1);

    /* JADX INFO: renamed from: E */
    public final String f154912E;

    /* JADX INFO: renamed from: F */
    public final String f154913F;

    /* JADX INFO: renamed from: w */
    public final int f154914w;

    /* JADX INFO: renamed from: x */
    public final int f154915x;

    /* JADX INFO: renamed from: y */
    public final String f154916y;

    /* JADX INFO: renamed from: z */
    public final String f154917z;

    public C36188s(String str, String str2, int i13, int i14, String str3, String str4) {
        this.f154914w = i13;
        this.f154915x = i14;
        this.f154916y = str;
        this.f154917z = str2;
        this.f154912E = str3;
        this.f154913F = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C36188s.class == obj.getClass()) {
            C36188s c36188s = (C36188s) obj;
            if (this.f154914w == c36188s.f154914w && this.f154915x == c36188s.f154915x && TextUtils.equals(this.f154916y, c36188s.f154916y) && TextUtils.equals(this.f154917z, c36188s.f154917z) && TextUtils.equals(this.f154912E, c36188s.f154912E) && TextUtils.equals(this.f154913F, c36188s.f154913F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = ((this.f154914w * 31) + this.f154915x) * 31;
        String str = this.f154916y;
        int iHashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f154917z;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f154912E;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f154913F;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f154914w);
        parcel.writeInt(this.f154915x);
        parcel.writeString(this.f154916y);
        parcel.writeString(this.f154917z);
        parcel.writeString(this.f154912E);
        parcel.writeString(this.f154913F);
    }

    public C36188s(Parcel parcel) {
        this.f154914w = parcel.readInt();
        this.f154915x = parcel.readInt();
        this.f154916y = parcel.readString();
        this.f154917z = parcel.readString();
        this.f154912E = parcel.readString();
        this.f154913F = parcel.readString();
    }
}
