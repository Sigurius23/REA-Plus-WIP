package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.o1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16707o1 implements Parcelable {
    public static final Parcelable.Creator<C16707o1> CREATOR = new C16699n(18);

    /* JADX INFO: renamed from: w */
    public final EnumC16701n1 f64235w;

    public C16707o1(EnumC16701n1 link) {
        AbstractC22676k.m65750j(link, "link");
        this.f64235w = link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16707o1) && this.f64235w == ((C16707o1) obj).f64235w;
    }

    public final int hashCode() {
        return this.f64235w.hashCode();
    }

    public final String toString() {
        return "ButtonThemes(link=" + this.f64235w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64235w.name());
    }
}
