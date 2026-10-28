package t20;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C33324e implements InterfaceC33325f {
    public static final Parcelable.Creator<C33324e> CREATOR = new C33320a(3);

    /* JADX INFO: renamed from: w */
    public final String f139006w;

    public C33324e(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f139006w = id4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33324e) && AbstractC22676k.m65745e(this.f139006w, ((C33324e) obj).f139006w);
    }

    public final int hashCode() {
        return this.f139006w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Session(id=", this.f139006w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f139006w);
    }
}
