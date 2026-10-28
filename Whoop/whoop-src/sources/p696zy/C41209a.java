package p696zy;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import z10.C39988k;

/* JADX INFO: renamed from: zy.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C41209a implements InterfaceC41211c {
    public static final Parcelable.Creator<C41209a> CREATOR = new C39988k(7);

    /* JADX INFO: renamed from: w */
    public final InterfaceC41211c f177843w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC41211c f177844x;

    public C41209a(InterfaceC41211c first, InterfaceC41211c second) {
        AbstractC22676k.m65750j(first, "first");
        AbstractC22676k.m65750j(second, "second");
        this.f177843w = first;
        this.f177844x = second;
    }

    @Override // p696zy.InterfaceC41211c
    /* JADX INFO: renamed from: M */
    public final String mo133889M(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return AbstractC2875y.m8299l(this.f177843w.mo133889M(context), this.f177844x.mo133889M(context));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41209a)) {
            return false;
        }
        C41209a c41209a = (C41209a) obj;
        return AbstractC22676k.m65745e(this.f177843w, c41209a.f177843w) && AbstractC22676k.m65745e(this.f177844x, c41209a.f177844x);
    }

    public final int hashCode() {
        return this.f177844x.hashCode() + (this.f177843w.hashCode() * 31);
    }

    public final String toString() {
        return "ConcatenatedResolvableString(first=" + this.f177843w + ", second=" + this.f177844x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f177843w, i13);
        dest.writeParcelable(this.f177844x, i13);
    }
}
