package i20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C17973r implements Parcelable {
    public static final Parcelable.Creator<C17973r> CREATOR = new C17925a(5);

    /* JADX INFO: renamed from: w */
    public final EnumC17971q f69796w;

    /* JADX INFO: renamed from: x */
    public final String f69797x;

    public C17973r(EnumC17971q phone, String str) {
        AbstractC22676k.m65750j(phone, "phone");
        this.f69796w = phone;
        this.f69797x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17973r)) {
            return false;
        }
        C17973r c17973r = (C17973r) obj;
        return this.f69796w == c17973r.f69796w && AbstractC22676k.m65745e(this.f69797x, c17973r.f69797x);
    }

    public final int hashCode() {
        int iHashCode = this.f69796w.hashCode() * 31;
        String str = this.f69797x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AdditionalFieldsConfiguration(phone=" + this.f69796w + ", checkboxLabel=" + this.f69797x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f69796w.writeToParcel(dest, i13);
        dest.writeString(this.f69797x);
    }
}
