package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: androidx.room.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C1811n implements InterfaceC1814o {

    /* JADX INFO: renamed from: f */
    public IBinder f7117f;

    @Override // androidx.room.InterfaceC1814o
    /* JADX INFO: renamed from: a */
    public final void mo5438a(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1814o.f7135b);
            parcelObtain.writeStringArray(strArr);
            this.f7117f.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7117f;
    }
}
