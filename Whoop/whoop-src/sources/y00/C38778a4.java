package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.a4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38778a4 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C38778a4> CREATOR = new C38967u2(21);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ C38778a4 f166914x = new C38778a4(true);

    /* JADX INFO: renamed from: w */
    public final boolean f166915w;

    public C38778a4(boolean z4) {
        this.f166915w = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38778a4) && this.f166915w == ((C38778a4) obj).f166915w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166915w);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("CardPresent(ignore=", ")", this.f166915w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f166915w ? 1 : 0);
    }
}
