package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: androidx.room.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C1817p implements InterfaceC1820q {

    /* JADX INFO: renamed from: f */
    public IBinder f7141f;

    @Override // androidx.room.InterfaceC1820q
    /* JADX INFO: renamed from: H */
    public final int mo5413H(InterfaceC1814o interfaceC1814o, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1820q.f7162c);
            parcelObtain.writeStrongInterface(interfaceC1814o);
            parcelObtain.writeString(str);
            this.f7141f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7141f;
    }

    @Override // androidx.room.InterfaceC1820q
    /* JADX INFO: renamed from: f0 */
    public final void mo5414f0(InterfaceC1814o interfaceC1814o, int i13) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1820q.f7162c);
            parcelObtain.writeStrongInterface(interfaceC1814o);
            parcelObtain.writeInt(i13);
            this.f7141f.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // androidx.room.InterfaceC1820q
    /* JADX INFO: renamed from: y */
    public final void mo5415y(int i13, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1820q.f7162c);
            parcelObtain.writeInt(i13);
            parcelObtain.writeStringArray(strArr);
            this.f7141f.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
