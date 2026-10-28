package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.z2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39012z2 implements Parcelable {
    public static final Parcelable.Creator<C39012z2> CREATOR = new C38967u2(3);

    /* JADX INFO: renamed from: w */
    public final boolean f167909w;

    public C39012z2(boolean z4) {
        this.f167909w = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39012z2) && this.f167909w == ((C39012z2) obj).f167909w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167909w);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("CardBrandChoice(eligible=", ")", this.f167909w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f167909w ? 1 : 0);
    }
}
