package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C16717q extends AbstractC16723r {
    public static final Parcelable.Creator<C16717q> CREATOR = new C16699n(2);

    /* JADX INFO: renamed from: w */
    public final String f64255w;

    public C16717q(String str) {
        this.f64255w = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16717q) && AbstractC22676k.m65745e(this.f64255w, ((C16717q) obj).f64255w);
    }

    public final int hashCode() {
        String str = this.f64255w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Failed(displayMessage=", this.f64255w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64255w);
    }
}
