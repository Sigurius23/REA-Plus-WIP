package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import y00.EnumC38913o2;

/* JADX INFO: renamed from: a30.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0289f0 implements InterfaceC0310m0 {
    public static final Parcelable.Creator<C0289f0> CREATOR = new C0113a(8);

    /* JADX INFO: renamed from: w */
    public final List f1018w;

    public C0289f0(AbstractList linkDisabledReasons) {
        AbstractC22676k.m65750j(linkDisabledReasons, "linkDisabledReasons");
        this.f1018w = linkDisabledReasons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0289f0) && AbstractC22676k.m65745e(this.f1018w, ((C0289f0) obj).f1018w);
    }

    public final int hashCode() {
        return this.f1018w.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106654m("LinkDisabledState(linkDisabledReasons=", ")", this.f1018w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Iterator itM30863o = AbstractC11478a.m30863o(this.f1018w, dest);
        while (itM30863o.hasNext()) {
            dest.writeString(((EnumC38913o2) itM30863o.next()).name());
        }
    }
}
