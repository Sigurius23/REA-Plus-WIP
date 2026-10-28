package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p035bp.AbstractC3511b;
import p453r8.C31057a;

/* JADX INFO: renamed from: android.support.v4.media.session.k */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC1077k extends Binder implements InterfaceC1070d {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f4195g = 0;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f4196f;

    public BinderC1077k(C1078l c1078l) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f4196f = new AtomicReference(c1078l);
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: A */
    public final String mo3167A() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: B */
    public final void mo3165B(InterfaceC1068b interfaceC1068b) {
        C1078l c1078l = (C1078l) this.f4196f.get();
        if (c1078l == null) {
            return;
        }
        c1078l.f4200d.register(interfaceC1068b, new C31057a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c1078l.f4199c) {
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: C */
    public final void mo3168C(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: D */
    public final void mo3169D(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: E */
    public final boolean mo3170E() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: F */
    public final void mo3171F(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: G */
    public final void mo3172G(int i13, int i14) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: I */
    public final CharSequence mo3173I() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: L */
    public final void mo3174L(InterfaceC1068b interfaceC1068b) {
        C1078l c1078l = (C1078l) this.f4196f.get();
        if (c1078l == null) {
            return;
        }
        c1078l.f4200d.unregister(interfaceC1068b);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c1078l.f4199c) {
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: M */
    public final void mo3175M(int i13, int i14) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: N */
    public final void mo3176N() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: O */
    public final void mo3177O(long j7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: Q */
    public final void mo3178Q(float f13) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: T */
    public final void mo3179T(boolean z4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: W */
    public final PlaybackStateCompat mo3180W() {
        long j7;
        C1078l c1078l = (C1078l) this.f4196f.get();
        if (c1078l == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = c1078l.f4201e;
        MediaMetadataCompat mediaMetadataCompat = c1078l.f4202f;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        float f13 = playbackStateCompat.f4179z;
        long j13 = playbackStateCompat.f4171H;
        int i13 = playbackStateCompat.f4176w;
        long j14 = playbackStateCompat.f4177x;
        long j15 = -1;
        if (j14 == -1) {
            return playbackStateCompat;
        }
        if ((i13 != 3 && i13 != 4 && i13 != 5) || j13 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j16 = ((long) (f13 * (jElapsedRealtime - j13))) + j14;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f4150w;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j15 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        if (j15 < 0 || j16 <= j15) {
            j7 = j16 < 0 ? 0L : j16;
        } else {
            j7 = j15;
        }
        ArrayList arrayList = new ArrayList();
        long j17 = playbackStateCompat.f4178y;
        long j18 = playbackStateCompat.f4168E;
        int i14 = playbackStateCompat.f4169F;
        CharSequence charSequence = playbackStateCompat.f4170G;
        ArrayList arrayList2 = playbackStateCompat.f4172I;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f4176w, j7, j17, playbackStateCompat.f4179z, j18, i14, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.f4173J, playbackStateCompat.f4174K);
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: Y */
    public final void mo3181Y() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: Z */
    public final void mo3182Z() {
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: a0 */
    public final void mo3183a0(int i13) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: b0 */
    public final void mo3184b0(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: c */
    public final MediaMetadataCompat mo3185c() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: d */
    public final long mo3186d() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: d0 */
    public final int mo3187d0() {
        return ((C1078l) this.f4196f.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: e */
    public final void mo3188e(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: e0 */
    public final ParcelableVolumeInfo mo3189e0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: f */
    public final void mo3190f(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: g */
    public final PendingIntent mo3191g() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: g0 */
    public final void mo3192g0(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    public final String getTag() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: h */
    public final void mo3193h() {
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: i */
    public final void mo3194i(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: j */
    public final Bundle mo3195j() {
        ((C1078l) this.f4196f.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: k */
    public final void mo3196k(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: l */
    public final boolean mo3166l(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: m */
    public final void mo3197m(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: n */
    public final void mo3198n(MediaDescriptionCompat mediaDescriptionCompat, int i13) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i13 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        InterfaceC1068b interfaceC1068b = null;
        InterfaceC1068b interfaceC1068b2 = null;
        switch (i13) {
            case 1:
                mo3203v(parcel.readString(), (Bundle) AbstractC3511b.m10375d(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) AbstractC3511b.m10375d(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zMo3166l = mo3166l((KeyEvent) AbstractC3511b.m10375d(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zMo3166l ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1068b)) {
                        C1067a c1067a = new C1067a();
                        c1067a.f4184f = strongBinder;
                        interfaceC1068b = c1067a;
                    } else {
                        interfaceC1068b = (InterfaceC1068b) iInterfaceQueryLocalInterface;
                    }
                }
                mo3165B(interfaceC1068b);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC1068b)) {
                        C1067a c1067a2 = new C1067a();
                        c1067a2.f4184f = strongBinder2;
                        interfaceC1068b2 = c1067a2;
                    } else {
                        interfaceC1068b2 = (InterfaceC1068b) iInterfaceQueryLocalInterface2;
                    }
                }
                mo3174L(interfaceC1068b2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zMo3170E = mo3170E();
                parcel2.writeNoException();
                parcel2.writeInt(zMo3170E ? 1 : 0);
                return true;
            case 6:
                String strMo3167A = mo3167A();
                parcel2.writeNoException();
                parcel2.writeString(strMo3167A);
                return true;
            case 7:
                String tag = getTag();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                PendingIntent pendingIntentMo3191g = mo3191g();
                parcel2.writeNoException();
                AbstractC3511b.m10372L(parcel2, pendingIntentMo3191g, 1);
                return true;
            case 9:
                long jMo3186d = mo3186d();
                parcel2.writeNoException();
                parcel2.writeLong(jMo3186d);
                return true;
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfoMo3189e0 = mo3189e0();
                parcel2.writeNoException();
                AbstractC3511b.m10372L(parcel2, parcelableVolumeInfoMo3189e0, 1);
                return true;
            case 11:
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                parcel.readString();
                mo3172G(i15, i16);
                parcel2.writeNoException();
                return true;
            case 12:
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                parcel.readString();
                mo3175M(i17, i18);
                parcel2.writeNoException();
                return true;
            case 13:
                mo3181Y();
                parcel2.writeNoException();
                return true;
            case 14:
                mo3194i((Bundle) AbstractC3511b.m10375d(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo3184b0((Bundle) AbstractC3511b.m10375d(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                mo3196k((Uri) AbstractC3511b.m10375d(parcel, Uri.CREATOR), (Bundle) AbstractC3511b.m10375d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                mo3205x(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                pause();
                parcel2.writeNoException();
                return true;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                mo3176N();
                parcel2.writeNoException();
                return true;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                mo3204w();
                parcel2.writeNoException();
                return true;
            case 24:
                mo3177O(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                mo3168C((RatingCompat) AbstractC3511b.m10375d(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                mo3188e((Bundle) AbstractC3511b.m10375d(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat mediaMetadataCompatMo3185c = mo3185c();
                parcel2.writeNoException();
                AbstractC3511b.m10372L(parcel2, mediaMetadataCompatMo3185c, 1);
                return true;
            case 28:
                PlaybackStateCompat playbackStateCompatMo3180W = mo3180W();
                parcel2.writeNoException();
                AbstractC3511b.m10372L(parcel2, playbackStateCompatMo3180W, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceMo3173I = mo3173I();
                parcel2.writeNoException();
                if (charSequenceMo3173I == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(charSequenceMo3173I, parcel2, 1);
                return true;
            case 31:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                AbstractC3511b.m10372L(parcel2, extras, 1);
                return true;
            case 32:
                mo3193h();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                prepare();
                parcel2.writeNoException();
                return true;
            case 34:
                mo3202u((Bundle) AbstractC3511b.m10375d(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 35:
                mo3192g0((Bundle) AbstractC3511b.m10375d(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 36:
                mo3190f((Uri) AbstractC3511b.m10375d(parcel, Uri.CREATOR), (Bundle) AbstractC3511b.m10375d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iMo3187d0 = mo3187d0();
                parcel2.writeNoException();
                parcel2.writeInt(iMo3187d0);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                mo3183a0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                mo3171F((MediaDescriptionCompat) AbstractC3511b.m10375d(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                mo3198n((MediaDescriptionCompat) AbstractC3511b.m10375d(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                mo3169D((MediaDescriptionCompat) AbstractC3511b.m10375d(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                mo3200r(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                mo3201t();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                mo3179T(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iMo3199p = mo3199p();
                parcel2.writeNoException();
                parcel2.writeInt(iMo3199p);
                return true;
            case 48:
                mo3206z(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                mo3178Q(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleMo3195j = mo3195j();
                parcel2.writeNoException();
                AbstractC3511b.m10372L(parcel2, bundleMo3195j, 1);
                return true;
            case 51:
                mo3197m((RatingCompat) AbstractC3511b.m10375d(parcel, RatingCompat.CREATOR), (Bundle) AbstractC3511b.m10375d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i13, parcel, parcel2, i14);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: p */
    public final int mo3199p() {
        return ((C1078l) this.f4196f.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    public final void pause() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    public final void prepare() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: r */
    public final void mo3200r(int i13) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: t */
    public final void mo3201t() {
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: u */
    public final void mo3202u(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: v */
    public final void mo3203v(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: w */
    public final void mo3204w() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: x */
    public final void mo3205x(long j7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1070d
    /* JADX INFO: renamed from: z */
    public final void mo3206z(int i13) {
        throw new AssertionError();
    }
}
