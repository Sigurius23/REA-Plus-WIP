package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.v4.app.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C1059a implements InterfaceC1061c {

    /* JADX INFO: renamed from: f */
    public IBinder f4136f;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4136f;
    }

    @Override // android.support.v4.app.InterfaceC1061c
    public final void cancel(String str, int i13, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1061c.f4137a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i13);
            parcelObtain.writeString(str2);
            this.f4136f.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.app.InterfaceC1061c
    public final void cancelAll(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1061c.f4137a);
            parcelObtain.writeString(str);
            this.f4136f.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.app.InterfaceC1061c
    public final void notify(String str, int i13, String str2, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1061c.f4137a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i13);
            parcelObtain.writeString(str2);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f4136f.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
