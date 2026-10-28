package h20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.b3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16631b3 implements Parcelable {
    public static final Parcelable.Creator<C16631b3> CREATOR = new C16654f2(13);

    /* JADX INFO: renamed from: w */
    public final Integer f63975w;

    /* JADX INFO: renamed from: x */
    public final Float f63976x;

    public C16631b3(Integer num, Float f13) {
        this.f63975w = num;
        this.f63976x = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16631b3)) {
            return false;
        }
        C16631b3 c16631b3 = (C16631b3) obj;
        return AbstractC22676k.m65745e(this.f63975w, c16631b3.f63975w) && AbstractC22676k.m65745e(this.f63976x, c16631b3.f63976x);
    }

    public final int hashCode() {
        Integer num = this.f63975w;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f13 = this.f63976x;
        return iHashCode + (f13 != null ? f13.hashCode() : 0);
    }

    public final String toString() {
        return "PrimaryButtonTypography(fontResId=" + this.f63975w + ", fontSizeSp=" + this.f63976x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.f63975w;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Float f13 = this.f63976x;
        if (f13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f13.floatValue());
        }
    }
}
