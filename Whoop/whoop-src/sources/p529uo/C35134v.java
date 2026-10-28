package p529uo;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.fragment.app.C1337q1;

/* JADX INFO: renamed from: uo.v */
/* JADX INFO: loaded from: classes.dex */
public final class C35134v implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f149081f;

    public C35134v(IBinder iBinder) {
        this.f149081f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f149081f;
    }

    /* JADX INFO: renamed from: s */
    public final void m111088s(BinderC35138z binderC35138z, C35115g c35115g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(binderC35138z);
            parcelObtain.writeInt(1);
            C1337q1.m4208a(c35115g, parcelObtain, 0);
            this.f149081f.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
