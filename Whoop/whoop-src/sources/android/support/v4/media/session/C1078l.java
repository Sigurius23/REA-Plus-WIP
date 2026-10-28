package android.support.v4.media.session;

import a00.C0072g;
import android.content.Context;
import android.media.session.MediaSession;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import p453r8.C31057a;

/* JADX INFO: renamed from: android.support.v4.media.session.l */
/* JADX INFO: loaded from: classes5.dex */
public class C1078l implements InterfaceC1076j {

    /* JADX INFO: renamed from: a */
    public final MediaSession f4197a;

    /* JADX INFO: renamed from: b */
    public final MediaSessionCompat$Token f4198b;

    /* JADX INFO: renamed from: c */
    public final Object f4199c = new Object();

    /* JADX INFO: renamed from: d */
    public final RemoteCallbackList f4200d = new RemoteCallbackList();

    /* JADX INFO: renamed from: e */
    public PlaybackStateCompat f4201e;

    /* JADX INFO: renamed from: f */
    public MediaMetadataCompat f4202f;

    /* JADX INFO: renamed from: g */
    public C0072g f4203g;

    public C1078l(Context context, String str) {
        MediaSession mediaSessionMo3212c = mo3212c(context, str);
        this.f4197a = mediaSessionMo3212c;
        this.f4198b = new MediaSessionCompat$Token(mediaSessionMo3212c.getSessionToken(), new BinderC1077k(this));
        mediaSessionMo3212c.setFlags(3);
    }

    @Override // android.support.v4.media.session.InterfaceC1076j
    /* JADX INFO: renamed from: a */
    public final void mo3210a(C31057a c31057a) {
    }

    @Override // android.support.v4.media.session.InterfaceC1076j
    /* JADX INFO: renamed from: b */
    public final C0072g mo3211b() {
        C0072g c0072g;
        synchronized (this.f4199c) {
            c0072g = this.f4203g;
        }
        return c0072g;
    }

    /* JADX INFO: renamed from: c */
    public MediaSession mo3212c(Context context, String str) {
        return new MediaSession(context, str);
    }
}
