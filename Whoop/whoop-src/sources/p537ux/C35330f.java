package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;
import y00.EnumC38853i;

/* JADX INFO: renamed from: ux.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C35330f implements InterfaceC35320a {

    /* JADX INFO: renamed from: w */
    public static final C35330f f150532w = new C35330f();
    public static final Parcelable.Creator<C35330f> CREATOR = new C32854e(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p537ux.InterfaceC35320a
    /* JADX INFO: renamed from: l0 */
    public final boolean mo112178l0(C38915o4 c38915o4) {
        return true;
    }

    @Override // p537ux.InterfaceC35320a
    /* JADX INFO: renamed from: o */
    public final boolean mo112179o(EnumC38853i cardBrand) {
        AbstractC22676k.m65750j(cardBrand, "cardBrand");
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
