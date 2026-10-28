package so;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: so.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C32791h implements Parcelable {
    public static final Parcelable.Creator<C32791h> CREATOR = new C32786c(1);

    /* JADX INFO: renamed from: w */
    public final Messenger f136478w;

    public C32791h(IBinder iBinder) {
        this.f136478w = new Messenger(iBinder);
    }

    /* JADX INFO: renamed from: b */
    public final void m102847b(Message message) throws RemoteException {
        Messenger messenger = this.f136478w;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f136478w;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((C32791h) obj).f136478w;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f136478w;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Messenger messenger = this.f136478w;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
