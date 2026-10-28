package h20;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16635c1 implements Parcelable {
    public static final Parcelable.Creator<C16635c1> CREATOR = new C16699n(13);

    /* JADX INFO: renamed from: w */
    public final int f63980w;

    /* JADX INFO: renamed from: x */
    public final int f63981x;

    /* JADX INFO: renamed from: y */
    public final int f63982y;

    public C16635c1(int i13, int i14, int i15) {
        this.f63980w = i13;
        this.f63981x = i14;
        this.f63982y = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16635c1)) {
            return false;
        }
        C16635c1 c16635c1 = (C16635c1) obj;
        return this.f63980w == c16635c1.f63980w && this.f63981x == c16635c1.f63981x && this.f63982y == c16635c1.f63982y;
    }

    public final int hashCode() {
        return (((this.f63980w * 31) + this.f63981x) * 31) + this.f63982y;
    }

    public final String toString() {
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(this.f63980w, this.f63981x, "Colors(separatorColor=", ", selectedColor=", ", unselectedColor="), this.f63982y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f63980w);
        dest.writeInt(this.f63981x);
        dest.writeInt(this.f63982y);
    }
}
