package p047c9;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import live.hms.video.error.ErrorCodes;
import p009a8.RunnableC0533c;
import p012ab.C0682h0;
import p031b9.C2830f0;
import p299l9.C23488c0;
import p516u8.AbstractC34590f;
import p516u8.AbstractC34609o0;
import p516u8.C34602l;
import p516u8.C34605m0;
import p516u8.C34606n;
import p516u8.C34607n0;
import p516u8.C34610p;
import p516u8.C34620u;
import p516u8.C34621u0;
import p516u8.C34623v0;
import p516u8.InterfaceC34599j0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38058m;
import p690zr.C41017e0;
import qg3.C30352d;

/* JADX INFO: renamed from: c9.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C4321l implements InterfaceC4311b {

    /* JADX INFO: renamed from: A */
    public int f17543A;

    /* JADX INFO: renamed from: B */
    public boolean f17544B;

    /* JADX INFO: renamed from: a */
    public final Context f17545a;

    /* JADX INFO: renamed from: c */
    public final C4319j f17547c;

    /* JADX INFO: renamed from: d */
    public final PlaybackSession f17548d;

    /* JADX INFO: renamed from: j */
    public String f17554j;

    /* JADX INFO: renamed from: k */
    public PlaybackMetrics.Builder f17555k;

    /* JADX INFO: renamed from: l */
    public int f17556l;

    /* JADX INFO: renamed from: o */
    public PlaybackException f17559o;

    /* JADX INFO: renamed from: p */
    public C0682h0 f17560p;

    /* JADX INFO: renamed from: q */
    public C0682h0 f17561q;

    /* JADX INFO: renamed from: r */
    public C0682h0 f17562r;

    /* JADX INFO: renamed from: s */
    public C34610p f17563s;

    /* JADX INFO: renamed from: t */
    public C34610p f17564t;

    /* JADX INFO: renamed from: u */
    public C34610p f17565u;

    /* JADX INFO: renamed from: v */
    public boolean f17566v;

    /* JADX INFO: renamed from: w */
    public int f17567w;

    /* JADX INFO: renamed from: x */
    public boolean f17568x;

    /* JADX INFO: renamed from: y */
    public int f17569y;

    /* JADX INFO: renamed from: z */
    public int f17570z;

    /* JADX INFO: renamed from: b */
    public final Executor f17546b = AbstractC38046a.m121814i();

    /* JADX INFO: renamed from: f */
    public final C34607n0 f17550f = new C34607n0();

    /* JADX INFO: renamed from: g */
    public final C34605m0 f17551g = new C34605m0();

    /* JADX INFO: renamed from: i */
    public final HashMap f17553i = new HashMap();

    /* JADX INFO: renamed from: h */
    public final HashMap f17552h = new HashMap();

    /* JADX INFO: renamed from: e */
    public final long f17549e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m */
    public int f17557m = 0;

    /* JADX INFO: renamed from: n */
    public int f17558n = 0;

    public C4321l(Context context, PlaybackSession playbackSession) {
        this.f17545a = context.getApplicationContext();
        this.f17548d = playbackSession;
        C4319j c4319j = new C4319j();
        this.f17547c = c4319j;
        c4319j.f17536d = this;
    }

    /* JADX INFO: renamed from: g */
    public static C4321l m13618g(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C4321l(context, mediaMetricsManager.createPlaybackSession());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13619f(C0682h0 c0682h0) {
        String str;
        if (c0682h0 == null) {
            return false;
        }
        String str2 = (String) c0682h0.f2434z;
        C4319j c4319j = this.f17547c;
        synchronized (c4319j) {
            str = c4319j.f17538f;
        }
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: h */
    public final void m13620h() {
        PlaybackMetrics.Builder builder = this.f17555k;
        if (builder != null && this.f17544B) {
            builder.setAudioUnderrunCount(this.f17543A);
            this.f17555k.setVideoFramesDropped(this.f17569y);
            this.f17555k.setVideoFramesPlayed(this.f17570z);
            Long l7 = (Long) this.f17552h.get(this.f17554j);
            this.f17555k.setNetworkTransferDurationMillis(l7 == null ? 0L : l7.longValue());
            Long l12 = (Long) this.f17553i.get(this.f17554j);
            this.f17555k.setNetworkBytesRead(l12 == null ? 0L : l12.longValue());
            this.f17555k.setStreamSource((l12 == null || l12.longValue() <= 0) ? 0 : 1);
            this.f17546b.execute(new RunnableC0533c(8, this, this.f17555k.build()));
        }
        this.f17555k = null;
        this.f17554j = null;
        this.f17543A = 0;
        this.f17569y = 0;
        this.f17570z = 0;
        this.f17563s = null;
        this.f17564t = null;
        this.f17565u = null;
        this.f17544B = false;
    }

    /* JADX INFO: renamed from: i */
    public final LogSessionId m13621i() {
        return this.f17548d.getSessionId();
    }

    /* JADX INFO: renamed from: j */
    public final void m13622j(AbstractC34609o0 abstractC34609o0, C23488c0 c23488c0) {
        int iMo8132b;
        PlaybackMetrics.Builder builder = this.f17555k;
        if (c23488c0 == null || (iMo8132b = abstractC34609o0.mo8132b(c23488c0.f92976a)) == -1) {
            return;
        }
        C34605m0 c34605m0 = this.f17551g;
        int i13 = 0;
        abstractC34609o0.mo8128f(iMo8132b, c34605m0, false);
        int i14 = c34605m0.f145693c;
        C34607n0 c34607n0 = this.f17550f;
        abstractC34609o0.m109407n(i14, c34607n0);
        C34620u c34620u = c34607n0.f145703c.f145867b;
        if (c34620u != null) {
            int iM121890D = AbstractC38065t.m121890D(c34620u.f145852a, c34620u.f145853b);
            if (iM121890D == 0) {
                i13 = 3;
            } else if (iM121890D != 1) {
                i13 = iM121890D != 2 ? 1 : 4;
            } else {
                i13 = 5;
            }
        }
        builder.setStreamType(i13);
        if (c34607n0.f145713m != -9223372036854775807L && !c34607n0.f145711k && !c34607n0.f145709i && !c34607n0.m109401a()) {
            builder.setMediaDurationMillis(AbstractC38065t.m121907U(c34607n0.f145713m));
        }
        builder.setPlaybackType(c34607n0.m109401a() ? 2 : 1);
        this.f17544B = true;
    }

    /* JADX WARN: Code duplicated, block: B:256:0x048b  */
    /* JADX WARN: Code duplicated, block: B:389:0x0637  */
    /* JADX WARN: Code duplicated, block: B:392:0x0665  */
    /* JADX WARN: Code duplicated, block: B:396:0x0679 A[Catch: all -> 0x0688, TryCatch #1 {all -> 0x0688, blocks: (B:394:0x0675, B:396:0x0679, B:399:0x068a, B:400:0x0694, B:402:0x069a, B:404:0x06a7, B:406:0x06ab), top: B:415:0x0675 }] */
    /* JADX WARN: Code duplicated, block: B:402:0x069a A[Catch: all -> 0x0688, TryCatch #1 {all -> 0x0688, blocks: (B:394:0x0675, B:396:0x0679, B:399:0x068a, B:400:0x0694, B:402:0x069a, B:404:0x06a7, B:406:0x06ab), top: B:415:0x0675 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x06b5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:415:0x0675 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m13623k(InterfaceC34599j0 interfaceC34599j0, C30352d c30352d) {
        int i13;
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C4320k c4320k;
        C4320k c4320k2;
        int i24;
        int i25;
        int i26;
        int i27;
        C4320k c4320k3;
        int i28;
        int i29;
        C0682h0 c0682h0;
        int i34;
        int i35;
        int i36;
        boolean z13;
        C4319j c4319j;
        String str;
        Iterator it;
        C4318i c4318i;
        C4321l c4321l;
        C34610p c34610p;
        C34602l c34602l;
        int i37;
        if (((C34606n) c30352d.f124535x).f145698a.size() == 0) {
            return;
        }
        int i38 = 0;
        int i39 = 0;
        while (true) {
            boolean z14 = true;
            if (i39 >= ((C34606n) c30352d.f124535x).f145698a.size()) {
                break;
            }
            int iM109400a = ((C34606n) c30352d.f124535x).m109400a(i39);
            C4310a c4310a = (C4310a) ((SparseArray) c30352d.f124536y).get(iM109400a);
            c4310a.getClass();
            if (iM109400a == 0) {
                C4319j c4319j2 = this.f17547c;
                synchronized (c4319j2) {
                    try {
                        c4319j2.f17536d.getClass();
                        AbstractC34609o0 abstractC34609o0 = c4319j2.f17537e;
                        c4319j2.f17537e = c4310a.f17496b;
                        Iterator it3 = c4319j2.f17535c.values().iterator();
                        while (it3.hasNext()) {
                            C4318i c4318i2 = (C4318i) it3.next();
                            if (!c4318i2.m13605b(abstractC34609o0, c4319j2.f17537e) || c4318i2.m13604a(c4310a)) {
                                it3.remove();
                                if (c4318i2.f17528e) {
                                    if (c4318i2.f17524a.equals(c4319j2.f17538f)) {
                                        c4319j2.m13606a(c4318i2);
                                    }
                                    c4319j2.f17536d.m13625m(c4310a, c4318i2.f17524a);
                                }
                            }
                        }
                        c4319j2.m13609d(c4310a);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else if (iM109400a == 11) {
                C4319j c4319j3 = this.f17547c;
                int i44 = this.f17556l;
                synchronized (c4319j3) {
                    try {
                        c4319j3.f17536d.getClass();
                        if (i44 != 0) {
                            z14 = false;
                        }
                        Iterator it4 = c4319j3.f17535c.values().iterator();
                        while (it4.hasNext()) {
                            C4318i c4318i3 = (C4318i) it4.next();
                            if (c4318i3.m13604a(c4310a)) {
                                it4.remove();
                                if (c4318i3.f17528e) {
                                    boolean zEquals = c4318i3.f17524a.equals(c4319j3.f17538f);
                                    if (z14 && zEquals) {
                                        boolean z15 = c4318i3.f17529f;
                                    }
                                    if (zEquals) {
                                        c4319j3.m13606a(c4318i3);
                                    }
                                    c4319j3.f17536d.m13625m(c4310a, c4318i3.f17524a);
                                }
                            }
                        }
                        c4319j3.m13609d(c4310a);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } else {
                this.f17547c.m13610e(c4310a);
            }
            i39++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c30352d.m92813l(0)) {
            C4310a c4310a2 = (C4310a) ((SparseArray) c30352d.f124536y).get(0);
            c4310a2.getClass();
            if (this.f17555k != null) {
                m13622j(c4310a2.f17496b, c4310a2.f17498d);
            }
        }
        if (c30352d.m92813l(2) && this.f17555k != null) {
            C41017e0 c41017e0ListIterator = ((C2830f0) interfaceC34599j0).m8105d0().f145864a.listIterator(0);
            loop3: while (true) {
                if (!c41017e0ListIterator.hasNext()) {
                    c34602l = null;
                    break;
                }
                C34621u0 c34621u0 = (C34621u0) c41017e0ListIterator.next();
                for (int i45 = 0; i45 < c34621u0.f145857a; i45++) {
                    if (c34621u0.f145861e[i45] && (c34602l = c34621u0.f145858b.f145799d[i45].f145787r) != null) {
                        break loop3;
                    }
                }
            }
            if (c34602l != null) {
                PlaybackMetrics.Builder builder = this.f17555k;
                int i46 = 0;
                while (true) {
                    if (i46 >= c34602l.f145690z) {
                        i37 = 1;
                        break;
                    }
                    UUID uuid = c34602l.f145687w[i46].f145681x;
                    if (uuid.equals(AbstractC34590f.f145654d)) {
                        i37 = 3;
                        break;
                    } else if (uuid.equals(AbstractC34590f.f145655e)) {
                        i37 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC34590f.f145653c)) {
                            i37 = 6;
                            break;
                        }
                        i46++;
                    }
                }
                builder.setDrmType(i37);
            }
        }
        if (c30352d.m92813l(MessageListItemViewType.THREAD_PLACEHOLDER)) {
            this.f17543A++;
        }
        PlaybackException playbackException = this.f17559o;
        int i47 = 5;
        if (playbackException == null) {
            i16 = 4;
            i28 = 1;
            i29 = 2;
            i19 = 13;
            i14 = 9;
            i15 = 8;
            i17 = 7;
            i18 = 6;
        } else {
            int i48 = playbackException.f6365w;
            Context context = this.f17545a;
            boolean z16 = this.f17567w == 4;
            if (i48 == 1001) {
                c4320k = new C4320k(20, i38, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z4 = exoPlaybackException.f6376y == 1;
                    i13 = exoPlaybackException.f6373G;
                } else {
                    i13 = 0;
                    z4 = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                int i49 = 27;
                int i54 = 23;
                if (cause instanceof IOException) {
                    if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                        c4320k3 = new C4320k(i47, ((HttpDataSource$InvalidResponseCodeException) cause).f6370y, 0);
                    } else {
                        if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                            i24 = 6;
                            i25 = 7;
                            i26 = 4;
                            i27 = 8;
                            i14 = 9;
                            c4320k = new C4320k(z16 ? 10 : 11, i38, 0);
                        } else {
                            boolean z17 = cause instanceof HttpDataSource$HttpDataSourceException;
                            if (z17 || (cause instanceof UdpDataSource$UdpDataSourceException)) {
                                i14 = 9;
                                if (C38058m.m121838a(context).m121839b() == 1) {
                                    c4320k = new C4320k(3, i38, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        c4320k = new C4320k(6, i38, 0);
                                        i18 = 6;
                                        i19 = 13;
                                        i15 = 8;
                                        i16 = 4;
                                        i17 = 7;
                                    } else {
                                        i24 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            c4320k = new C4320k(7, i38, 0);
                                            i18 = 6;
                                            i17 = 7;
                                            i19 = 13;
                                            i15 = 8;
                                            i16 = 4;
                                        } else {
                                            i25 = 7;
                                            if (z17 && ((HttpDataSource$HttpDataSourceException) cause).f6369x == 1) {
                                                c4320k = new C4320k(4, i38, 0);
                                                i18 = 6;
                                                i17 = 7;
                                                i16 = 4;
                                                i19 = 13;
                                                i15 = 8;
                                            } else {
                                                i26 = 4;
                                                i27 = 8;
                                                c4320k = new C4320k(i27, i38, 0);
                                            }
                                        }
                                    }
                                }
                            } else if (i48 == 1002) {
                                c4320k = new C4320k(21, i38, 0);
                            } else if (cause instanceof DrmSession$DrmSessionException) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int iM121927t = AbstractC38065t.m121927t(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (AbstractC38065t.m121926s(iM121927t)) {
                                        case ErrorCodes.GenericErrors.cUnknown /* 6002 */:
                                            i49 = 24;
                                            break;
                                        case ErrorCodes.GenericErrors.cNotReady /* 6003 */:
                                            i49 = 28;
                                            break;
                                        case ErrorCodes.GenericErrors.cJsonParsingFailed /* 6004 */:
                                            i49 = 25;
                                            break;
                                        case ErrorCodes.GenericErrors.cTrackMetadataMissing /* 6005 */:
                                            i49 = 26;
                                            break;
                                    }
                                    c4320k3 = new C4320k(i49, iM121927t, 0);
                                } else if (AbstractC38065t.f163031a >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                    c4320k = new C4320k(i49, i38, 0);
                                } else if (cause3 instanceof NotProvisionedException) {
                                    c4320k = new C4320k(24, i38, 0);
                                } else if (cause3 instanceof DeniedByServerException) {
                                    c4320k = new C4320k(29, i38, 0);
                                } else if (cause3 instanceof UnsupportedDrmException) {
                                    c4320k = new C4320k(i54, i38, 0);
                                } else {
                                    c4320k = cause3 instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new C4320k(28, i38, 0) : new C4320k(30, i38, 0);
                                }
                            } else if ((cause instanceof FileDataSource$FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                c4320k = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new C4320k(32, i38, 0) : new C4320k(31, i38, 0);
                            } else {
                                i14 = 9;
                                c4320k = new C4320k(i14, i38, 0);
                            }
                            i19 = 13;
                            i15 = 8;
                            i16 = 4;
                            i17 = 7;
                            i18 = 6;
                        }
                        i18 = i24;
                        i17 = i25;
                        i16 = i26;
                        i15 = i27;
                        i19 = 13;
                    }
                    c4320k = c4320k3;
                } else {
                    i14 = 9;
                    i15 = 8;
                    i16 = 4;
                    i17 = 7;
                    i18 = 6;
                    if (z4 && (i13 == 0 || i13 == 1)) {
                        c4320k = new C4320k(35, i38, 0);
                    } else if (z4 && i13 == 3) {
                        c4320k = new C4320k(15, i38, 0);
                    } else if (z4 && i13 == 2) {
                        c4320k = new C4320k(i54, i38, 0);
                    } else {
                        if (cause instanceof MediaCodecRenderer$DecoderInitializationException) {
                            i19 = 13;
                            c4320k2 = new C4320k(i19, AbstractC38065t.m121927t(((MediaCodecRenderer$DecoderInitializationException) cause).f6397z), 0);
                        } else {
                            i19 = 13;
                            int i55 = 14;
                            if (cause instanceof MediaCodecDecoderException) {
                                c4320k = new C4320k(i55, ((MediaCodecDecoderException) cause).f6393w, 0);
                            } else if (cause instanceof OutOfMemoryError) {
                                c4320k = new C4320k(i55, i38, 0);
                            } else if (cause instanceof AudioSink$InitializationException) {
                                c4320k2 = new C4320k(17, ((AudioSink$InitializationException) cause).f6379w, 0);
                            } else if (cause instanceof AudioSink$WriteException) {
                                c4320k2 = new C4320k(18, ((AudioSink$WriteException) cause).f6381w, 0);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (AbstractC38065t.m121926s(errorCode)) {
                                    case ErrorCodes.GenericErrors.cUnknown /* 6002 */:
                                        i49 = 24;
                                        break;
                                    case ErrorCodes.GenericErrors.cNotReady /* 6003 */:
                                        i49 = 28;
                                        break;
                                    case ErrorCodes.GenericErrors.cJsonParsingFailed /* 6004 */:
                                        i49 = 25;
                                        break;
                                    case ErrorCodes.GenericErrors.cTrackMetadataMissing /* 6005 */:
                                        i49 = 26;
                                        break;
                                }
                                c4320k2 = new C4320k(i49, errorCode, 0);
                            } else {
                                c4320k = new C4320k(22, i38, 0);
                            }
                        }
                        c4320k = c4320k2;
                    }
                    i19 = 13;
                }
                this.f17546b.execute(new RunnableC0533c(7, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f17549e).setErrorCode(c4320k.f17541x).setSubErrorCode(c4320k.f17542y).setException(playbackException).build()));
                i28 = 1;
                this.f17544B = true;
                this.f17559o = null;
                i29 = 2;
            }
            i19 = 13;
            i14 = 9;
            i15 = 8;
            i16 = 4;
            i17 = 7;
            i18 = 6;
            this.f17546b.execute(new RunnableC0533c(7, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f17549e).setErrorCode(c4320k.f17541x).setSubErrorCode(c4320k.f17542y).setException(playbackException).build()));
            i28 = 1;
            this.f17544B = true;
            this.f17559o = null;
            i29 = 2;
        }
        if (c30352d.m92813l(i29)) {
            C34623v0 c34623v0M8105d0 = ((C2830f0) interfaceC34599j0).m8105d0();
            boolean zM109417a = c34623v0M8105d0.m109417a(i29);
            boolean zM109417a2 = c34623v0M8105d0.m109417a(i28);
            boolean zM109417a3 = c34623v0M8105d0.m109417a(3);
            if (zM109417a || zM109417a2 || zM109417a3) {
                if (zM109417a) {
                    c34610p = null;
                } else {
                    c34610p = null;
                    if (!Objects.equals(this.f17563s, null)) {
                        int i56 = this.f17563s == null ? 1 : 0;
                        this.f17563s = null;
                        m13626n(1, jElapsedRealtime, null, i56);
                    }
                }
                if (!zM109417a2 && !Objects.equals(this.f17564t, c34610p)) {
                    int i57 = this.f17564t == null ? 1 : 0;
                    this.f17564t = c34610p;
                    m13626n(0, jElapsedRealtime, c34610p, i57);
                }
                if (!zM109417a3 && !Objects.equals(this.f17565u, c34610p)) {
                    int i58 = this.f17565u == null ? 1 : 0;
                    this.f17565u = c34610p;
                    m13626n(2, jElapsedRealtime, c34610p, i58);
                }
                c0682h0 = c34610p;
            } else {
                i16 = i16;
                c0682h0 = 0;
            }
        } else {
            i16 = i16;
            c0682h0 = 0;
        }
        if (m13619f(this.f17560p)) {
            C0682h0 c0682h1 = this.f17560p;
            C34610p c34610p2 = (C34610p) c0682h1.f2433y;
            if (c34610p2.f145791v != -1) {
                int i59 = c0682h1.f2432x;
                if (!Objects.equals(this.f17563s, c34610p2)) {
                    int i64 = (this.f17563s == null && i59 == 0) ? 1 : i59;
                    this.f17563s = c34610p2;
                    m13626n(1, jElapsedRealtime, c34610p2, i64);
                }
                this.f17560p = c0682h0;
            }
        }
        if (m13619f(this.f17561q)) {
            C0682h0 c0682h2 = this.f17561q;
            C34610p c34610p3 = (C34610p) c0682h2.f2433y;
            int i65 = c0682h2.f2432x;
            if (!Objects.equals(this.f17564t, c34610p3)) {
                int i66 = (this.f17564t == null && i65 == 0) ? 1 : i65;
                this.f17564t = c34610p3;
                m13626n(0, jElapsedRealtime, c34610p3, i66);
            }
            this.f17561q = c0682h0;
        }
        if (m13619f(this.f17562r)) {
            C0682h0 c0682h3 = this.f17562r;
            C34610p c34610p4 = (C34610p) c0682h3.f2433y;
            int i67 = c0682h3.f2432x;
            if (!Objects.equals(this.f17565u, c34610p4)) {
                int i68 = (this.f17565u == null && i67 == 0) ? 1 : i67;
                this.f17565u = c34610p4;
                m13626n(2, jElapsedRealtime, c34610p4, i68);
            }
            this.f17562r = c0682h0;
        }
        switch (C38058m.m121838a(this.f17545a).m121839b()) {
            case 0:
                i34 = 0;
                break;
            case 1:
                i34 = i14;
                break;
            case 2:
                i34 = 2;
                break;
            case 3:
                i34 = i16;
                break;
            case 4:
                i34 = 5;
                break;
            case 5:
                i34 = i18;
                break;
            case 6:
            case 8:
            default:
                i34 = 1;
                break;
            case 7:
                i34 = 3;
                break;
            case 9:
                i34 = i15;
                break;
            case 10:
                i34 = i17;
                break;
        }
        if (i34 != this.f17558n) {
            this.f17558n = i34;
            this.f17546b.execute(new RunnableC0533c(6, this, new NetworkEvent.Builder().setNetworkType(i34).setTimeSinceCreatedMillis(jElapsedRealtime - this.f17549e).build()));
        }
        C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
        if (c2830f0.m8110i0() != 2) {
            this.f17566v = false;
        }
        c2830f0.m8091L0();
        if (c2830f0.f11111I0.f11050f == null) {
            this.f17568x = false;
            i35 = 10;
        } else {
            i35 = 10;
            if (c30352d.m92813l(10)) {
                this.f17568x = true;
            }
        }
        int iM8110i0 = c2830f0.m8110i0();
        if (this.f17566v) {
            i36 = 5;
        } else if (this.f17568x) {
            i36 = i19;
        } else if (iM8110i0 == i16) {
            i36 = 11;
        } else {
            i36 = 12;
            if (iM8110i0 != 2) {
                if (iM8110i0 != 3) {
                    z13 = true;
                    if (iM8110i0 != 1 || this.f17557m == 0) {
                        i36 = this.f17557m;
                    }
                } else if (c2830f0.m8108g0()) {
                    c2830f0.m8091L0();
                    i36 = c2830f0.f11111I0.f11058n != 0 ? i14 : 3;
                } else {
                    i36 = i16;
                }
                if (this.f17557m != i36) {
                    this.f17557m = i36;
                    this.f17544B = z13;
                    this.f17546b.execute(new RunnableC0533c(9, this, new PlaybackStateEvent.Builder().setState(this.f17557m).setTimeSinceCreatedMillis(jElapsedRealtime - this.f17549e).build()));
                }
                if (c30352d.m92813l(1028)) {
                    c4319j = this.f17547c;
                    C4310a c4310a3 = (C4310a) ((SparseArray) c30352d.f124536y).get(1028);
                    c4310a3.getClass();
                    synchronized (c4319j) {
                        try {
                            str = c4319j.f17538f;
                            if (str != null) {
                                C4318i c4318i4 = (C4318i) c4319j.f17535c.get(str);
                                c4318i4.getClass();
                                c4319j.m13606a(c4318i4);
                            }
                            it = c4319j.f17535c.values().iterator();
                            while (it.hasNext()) {
                                c4318i = (C4318i) it.next();
                                it.remove();
                                if (!c4318i.f17528e && (c4321l = c4319j.f17536d) != null) {
                                    c4321l.m13625m(c4310a3, c4318i.f17524a);
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            }
            int i69 = this.f17557m;
            if (i69 == 0 || i69 == 2 || i69 == 12) {
                i36 = 2;
            } else if (c2830f0.m8108g0()) {
                c2830f0.m8091L0();
                i36 = c2830f0.f11111I0.f11058n != 0 ? i35 : i18;
            } else {
                i36 = i17;
            }
        }
        z13 = true;
        if (this.f17557m != i36) {
            this.f17557m = i36;
            this.f17544B = z13;
            this.f17546b.execute(new RunnableC0533c(9, this, new PlaybackStateEvent.Builder().setState(this.f17557m).setTimeSinceCreatedMillis(jElapsedRealtime - this.f17549e).build()));
        }
        if (c30352d.m92813l(1028)) {
            c4319j = this.f17547c;
            C4310a c4310a4 = (C4310a) ((SparseArray) c30352d.f124536y).get(1028);
            c4310a4.getClass();
            synchronized (c4319j) {
                str = c4319j.f17538f;
                if (str != null) {
                    C4318i c4318i5 = (C4318i) c4319j.f17535c.get(str);
                    c4318i5.getClass();
                    c4319j.m13606a(c4318i5);
                }
                it = c4319j.f17535c.values().iterator();
                while (it.hasNext()) {
                    c4318i = (C4318i) it.next();
                    it.remove();
                    if (!c4318i.f17528e) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13624l(C4310a c4310a, String str) {
        C23488c0 c23488c0 = c4310a.f17498d;
        if (c23488c0 == null || !c23488c0.m68054b()) {
            m13620h();
            this.f17554j = str;
            this.f17555k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.6.1");
            m13622j(c4310a.f17496b, c23488c0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13625m(C4310a c4310a, String str) {
        C23488c0 c23488c0 = c4310a.f17498d;
        if ((c23488c0 == null || !c23488c0.m68054b()) && str.equals(this.f17554j)) {
            m13620h();
        }
        this.f17552h.remove(str);
        this.f17553i.remove(str);
    }

    /* JADX INFO: renamed from: n */
    public final void m13626n(int i13, long j7, C34610p c34610p, int i14) {
        int i15;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i13).setTimeSinceCreatedMillis(j7 - this.f17549e);
        if (c34610p != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i14 != 1) {
                i15 = 3;
                if (i14 != 2) {
                    i15 = i14 != 3 ? 1 : 4;
                }
            } else {
                i15 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i15);
            String str = c34610p.f145782m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c34610p.f145783n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c34610p.f145780k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i16 = c34610p.f145779j;
            if (i16 != -1) {
                timeSinceCreatedMillis.setBitrate(i16);
            }
            int i17 = c34610p.f145790u;
            if (i17 != -1) {
                timeSinceCreatedMillis.setWidth(i17);
            }
            int i18 = c34610p.f145791v;
            if (i18 != -1) {
                timeSinceCreatedMillis.setHeight(i18);
            }
            int i19 = c34610p.f145759D;
            if (i19 != -1) {
                timeSinceCreatedMillis.setChannelCount(i19);
            }
            int i24 = c34610p.f145760E;
            if (i24 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i24);
            }
            String str4 = c34610p.f145773d;
            if (str4 != null) {
                int i25 = AbstractC38065t.f163031a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f13 = c34610p.f145792w;
            if (f13 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f13);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f17544B = true;
        this.f17546b.execute(new RunnableC0533c(5, this, timeSinceCreatedMillis.build()));
    }
}
