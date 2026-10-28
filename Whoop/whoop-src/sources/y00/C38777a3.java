package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.a3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38777a3 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38777a3> CREATOR = new C38967u2(4);

    /* JADX INFO: renamed from: w */
    public final C39012z2 f166913w;

    public C38777a3(C39012z2 cardBrandChoice) {
        AbstractC22676k.m65750j(cardBrandChoice, "cardBrandChoice");
        this.f166913w = cardBrandChoice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38777a3) && AbstractC22676k.m65745e(this.f166913w, ((C38777a3) obj).f166913w);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166913w.f167909w);
    }

    public final String toString() {
        return "MobileCardElementConfig(cardBrandChoice=" + this.f166913w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f166913w.writeToParcel(dest, i13);
    }
}
