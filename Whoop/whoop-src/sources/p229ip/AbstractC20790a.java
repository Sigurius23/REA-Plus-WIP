package p229ip;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ip.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC20790a implements IInterface {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f78072f;

    /* JADX INFO: renamed from: g */
    public final IBinder f78073g;

    /* JADX INFO: renamed from: h */
    public final String f78074h;

    public /* synthetic */ AbstractC20790a(IBinder iBinder, String str, int i13) {
        this.f78072f = i13;
        this.f78073g = iBinder;
        this.f78074h = str;
    }

    /* JADX INFO: renamed from: X */
    public void m57319X(Parcel parcel, int i13) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f78073g.transact(i13, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f78072f) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f78073g;
    }

    /* JADX INFO: renamed from: c0 */
    public Parcel m57320c0(Parcel parcel, int i13) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f78073g.transact(i13, parcel, parcelObtain, 0);
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

    /* JADX INFO: renamed from: j0 */
    public Parcel m57321j0(Parcel parcel, int i13) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f78073g.transact(i13, parcel, parcelObtain, 0);
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

    /* JADX INFO: renamed from: k0 */
    public Parcel m57322k0() {
        switch (this.f78072f) {
            case 2:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f78074h);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f78074h);
                return parcelObtain2;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m57323l0(Parcel parcel, int i13) {
        switch (this.f78072f) {
            case 3:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    this.f78073g.transact(i13, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain.recycle();
                }
            default:
                try {
                    this.f78073g.transact(i13, parcel, null, 1);
                    return;
                } finally {
                    parcel.recycle();
                }
        }
    }

    /* JADX INFO: renamed from: s */
    public Parcel m57324s() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f78074h);
        return parcelObtain;
    }
}
