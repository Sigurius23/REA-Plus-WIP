package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: android.support.v4.app.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractBinderC1060b extends Binder implements InterfaceC1061c {
    static final int TRANSACTION_cancel = 2;
    static final int TRANSACTION_cancelAll = 3;
    static final int TRANSACTION_notify = 1;

    public static InterfaceC1061c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1061c.f4137a);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC1061c)) {
            return (InterfaceC1061c) iInterfaceQueryLocalInterface;
        }
        C1059a c1059a = new C1059a();
        c1059a.f4136f = iBinder;
        return c1059a;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) throws RemoteException {
        String str = InterfaceC1061c.f4137a;
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i13 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i13 == 1) {
            notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) (parcel.readInt() != 0 ? Notification.CREATOR.createFromParcel(parcel) : null));
        } else if (i13 == 2) {
            cancel(parcel.readString(), parcel.readInt(), parcel.readString());
        } else {
            if (i13 != 3) {
                return super.onTransact(i13, parcel, parcel2, i14);
            }
            cancelAll(parcel.readString());
        }
        return true;
    }
}
