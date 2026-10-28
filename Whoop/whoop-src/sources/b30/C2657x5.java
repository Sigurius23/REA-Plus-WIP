package b30;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.x5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2657x5 implements Parcelable {
    public static final Parcelable.Creator<C2657x5> CREATOR = new C2650w5(0);

    /* JADX INFO: renamed from: w */
    public final String f10379w;

    public C2657x5(String merchantName) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        this.f10379w = merchantName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2657x5) && AbstractC22676k.m65745e(this.f10379w, ((C2657x5) obj).f10379w);
    }

    public final int hashCode() {
        return this.f10379w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Args(merchantName=", this.f10379w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f10379w);
    }
}
