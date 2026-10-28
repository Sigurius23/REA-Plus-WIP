package m30;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: m30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C24990f extends AbstractC24985a implements InterfaceC24993i {
    public static final Parcelable.Creator<C24990f> CREATOR = new C22060h(27);

    /* JADX INFO: renamed from: E */
    public String f97790E;

    /* JADX INFO: renamed from: F */
    public int f97791F;

    /* JADX INFO: renamed from: G */
    public String f97792G;

    /* JADX INFO: renamed from: z */
    public int f97793z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24990f)) {
            return false;
        }
        C24990f c24990f = (C24990f) obj;
        return this.f97793z == c24990f.f97793z && AbstractC22676k.m65745e(this.f97790E, c24990f.f97790E) && this.f97791F == c24990f.f97791F && AbstractC22676k.m65745e(this.f97792G, c24990f.f97792G);
    }

    public final int hashCode() {
        return AbstractC32103e.m99885g(Integer.valueOf(this.f97793z), this.f97790E, Integer.valueOf(this.f97791F), this.f97792G);
    }

    @Override // m30.AbstractC24985a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeInt(this.f97793z);
        parcel.writeString(this.f97790E);
        parcel.writeInt(this.f97791F);
        parcel.writeString(this.f97792G);
    }
}
