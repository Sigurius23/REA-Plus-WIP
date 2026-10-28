package d00;

import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d00.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C11434m implements Parcelable {
    public static final Parcelable.Creator<C11434m> CREATOR = new C2125b(19);

    /* JADX INFO: renamed from: w */
    public final String f36663w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC11432k f36664x;

    public C11434m(String linkAuthIntentId, InterfaceC11432k interfaceC11432k) {
        AbstractC22676k.m65750j(linkAuthIntentId, "linkAuthIntentId");
        this.f36663w = linkAuthIntentId;
        this.f36664x = interfaceC11432k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11434m)) {
            return false;
        }
        C11434m c11434m = (C11434m) obj;
        return AbstractC22676k.m65745e(this.f36663w, c11434m.f36663w) && AbstractC22676k.m65745e(this.f36664x, c11434m.f36664x);
    }

    public final int hashCode() {
        int iHashCode = this.f36663w.hashCode() * 31;
        InterfaceC11432k interfaceC11432k = this.f36664x;
        return iHashCode + (interfaceC11432k == null ? 0 : interfaceC11432k.hashCode());
    }

    public final String toString() {
        return "LinkAuthIntentInfo(linkAuthIntentId=" + this.f36663w + ", consentPresentation=" + this.f36664x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f36663w);
        dest.writeParcelable(this.f36664x, i13);
    }
}
