package g73;

import a13.C0144b;
import a30.C0332w0;
import a33.C0352d;
import ai.C0904j;
import android.app.Application;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.text.PrecomputedText;
import android.util.Log;
import android.view.Surface;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.NotificationManagerCompat;
import b23.C2345k;
import bb.C2919f;
import c93.InterfaceC4339a;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.android.R;
import dm.EnumC12174d;
import e43.C12715g;
import g43.AbstractC15464a;
import g43.AbstractC15473j;
import g43.C15468e;
import g43.C15474k;
import g43.C15476m;
import g43.C15477n;
import g43.C15480q;
import g43.InterfaceC15478o;
import gm.C15990r;
import h43.C16852a;
import h43.C16853b;
import hn.C17501i;
import hn.InterfaceC17502j;
import hn.InterfaceC17503k;
import im.InterfaceC18653b;
import io.sentry.C20275c5;
import io.sentry.EnumC20418m;
import io.sentry.clientreport.EnumC20296d;
import io.sentry.clientreport.InterfaceC20299g;
import io.sentry.hints.InterfaceC20362i;
import j93.InterfaceC21461d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jg3.C21678e;
import k93.C22305b;
import kg3.AbstractC22465d;
import kr.C22786e;
import live.hms.video.error.ErrorCodes;
import live.hms.video.utils.HMSConstantsKt;
import ml.InterfaceC25666h;
import mm.C25677a;
import mm.C25678b;
import mm.EnumC25679c;
import ng3.C26701n;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26704q;
import p047c9.C4320k;
import p215i9.C18233i;
import p215i9.C18237m;
import p215i9.C18244t;
import p215i9.InterfaceC18234j;
import p215i9.InterfaceC18235k;
import p264jx.C21997d;
import p304lh.InterfaceC24066e;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p607x8.AbstractC38065t;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;
import q83.InterfaceC30062i;
import qg3.C30352d;
import ub3.InterfaceC34747a;

