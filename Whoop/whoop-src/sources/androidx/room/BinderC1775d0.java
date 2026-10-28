package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC1775d0 extends Binder implements InterfaceC1820q {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f6998g = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MultiInstanceInvalidationService f6999f;

    public BinderC1775d0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f6999f = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC1820q.f7162c);
    }

    @Override // androidx.room.InterfaceC1820q
    /* JADX INFO: renamed from: H */
    public final int mo5413H(InterfaceC1814o callback, String str) {
        AbstractC22676k.m65750j(callback, "callback");
        int i13 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6999f;
        synchronized (multiInstanceInvalidationService.f6947y) {
            try {
                int i14 = multiInstanceInvalidationService.f6945w + 1;
                multiInstanceInvalidationService.f6945w = i14;
                if (multiInstanceInvalidationService.f6947y.register(callback, Integer.valueOf(i14))) {
                    multiInstanceInvalidationService.f6946x.put(Integer.valueOf(i14), str);
                    i13 = i14;
                } else {
                    multiInstanceInvalidationService.f6945w--;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i13;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // androidx.room.InterfaceC1820q
    /* JADX INFO: renamed from: f0 */
    public final void mo5414f0(InterfaceC1814o callback, int i13) {
        AbstractC22676k.m65750j(callback, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6999f;
        synchronized (multiInstanceInvalidationService.f6947y) {
            multiInstanceInvalidationService.f6947y.unregister(callback);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        String str = InterfaceC1820q.f7162c;
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i13 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC1814o interfaceC1814o = null;
        InterfaceC1814o interfaceC1814o2 = null;
        if (i13 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC1814o.f7135b);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1814o)) {
                    C1811n c1811n = new C1811n();
                    c1811n.f7117f = strongBinder;
                    interfaceC1814o = c1811n;
                } else {
                    interfaceC1814o = (InterfaceC1814o) iInterfaceQueryLocalInterface;
                }
            }
            int iMo5413H = mo5413H(interfaceC1814o, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iMo5413H);
            return true;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                return super.onTransact(i13, parcel, parcel2, i14);
            }
            mo5415y(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(InterfaceC1814o.f7135b);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC1814o)) {
                C1811n c1811n2 = new C1811n();
                c1811n2.f7117f = strongBinder2;
                interfaceC1814o2 = c1811n2;
            } else {
                interfaceC1814o2 = (InterfaceC1814o) iInterfaceQueryLocalInterface2;
            }
        }
        mo5414f0(interfaceC1814o2, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    @Override // androidx.room.InterfaceC1820q
    /* JADX INFO: renamed from: y */
    public final void mo5415y(int i13, String[] tables) {
        AbstractC22676k.m65750j(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6999f;
        synchronized (multiInstanceInvalidationService.f6947y) {
            String str = (String) multiInstanceInvalidationService.f6946x.get(Integer.valueOf(i13));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f6947y.beginBroadcast();
            for (int i14 = 0; i14 < iBeginBroadcast; i14++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f6947y.getBroadcastCookie(i14);
                    AbstractC22676k.m65748h(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f6946x.get(num);
                    if (i13 != iIntValue && str.equals(str2)) {
                        try {
                            ((InterfaceC1814o) multiInstanceInvalidationService.f6947y.getBroadcastItem(i14)).mo5438a(tables);
                        } catch (RemoteException e5) {
                            Log.w("ROOM", "Error invoking a remote callback", e5);
                        }
                    }
                } catch (Throwable th3) {
                    multiInstanceInvalidationService.f6947y.finishBroadcast();
                    throw th3;
                }
            }
            multiInstanceInvalidationService.f6947y.finishBroadcast();
        }
    }
}
