package w30;

import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import java.util.Iterator;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import v00.C35467g0;
import y00.EnumC38853i;

/* JADX INFO: renamed from: w30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36784a implements InterfaceC36786c {
    public static final Parcelable.Creator<C36784a> CREATOR = new C35467g0(14);

    /* JADX INFO: renamed from: w */
    public final List f157368w;

    public C36784a(List preferredNetworks) {
        AbstractC22676k.m65750j(preferredNetworks, "preferredNetworks");
        this.f157368w = preferredNetworks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36784a) && AbstractC22676k.m65745e(this.f157368w, ((C36784a) obj).f157368w);
    }

    public final int hashCode() {
        return this.f157368w.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106654m("Eligible(preferredNetworks=", ")", this.f157368w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Iterator itM30863o = AbstractC11478a.m30863o(this.f157368w, dest);
        while (itM30863o.hasNext()) {
            dest.writeString(((EnumC38853i) itM30863o.next()).name());
        }
    }
}
