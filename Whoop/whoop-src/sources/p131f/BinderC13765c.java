package p131f;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: f.c */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC13765c extends Binder implements InterfaceC13764b {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f49115g = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C13766d f49116f;

    public BinderC13765c(C13766d c13766d) {
        this.f49116f = c13766d;
        attachInterface(this, InterfaceC13764b.f49114e);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        String str = InterfaceC13764b.f49114e;
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i13 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i13 != 1) {
            return super.onTransact(i13, parcel, parcel2, i14);
        }
        this.f49116f.mo3134b(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
