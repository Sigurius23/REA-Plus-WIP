package p310lp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: lp.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC24628g extends Binder implements IInterface {
    public AbstractBinderC24628g(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        if (i13 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i13, parcel, parcel2, i14)) {
            return true;
        }
        return mo15621s(i13, parcel, parcel2);
    }

    /* JADX INFO: renamed from: s */
    public boolean mo15621s(int i13, Parcel parcel, Parcel parcel2) {
        return false;
    }
}
