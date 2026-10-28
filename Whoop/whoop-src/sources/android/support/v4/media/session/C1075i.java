package android.support.v4.media.session;

import a00.C0072g;
import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.AbstractC1065d;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import p088dc.InterfaceC11898e;

/* JADX INFO: renamed from: android.support.v4.media.session.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C1075i extends MediaSession.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0072g f4194a;

    public C1075i(C0072g c0072g) {
        this.f4194a = c0072g;
    }

    /* JADX INFO: renamed from: a */
    public final C1078l m3209a() {
        C1078l c1078l;
        synchronized (this.f4194a.f223x) {
            c1078l = (C1078l) ((WeakReference) this.f4194a.f225z).get();
        }
        if (c1078l == null || this.f4194a != c1078l.mo3211b()) {
            return null;
        }
        return c1078l;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        InterfaceC1070d interfaceC1070d;
        InterfaceC11898e interfaceC11898e;
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        C1082p.m3218a(bundle);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = c1078lM3209a.f4198b;
                synchronized (mediaSessionCompat$Token.f4159w) {
                    interfaceC1070d = mediaSessionCompat$Token.f4161y;
                }
                BundleCompat.putBinder(bundle2, "android.support.v4.media.session.EXTRA_BINDER", interfaceC1070d == null ? null : interfaceC1070d.asBinder());
                synchronized (mediaSessionCompat$Token.f4159w) {
                    interfaceC11898e = mediaSessionCompat$Token.f4162z;
                }
                if (interfaceC11898e != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(interfaceC11898e));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        c1078lM3209a.getClass();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        C1082p.m3218a(bundle);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                C1082p.m3218a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    C1082p.m3218a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    C1082p.m3218a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    C1082p.m3218a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    C1082p.m3218a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return false;
        }
        c1078lM3209a.mo3210a(null);
        return super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        this.f4194a.getClass();
        c1078lM3209a.getClass();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        this.f4194a.getClass();
        c1078lM3209a.getClass();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        C1082p.m3218a(bundle);
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        C1082p.m3218a(bundle);
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        C1082p.m3218a(bundle);
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        C1082p.m3218a(bundle);
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        C1082p.m3218a(bundle);
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        C1082p.m3218a(bundle);
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j7) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f13) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f13;
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        if (rating != null) {
            int iM3154b = AbstractC1065d.m3154b(rating);
            RatingCompat ratingCompat = null;
            if (AbstractC1065d.m3157e(rating)) {
                switch (iM3154b) {
                    case 1:
                        ratingCompat = new RatingCompat(1, AbstractC1065d.m3156d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, AbstractC1065d.m3158f(rating) ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fM3155c = AbstractC1065d.m3155c(rating);
                        if (iM3154b == 3) {
                            f13 = 3.0f;
                        } else if (iM3154b == 4) {
                            f13 = 4.0f;
                        } else if (iM3154b != 5) {
                            Log.e("Rating", "Invalid rating style (" + iM3154b + ") for a star rating");
                        } else {
                            f13 = 5.0f;
                        }
                        if (fM3155c >= 0.0f && fM3155c <= f13) {
                            ratingCompat = new RatingCompat(iM3154b, fM3155c);
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                        }
                        break;
                    case 6:
                        float fM3153a = AbstractC1065d.m3153a(rating);
                        if (fM3153a >= 0.0f && fM3153a <= 100.0f) {
                            ratingCompat = new RatingCompat(6, fM3153a);
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        break;
                }
            } else {
                switch (iM3154b) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(iM3154b, -1.0f);
                        break;
                }
            }
            ratingCompat.getClass();
        }
        c1078lM3209a.getClass();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j7) {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        c1078lM3209a.mo3210a(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        C1078l c1078lM3209a = m3209a();
        if (c1078lM3209a == null) {
            return;
        }
        c1078lM3209a.mo3210a(null);
    }
}
