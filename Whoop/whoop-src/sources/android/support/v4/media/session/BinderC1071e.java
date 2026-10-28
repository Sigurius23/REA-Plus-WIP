package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import bi.AbstractC3269g;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: android.support.v4.media.session.e */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC1071e extends Binder implements InterfaceC1068b {

    /* JADX INFO: renamed from: f */
    public final WeakReference f4186f;

    public BinderC1071e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f4186f = new WeakReference(null);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.InterfaceC1068b
    /* JADX INFO: renamed from: h0 */
    public final void mo3164h0(PlaybackStateCompat playbackStateCompat) {
        if (this.f4186f.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i13 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i13) {
            case 1:
                parcel.readString();
                if (this.f4186f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 2:
                throw new AssertionError();
            case 3:
                mo3164h0((PlaybackStateCompat) AbstractC3269g.m9504h(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                throw new AssertionError();
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                throw new AssertionError();
            case 6:
                throw new AssertionError();
            case 7:
                throw new AssertionError();
            case 8:
                throw new AssertionError();
            case 9:
                parcel.readInt();
                if (this.f4186f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.f4186f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 12:
                parcel.readInt();
                if (this.f4186f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 13:
                if (this.f4186f.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            default:
                return super.onTransact(i13, parcel, parcel2, i14);
        }
    }
}
