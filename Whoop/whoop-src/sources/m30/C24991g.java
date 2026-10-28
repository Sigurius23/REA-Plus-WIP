package m30;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: m30.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C24991g extends AbstractC24985a implements InterfaceC24987c {
    public static final Parcelable.Creator<C24991g> CREATOR = new C22060h(28);

    /* JADX INFO: renamed from: E */
    public String f97794E;

    /* JADX INFO: renamed from: F */
    public String f97795F;

    /* JADX INFO: renamed from: G */
    public String f97796G;

    /* JADX INFO: renamed from: z */
    public String f97797z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24991g)) {
            return false;
        }
        C24991g c24991g = (C24991g) obj;
        return AbstractC22676k.m65745e(this.f97797z, c24991g.f97797z) && AbstractC22676k.m65745e(this.f97794E, c24991g.f97794E) && AbstractC22676k.m65745e(this.f97795F, c24991g.f97795F) && AbstractC22676k.m65745e(this.f97796G, c24991g.f97796G);
    }

    public final int hashCode() {
        return AbstractC32103e.m99885g(this.f97797z, this.f97794E, this.f97795F, this.f97796G);
    }

    @Override // m30.AbstractC24985a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeString(this.f97797z);
        parcel.writeString(this.f97794E);
        parcel.writeString(this.f97795F);
        parcel.writeString(this.f97796G);
    }
}
