package android.support.v4.media.session;

import a00.C0072g;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.utils.AndroidSDKConstants;
import p498t8.AbstractC33590a;
import ro.C31624i;

/* JADX INFO: renamed from: android.support.v4.media.session.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C1082p {

    /* JADX INFO: renamed from: c */
    public static int f4205c;

    /* JADX INFO: renamed from: a */
    public final C1078l f4206a;

    /* JADX INFO: renamed from: b */
    public final C31624i f4207b;

    public C1082p(Application application, String str) {
        ComponentName componentName;
        new ArrayList();
        if (application == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i13 = AbstractC33590a.f140176a;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(application.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = application.getPackageManager().queryBroadcastReceivers(intent, 0);
        PendingIntent broadcast = null;
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (listQueryBroadcastReceivers.size() > 1) {
                Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = null;
        }
        if (componentName == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            broadcast = PendingIntent.getBroadcast(application, 0, intent2, Build.VERSION.SDK_INT >= 31 ? AndroidSDKConstants.FLAG_MUTABLE : 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4206a = new C1080n(application, str);
        } else {
            this.f4206a = new C1078l(application, str);
        }
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        C0072g c0072g = new C0072g(4);
        C1078l c1078l = this.f4206a;
        synchronized (c1078l.f4199c) {
            c1078l.f4203g = c0072g;
            c1078l.f4197a.setCallback((C1075i) c0072g.f224y, handler);
            c0072g.m176L(c1078l, handler);
        }
        this.f4206a.f4197a.setMediaButtonReceiver(broadcast);
        this.f4207b = new C31624i(application, this);
        if (f4205c == 0) {
            f4205c = (int) (TypedValue.applyDimension(1, 320.0f, application.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3218a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C1082p.class.getClassLoader());
        }
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m3219d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m3218a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3220b(MediaMetadataCompat mediaMetadataCompat) {
        C1078l c1078l = this.f4206a;
        c1078l.f4202f = mediaMetadataCompat;
        MediaSession mediaSession = c1078l.f4197a;
        if (mediaMetadataCompat.f4151x == null) {
            Parcel parcelObtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompat.f4151x = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.f4151x);
    }

    /* JADX INFO: renamed from: c */
    public final void m3221c(PlaybackStateCompat playbackStateCompat) {
        C1078l c1078l = this.f4206a;
        c1078l.f4201e = playbackStateCompat;
        synchronized (c1078l.f4199c) {
            for (int iBeginBroadcast = c1078l.f4200d.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC1068b) c1078l.f4200d.getBroadcastItem(iBeginBroadcast)).mo3164h0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            c1078l.f4200d.finishBroadcast();
        }
        MediaSession mediaSession = c1078l.f4197a;
        if (playbackStateCompat.f4175L == null) {
            PlaybackState.Builder builderM3225d = AbstractC1083q.m3225d();
            AbstractC1083q.m3245x(builderM3225d, playbackStateCompat.f4176w, playbackStateCompat.f4177x, playbackStateCompat.f4179z, playbackStateCompat.f4171H);
            AbstractC1083q.m3242u(builderM3225d, playbackStateCompat.f4178y);
            AbstractC1083q.m3240s(builderM3225d, playbackStateCompat.f4168E);
            AbstractC1083q.m3243v(builderM3225d, playbackStateCompat.f4170G);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f4172I) {
                PlaybackState.CustomAction.Builder builderM3226e = AbstractC1083q.m3226e(customAction.f4180w, customAction.f4181x, customAction.f4182y);
                AbstractC1083q.m3244w(builderM3226e, customAction.f4183z);
                AbstractC1083q.m3222a(builderM3225d, AbstractC1083q.m3223b(builderM3226e));
            }
            AbstractC1083q.m3241t(builderM3225d, playbackStateCompat.f4173J);
            AbstractC1084r.m3247b(builderM3225d, playbackStateCompat.f4174K);
            playbackStateCompat.f4175L = AbstractC1083q.m3224c(builderM3225d);
        }
        mediaSession.setPlaybackState(playbackStateCompat.f4175L);
    }
}
