package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import j00.EnumC21096d0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;
import y00.EnumC38958t2;

/* JADX INFO: renamed from: a30.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0295h0 implements InterfaceC0301j0 {
    public static final Parcelable.Creator<C0295h0> CREATOR = new C0113a(10);

    /* JADX INFO: renamed from: w */
    public final List f1031w;

    public C0295h0(AbstractList disabledReasons) {
        AbstractC22676k.m65750j(disabledReasons, "disabledReasons");
        this.f1031w = disabledReasons;
    }

    @Override // a30.InterfaceC0301j0
    /* JADX INFO: renamed from: P */
    public final List mo822P() {
        return this.f1031w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0295h0) && AbstractC22676k.m65745e(this.f1031w, ((C0295h0) obj).f1031w);
    }

    @Override // a30.InterfaceC0301j0
    /* JADX INFO: renamed from: g */
    public final EnumC21096d0 mo823g() {
        return null;
    }

    public final int hashCode() {
        return this.f1031w.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106654m("Disabled(disabledReasons=", ")", this.f1031w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Iterator itM30863o = AbstractC11478a.m30863o(this.f1031w, dest);
        while (itM30863o.hasNext()) {
            dest.writeString(((EnumC38958t2) itM30863o.next()).name());
        }
    }
}
