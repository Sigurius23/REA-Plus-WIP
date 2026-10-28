package m30;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: m30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C24989e extends AbstractC24985a implements InterfaceC24987c {
    public static final Parcelable.Creator<C24989e> CREATOR = new C22060h(26);

    /* JADX INFO: renamed from: E */
    public String f97787E;

    /* JADX INFO: renamed from: F */
    public int f97788F;

    /* JADX INFO: renamed from: z */
    public String f97789z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24989e)) {
            return false;
        }
        C24989e c24989e = (C24989e) obj;
        return AbstractC22676k.m65745e(this.f97789z, c24989e.f97789z) && AbstractC22676k.m65745e(this.f97787E, c24989e.f97787E) && this.f97788F == c24989e.f97788F;
    }

    public final int hashCode() {
        return AbstractC32103e.m99885g(this.f97789z, this.f97787E, Integer.valueOf(this.f97788F));
    }

    @Override // m30.AbstractC24985a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeString(this.f97789z);
        parcel.writeString(this.f97787E);
        parcel.writeInt(this.f97788F);
    }
}
