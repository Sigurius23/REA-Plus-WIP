package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import p088dc.AbstractC11894a;
import p088dc.InterfaceC11898e;

/* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
/* JADX INFO: loaded from: classes5.dex */
class ResultReceiverC1066x50fd9e4a extends ResultReceiver {

    /* JADX INFO: renamed from: w */
    public WeakReference f4155w;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i13, Bundle bundle) {
        InterfaceC1070d interfaceC1070d;
        C1072f c1072f = (C1072f) this.f4155w.get();
        if (c1072f == null || bundle == null) {
            return;
        }
        synchronized (c1072f.f4188b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = c1072f.f4191e;
            IBinder binder = BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER");
            int i14 = BinderC1077k.f4195g;
            InterfaceC11898e interfaceC11898e = null;
            if (binder == null) {
                interfaceC1070d = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1070d)) {
                    C1069c c1069c = new C1069c();
                    c1069c.f4185f = binder;
                    interfaceC1070d = c1069c;
                } else {
                    interfaceC1070d = (InterfaceC1070d) iInterfaceQueryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.f4159w) {
                mediaSessionCompat$Token.f4161y = interfaceC1070d;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = c1072f.f4191e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(AbstractC11894a.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    interfaceC11898e = ((ParcelImpl) parcelable).f7232w;
                }
            } catch (RuntimeException unused) {
            }
            synchronized (mediaSessionCompat$Token2.f4159w) {
                mediaSessionCompat$Token2.f4162z = interfaceC11898e;
            }
            c1072f.m3207a();
        }
    }
}
