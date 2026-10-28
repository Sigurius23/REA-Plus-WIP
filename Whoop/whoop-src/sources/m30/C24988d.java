package m30;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: m30.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C24988d extends AbstractC24985a implements InterfaceC24986b {
    public static final Parcelable.Creator<C24988d> CREATOR = new C22060h(25);

    /* JADX INFO: renamed from: E */
    public int f97785E;

    /* JADX INFO: renamed from: z */
    public String f97786z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24988d)) {
            return false;
        }
        C24988d c24988d = (C24988d) obj;
        return AbstractC22676k.m65745e(this.f97786z, c24988d.f97786z) && this.f97785E == c24988d.f97785E;
    }

    public final int hashCode() {
        return AbstractC32103e.m99885g(this.f97786z, Integer.valueOf(this.f97785E));
    }

    @Override // m30.AbstractC24985a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeString(this.f97786z);
        parcel.writeInt(this.f97785E);
    }
}
