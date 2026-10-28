package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.v4.media.session.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C1067a implements InterfaceC1068b {

    /* JADX INFO: renamed from: f */
    public IBinder f4184f;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4184f;
    }

    @Override // android.support.v4.media.session.InterfaceC1068b
    /* JADX INFO: renamed from: h0 */
    public final void mo3164h0(PlaybackStateCompat playbackStateCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            playbackStateCompat.writeToParcel(parcelObtain, 0);
            this.f4184f.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
