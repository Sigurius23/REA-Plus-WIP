package w10;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;

/* JADX INFO: renamed from: w10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36690b implements InterfaceC36692d {
    public static final Parcelable.Creator<C36690b> CREATOR = new C35467g0(12);

    /* JADX INFO: renamed from: w */
    public final String f157128w;

    /* JADX INFO: renamed from: x */
    public final String f157129x;

    public C36690b(String name, String str) {
        AbstractC22676k.m65750j(name, "name");
        this.f157128w = name;
        this.f157129x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36690b)) {
            return false;
        }
        C36690b c36690b = (C36690b) obj;
        return AbstractC22676k.m65745e(this.f157128w, c36690b.f157128w) && AbstractC22676k.m65745e(this.f157129x, c36690b.f157129x);
    }

    public final int hashCode() {
        int iHashCode = this.f157128w.hashCode() * 31;
        String str = this.f157129x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC2875y.m8300m("USBankAccount(name=", this.f157128w, ", email=", this.f157129x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f157128w);
        dest.writeString(this.f157129x);
    }
}
