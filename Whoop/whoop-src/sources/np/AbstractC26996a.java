package np;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: np.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC26996a implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f107676f;

    /* JADX INFO: renamed from: g */
    public final String f107677g;

    public AbstractC26996a(IBinder iBinder, String str) {
        this.f107676f = iBinder;
        this.f107677g = str;
    }

    /* JADX INFO: renamed from: X */
    public final Parcel m80979X(Parcel parcel, int i13) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f107676f.transact(i13, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f107676f;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m80980c0(Parcel parcel, int i13) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f107676f.transact(i13, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: s */
    public final Parcel m80981s() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f107677g);
        return parcelObtain;
    }
}
