package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

/* JADX INFO: renamed from: android.support.v4.media.session.d */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC1070d extends IInterface {
    /* JADX INFO: renamed from: A */
    String mo3167A();

    /* JADX INFO: renamed from: B */
    void mo3165B(InterfaceC1068b interfaceC1068b);

    /* JADX INFO: renamed from: C */
    void mo3168C(RatingCompat ratingCompat);

    /* JADX INFO: renamed from: D */
    void mo3169D(MediaDescriptionCompat mediaDescriptionCompat);

    /* JADX INFO: renamed from: E */
    boolean mo3170E();

    /* JADX INFO: renamed from: F */
    void mo3171F(MediaDescriptionCompat mediaDescriptionCompat);

    /* JADX INFO: renamed from: G */
    void mo3172G(int i13, int i14);

    /* JADX INFO: renamed from: I */
    CharSequence mo3173I();

    /* JADX INFO: renamed from: L */
    void mo3174L(InterfaceC1068b interfaceC1068b);

    /* JADX INFO: renamed from: M */
    void mo3175M(int i13, int i14);

    /* JADX INFO: renamed from: N */
    void mo3176N();

    /* JADX INFO: renamed from: O */
    void mo3177O(long j7);

    /* JADX INFO: renamed from: Q */
    void mo3178Q(float f13);

    /* JADX INFO: renamed from: T */
    void mo3179T(boolean z4);

    /* JADX INFO: renamed from: W */
    PlaybackStateCompat mo3180W();

    /* JADX INFO: renamed from: Y */
    void mo3181Y();

    /* JADX INFO: renamed from: Z */
    void mo3182Z();

    /* JADX INFO: renamed from: a0 */
    void mo3183a0(int i13);

    /* JADX INFO: renamed from: b0 */
    void mo3184b0(Bundle bundle, String str);

    /* JADX INFO: renamed from: c */
    MediaMetadataCompat mo3185c();

    /* JADX INFO: renamed from: d */
    long mo3186d();

    /* JADX INFO: renamed from: d0 */
    int mo3187d0();

    /* JADX INFO: renamed from: e */
    void mo3188e(Bundle bundle, String str);

    /* JADX INFO: renamed from: e0 */
    ParcelableVolumeInfo mo3189e0();

    /* JADX INFO: renamed from: f */
    void mo3190f(Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: g */
    PendingIntent mo3191g();

    /* JADX INFO: renamed from: g0 */
    void mo3192g0(Bundle bundle, String str);

    Bundle getExtras();

    String getTag();

    /* JADX INFO: renamed from: h */
    void mo3193h();

    /* JADX INFO: renamed from: i */
    void mo3194i(Bundle bundle, String str);

    /* JADX INFO: renamed from: j */
    Bundle mo3195j();

    /* JADX INFO: renamed from: k */
    void mo3196k(Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: l */
    boolean mo3166l(KeyEvent keyEvent);

    /* JADX INFO: renamed from: m */
    void mo3197m(RatingCompat ratingCompat, Bundle bundle);

    /* JADX INFO: renamed from: n */
    void mo3198n(MediaDescriptionCompat mediaDescriptionCompat, int i13);

    void next();

    /* JADX INFO: renamed from: p */
    int mo3199p();

    void pause();

    void prepare();

    void previous();

    /* JADX INFO: renamed from: r */
    void mo3200r(int i13);

    void stop();

    /* JADX INFO: renamed from: t */
    void mo3201t();

    /* JADX INFO: renamed from: u */
    void mo3202u(Bundle bundle, String str);

    /* JADX INFO: renamed from: v */
    void mo3203v(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    /* JADX INFO: renamed from: w */
    void mo3204w();

    /* JADX INFO: renamed from: x */
    void mo3205x(long j7);

    /* JADX INFO: renamed from: z */
    void mo3206z(int i13);
}
