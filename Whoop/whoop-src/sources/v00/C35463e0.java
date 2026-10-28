package v00;

import android.os.Parcel;
import android.os.Parcelable;
import p482s7.AbstractC32237a;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.EnumC29820h;
import y00.EnumC38941r3;

/* JADX INFO: renamed from: v00.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35463e0 implements InterfaceC35471i0 {
    public static final Parcelable.Creator<C35463e0> CREATOR = new C35332g(28);

    /* JADX INFO: renamed from: w */
    public final EnumC38941r3 f151002w;

    public C35463e0(EnumC38941r3 enumC38941r3) {
        this.f151002w = enumC38941r3;
    }

    @Override // v00.InterfaceC35471i0
    /* JADX INFO: renamed from: L */
    public final EnumC38941r3 mo112545L(boolean z4, EnumC29820h enumC29820h) {
        return AbstractC32237a.m100287a(this, z4, enumC29820h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35463e0) && this.f151002w == ((C35463e0) obj).f151002w;
    }

    public final int hashCode() {
        EnumC38941r3 enumC38941r3 = this.f151002w;
        if (enumC38941r3 == null) {
            return 0;
        }
        return enumC38941r3.hashCode();
    }

    public final String toString() {
        return "Disabled(overrideAllowRedisplay=" + this.f151002w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f151002w, i13);
    }
}
