package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16623a1 implements Parcelable {
    public static final Parcelable.Creator<C16623a1> CREATOR = new C16699n(11);

    /* JADX INFO: renamed from: w */
    public final int f63957w;

    /* JADX INFO: renamed from: x */
    public final int f63958x;

    public C16623a1(int i13, int i14) {
        this.f63957w = i13;
        this.f63958x = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16623a1)) {
            return false;
        }
        C16623a1 c16623a1 = (C16623a1) obj;
        return this.f63957w == c16623a1.f63957w && this.f63958x == c16623a1.f63958x;
    }

    public final int hashCode() {
        return (this.f63957w * 31) + this.f63958x;
    }

    public final String toString() {
        return AbstractC25012a.m73372e(this.f63957w, this.f63958x, "Colors(separatorColor=", ", disclosureColor=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f63957w);
        dest.writeInt(this.f63958x);
    }
}
