package c10;

import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c10.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C3829l extends AbstractC3830m {
    public static final Parcelable.Creator<C3829l> CREATOR = new C2125b(8);

    /* JADX INFO: renamed from: w */
    public final String f15666w;

    public C3829l(String str) {
        this.f15666w = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3829l) && AbstractC22676k.m65745e(this.f15666w, ((C3829l) obj).f15666w);
    }

    public final int hashCode() {
        String str = this.f15666w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Failed(displayMessage=", this.f15666w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f15666w);
    }
}
