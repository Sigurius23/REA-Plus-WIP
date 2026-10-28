package p695zx;

import android.os.Parcel;
import android.os.Parcelable;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import z10.C39988k;

/* JADX INFO: renamed from: zx.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C41179a implements InterfaceC36562b {
    public static final Parcelable.Creator<C41179a> CREATOR = new C39988k(6);

    /* JADX INFO: renamed from: w */
    public final String f177688w;

    public C41179a(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f177688w = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41179a) && AbstractC22676k.m65745e(this.f177688w, ((C41179a) obj).f177688w);
    }

    public final int hashCode() {
        return this.f177688w.hashCode();
    }

    public final String toString() {
        return this.f177688w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f177688w);
    }
}
