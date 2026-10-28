package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38863j;

/* JADX INFO: renamed from: ux.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C35334h implements InterfaceC35322b {

    /* JADX INFO: renamed from: w */
    public static final C35334h f150537w = new C35334h();
    public static final Parcelable.Creator<C35334h> CREATOR = new C35332g(0);

    @Override // p537ux.InterfaceC35322b
    /* JADX INFO: renamed from: A */
    public final /* bridge */ /* synthetic */ Integer mo112182A() {
        return null;
    }

    @Override // p537ux.InterfaceC35322b
    /* JADX INFO: renamed from: F */
    public final boolean mo112183F(EnumC38863j cardFunding) {
        AbstractC22676k.m65750j(cardFunding, "cardFunding");
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
