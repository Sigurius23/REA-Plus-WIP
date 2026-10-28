package e33;

import androidx.room.C1836v0;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import b30.C2570m;
import bc3.C2996c2;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import c43.AbstractC4191g;
import c43.C4185a;
import c43.C4207w;
import c43.EnumC4206v;
import d33.C11583b0;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13096w1;
import ge3.AbstractC15751g;
import gm.C15990r;
import h33.C16831a;
import io.getstream.video.android.core.api.SignalServerService;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import l53.C23372m;
import l83.C23465k;
import l83.C23468n;
import m83.AbstractC25247g0;
import n23.AbstractC26202e;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import n53.C26377x1;
import org.webrtc.AudioTrack;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.VideoTrack;
import p000.AbstractC11266d;
import p043c4.C3955e;
import p33.AbstractC28824q;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import stream.video.sfu.models.PeerType;
import stream.video.sfu.models.TrackType;
import stream.video.sfu.models.VideoDimension;
import stream.video.sfu.signal.ICERestartRequest;
import wb3.AbstractC37056f;
import y33.C39202e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: e33.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12662v0 extends C12659u {

    /* JADX INFO: renamed from: Q */
    public static final VideoDimension f43287Q = new VideoDimension(720, 1280, null, 4, null);

    /* JADX INFO: renamed from: A */
    public final C23372m f43288A;

    /* JADX INFO: renamed from: B */
    public final C11583b0 f43289B;

    /* JADX INFO: renamed from: C */
    public final C20378c f43290C;

    /* JADX INFO: renamed from: D */
    public final C13045h2 f43291D;

    /* JADX INFO: renamed from: E */
    public C2996c2 f43292E;

    /* JADX INFO: renamed from: F */
    public final ConcurrentHashMap f43293F;

    /* JADX INFO: renamed from: G */
    public final ConcurrentHashMap f43294G;

    /* JADX INFO: renamed from: H */
    public final ConcurrentHashMap f43295H;

    /* JADX INFO: renamed from: I */
    public final ConcurrentHashMap f43296I;

    /* JADX INFO: renamed from: J */
    public final ConcurrentHashMap f43297J;

    /* JADX INFO: renamed from: K */
    public final C26377x1 f43298K;

    /* JADX INFO: renamed from: L */
    public final ConcurrentHashMap f43299L;

    /* JADX INFO: renamed from: M */
    public final ConcurrentHashMap f43300M;

    /* JADX INFO: renamed from: N */
    public final ArrayList f43301N;

    /* JADX INFO: renamed from: O */
    public final C13096w1 f43302O;

    /* JADX INFO: renamed from: P */
    public final C13096w1 f43303P;

    /* JADX INFO: renamed from: w */
    public final String f43304w;

    /* JADX INFO: renamed from: x */
    public final SignalServerService f43305x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC2994c0 f43306y;

    /* JADX INFO: renamed from: z */
    public final boolean f43307z;

    static {
        new VideoDimension(180, 320, null, 4, null);
        new VideoDimension(0, 0, null, 4, null);
    }

    public C12662v0(String sessionId, SignalServerService sfuClient, InterfaceC2994c0 coroutineScope, boolean z4, C23372m tracer, C1836v0 c1836v0, C39202e c39202e) {
        C11583b0 c11583b0 = C11583b0.f37363y;
        C11583b0 c11583b1 = C11583b0.f37364z;
        C20378c c20378c = new C20378c(coroutineScope);
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(sfuClient, "sfuClient");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(tracer, "tracer");
        super(EnumC4206v.f17064x, new MediaConstraints(), C12627e.f43129y, C12640k0.f43173w, new C3955e(c1836v0, 3), c11583b0, c11583b1, 0, false, tracer, "Subscriber");
        this.f43304w = sessionId;
        this.f43305x = sfuClient;
        this.f43306y = coroutineScope;
        this.f43307z = z4;
        this.f43288A = tracer;
        this.f43289B = c11583b0;
        this.f43290C = c20378c;
        this.f43291D = AbstractC13091v.m36593c(Boolean.TRUE);
        this.f43293F = new ConcurrentHashMap();
        this.f43294G = new ConcurrentHashMap();
        this.f43295H = new ConcurrentHashMap();
        this.f43296I = new ConcurrentHashMap();
        this.f43297J = new ConcurrentHashMap();
        this.f43298K = new C26377x1(coroutineScope);
        this.f43299L = new ConcurrentHashMap();
        this.f43300M = new ConcurrentHashMap();
        this.f43301N = new ArrayList();
        EnumC11916a enumC11916a = EnumC11916a.f38983x;
        this.f43302O = AbstractC13091v.m36591a(1, 100, enumC11916a);
        this.f43303P = AbstractC13091v.m36591a(0, 100, enumC11916a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m35424n(String str, AbstractC32269c abstractC32269c) {
        C12648o0 c12648o0;
        Object objM78095c;
        C12662v0 c12662v0;
        if (abstractC32269c instanceof C12648o0) {
            c12648o0 = (C12648o0) abstractC32269c;
            int i13 = c12648o0.f43211z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12648o0.f43211z = i13 - Integer.MIN_VALUE;
            } else {
                c12648o0 = new C12648o0(this, abstractC32269c);
            }
        } else {
            c12648o0 = new C12648o0(this, abstractC32269c);
        }
        Object obj = c12648o0.f43209x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12648o0.f43211z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C12650p0 c12650p0 = new C12650p0(str, this, null);
            c12648o0.f43208w = this;
            c12648o0.f43211z = 1;
            objM78095c = this.f43298K.m78095c("subscriberNegotiate", c12650p0, c12648o0);
            if (objM78095c == enumC31071a) {
                return enumC31071a;
            }
            c12662v0 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12662v0 = c12648o0.f43208w;
            AbstractC34132o.m107864I(obj);
            objM78095c = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM78095c);
        if (thM68037a != null) {
            C23372m c23372m = c12662v0.f43288A;
            String message = thM68037a.getMessage();
            if (message == null) {
                message = "unknown";
            }
            c23372m.m67653b(message, "negotiate-error-submit");
        }
        return objM78095c;
    }

    /* JADX INFO: renamed from: o */
    public final void m35425o(MediaStream mediaStream) {
        CharSequence charSequence;
        AbstractC22676k.m65750j(mediaStream, "mediaStream");
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM35417f.f9273a)) {
            c2345kM35417f.f9274b.log(enumC2341g, c2345kM35417f.f9273a, "[addStream] #sfu; #track; mediaStream: " + mediaStream, null);
        }
        if (this.f43299L.isEmpty()) {
            C2345k c2345kM35417f2 = m35417f();
            if (c2345kM35417f2.f9275c.isLoggable(enumC2341g, c2345kM35417f2.f9273a)) {
                c2345kM35417f2.f9274b.log(enumC2341g, c2345kM35417f2.f9273a, "[addStream] #sfu; #track; trackPrefixToSessionIdMap is empty, adding to pending", null);
            }
            synchronized (this.f43301N) {
                this.f43301N.add(mediaStream);
            }
            return;
        }
        String id4 = mediaStream.getId();
        AbstractC22676k.m65749i(id4, "getId(...)");
        List listM125905x0 = AbstractC39414r.m125905x0(id4, new char[]{':'}, 0, 6);
        String str = (String) listM125905x0.get(0);
        String str2 = (String) listM125905x0.get(1);
        C2345k c2345kM35417f3 = m35417f();
        if (c2345kM35417f3.f9275c.isLoggable(enumC2341g, c2345kM35417f3.f9273a)) {
            c2345kM35417f3.f9274b.log(enumC2341g, c2345kM35417f3.f9273a, AbstractC31061c.m95640p("[addStream] #sfu; #track; trackPrefix: ", str, ", trackTypeString: ", str2), null);
        }
        String str3 = (String) this.f43299L.get(str);
        if (str3 == null || (charSequence = (CharSequence) this.f43299L.get(str)) == null || charSequence.length() == 0) {
            C2345k c2345kM35417f4 = m35417f();
            if (c2345kM35417f4.f9275c.isLoggable(enumC2341g, c2345kM35417f4.f9273a)) {
                c2345kM35417f4.f9274b.log(enumC2341g, c2345kM35417f4.f9273a, "[addStream] skipping unrecognized trackPrefix " + str + " " + mediaStream + ".id", null);
                return;
            }
            return;
        }
        TrackType trackTypeFromValue = (TrackType) AbstractC25247g0.m73990Y(new C23465k("TRACK_TYPE_UNSPECIFIED", TrackType.TRACK_TYPE_UNSPECIFIED), new C23465k("TRACK_TYPE_AUDIO", TrackType.TRACK_TYPE_AUDIO), new C23465k("TRACK_TYPE_VIDEO", TrackType.TRACK_TYPE_VIDEO), new C23465k("TRACK_TYPE_SCREEN_SHARE", TrackType.TRACK_TYPE_SCREEN_SHARE), new C23465k("TRACK_TYPE_SCREEN_SHARE_AUDIO", TrackType.TRACK_TYPE_SCREEN_SHARE_AUDIO)).get(str2);
        if (trackTypeFromValue == null && (trackTypeFromValue = TrackType.INSTANCE.fromValue(Integer.parseInt(str2))) == null) {
            throw new IllegalStateException(AbstractC11266d.m30461o("trackType not recognized: ", str2));
        }
        C2345k c2345kM35417f5 = m35417f();
        InterfaceC2339e interfaceC2339e2 = c2345kM35417f5.f9275c;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM35417f5.f9273a)) {
            c2345kM35417f5.f9274b.log(enumC2341g2, c2345kM35417f5.f9273a, "[addStream] #sfu; mediaStream: " + mediaStream, null);
        }
        List<AudioTrack> audioTracks = mediaStream.audioTracks;
        AbstractC22676k.m65749i(audioTracks, "audioTracks");
        for (AudioTrack audioTrack : audioTracks) {
            C2345k c2345kM35417f6 = m35417f();
            InterfaceC2339e interfaceC2339e3 = c2345kM35417f6.f9275c;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM35417f6.f9273a)) {
                InterfaceC2344j interfaceC2344j = c2345kM35417f6.f9274b;
                String str4 = c2345kM35417f6.f9273a;
                AbstractC22676k.m65747g(audioTrack);
                interfaceC2344j.log(enumC2341g3, str4, AbstractC11266d.m30461o("[addStream] #sfu; audioTrack: ", AbstractC28824q.m87680a(audioTrack)), null);
            }
            audioTrack.setEnabled(true);
            String id5 = mediaStream.getId();
            AbstractC22676k.m65749i(id5, "getId(...)");
            C4185a c4185a = new C4185a(id5, audioTrack);
            ConcurrentHashMap concurrentHashMap = this.f43300M;
            String strM85628id = audioTrack.m85628id();
            AbstractC22676k.m65749i(strM85628id, "id(...)");
            concurrentHashMap.put(strM85628id, str3);
            ConcurrentHashMap concurrentHashMap2 = this.f43296I;
            String strM85628id2 = audioTrack.m85628id();
            AbstractC22676k.m65749i(strM85628id2, "id(...)");
            concurrentHashMap2.put(strM85628id2, trackTypeFromValue);
            String strM85628id3 = audioTrack.m85628id();
            AbstractC22676k.m65749i(strM85628id3, "id(...)");
            m35423m(trackTypeFromValue, strM85628id3, AbstractC37056f.m118958J(mediaStream.getId()));
            m35427q(str3, trackTypeFromValue, c4185a);
            this.f43302O.mo36564a(new C12642l0(str3, trackTypeFromValue, c4185a));
        }
        List<VideoTrack> videoTracks = mediaStream.videoTracks;
        AbstractC22676k.m65749i(videoTracks, "videoTracks");
        for (VideoTrack videoTrack : videoTracks) {
            C2345k c2345kM35417f7 = m35417f();
            InterfaceC2339e interfaceC2339e4 = c2345kM35417f7.f9275c;
            EnumC2341g enumC2341g4 = EnumC2341g.WARN;
            if (interfaceC2339e4.isLoggable(enumC2341g4, c2345kM35417f7.f9273a)) {
                InterfaceC2344j interfaceC2344j2 = c2345kM35417f7.f9274b;
                String str5 = c2345kM35417f7.f9273a;
                AbstractC22676k.m65747g(videoTrack);
                interfaceC2344j2.log(enumC2341g4, str5, AbstractC11266d.m30461o("[addStream] #sfu; #track; videoTrack: ", AbstractC28824q.m87680a(videoTrack)), null);
            }
            videoTrack.setEnabled(true);
            String id6 = mediaStream.getId();
            AbstractC22676k.m65749i(id6, "getId(...)");
            C4207w c4207w = new C4207w(id6, videoTrack);
            ConcurrentHashMap concurrentHashMap3 = this.f43300M;
            String strM85628id4 = videoTrack.m85628id();
            AbstractC22676k.m65749i(strM85628id4, "id(...)");
            concurrentHashMap3.put(strM85628id4, str3);
            ConcurrentHashMap concurrentHashMap4 = this.f43296I;
            String strM85628id5 = videoTrack.m85628id();
            AbstractC22676k.m65749i(strM85628id5, "id(...)");
            concurrentHashMap4.put(strM85628id5, trackTypeFromValue);
            String strM85628id6 = videoTrack.m85628id();
            AbstractC22676k.m65749i(strM85628id6, "id(...)");
            m35423m(trackTypeFromValue, strM85628id6, AbstractC37056f.m118958J(mediaStream.getId()));
            m35427q(str3, trackTypeFromValue, c4207w);
            this.f43302O.mo36564a(new C12642l0(str3, trackTypeFromValue, c4207w));
        }
    }

    @Override // e33.C12659u, org.webrtc.PeerConnection.Observer
    public final void onAddStream(MediaStream mediaStream) {
        super.onAddStream(mediaStream);
        if (mediaStream != null) {
            m35425o(mediaStream);
            return;
        }
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        String str = c2345kM35417f.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onAddStream] #sfu; #track; stream is null", null);
        }
    }

    @Override // e33.C12659u, org.webrtc.PeerConnection.Observer
    public final void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        super.onIceConnectionChange(iceConnectionState);
        int i13 = iceConnectionState == null ? -1 : AbstractC12646n0.f43202a[iceConnectionState.ordinal()];
        C20378c c20378c = this.f43290C;
        if (i13 == 1) {
            C2996c2 c2996c2 = (C2996c2) c20378c.f76423y;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
                return;
            }
            return;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                return;
            }
            c20378c.m56582E(new C12654r0(this, null));
        } else {
            C12652q0 c12652q0 = new C12652q0(this, null);
            c20378c.getClass();
            c20378c.m56582E(c12652q0);
        }
    }

    @Override // e33.C12659u, org.webrtc.PeerConnection.Observer
    public final void onRemoveStream(MediaStream mediaStream) {
        C13096w1 c13096w1;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        C12662v0 c12662v0 = this;
        super.onRemoveStream(mediaStream);
        if (mediaStream == null) {
            return;
        }
        C2345k c2345kM35417f = c12662v0.m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        String str = c2345kM35417f.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onRemoveStream] #sfu; #track; #orphaned-track; stream: " + mediaStream, null);
        }
        List<AudioTrack> audioTracks = mediaStream.audioTracks;
        AbstractC22676k.m65749i(audioTracks, "audioTracks");
        Iterator<T> it = audioTracks.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c13096w1 = c12662v0.f43303P;
            concurrentHashMap = c12662v0.f43297J;
            concurrentHashMap2 = c12662v0.f43296I;
            concurrentHashMap3 = c12662v0.f43300M;
            if (!zHasNext) {
                break;
            }
            String strM85628id = ((AudioTrack) it.next()).m85628id();
            String str2 = (String) concurrentHashMap3.get(strM85628id);
            TrackType trackType = (TrackType) concurrentHashMap2.get(strM85628id);
            if (str2 == null || trackType == null) {
                C2345k c2345kM35417f2 = m35417f();
                InterfaceC2339e interfaceC2339e2 = c2345kM35417f2.f9275c;
                String str3 = c2345kM35417f2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.WARN;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                    c2345kM35417f2.f9274b.log(enumC2341g2, str3, AbstractC11266d.m30461o("[onRemoveStream] #sfu; #track; #orphaned-track; Could not find sessionId or trackType for removed audio track: ", strM85628id), null);
                }
            } else {
                C2345k c2345kM35417f3 = c12662v0.m35417f();
                InterfaceC2339e interfaceC2339e3 = c2345kM35417f3.f9275c;
                String str4 = c2345kM35417f3.f9273a;
                EnumC2341g enumC2341g3 = EnumC2341g.INFO;
                if (interfaceC2339e3.isLoggable(enumC2341g3, str4)) {
                    c2345kM35417f3.f9274b.log(enumC2341g3, str4, "[onRemoveStream] #sfu; #track; #orphaned-track; Removing audio track for sessionId=" + str2 + ", trackType=" + trackType + ", trackId=" + strM85628id, null);
                }
                ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) concurrentHashMap.get(str2);
                if (concurrentHashMap4 != null) {
                }
                concurrentHashMap3.remove(strM85628id);
                concurrentHashMap2.remove(strM85628id);
                c13096w1.mo36564a(new C12644m0(str2, trackType));
            }
            c12662v0 = this;
        }
        List<VideoTrack> videoTracks = mediaStream.videoTracks;
        AbstractC22676k.m65749i(videoTracks, "videoTracks");
        Iterator<T> it3 = videoTracks.iterator();
        while (it3.hasNext()) {
            String strM85628id2 = ((VideoTrack) it3.next()).m85628id();
            String str5 = (String) concurrentHashMap3.get(strM85628id2);
            TrackType trackType2 = (TrackType) concurrentHashMap2.get(strM85628id2);
            if (str5 == null || trackType2 == null) {
                C2345k c2345kM35417f4 = m35417f();
                InterfaceC2339e interfaceC2339e4 = c2345kM35417f4.f9275c;
                String str6 = c2345kM35417f4.f9273a;
                EnumC2341g enumC2341g4 = EnumC2341g.WARN;
                if (interfaceC2339e4.isLoggable(enumC2341g4, str6)) {
                    c2345kM35417f4.f9274b.log(enumC2341g4, str6, AbstractC11266d.m30461o("[onRemoveStream] #sfu; #track; #orphaned-track; Could not find sessionId or trackType for removed video track: ", strM85628id2), null);
                }
            } else {
                C2345k c2345kM35417f5 = m35417f();
                InterfaceC2339e interfaceC2339e5 = c2345kM35417f5.f9275c;
                String str7 = c2345kM35417f5.f9273a;
                EnumC2341g enumC2341g5 = EnumC2341g.INFO;
                if (interfaceC2339e5.isLoggable(enumC2341g5, str7)) {
                    c2345kM35417f5.f9274b.log(enumC2341g5, str7, "[onRemoveStream] #sfu; #track; #orphaned-track; Removing video track for sessionId=" + str5 + ", trackType=" + trackType2 + ", trackId=" + strM85628id2, null);
                }
                ConcurrentHashMap concurrentHashMap5 = (ConcurrentHashMap) concurrentHashMap.get(str5);
                if (concurrentHashMap5 != null) {
                }
                concurrentHashMap3.remove(strM85628id2);
                concurrentHashMap2.remove(strM85628id2);
                c13096w1.mo36564a(new C12644m0(str5, trackType2));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m35426p(AbstractC32269c abstractC32269c) {
        C12656s0 c12656s0;
        Throwable th3;
        C12662v0 c12662v0;
        InterfaceC2339e interfaceC2339e;
        EnumC2341g enumC2341g;
        Object c26203f;
        String message;
        if (abstractC32269c instanceof C12656s0) {
            c12656s0 = (C12656s0) abstractC32269c;
            int i13 = c12656s0.f43247z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12656s0.f43247z = i13 - Integer.MIN_VALUE;
            } else {
                c12656s0 = new C12656s0(this, abstractC32269c);
            }
        } else {
            c12656s0 = new C12656s0(this, abstractC32269c);
        }
        Object objIceRestart = c12656s0.f43245x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12656s0.f43247z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objIceRestart);
                try {
                    ICERestartRequest iCERestartRequest = new ICERestartRequest(this.f43304w, PeerType.PEER_TYPE_SUBSCRIBER, null, 4, null);
                    SignalServerService signalServerService = this.f43305x;
                    c12656s0.f43244w = this;
                    c12656s0.f43247z = 1;
                    objIceRestart = signalServerService.iceRestart(iCERestartRequest, c12656s0);
                    if (objIceRestart == enumC31071a) {
                        return enumC31071a;
                    }
                    c12662v0 = this;
                } catch (Throwable th4) {
                    th3 = th4;
                    c12662v0 = this;
                    C2343i c2343i = C2343i.f9269a;
                    interfaceC2339e = C2343i.f9272d;
                    enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, "SafeApiCall")) {
                        C2343i.f9271c.log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th3.getMessage()), th3);
                    }
                    message = th3.getMessage();
                    if (message == null) {
                        message = "API call failed";
                    }
                    c26203f = new C26203f(new C26201d(message, th3));
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c12662v0 = c12656s0.f43244w;
                try {
                    AbstractC34132o.m107864I(objIceRestart);
                } catch (Throwable th5) {
                    th3 = th5;
                    C2343i c2343i2 = C2343i.f9269a;
                    interfaceC2339e = C2343i.f9272d;
                    enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, "SafeApiCall")) {
                        C2343i.f9271c.log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th3.getMessage()), th3);
                    }
                    message = th3.getMessage();
                    if (message == null) {
                        message = "API call failed";
                    }
                    c26203f = new C26203f(new C26201d(message, th3));
                }
            }
            c26203f = new C26204g(objIceRestart);
            if (!(c26203f instanceof C26204g)) {
                if (!(c26203f instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) c26203f).f103918a;
                C23372m c23372m = c12662v0.f43288A;
                String strMo77807a = abstractC26202e.mo77807a();
                if (strMo77807a == null) {
                    strMo77807a = "unknown";
                }
                c23372m.m67653b(strMo77807a, "iceRestart-error");
                C2996c2 c2996c2 = (C2996c2) c12662v0.f43290C.f76423y;
                if (c2996c2 != null) {
                    c2996c2.cancel((CancellationException) null);
                }
            }
            return c26203f;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m35427q(String sessionId, TrackType type, AbstractC4191g abstractC4191g) {
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(type, "type");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = this.f43297J;
        concurrentHashMap2.putIfAbsent(sessionId, concurrentHashMap);
        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap2.get(sessionId);
        if (concurrentHashMap3 != null) {
            concurrentHashMap3.put(type, abstractC4191g);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m35428r(AbstractC32269c abstractC32269c) {
        C12660u0 c12660u0;
        if (abstractC32269c instanceof C12660u0) {
            c12660u0 = (C12660u0) abstractC32269c;
            int i13 = c12660u0.f43285y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12660u0.f43285y = i13 - Integer.MIN_VALUE;
            } else {
                c12660u0 = new C12660u0(this, abstractC32269c);
            }
        } else {
            c12660u0 = new C12660u0(this, abstractC32269c);
        }
        Object objM8773r = c12660u0.f43283w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12660u0.f43285y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8773r);
                C2570m c2570m = this.f43282v;
                if (c2570m == null) {
                    return null;
                }
                ConcurrentHashMap concurrentHashMap = this.f43296I;
                c12660u0.f43285y = 1;
                C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c12660u0));
                c3033m.m8774s();
                ((PeerConnection) c2570m.f9987x).getStats(new C15990r(c2570m, concurrentHashMap, c3033m, 4));
                objM8773r = c3033m.m8773r();
                if (objM8773r == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8773r);
            }
            return (C16831a) objM8773r;
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (!interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                return null;
            }
            C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final LinkedHashMap m35429s() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.f43293F.entrySet().iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