/* JADX INFO: renamed from: g73.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15556d implements InterfaceC17502j, InterfaceC18234j, InterfaceC20299g, InterfaceC20362i, InterfaceC26704q, InterfaceC34747a, InterfaceC30062i, InterfaceC24066e, InterfaceC18653b, InterfaceC25666h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58384w;

    public C15556d() {
        this.f58384w = 16;
        C22305b c22305b = C22305b.f87029w;
    }

    /* JADX INFO: renamed from: b */
    public static final C2345k m43801b() {
        C15556d c15556d = C16853b.f64763E;
        return (C2345k) C16853b.f64764F.getValue();
    }

    /* JADX INFO: renamed from: c */
    public static MediaCodec m43802c(C0332w0 c0332w0) throws IOException {
        String str = ((C18237m) c0332w0.f1168x).f70948a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* JADX INFO: renamed from: f */
    public static MediaCodec m43803f(C17501i c17501i) throws IOException {
        c17501i.f67652a.getClass();
        String str = c17501i.f67652a.f67657a;
        String strValueOf = String.valueOf(str);
        AbstractC24543a.m71567c(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        AbstractC24543a.m71579o();
        return mediaCodecCreateByCodecName;
    }

    /* JADX INFO: renamed from: g */
    public static C2919f m43804g(C4320k c4320k, C0904j c0904j) {
        IOException iOException = (IOException) c0904j.f3302x;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return null;
        }
        int i13 = ((HttpDataSource$InvalidResponseCodeException) iOException).f20438y;
        if ((i13 == 403 || i13 == 404 || i13 == 410 || i13 == 416 || i13 == 500 || i13 == 503) && c4320k.f17541x - c4320k.f17542y > 1) {
            return new C2919f(2, 60000L, 2);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static long m43805i(C0904j c0904j) {
        Throwable cause = (IOException) c0904j.f3302x;
        if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        int i13 = DataSourceException.f20436x;
        while (cause != null) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f20437w == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((c0904j.f3301w - 1) * 1000, ErrorCodes.WebsocketMethodErrors.cServerErrors);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.app.Application, android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v0, types: [e43.h] */
    /* JADX INFO: renamed from: m */
    public static C12715g m43806m(C12715g c12715g, Application application, boolean z4) {
        if (application == 0) {
            return c12715g;
        }
        InterfaceC15478o abstractC15473j = c12715g.f43505c;
        if (AbstractC22676k.m65745e(abstractC15473j, C16852a.f64762w)) {
            abstractC15473j = null;
        }
        if (abstractC15473j == null) {
            C0144b c0144b = new C0144b();
            application.registerActivityLifecycleCallbacks(c0144b);
            NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(application.getApplicationContext());
            AbstractC22676k.m65749i(notificationManagerCompatFrom, "from(...)");
            C0352d c0352d = new C0352d((Application) application, new C22786e(25));
            C15474k c15474k = new C15474k();
            C15480q c15480q = new C15480q();
            C15468e c15468e = new C15468e(c15474k, c15480q);
            Context applicationContext = application.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            C15476m c15476mM43660b = AbstractC15464a.m43660b(applicationContext, R.string.stream_video_incoming_call_notification_channel_id, R.string.stream_video_incoming_call_notification_channel_title, R.string.stream_video_incoming_call_notification_channel_description, 4);
            Context applicationContext2 = application.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext2, "getApplicationContext(...)");
            C15476m c15476mM43660b2 = AbstractC15464a.m43660b(applicationContext2, R.string.stream_video_ongoing_call_notification_channel_id, R.string.stream_video_ongoing_call_notification_channel_title, R.string.stream_video_ongoing_call_notification_channel_description, 3);
            Context applicationContext3 = application.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext3, "getApplicationContext(...)");
            C15476m c15476mM43660b3 = AbstractC15464a.m43660b(applicationContext3, R.string.stream_video_outgoing_call_notification_channel_id, R.string.stream_video_outgoing_call_notification_channel_title, R.string.stream_video_outgoing_call_notification_channel_description, 3);
            Context applicationContext4 = application.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext4, "getApplicationContext(...)");
            C15476m c15476mM43660b4 = AbstractC15464a.m43660b(applicationContext4, R.string.stream_video_missed_call_notification_channel_id, R.string.stream_video_missed_call_notification_channel_title, R.string.stream_video_missed_call_notification_channel_description, 4);
            Context applicationContext5 = application.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext5, "getApplicationContext(...)");
            C15476m c15476mM43660b5 = AbstractC15464a.m43660b(applicationContext5, R.string.stream_video_missed_call_low_priority_notification_channel_id, R.string.stream_video_missed_call_notification_channel_title, R.string.stream_video_missed_call_low_priority_notification_channel_description, 3);
            Context applicationContext6 = application.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext6, "getApplicationContext(...)");
            abstractC15473j = new AbstractC15473j(application, notificationManagerCompatFrom, c0144b, c0352d, z4, c15474k, c15480q, new C15477n(c15476mM43660b, c15476mM43660b2, c15476mM43660b3, c15476mM43660b4, c15476mM43660b5, AbstractC15464a.m43660b(applicationContext6, R.string.stream_video_incoming_call_low_priority_notification_channel_id, R.string.stream_video_incoming_call_notification_channel_title, R.string.stream_video_incoming_call_low_priority_notification_channel_description, 3)), c15468e);
        }
        List pushDeviceGenerators = c12715g.f43503a;
        InterfaceC4339a requestPermissionOnAppLaunch = c12715g.f43504b;
        boolean z13 = c12715g.f43506d;
        InterfaceC4339a requestPermissionOnDeviceRegistration = c12715g.f43507e;
        boolean z14 = c12715g.f43508f;
        boolean z15 = c12715g.f43509g;
        Set set = c12715g.f43510h;
        Function1 notificationUpdateTriggers = c12715g.f43511i;
        AbstractC22676k.m65750j(pushDeviceGenerators, "pushDeviceGenerators");
        AbstractC22676k.m65750j(requestPermissionOnAppLaunch, "requestPermissionOnAppLaunch");
        AbstractC22676k.m65750j(requestPermissionOnDeviceRegistration, "requestPermissionOnDeviceRegistration");
        AbstractC22676k.m65750j(notificationUpdateTriggers, "notificationUpdateTriggers");
        return new C12715g(pushDeviceGenerators, requestPermissionOnAppLaunch, abstractC15473j, z13, requestPermissionOnDeviceRegistration, z14, z15, set, notificationUpdateTriggers);
    }

    @Override // hn.InterfaceC17502j
    /* JADX INFO: renamed from: a */
    public InterfaceC17503k mo43807a(C17501i c17501i) {
        String string;
        switch (this.f58384w) {
            case 4:
                if (AbstractC24567y.f95875a < 31) {
                    return new C15556d(5).mo43807a(c17501i);
                }
                int iM71613g = AbstractC24555m.m71613g(c17501i.f67654c.f130077L);
                switch (iM71613g) {
                    case -2:
                        string = "none";
                        break;
                    case -1:
                        string = "unknown";
                        break;
                    case 0:
                        string = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
                        break;
                    case 1:
                        string = "audio";
                        break;
                    case 2:
                        string = "video";
                        break;
                    case 3:
                        string = "text";
                        break;
                    case 4:
                        string = "image";
                        break;
                    case 5:
                        string = "metadata";
                        break;
                    case 6:
                        string = "camera motion";
                        break;
                    default:
                        if (iM71613g < 10000) {
                            string = "?";
                        } else {
                            StringBuilder sb4 = new StringBuilder(20);
                            sb4.append("custom (");
                            sb4.append(iM71613g);
                            sb4.append(")");
                            string = sb4.toString();
                        }
                        break;
                }
                String strValueOf = String.valueOf(string);
                Log.i("DMCodecAdapterFactory", strValueOf.length() != 0 ? "Creating an asynchronous MediaCodec adapter for track type ".concat(strValueOf) : new String("Creating an asynchronous MediaCodec adapter for track type "));
                return new C30352d(iM71613g).mo43807a(c17501i);
            default:
                MediaCodec mediaCodecM43803f = null;
                try {
                    mediaCodecM43803f = m43803f(c17501i);
                    AbstractC24543a.m71567c("configureCodec");
                    mediaCodecM43803f.configure(c17501i.f67653b, c17501i.f67655d, c17501i.f67656e, 0);
                    AbstractC24543a.m71579o();
                    AbstractC24543a.m71567c("startCodec");
                    mediaCodecM43803f.start();
                    AbstractC24543a.m71579o();
                    return new C15990r(mediaCodecM43803f);
                } catch (IOException | RuntimeException e5) {
                    if (mediaCodecM43803f != null) {
                        mediaCodecM43803f.release();
                    }
                    throw e5;
                }
        }
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: d */
    public void mo16051d(EnumC20296d enumC20296d, EnumC20418m enumC20418m) {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // p215i9.InterfaceC18234j
    /* JADX INFO: renamed from: e */
    public InterfaceC18235k mo43808e(C0332w0 c0332w0) throws Throwable {
        MediaCodec mediaCodecM43802c = null;
        try {
            mediaCodecM43802c = m43802c(c0332w0);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) c0332w0.f1164E;
            mediaCodecM43802c.configure((MediaFormat) c0332w0.f1169y, surface, (MediaCrypto) c0332w0.f1165F, (surface == null && ((C18237m) c0332w0.f1168x).f70955h && AbstractC38065t.f163031a >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM43802c.start();
            Trace.endSection();
            return new C18244t(mediaCodecM43802c, (C18233i) c0332w0.f1166G);
        } catch (IOException e5) {
            e = e5;
            if (mediaCodecM43802c != null) {
                mediaCodecM43802c.release();
            }
            throw e;
        } catch (RuntimeException e13) {
            e = e13;
            if (mediaCodecM43802c != null) {
                mediaCodecM43802c.release();
            }
            throw e;
        }
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        C26701n c26701n = new C26701n(14);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(EnumC12174d.f40479w, new C25678b(30000L, DurationKt.MILLIS_IN_DAY, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(EnumC12174d.f40481y, new C25678b(1000L, DurationKt.MILLIS_IN_DAY, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC25679c.f101011x)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(EnumC12174d.f40480x, new C25678b(DurationKt.MILLIS_IN_DAY, DurationKt.MILLIS_IN_DAY, setUnmodifiableSet));
        if (map.keySet().size() < EnumC12174d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C25677a(c26701n, map);
    }

    /* JADX INFO: renamed from: h */
    public int m43809h(int i13) {
        return i13 == 7 ? 6 : 3;
    }

    @Override // p304lh.InterfaceC24066e
    public boolean isOnline() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean m43810j(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: k */
    public void mo16062k(EnumC20296d enumC20296d, EnumC20418m enumC20418m, long j7) {
    }

    @Override // ng3.InterfaceC26704q
    /* JADX INFO: renamed from: l */
    public Object mo43799l(InterfaceC26698k interfaceC26698k) {
        switch (this.f58384w) {
            case 14:
                return C21678e.m61017r0(interfaceC26698k);
            default:
                return (AbstractC22465d) interfaceC26698k.mo14019g(this);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: n */
    public void mo16068n(EnumC20296d enumC20296d, C20275c5 c20275c5) {
    }

    @Override // ub3.InterfaceC34747a
    /* JADX INFO: renamed from: r */
    public Iterable mo13799r(Object obj) {
        return (Iterable) C22305b.f87029w.get((InterfaceC21461d) obj);
    }

    @Override // p304lh.InterfaceC24066e
    public void shutdown() {
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: u */
    public void mo16071u(EnumC20296d enumC20296d, C5101l0 c5101l0) {
    }

    @Override // io.sentry.clientreport.InterfaceC20299g
    /* JADX INFO: renamed from: y */
    public C5101l0 mo16072y(C5101l0 c5101l0) {
        return c5101l0;
    }

    public /* synthetic */ C15556d(int i13) {
        this.f58384w = i13;
    }

    public C15556d(ImageView internalImage, FrameLayout internalImageContainer) {
        this.f58384w = 23;
        AbstractC22676k.m65750j(internalImage, "internalImage");
        AbstractC22676k.m65750j(internalImageContainer, "internalImageContainer");
    }

    public C15556d(C21997d c21997d) {
        this.f58384w = 15;
    }
}
