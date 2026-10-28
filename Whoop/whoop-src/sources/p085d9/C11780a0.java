package p085d9;

import a30.C0332w0;
import a33.C0352d;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.RunnableC1319m;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import d30.C11535h;
import e10.C12554k0;
import hn.C17508p;
import io.sentry.internal.debugmeta.C20378c;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import p010a9.C0580e;
import p031b9.AbstractC2829f;
import p031b9.C2832g;
import p031b9.C2835h;
import p031b9.C2836h0;
import p031b9.C2840i1;
import p031b9.InterfaceC2858p0;
import p031b9.SurfaceHolderCallbackC2821c0;
import p047c9.C4323n;
import p215i9.AbstractC18239o;
import p215i9.AbstractC18243s;
import p215i9.C18232h;
import p215i9.C18233i;
import p215i9.C18237m;
import p215i9.InterfaceC18234j;
import p215i9.InterfaceC18235k;
import p516u8.AbstractC34587d0;
import p516u8.C34586d;
import p516u8.C34588e;
import p516u8.C34589e0;
import p516u8.C34608o;
import p516u8.C34610p;
import p547v8.AbstractC35785b;
import p547v8.C35790g;
import p547v8.C35791h;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38061p;
import p690zr.AbstractC41023g0;
import p690zr.C41060w0;
import p705ea2.C12915l;
import qg3.C30352d;
import ro.C31624i;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: d9.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11780a0 extends AbstractC18239o implements InterfaceC2858p0 {

    /* JADX INFO: renamed from: c1 */
    public final Context f38177c1;

    /* JADX INFO: renamed from: d1 */
    public final C20378c f38178d1;

    /* JADX INFO: renamed from: e1 */
    public final C11807x f38179e1;

    /* JADX INFO: renamed from: f1 */
    public final C18233i f38180f1;

    /* JADX INFO: renamed from: g1 */
    public int f38181g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f38182h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f38183i1;

    /* JADX INFO: renamed from: j1 */
    public C34610p f38184j1;

    /* JADX INFO: renamed from: k1 */
    public C34610p f38185k1;

    /* JADX INFO: renamed from: l1 */
    public long f38186l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f38187m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f38188n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f38189o1;

    /* JADX INFO: renamed from: p1 */
    public int f38190p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11780a0(Context context, InterfaceC18234j interfaceC18234j, Handler handler, SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0, C11807x c11807x) {
        super(1, interfaceC18234j, 44100.0f);
        C18233i c18233i = AbstractC38065t.f163031a >= 35 ? new C18233i() : null;
        this.f38177c1 = context.getApplicationContext();
        this.f38179e1 = c11807x;
        this.f38180f1 = c18233i;
        this.f38190p1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f38178d1 = new C20378c(10, handler, surfaceHolderCallbackC2821c0);
        c11807x.f38389r = new C31624i(this, 26);
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: D */
    public final C2835h mo31572D(C18237m c18237m, C34610p c34610p, C34610p c34610p2) {
        C2835h c2835hM52510b = c18237m.m52510b(c34610p, c34610p2);
        int i13 = c2835hM52510b.f11187e;
        if (this.f71003e0 == null && mo31586r0(c34610p2)) {
            i13 |= 32768;
        }
        if (m31589x0(c18237m, c34610p2) > this.f38181g1) {
            i13 |= 64;
        }
        int i14 = i13;
        return new C2835h(c18237m.f70948a, c34610p, c34610p2, i14 != 0 ? 0 : c2835hM52510b.f11186d, i14);
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: O */
    public final float mo31573O(float f13, C34610p[] c34610pArr) {
        int iMax = -1;
        for (C34610p c34610p : c34610pArr) {
            int i13 = c34610p.f145760E;
            if (i13 != -1) {
                iMax = Math.max(iMax, i13);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f13;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: P */
    public final ArrayList mo31574P(C18232h c18232h, C34610p c34610p, boolean z4) {
        C41060w0 c41060w0M52553g;
        if (c34610p.f145783n == null) {
            c41060w0M52553g = C41060w0.f177067E;
        } else if (this.f38179e1.m31638i(c34610p) != 0) {
            List listM52551e = AbstractC18243s.m52551e("audio/raw", false, false);
            C18237m c18237m = listM52551e.isEmpty() ? null : (C18237m) listM52551e.get(0);
            if (c18237m != null) {
                c41060w0M52553g = AbstractC41023g0.m133256r(c18237m);
            } else {
                c41060w0M52553g = AbstractC18243s.m52553g(c18232h, c34610p, z4, false);
            }
        } else {
            c41060w0M52553g = AbstractC18243s.m52553g(c18232h, c34610p, z4, false);
        }
        HashMap map = AbstractC18243s.f71028a;
        ArrayList arrayList = new ArrayList(c41060w0M52553g);
        Collections.sort(arrayList, new C12915l(new C17508p(c34610p, 2), 4));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: Q */
    public final C0332w0 mo31575Q(C18237m c18237m, C34610p c34610p, MediaCrypto mediaCrypto, float f13) {
        boolean z4;
        C34610p[] c34610pArr = this.f11086J;
        c34610pArr.getClass();
        int iM31589x0 = m31589x0(c18237m, c34610p);
        String str = c18237m.f70948a;
        if (c34610pArr.length != 1) {
            for (C34610p c34610p2 : c34610pArr) {
                if (c18237m.m52510b(c34610p, c34610p2).f11186d != 0) {
                    iM31589x0 = Math.max(iM31589x0, m31589x0(c18237m, c34610p2));
                }
            }
        }
        this.f38181g1 = iM31589x0;
        int i13 = AbstractC38065t.f163031a;
        if (i13 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.f38182h1 = z4;
        this.f38183i1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = c18237m.f70950c;
        int i14 = this.f38181g1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i15 = c34610p.f145759D;
        String str4 = c34610p.f145783n;
        mediaFormat.setInteger("channel-count", i15);
        int i16 = c34610p.f145760E;
        mediaFormat.setInteger("sample-rate", i16);
        AbstractC38046a.m121825t(mediaFormat, c34610p.f145786q);
        AbstractC38046a.m121821p(mediaFormat, "max-input-size", i14);
        if (i13 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f13 != -1.0f) {
                if (i13 == 23) {
                    String str5 = Build.MODEL;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f13);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f13);
                }
            }
        }
        if (i13 <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i13 >= 24) {
            int i17 = c34610p.f145759D;
            C34608o c34608o = new C34608o();
            c34608o.f145741m = AbstractC34587d0.m109382o("audio/raw");
            c34608o.f145719C = i17;
            c34608o.f145720D = i16;
            c34608o.f145721E = 4;
            if (this.f38179e1.m31638i(new C34610p(c34608o)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i13 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i13 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f38190p1));
        }
        this.f38185k1 = (!"audio/raw".equals(c18237m.f70949b) || "audio/raw".equals(str4)) ? null : c34610p;
        return new C0332w0(c18237m, mediaFormat, c34610p, null, mediaCrypto, this.f38180f1, 6);
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: R */
    public final void mo31576R(C0580e c0580e) {
        C34610p c34610p;
        if (AbstractC38065t.f163031a < 29 || (c34610p = c0580e.f2068y) == null || !Objects.equals(c34610p.f145783n, "audio/opus") || !this.f70969G0) {
            return;
        }
        ByteBuffer byteBuffer = c0580e.f2066H;
        byteBuffer.getClass();
        C34610p c34610p2 = c0580e.f2068y;
        c34610p2.getClass();
        int i13 = c34610p2.f145762G;
        if (byteBuffer.remaining() == 8) {
            this.f38179e1.m31651w(i13, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: X */
    public final void mo31577X(Exception exc) {
        AbstractC38046a.m121813h("MediaCodecAudioRenderer", "Audio codec error", exc);
        C20378c c20378c = this.f38178d1;
        Handler handler = (Handler) c20378c.f76422x;
        if (handler != null) {
            handler.post(new RunnableC11791h(c20378c, exc, 0));
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: Y */
    public final void mo31578Y(long j7, long j13, String str) {
        C20378c c20378c = this.f38178d1;
        Handler handler = (Handler) c20378c.f76422x;
        if (handler != null) {
            handler.post(new RunnableC11791h(c20378c, str, j7, j13));
        }
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: Z */
    public final void mo31579Z(String str) {
        C20378c c20378c = this.f38178d1;
        Handler handler = (Handler) c20378c.f76422x;
        if (handler != null) {
            handler.post(new RunnableC11791h(c20378c, str, 4));
        }
    }

    @Override // p031b9.AbstractC2829f, p031b9.InterfaceC2828e1
    /* JADX INFO: renamed from: a */
    public final void mo8047a(int i13, Object obj) {
        C31624i c31624i;
        C18233i c18233i;
        C11807x c11807x = this.f38179e1;
        if (i13 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (c11807x.f38351O != fFloatValue) {
                c11807x.f38351O = fFloatValue;
                if (c11807x.m31644o()) {
                    c11807x.f38393v.setVolume(c11807x.f38351O);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 3) {
            C34586d c34586d = (C34586d) obj;
            c34586d.getClass();
            if (c11807x.f38397z.equals(c34586d)) {
                return;
            }
            c11807x.f38397z = c34586d;
            if (c11807x.f38364a0) {
                return;
            }
            C11535h c11535h = c11807x.f38395x;
            if (c11535h != null) {
                c11535h.f37193j = c34586d;
                c11535h.m30992b(C11781b.m31593c((Context) c11535h.f37185b, c34586d, (C31624i) c11535h.f37192i));
            }
            c11807x.m31636g();
            return;
        }
        if (i13 == 6) {
            C34588e c34588e = (C34588e) obj;
            c34588e.getClass();
            if (c11807x.f38361Y.equals(c34588e)) {
                return;
            }
            if (c11807x.f38393v != null) {
                c11807x.f38361Y.getClass();
            }
            c11807x.f38361Y = c34588e;
            return;
        }
        if (i13 == 12) {
            if (AbstractC38065t.f163031a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    c31624i = null;
                } else {
                    c11807x.getClass();
                    c31624i = new C31624i(audioDeviceInfo, 24);
                }
                c11807x.f38362Z = c31624i;
                C11535h c11535h2 = c11807x.f38395x;
                if (c11535h2 != null) {
                    c11535h2.m30993c(audioDeviceInfo);
                }
                AudioTrack audioTrack = c11807x.f38393v;
                if (audioTrack != null) {
                    C31624i c31624i2 = c11807x.f38362Z;
                    audioTrack.setPreferredDevice(c31624i2 != null ? (AudioDeviceInfo) c31624i2.f130665x : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 16) {
            obj.getClass();
            this.f38190p1 = ((Integer) obj).intValue();
            InterfaceC18235k interfaceC18235k = this.f71009k0;
            if (interfaceC18235k != null && AbstractC38065t.f163031a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f38190p1));
                interfaceC18235k.setParameters(bundle);
                return;
            }
            return;
        }
        if (i13 == 9) {
            obj.getClass();
            c11807x.f38340D = ((Boolean) obj).booleanValue();
            C11801r c11801r = new C11801r(c11807x.m31653y() ? C34589e0.f145647d : c11807x.f38339C, -9223372036854775807L, -9223372036854775807L);
            if (c11807x.m31644o()) {
                c11807x.f38337A = c11801r;
                return;
            } else {
                c11807x.f38338B = c11801r;
                return;
            }
        }
        if (i13 != 10) {
            if (i13 == 11) {
                C2836h0 c2836h0 = (C2836h0) obj;
                c2836h0.getClass();
                this.f71004f0 = c2836h0;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (c11807x.f38360X != iIntValue) {
            c11807x.f38360X = iIntValue;
            c11807x.f38359W = iIntValue != 0;
            c11807x.m31636g();
        }
        if (AbstractC38065t.f163031a < 35 || (c18233i = this.f38180f1) == null) {
            return;
        }
        c18233i.m52507d(iIntValue);
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: a0 */
    public final C2835h mo31580a0(C30352d c30352d) throws ExoPlaybackException {
        C34610p c34610p = (C34610p) c30352d.f124536y;
        c34610p.getClass();
        this.f38184j1 = c34610p;
        C2835h c2835hMo31580a0 = super.mo31580a0(c30352d);
        C20378c c20378c = this.f38178d1;
        Handler handler = (Handler) c20378c.f76422x;
        if (handler != null) {
            handler.post(new RunnableC11791h(c20378c, c34610p, c2835hMo31580a0));
        }
        return c2835hMo31580a0;
    }

    @Override // p031b9.InterfaceC2858p0
    /* JADX INFO: renamed from: b */
    public final C34589e0 mo8164b() {
        return this.f38179e1.f38339C;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0102 A[Catch: AudioSink$ConfigurationException -> 0x0100, TryCatch #0 {AudioSink$ConfigurationException -> 0x0100, blocks: (B:44:0x00d7, B:47:0x00df, B:49:0x00e3, B:51:0x00ec, B:55:0x00fa, B:58:0x0102, B:62:0x0109, B:63:0x010e), top: B:67:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: b0 */
    public final void mo31581b0(C34610p c34610p, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iM121930w;
        C34610p c34610p2 = this.f38185k1;
        boolean z4 = true;
        int[] iArr = null;
        if (c34610p2 != null) {
            c34610p = c34610p2;
        } else if (this.f71009k0 != null) {
            mediaFormat.getClass();
            String str = c34610p.f145783n;
            int i13 = c34610p.f145759D;
            if ("audio/raw".equals(str)) {
                iM121930w = c34610p.f145761F;
            } else if (AbstractC38065t.f163031a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM121930w = mediaFormat.containsKey("v-bits-per-sample") ? AbstractC38065t.m121930w(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM121930w = mediaFormat.getInteger("pcm-encoding");
            }
            C34608o c34608o = new C34608o();
            c34608o.f145741m = AbstractC34587d0.m109382o("audio/raw");
            c34608o.f145721E = iM121930w;
            c34608o.f145722F = c34610p.f145762G;
            c34608o.f145723G = c34610p.f145763H;
            c34608o.f145739k = c34610p.f145781l;
            c34608o.f145729a = c34610p.f145770a;
            c34608o.f145730b = c34610p.f145771b;
            c34608o.f145731c = AbstractC41023g0.m133252m(c34610p.f145772c);
            c34608o.f145732d = c34610p.f145773d;
            c34608o.f145733e = c34610p.f145774e;
            c34608o.f145734f = c34610p.f145775f;
            c34608o.f145719C = mediaFormat.getInteger("channel-count");
            c34608o.f145720D = mediaFormat.getInteger("sample-rate");
            c34610p = new C34610p(c34608o);
            boolean z13 = this.f38182h1;
            int i14 = c34610p.f145759D;
            if (z13 && i14 == 6 && i13 < 6) {
                iArr = new int[i13];
                for (int i15 = 0; i15 < i13; i15++) {
                    iArr[i15] = i15;
                }
            } else if (this.f38183i1) {
                if (i14 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i14 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i14 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i14 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i14 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i16 = AbstractC38065t.f163031a;
            C11807x c11807x = this.f38179e1;
            if (i16 >= 29) {
                if (this.f70969G0) {
                    C2840i1 c2840i1 = this.f11097z;
                    c2840i1.getClass();
                    if (c2840i1.f11219a != 0) {
                        C2840i1 c2840i2 = this.f11097z;
                        c2840i2.getClass();
                        int i17 = c2840i2.f11219a;
                        c11807x.getClass();
                        if (i16 < 29) {
                            z4 = false;
                        }
                        AbstractC35849g.m113807i(z4);
                        c11807x.f38381j = i17;
                    } else {
                        c11807x.getClass();
                        if (i16 >= 29) {
                            z4 = false;
                        }
                        AbstractC35849g.m113807i(z4);
                        c11807x.f38381j = 0;
                    }
                } else {
                    c11807x.getClass();
                    if (i16 >= 29) {
                        z4 = false;
                    }
                    AbstractC35849g.m113807i(z4);
                    c11807x.f38381j = 0;
                }
            }
            c11807x.m31633d(c34610p, iArr);
        } catch (AudioSink$ConfigurationException e5) {
            throw m8059g(e5, e5.f6378w, false, ErrorCodes.WebsocketMethodErrors.cAlreadyJoined);
        }
    }

    @Override // p031b9.InterfaceC2858p0, p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: c */
    public final long mo8165c() {
        if (this.f11084H == 2) {
            m31590y0();
        }
        return this.f38186l1;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: c0 */
    public final void mo31582c0() {
        this.f38179e1.getClass();
    }

    @Override // p031b9.InterfaceC2858p0
    /* JADX INFO: renamed from: d */
    public final void mo8166d(C34589e0 c34589e0) {
        C11807x c11807x = this.f38179e1;
        c11807x.getClass();
        c11807x.f38339C = new C34589e0(AbstractC38065t.m121913f(c34589e0.f145648a, 0.1f, 8.0f), AbstractC38065t.m121913f(c34589e0.f145649b, 0.1f, 8.0f));
        if (c11807x.m31653y()) {
            c11807x.m31650v();
            return;
        }
        C11801r c11801r = new C11801r(c34589e0, -9223372036854775807L, -9223372036854775807L);
        if (c11807x.m31644o()) {
            c11807x.f38337A = c11801r;
        } else {
            c11807x.f38338B = c11801r;
        }
    }

    @Override // p031b9.InterfaceC2858p0
    /* JADX INFO: renamed from: e */
    public final boolean mo8167e() {
        boolean z4 = this.f38189o1;
        this.f38189o1 = false;
        return z4;
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: e0 */
    public final void mo31583e0() {
        this.f38179e1.f38348L = true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: h0 */
    public final boolean mo31584h0(long j7, long j13, InterfaceC18235k interfaceC18235k, ByteBuffer byteBuffer, int i13, int i14, int i15, long j14, boolean z4, boolean z13, C34610p c34610p) throws ExoPlaybackException {
        int i16;
        int i17;
        byteBuffer.getClass();
        if (this.f38185k1 != null && (i14 & 2) != 0) {
            interfaceC18235k.getClass();
            interfaceC18235k.mo52491i(i13);
            return true;
        }
        C11807x c11807x = this.f38179e1;
        if (z4) {
            if (interfaceC18235k != null) {
                interfaceC18235k.mo52491i(i13);
            }
            this.f70993X0.f11171g += i15;
            c11807x.f38348L = true;
            return true;
        }
        try {
            if (!c11807x.m31641l(byteBuffer, j14, i15)) {
                return false;
            }
            if (interfaceC18235k != null) {
                interfaceC18235k.mo52491i(i13);
            }
            this.f70993X0.f11170f += i15;
            return true;
        } catch (AudioSink$InitializationException e5) {
            C34610p c34610p2 = this.f38184j1;
            if (this.f70969G0) {
                C2840i1 c2840i1 = this.f11097z;
                c2840i1.getClass();
                if (c2840i1.f11219a != 0) {
                    i17 = 5004;
                } else {
                    i17 = ErrorCodes.WebsocketMethodErrors.cAlreadyJoined;
                }
            } else {
                i17 = ErrorCodes.WebsocketMethodErrors.cAlreadyJoined;
            }
            throw m8059g(e5, c34610p2, e5.f6380x, i17);
        } catch (AudioSink$WriteException e13) {
            if (this.f70969G0) {
                C2840i1 c2840i2 = this.f11097z;
                c2840i2.getClass();
                if (c2840i2.f11219a != 0) {
                    i16 = 5003;
                } else {
                    i16 = 5002;
                }
            } else {
                i16 = 5002;
            }
            throw m8059g(e13, c34610p, e13.f6382x, i16);
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: i */
    public final InterfaceC2858p0 mo8061i() {
        return this;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: j */
    public final String mo8062j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: k0 */
    public final void mo31585k0() throws ExoPlaybackException {
        try {
            C11807x c11807x = this.f38179e1;
            if (!c11807x.f38355S && c11807x.m31644o() && c11807x.m31635f()) {
                c11807x.m31647s();
                c11807x.f38355S = true;
            }
        } catch (AudioSink$WriteException e5) {
            throw m8059g(e5, e5.f6383y, e5.f6382x, this.f70969G0 ? 5003 : 5002);
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: l */
    public final boolean mo8064l() {
        if (!this.f70985T0) {
            return false;
        }
        C11807x c11807x = this.f38179e1;
        if (c11807x.m31644o()) {
            return c11807x.f38355S && !c11807x.m31642m();
        }
        return true;
    }

    @Override // p215i9.AbstractC18239o, p031b9.AbstractC2829f
    /* JADX INFO: renamed from: n */
    public final boolean mo8065n() {
        return this.f38179e1.m31642m() || super.mo8065n();
    }

    @Override // p215i9.AbstractC18239o, p031b9.AbstractC2829f
    /* JADX INFO: renamed from: o */
    public final void mo8066o() {
        C20378c c20378c = this.f38178d1;
        this.f38188n1 = true;
        this.f38184j1 = null;
        try {
            this.f38179e1.m31636g();
            try {
                super.mo8066o();
            } finally {
                c20378c.m56587p(this.f70993X0);
            }
        } catch (Throwable th3) {
            try {
                super.mo8066o();
                throw th3;
            } finally {
                c20378c.m56587p(this.f70993X0);
            }
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: p */
    public final void mo8067p(boolean z4, boolean z13) {
        C2832g c2832g = new C2832g(0);
        this.f70993X0 = c2832g;
        C20378c c20378c = this.f38178d1;
        Handler handler = (Handler) c20378c.f76422x;
        if (handler != null) {
            handler.post(new RunnableC11791h(c20378c, c2832g, 5));
        }
        C2840i1 c2840i1 = this.f11097z;
        c2840i1.getClass();
        boolean z14 = c2840i1.f11220b;
        C11807x c11807x = this.f38179e1;
        if (z14) {
            AbstractC35849g.m113807i(c11807x.f38359W);
            if (!c11807x.f38364a0) {
                c11807x.f38364a0 = true;
                c11807x.m31636g();
            }
        } else if (c11807x.f38364a0) {
            c11807x.f38364a0 = false;
            c11807x.m31636g();
        }
        C4323n c4323n = this.f11082F;
        c4323n.getClass();
        c11807x.f38388q = c4323n;
        C38061p c38061p = this.f11083G;
        c38061p.getClass();
        c11807x.f38375g.f38270I = c38061p;
    }

    @Override // p215i9.AbstractC18239o, p031b9.AbstractC2829f
    /* JADX INFO: renamed from: q */
    public final void mo8068q(long j7, boolean z4) throws ExoPlaybackException {
        super.mo8068q(j7, z4);
        this.f38179e1.m31636g();
        this.f38186l1 = j7;
        this.f38189o1 = false;
        this.f38187m1 = true;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: r */
    public final void mo8069r() {
        C18233i c18233i;
        C11783c c11783c;
        C11535h c11535h = this.f38179e1.f38395x;
        if (c11535h != null) {
            Context context = (Context) c11535h.f37185b;
            if (c11535h.f37184a) {
                c11535h.f37191h = null;
                if (AbstractC38065t.f163031a >= 23 && (c11783c = (C11783c) c11535h.f37188e) != null) {
                    AbstractC35785b.m113423r(context).unregisterAudioDeviceCallback(c11783c);
                }
                context.unregisterReceiver((C11787e) c11535h.f37189f);
                C11785d c11785d = (C11785d) c11535h.f37190g;
                if (c11785d != null) {
                    c11785d.f38217a.unregisterContentObserver(c11785d);
                }
                c11535h.f37184a = false;
            }
        }
        if (AbstractC38065t.f163031a < 35 || (c18233i = this.f38180f1) == null) {
            return;
        }
        c18233i.m52505b();
    }

    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: r0 */
    public final boolean mo31586r0(C34610p c34610p) {
        C2840i1 c2840i1 = this.f11097z;
        c2840i1.getClass();
        if (c2840i1.f11219a != 0) {
            int iM31588w0 = m31588w0(c34610p);
            if ((iM31588w0 & 512) != 0) {
                C2840i1 c2840i2 = this.f11097z;
                c2840i2.getClass();
                if (c2840i2.f11219a == 2 || (iM31588w0 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 || (c34610p.f145762G == 0 && c34610p.f145763H == 0)) {
                    return true;
                }
            }
        }
        return this.f38179e1.m31638i(c34610p) != 0;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: s */
    public final void mo8070s() {
        C11807x c11807x = this.f38179e1;
        this.f38189o1 = false;
        try {
            try {
                m52519F();
                m52537j0();
                C12554k0 c12554k0 = this.f71003e0;
                if (c12554k0 != null) {
                    c12554k0.m35222K(null);
                }
                this.f71003e0 = null;
                if (this.f38188n1) {
                    this.f38188n1 = false;
                    c11807x.m31649u();
                }
            } catch (Throwable th3) {
                C12554k0 c12554k1 = this.f71003e0;
                if (c12554k1 != null) {
                    c12554k1.m35222K(null);
                }
                this.f71003e0 = null;
                throw th3;
            }
        } catch (Throwable th4) {
            if (this.f38188n1) {
                this.f38188n1 = false;
                c11807x.m31649u();
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    @Override // p215i9.AbstractC18239o
    /* JADX INFO: renamed from: s0 */
    public final int mo31587s0(C18232h c18232h, C34610p c34610p) {
        int iM31588w0;
        C41060w0 c41060w0M52553g;
        boolean z4;
        boolean z13;
        int iM8055f = AbstractC2829f.m8055f(1, 0, 0, 0);
        String str = c34610p.f145783n;
        String str2 = c34610p.f145783n;
        if (!AbstractC34587d0.m109378k(str)) {
            return AbstractC2829f.m8055f(0, 0, 0, 0);
        }
        int i13 = c34610p.f145768M;
        boolean z14 = i13 != 0;
        boolean z15 = i13 == 0 || i13 == 2;
        int i14 = 8;
        C11807x c11807x = this.f38179e1;
        if (z15) {
            if (z14) {
                List listM52551e = AbstractC18243s.m52551e("audio/raw", false, false);
                if ((listM52551e.isEmpty() ? null : (C18237m) listM52551e.get(0)) == null) {
                    iM31588w0 = 0;
                }
            }
            iM31588w0 = m31588w0(c34610p);
            if (c11807x.m31638i(c34610p) != 0) {
                return AbstractC2829f.m8055f(4, 8, 32, iM31588w0);
            }
        } else {
            iM31588w0 = 0;
        }
        if ("audio/raw".equals(str2) && c11807x.m31638i(c34610p) == 0) {
            return iM8055f;
        }
        int i15 = c34610p.f145759D;
        int i16 = c34610p.f145760E;
        C34608o c34608o = new C34608o();
        c34608o.f145741m = AbstractC34587d0.m109382o("audio/raw");
        c34608o.f145719C = i15;
        c34608o.f145720D = i16;
        c34608o.f145721E = 2;
        if (c11807x.m31638i(new C34610p(c34608o)) == 0) {
            return iM8055f;
        }
        if (str2 == null) {
            c41060w0M52553g = C41060w0.f177067E;
        } else if (c11807x.m31638i(c34610p) != 0) {
            List listM52551e2 = AbstractC18243s.m52551e("audio/raw", false, false);
            C18237m c18237m = listM52551e2.isEmpty() ? null : (C18237m) listM52551e2.get(0);
            if (c18237m != null) {
                c41060w0M52553g = AbstractC41023g0.m133256r(c18237m);
            } else {
                c41060w0M52553g = AbstractC18243s.m52553g(c18232h, c34610p, false, false);
            }
        } else {
            c41060w0M52553g = AbstractC18243s.m52553g(c18232h, c34610p, false, false);
        }
        if (c41060w0M52553g.isEmpty()) {
            return iM8055f;
        }
        if (!z15) {
            return AbstractC2829f.m8055f(2, 0, 0, 0);
        }
        C18237m c18237m2 = (C18237m) c41060w0M52553g.get(0);
        boolean zM52513e = c18237m2.m52513e(c34610p);
        if (!zM52513e) {
            int i17 = 1;
            while (true) {
                if (i17 >= c41060w0M52553g.f177069z) {
                    z4 = zM52513e;
                    z13 = true;
                    break;
                }
                C18237m c18237m3 = (C18237m) c41060w0M52553g.get(i17);
                if (c18237m3.m52513e(c34610p)) {
                    z13 = false;
                    c18237m2 = c18237m3;
                    z4 = true;
                    break;
                }
                i17++;
            }
        } else {
            z4 = zM52513e;
            z13 = true;
            break;
        }
        int i18 = z4 ? 4 : 3;
        if (z4 && c18237m2.m52514f(c34610p)) {
            i14 = 16;
        }
        return (c18237m2.f70954g ? 64 : 0) | i18 | i14 | 32 | (z13 ? 128 : 0) | iM31588w0;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: t */
    public final void mo8071t() {
        this.f38179e1.m31646r();
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: u */
    public final void mo8072u() {
        m31590y0();
        C11807x c11807x = this.f38179e1;
        c11807x.f38358V = false;
        if (c11807x.m31644o()) {
            C11796m c11796m = c11807x.f38375g;
            c11796m.m31616e();
            if (c11796m.f38294x == -9223372036854775807L) {
                C11795l c11795l = c11796m.f38275e;
                c11795l.getClass();
                c11795l.m31610a();
            } else {
                c11796m.f38296z = c11796m.m31613b();
                if (!C11807x.m31629p(c11807x.f38393v)) {
                    return;
                }
            }
            c11807x.f38393v.pause();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final int m31588w0(C34610p c34610p) {
        C11790g c11790gM31637h = this.f38179e1.m31637h(c34610p);
        if (!c11790gM31637h.f38234a) {
            return 0;
        }
        int i13 = c11790gM31637h.f38235b ? 1536 : 512;
        return c11790gM31637h.f38236c ? i13 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : i13;
    }

    /* JADX INFO: renamed from: x0 */
    public final int m31589x0(C18237m c18237m, C34610p c34610p) {
        int i13;
        if (!"OMX.google.raw.decoder".equals(c18237m.f70948a) || (i13 = AbstractC38065t.f163031a) >= 24 || (i13 == 23 && AbstractC38065t.m121895I(this.f38177c1))) {
            return c34610p.f145784o;
        }
        return -1;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m31590y0() {
        long j7;
        long jMax;
        long j13;
        mo8064l();
        C11807x c11807x = this.f38179e1;
        C0352d c0352d = c11807x.f38365b;
        if (!c11807x.m31644o() || c11807x.f38349M) {
            j7 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(c11807x.f38375g.m31612a(), AbstractC38065t.m121901O(c11807x.f38391t.f38311e, c11807x.m31640k()));
            ArrayDeque arrayDeque = c11807x.f38377h;
            while (!arrayDeque.isEmpty() && jMin >= ((C11801r) arrayDeque.getFirst()).f38321c) {
                c11807x.f38338B = (C11801r) arrayDeque.remove();
            }
            C11801r c11801r = c11807x.f38338B;
            long jM121903Q = jMin - c11801r.f38321c;
            long jM121928u = AbstractC38065t.m121928u(c11801r.f38319a.f145648a, jM121903Q);
            if (arrayDeque.isEmpty()) {
                C35791h c35791h = (C35791h) c0352d.f1239z;
                if (!c35791h.isActive()) {
                    j7 = Long.MIN_VALUE;
                } else if (c35791h.f152242o >= 1024) {
                    long j14 = c35791h.f152241n;
                    C35790g c35790g = c35791h.f152237j;
                    c35790g.getClass();
                    long j15 = j14 - ((long) ((c35790g.f152216k * c35790g.f152207b) * 2));
                    int i13 = c35791h.f152235h.f152194a;
                    int i14 = c35791h.f152234g.f152194a;
                    if (i13 == i14) {
                        jM121903Q = AbstractC38065t.m121903Q(jM121903Q, j15, c35791h.f152242o, RoundingMode.DOWN);
                        j7 = Long.MIN_VALUE;
                    } else {
                        j7 = Long.MIN_VALUE;
                        jM121903Q = AbstractC38065t.m121903Q(jM121903Q, j15 * ((long) i13), c35791h.f152242o * ((long) i14), RoundingMode.DOWN);
                    }
                } else {
                    j7 = Long.MIN_VALUE;
                    jM121903Q = (long) (((double) c35791h.f152230c) * jM121903Q);
                }
                C11801r c11801r2 = c11807x.f38338B;
                j13 = c11801r2.f38320b + jM121903Q;
                c11801r2.f38322d = jM121903Q - jM121928u;
            } else {
                j7 = Long.MIN_VALUE;
                C11801r c11801r3 = c11807x.f38338B;
                j13 = c11801r3.f38320b + jM121928u + c11801r3.f38322d;
            }
            long j16 = ((C11784c0) c0352d.f1238y).f38211q;
            jMax = AbstractC38065t.m121901O(c11807x.f38391t.f38311e, j16) + j13;
            long j17 = c11807x.f38376g0;
            if (j16 > j17) {
                long jM121901O = AbstractC38065t.m121901O(c11807x.f38391t.f38311e, j16 - j17);
                c11807x.f38376g0 = j16;
                c11807x.f38378h0 += jM121901O;
                if (c11807x.f38380i0 == null) {
                    c11807x.f38380i0 = new Handler(Looper.myLooper());
                }
                c11807x.f38380i0.removeCallbacksAndMessages(null);
                c11807x.f38380i0.postDelayed(new RunnableC1319m(c11807x, 19), 100L);
            }
        }
        if (jMax != j7) {
            if (!this.f38187m1) {
                jMax = Math.max(this.f38186l1, jMax);
            }
            this.f38186l1 = jMax;
            this.f38187m1 = false;
        }
    }
}
