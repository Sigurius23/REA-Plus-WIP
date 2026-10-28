package p656yp;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: yp.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39694a implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f170858f;

    public C39694a(IBinder iBinder) {
        this.f170858f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f170858f;
    }

    /* JADX INFO: renamed from: s */
    public final Parcel m127033s(Parcel parcel, int i13) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f170858f.transact(i13, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e5) {
                parcelObtain.recycle();
                throw e5;
            }
        } catch (Throwable th3) {
            parcel.recycle();
            throw th3;
        }
    }
}
