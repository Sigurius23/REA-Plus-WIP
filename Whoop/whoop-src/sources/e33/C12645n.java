package e33;

import a20.C0162b;
import a33.C0351c;
import androidx.room.C1836v0;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import b30.C2570m;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import c43.EnumC4206v;
import c93.InterfaceC4339a;
import d33.C11580a0;
import ge3.AbstractC15751g;
import gm.C15990r;
import h33.C16831a;
import i33.C18057a;
import i33.C18058b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.video.android.core.api.SignalServerService;
import io.sentry.internal.debugmeta.C20378c;
import j33.AbstractC21298b;
import j33.AbstractC21300d;
import j33.C21299c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.CancellationException;
import l53.C23372m;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.AbstractC26313c0;
import n53.C26305a0;
import n53.C26306a1;
import n53.C26309b0;
import n53.C26310b1;
import n53.C26314c1;
import n53.C26316d0;
import n53.C26317d1;
import n53.C26319e0;
import n53.C26320e1;
import n53.C26322f0;
import n53.C26323f1;
import n53.C26325g0;
import n53.C26326g1;
import n53.C26327h;
import n53.C26328h0;
import n53.C26329h1;
import n53.C26330i;
import n53.C26331i0;
import n53.C26332i1;
import n53.C26333j;
import n53.C26334j0;
import n53.C26335j1;
import n53.C26336k;
import n53.C26337k0;
import n53.C26338k1;
import n53.C26339l;
import n53.C26340l0;
import n53.C26341l1;
import n53.C26342m;
import n53.C26343m0;
import n53.C26344m1;
import n53.C26345n;
import n53.C26346n0;
import n53.C26347n1;
import n53.C26348o;
import n53.C26349o0;
import n53.C26350o1;
import n53.C26351p;
import n53.C26352p0;
import n53.C26353p1;
import n53.C26354q;
import n53.C26355q0;
import n53.C26356q1;
import n53.C26357r;
import n53.C26358r0;
import n53.C26359r1;
import n53.C26360s;
import n53.C26361s0;
import n53.C26362s1;
import n53.C26363t;
import n53.C26364t0;
import n53.C26365t1;
import n53.C26366u;
import n53.C26367u0;
import n53.C26368u1;
import n53.C26369v;
import n53.C26370v0;
import n53.C26372w;
import n53.C26373w0;
import n53.C26375x;
import n53.C26376x0;
import n53.C26377x1;
import n53.C26378y;
import n53.C26379y0;
import n53.C26381z;
import n53.C26382z0;
import org.webrtc.AudioTrack;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpParameters;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.SessionDescription;
import org.webrtc.VideoSource;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q33.C29954b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sc3.AbstractC32398l;
import stream.video.sfu.models.AudioBitrate;
import stream.video.sfu.models.AudioBitrateProfile;
import stream.video.sfu.models.Codec;
import stream.video.sfu.models.PublishOption;
import stream.video.sfu.models.TrackInfo;
import stream.video.sfu.models.TrackType;
import stream.video.sfu.models.VideoDimension;
import stream.video.sfu.models.VideoLayer;
import stream.video.sfu.models.VideoQuality;
import t23.C33476x1;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.C39408l;
import yb3.C39410n;

/* JADX INFO: renamed from: e33.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C12645n extends C12659u {

    /* JADX INFO: renamed from: A */
    public final int f43185A;

    /* JADX INFO: renamed from: B */
    public final SignalServerService f43186B;

    /* JADX INFO: renamed from: C */
    public final String f43187C;

    /* JADX INFO: renamed from: D */
    public final InterfaceC4339a f43188D;

    /* JADX INFO: renamed from: E */
    public final InterfaceC4339a f43189E;

    /* JADX INFO: renamed from: F */
    public final C20378c f43190F;

    /* JADX INFO: renamed from: G */
    public final C23372m f43191G;

    /* JADX INFO: renamed from: H */
    public final C20378c f43192H;

    /* JADX INFO: renamed from: I */
    public final CameraEnumerationAndroid.CaptureFormat f43193I;

    /* JADX INFO: renamed from: J */
    public final CameraEnumerationAndroid.CaptureFormat f43194J;

    /* JADX INFO: renamed from: K */
    public boolean f43195K;

    /* JADX INFO: renamed from: L */
    public final C26377x1 f43196L;

    /* JADX INFO: renamed from: M */
    public final C15990r f43197M;

    /* JADX INFO: renamed from: w */
    public final C33476x1 f43198w;

    /* JADX INFO: renamed from: x */
    public final C12638j0 f43199x;

    /* JADX INFO: renamed from: y */
    public final List f43200y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC2994c0 f43201z;

    public C12645n(C33476x1 c33476x1, C12638j0 c12638j0, List publishOptions, InterfaceC2994c0 coroutineScope, MediaConstraints mediaConstraints, C1836v0 c1836v0, SignalServerService sfuClient, String sessionId, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C23372m tracer) {
        EnumC4206v enumC4206v = EnumC4206v.f17063w;
        C20378c c20378c = new C20378c(19, (byte) 0);
        C20378c c20378c2 = new C20378c(coroutineScope);
        AbstractC22676k.m65750j(publishOptions, "publishOptions");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(mediaConstraints, "mediaConstraints");
        AbstractC22676k.m65750j(sfuClient, "sfuClient");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(tracer, "tracer");
        super(enumC4206v, mediaConstraints, null, C11580a0.f37358w, c1836v0, interfaceC4339a, interfaceC4339a2, 1200000, true, tracer, "Publisher");
        this.f43198w = c33476x1;
        this.f43199x = c12638j0;
        this.f43200y = publishOptions;
        this.f43201z = coroutineScope;
        this.f43185A = 1200000;
        this.f43186B = sfuClient;
        this.f43187C = sessionId;
        this.f43188D = interfaceC4339a;
        this.f43189E = interfaceC4339a2;
        this.f43190F = c20378c;
        this.f43191G = tracer;
        this.f43192H = c20378c2;
        this.f43193I = new CameraEnumerationAndroid.CaptureFormat(1280, 720, 24, 30);
        this.f43194J = new CameraEnumerationAndroid.CaptureFormat(1280, 720, 24, 30);
        this.f43196L = new C26377x1(coroutineScope);
        this.f43197M = new C15990r(coroutineScope);
    }

    /* JADX INFO: renamed from: A */
    public final void m35397A(TrackType trackType) {
        C20378c c20378c = this.f43190F;
        c20378c.getClass();
        AbstractC22676k.m65750j(trackType, "trackType");
        ArrayList arrayListM56595x = c20378c.m56595x();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM56595x) {
            if (((C18058b) obj).f70143a.getTrack_type() == trackType) {
                arrayList.add(obj);
            }
        }
        ArrayList<RtpTransceiver> arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C18058b) it.next()).f70144b);
        }
        for (RtpTransceiver rtpTransceiver : arrayList2) {
            C2345k c2345kM35417f = m35417f();
            InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
            String str = c2345kM35417f.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM35417f.f9274b.log(enumC2341g, str, "[trackPublishing] Unpublishing track: " + trackType, null);
            }
            MediaStreamTrack mediaStreamTrackTrack = rtpTransceiver.getSender().track();
            if (mediaStreamTrackTrack != null) {
                AbstractC32398l.m100981n(mediaStreamTrackTrack, false);
                this.f43270j.m67653b(trackType + ":" + mediaStreamTrackTrack.m85628id() + ":" + C23454a0.f92919a, "unpublishtrack");
                m35403s(mediaStreamTrackTrack);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX INFO: renamed from: n */
    public final void m35398n(List list, CameraEnumerationAndroid.CaptureFormat captureFormat, MediaStreamTrack mediaStreamTrack, PublishOption publishOption) {
        VideoDimension video_dimension;
        List listM118958J;
        Object next;
        Object next2;
        Object next3;
        List listM118958J2;
        List listM118958J3;
        List listM118958J4;
        RtpParameters parameters;
        List<RtpParameters.Encoding> list2;
        String str;
        Object next4;
        C12623c c12623c = new C12623c(this);
        Object obj = AbstractC21300d.f81385a;
        if (AbstractC21300d.m59805b(publishOption.getTrack_type())) {
            RtpParameters.Encoding encoding = new RtpParameters.Encoding(null, true, null);
            AudioBitrateProfile audioBitrateProfile = (AudioBitrateProfile) c12623c.invoke();
            if (audioBitrateProfile != null) {
                Iterator it = publishOption.getAudio_bitrate_profiles().iterator();
                do {
                    if (!it.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it.next();
                } while (((AudioBitrate) next4).getProfile() != audioBitrateProfile);
                AudioBitrate audioBitrate = (AudioBitrate) next4;
                if (audioBitrate != null) {
                    encoding.maxBitrateBps = Integer.valueOf(audioBitrate.getBitrate());
                }
            }
            listM118958J = AbstractC37056f.m118958J(encoding);
        } else {
            if (captureFormat != null) {
                video_dimension = AbstractC21300d.m59808e(captureFormat);
            } else {
                video_dimension = publishOption.getVideo_dimension();
                if (video_dimension == null) {
                    video_dimension = new VideoDimension(1280, 720, null, 4, null);
                }
            }
            ?? M59804a = AbstractC21300d.m59804a(video_dimension, publishOption);
            Codec codec = publishOption.getCodec();
            if (AbstractC21300d.m59806c(codec != null ? codec.getName() : null)) {
                Iterator it3 = M59804a.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!AbstractC22676k.m65745e(((C21299c) next).f81377b, "f"));
                C21299c c21299c = (C21299c) next;
                Iterator it4 = M59804a.iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (!AbstractC22676k.m65745e(((C21299c) next2).f81377b, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT));
                C21299c c21299c2 = (C21299c) next2;
                Iterator it5 = M59804a.iterator();
                do {
                    if (!it5.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it5.next();
                } while (!AbstractC22676k.m65745e(((C21299c) next3).f81377b, "q"));
                C21299c c21299c3 = (C21299c) next3;
                if (c21299c != null) {
                    listM118958J4 = AbstractC37056f.m118958J(C21299c.m59803a(c21299c, "q", 253));
                } else if (c21299c2 != null) {
                    listM118958J3 = AbstractC37056f.m118958J(C21299c.m59803a(c21299c2, "q", 253));
                } else if (c21299c3 != null) {
                    listM118958J2 = AbstractC37056f.m118958J(C21299c.m59803a(c21299c3, null, 255));
                } else {
                    M59804a = 0;
                }
                if (M59804a == 0) {
                    M59804a = listM118958J2;
                    M59804a = listM118958J3;
                    M59804a = listM118958J4;
                    M59804a = C25271y.f99162w;
                }
            }
            M59804a = listM118958J2;
            M59804a = listM118958J3;
            M59804a = listM118958J4;
            Iterable<C21299c> iterable = (Iterable) M59804a;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (C21299c c21299c4 : iterable) {
                RtpParameters.Encoding encoding2 = new RtpParameters.Encoding(c21299c4.f81377b, c21299c4.f81376a, c21299c4.f81383h);
                encoding2.scalabilityMode = c21299c4.f81382g;
                encoding2.maxBitrateBps = Integer.valueOf(c21299c4.f81380e);
                int i13 = c21299c4.f81381f;
                if (i13 == null) {
                    i13 = 30;
                }
                encoding2.maxFramerate = i13;
                encoding2.numTemporalLayers = Integer.valueOf(publishOption.getMax_temporal_layers());
                arrayList.add(encoding2);
            }
            listM118958J = arrayList;
        }
        try {
            C2345k c2345kM35417f = m35417f();
            InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
            String str2 = c2345kM35417f.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                c2345kM35417f.f9274b.log(enumC2341g, str2, "Adding " + publishOption.getTrack_type() + " transceiver. (trackID: " + mediaStreamTrack.m85628id() + ", sendEncodings: " + listM118958J + ")", null);
            }
            C2345k c2345kM35417f2 = m35417f();
            InterfaceC2339e interfaceC2339e2 = c2345kM35417f2.f9275c;
            String str3 = c2345kM35417f2.f9273a;
            if (interfaceC2339e2.isLoggable(enumC2341g, str3)) {
                InterfaceC2344j interfaceC2344j = c2345kM35417f2.f9274b;
                if (captureFormat != null) {
                    str = captureFormat.width + "x" + captureFormat.height + "@" + captureFormat.framerate + "fps";
                    if (str == null) {
                        str = "null";
                    }
                } else {
                    str = "null";
                }
                interfaceC2344j.log(enumC2341g, str3, "Transceiver init details - captureFormat: " + str + ", publishOption: " + publishOption.getTrack_type() + ", encodings count: " + listM118958J.size(), null);
            }
            int i14 = 0;
            for (Object obj2 : listM118958J) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                RtpParameters.Encoding encoding3 = (RtpParameters.Encoding) obj2;
                C2345k c2345kM35417f3 = m35417f();
                InterfaceC2339e interfaceC2339e3 = c2345kM35417f3.f9275c;
                String str4 = c2345kM35417f3.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e3.isLoggable(enumC2341g2, str4)) {
                    c2345kM35417f3.f9274b.log(enumC2341g2, str4, "  Encoding[" + i14 + "]: " + AbstractC21300d.m59807d(encoding3), null);
                }
                i14 = i15;
            }
            RtpTransceiver rtpTransceiverAddTransceiver = m35416e().addTransceiver(mediaStreamTrack, new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, list, listM118958J));
            AbstractC22676k.m65747g(rtpTransceiverAddTransceiver);
            m35399o(rtpTransceiverAddTransceiver, publishOption);
            C2345k c2345kM35417f4 = m35417f();
            InterfaceC2339e interfaceC2339e4 = c2345kM35417f4.f9275c;
            String str5 = c2345kM35417f4.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e4.isLoggable(enumC2341g3, str5)) {
                InterfaceC2344j interfaceC2344j2 = c2345kM35417f4.f9274b;
                TrackType track_type = publishOption.getTrack_type();
                String strM85628id = mediaStreamTrack.m85628id();
                RtpSender sender = rtpTransceiverAddTransceiver.getSender();
                interfaceC2344j2.log(enumC2341g3, str5, "Added " + track_type + " transceiver. (trackID: " + strM85628id + ", encodings: " + ((sender == null || (parameters = sender.getParameters()) == null || (list2 = parameters.encodings) == null) ? null : AbstractC25265s.m74110N0(list2, null, null, null, C12621b.f43120w, 31)) + ")", null);
            }
            C20378c c20378c = this.f43190F;
            c20378c.getClass();
            Map cache = (Map) c20378c.f76422x;
            AbstractC22676k.m65749i(cache, "cache");
            cache.put(C20378c.m56577y(publishOption), new C18058b(rtpTransceiverAddTransceiver, publishOption));
        } catch (Exception e5) {
            C2345k c2345kM35417f5 = m35417f();
            InterfaceC2339e interfaceC2339e5 = c2345kM35417f5.f9275c;
            String str6 = c2345kM35417f5.f9273a;
            EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
            if (interfaceC2339e5.isLoggable(enumC2341g4, str6)) {
                c2345kM35417f5.f9274b.log(enumC2341g4, str6, "Failed to add transceiver for " + publishOption.getTrack_type(), e5);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m35399o(RtpTransceiver rtpTransceiver, PublishOption publishOption) {
        RtpParameters parameters;
        RtpParameters.DegradationPreference degradationPreferenceM59802a = AbstractC21298b.m59802a(publishOption.getDegradation_preference());
        if (degradationPreferenceM59802a == null) {
            return;
        }
        try {
            RtpSender sender = rtpTransceiver.getSender();
            if (sender == null || (parameters = sender.getParameters()) == null || parameters.degradationPreference == degradationPreferenceM59802a) {
                return;
            }
            parameters.degradationPreference = degradationPreferenceM59802a;
            sender.setParameters(parameters);
            C2345k c2345kM35417f = m35417f();
            InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, c2345kM35417f.f9273a)) {
                c2345kM35417f.f9274b.log(enumC2341g, c2345kM35417f.f9273a, "Applied initial degradationPreference=" + degradationPreferenceM59802a + " for " + publishOption.getTrack_type() + " (publishOptionId=" + publishOption.getId() + ")", null);
            }
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
    }

    @Override // e33.C12659u, org.webrtc.PeerConnection.Observer
    public final void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        super.onIceConnectionChange(iceConnectionState);
        int i13 = iceConnectionState == null ? -1 : AbstractC12619a.f43117a[iceConnectionState.ordinal()];
        C20378c c20378c = this.f43192H;
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
            c20378c.m56582E(new C12635i(this, null));
        } else {
            C12633h c12633h = new C12633h(this, null);
            c20378c.getClass();
            c20378c.m56582E(c12633h);
        }
    }

    @Override // e33.C12659u, org.webrtc.PeerConnection.Observer
    public final void onRenegotiationNeeded() {
        AbstractC3006f0.m8732z(this.f43201z, null, null, new C0162b(this, null, 13), 3);
    }

    /* JADX INFO: renamed from: p */
    public final void m35400p() {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM35417f.f9273a)) {
            c2345kM35417f.f9274b.log(enumC2341g, c2345kM35417f.f9273a, "Stopping publishing all tracks", null);
        }
        Iterator it = this.f43190F.m56595x().iterator();
        while (it.hasNext()) {
            try {
                ((C18058b) it.next()).f70144b.stop();
            } catch (Exception e5) {
                C2343i c2343i = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
                EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                    C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
                }
            }
        }
        for (C18058b c18058b : this.f43190F.m56595x()) {
            try {
                c18058b.f70144b.stop();
            } catch (Exception e13) {
                C2345k c2345kM35417f2 = m35417f();
                InterfaceC2339e interfaceC2339e3 = c2345kM35417f2.f9275c;
                EnumC2341g enumC2341g3 = EnumC2341g.WARN;
                if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM35417f2.f9273a)) {
                    c2345kM35417f2.f9274b.log(enumC2341g3, c2345kM35417f2.f9273a, AbstractC11266d.m30461o("Transceiver already stopped: ", e13.getMessage()), null);
                }
            }
            try {
                c18058b.f70144b.dispose();
            } catch (Exception e14) {
                C2345k c2345kM35417f3 = m35417f();
                InterfaceC2339e interfaceC2339e4 = c2345kM35417f3.f9275c;
                EnumC2341g enumC2341g4 = EnumC2341g.WARN;
                if (interfaceC2339e4.isLoggable(enumC2341g4, c2345kM35417f3.f9273a)) {
                    c2345kM35417f3.f9274b.log(enumC2341g4, c2345kM35417f3.f9273a, AbstractC11266d.m30461o("Transceiver already disposed: ", e14.getMessage()), null);
                }
            }
        }
        m35413b();
    }

    /* JADX INFO: renamed from: q */
    public final List m35401q() {
        RandomAccess randomAccess = C25271y.f99162w;
        try {
            ArrayList arrayListM56595x = this.f43190F.m56595x();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM56595x, 10));
            Iterator it = arrayListM56595x.iterator();
            while (it.hasNext()) {
                arrayList.add(((C18058b) it.next()).f70143a);
            }
            randomAccess = arrayList;
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
        return (List) randomAccess;
    }

    /* JADX INFO: renamed from: r */
    public final ArrayList m35402r(CameraEnumerationAndroid.CaptureFormat captureFormat, String str) {
        ArrayList arrayList;
        synchronized (this) {
            if (str == null) {
                try {
                    SessionDescription sessionDescription = this.f43275o;
                    str = sessionDescription != null ? sessionDescription.description : null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            arrayList = new ArrayList();
            ArrayList arrayListM56595x = this.f43190F.m56595x();
            ArrayList<C18058b> arrayList2 = new ArrayList();
            for (Object obj : arrayListM56595x) {
                MediaStreamTrack mediaStreamTrackTrack = ((C18058b) obj).f70144b.getSender().track();
                if (mediaStreamTrackTrack != null && !mediaStreamTrackTrack.isDisposed()) {
                    arrayList2.add(obj);
                }
            }
            for (C18058b c18058b : arrayList2) {
                PublishOption publishOption = c18058b.f70143a;
                TrackInfo trackInfoM35410z = m35410z(captureFormat, c18058b.f70144b, publishOption, str);
                C2345k c2345kM35417f = m35417f();
                InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                if (interfaceC2339e.isLoggable(enumC2341g, c2345kM35417f.f9273a)) {
                    c2345kM35417f.f9274b.log(enumC2341g, c2345kM35417f.f9273a, "Announced track: " + publishOption + " -> " + trackInfoM35410z, null);
                }
                arrayList.add(trackInfoM35410z);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public final void m35403s(MediaStreamTrack mediaStreamTrack) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[trackPublishing] Track: " + Boolean.valueOf(mediaStreamTrack.enabled()) + ":" + mediaStreamTrack.state() + ":" + mediaStreamTrack.m85628id(), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m35404t(String str, boolean z4, AbstractC32269c abstractC32269c) {
        C12625d c12625d;
        if (abstractC32269c instanceof C12625d) {
            c12625d = (C12625d) abstractC32269c;
            int i13 = c12625d.f43126y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12625d.f43126y = i13 - Integer.MIN_VALUE;
            } else {
                c12625d = new C12625d(this, abstractC32269c);
            }
        } else {
            c12625d = new C12625d(this, abstractC32269c);
        }
        Object obj = c12625d.f43124w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12625d.f43126y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C12631g c12631g = new C12631g(this, z4, str, null);
        c12625d.f43126y = 1;
        Object objM78095c = this.f43196L.m78095c("publisherNegotiate", c12631g, c12625d);
        return objM78095c == enumC31071a ? enumC31071a : objM78095c;
    }

    /* JADX INFO: renamed from: u */
    public final MediaStreamTrack m35405u(TrackType trackType) {
        VideoSource videoSource;
        C33476x1 c33476x1 = this.f43198w;
        C12638j0 c12638j0 = this.f43199x;
        AbstractC22676k.m65750j(trackType, "trackType");
        int i13 = AbstractC12619a.f43118b[trackType.ordinal()];
        if (i13 == 1) {
            AudioTrack audioTrackCreateAudioTrack = c12638j0.m35393b().createAudioTrack(AbstractC11895b.m31995n("toString(...)"), c33476x1.m105873b());
            AbstractC22676k.m65749i(audioTrackCreateAudioTrack, "createAudioTrack(...)");
            return audioTrackCreateAudioTrack;
        }
        if (i13 == 2) {
            return c12638j0.m35396e(AbstractC11895b.m31995n("toString(...)"), c33476x1.m105874c());
        }
        if (i13 != 3) {
            throw new IllegalArgumentException("Unknown track type: " + trackType);
        }
        String strM31995n = AbstractC11895b.m31995n("toString(...)");
        synchronized (c33476x1.f139768p) {
            try {
                if (c33476x1.f139765m == null) {
                    C12638j0 c12638j0M105819j = c33476x1.f139754b.m105819j();
                    C29954b filterVideoProcessor = c33476x1.f139763k;
                    AbstractC22676k.m65750j(filterVideoProcessor, "filterVideoProcessor");
                    VideoSource videoSourceCreateVideoSource = c12638j0M105819j.m35393b().createVideoSource(true);
                    videoSourceCreateVideoSource.setVideoProcessor(filterVideoProcessor);
                    c33476x1.f139765m = videoSourceCreateVideoSource;
                }
                videoSource = c33476x1.f139765m;
                AbstractC22676k.m65747g(videoSource);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c12638j0.m35396e(strM31995n, videoSource);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m35406v(String str, TrackType trackType, CameraEnumerationAndroid.CaptureFormat captureFormat, AbstractC32269c abstractC32269c) {
        C12637j c12637j;
        Object objM78095c;
        if (abstractC32269c instanceof C12637j) {
            c12637j = (C12637j) abstractC32269c;
            int i13 = c12637j.f43150y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12637j.f43150y = i13 - Integer.MIN_VALUE;
            } else {
                c12637j = new C12637j(this, abstractC32269c);
            }
        } else {
            c12637j = new C12637j(this, abstractC32269c);
        }
        Object obj = c12637j.f43148w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12637j.f43150y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C12639k c12639k = new C12639k(this, str, trackType, captureFormat, null);
            c12637j.f43150y = 1;
            objM78095c = this.f43196L.m78095c("publishStream", c12639k, c12637j);
            if (objM78095c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM78095c = ((C23468n) obj).f92940w;
        }
        if (objM78095c instanceof C23467m) {
            return null;
        }
        return objM78095c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m35407w(String str, AbstractC32269c abstractC32269c) {
        C12641l c12641l;
        if (abstractC32269c instanceof C12641l) {
            c12641l = (C12641l) abstractC32269c;
            int i13 = c12641l.f43176y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12641l.f43176y = i13 - Integer.MIN_VALUE;
            } else {
                c12641l = new C12641l(this, abstractC32269c);
            }
        } else {
            c12641l = new C12641l(this, abstractC32269c);
        }
        Object obj = c12641l.f43174w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12641l.f43176y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C0351c c0351c = new C0351c(this, str, null, 4);
        c12641l.f43176y = 1;
        Object objM45148N = this.f43197M.m45148N("restartIce", c0351c, c12641l);
        return objM45148N == enumC31071a ? enumC31071a : objM45148N;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m35408x(AbstractC32269c abstractC32269c) {
        C12643m c12643m;
        if (abstractC32269c instanceof C12643m) {
            c12643m = (C12643m) abstractC32269c;
            int i13 = c12643m.f43182y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12643m.f43182y = i13 - Integer.MIN_VALUE;
            } else {
                c12643m = new C12643m(this, abstractC32269c);
            }
        } else {
            c12643m = new C12643m(this, abstractC32269c);
        }
        Object objM8773r = c12643m.f43180w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12643m.f43182y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8773r);
                C2570m c2570m = this.f43282v;
                if (c2570m != null) {
                    ArrayList<C18058b> arrayListM56595x = this.f43190F.m56595x();
                    int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayListM56595x, 10));
                    if (iM73988W < 16) {
                        iM73988W = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                    for (C18058b c18058b : arrayListM56595x) {
                        MediaStreamTrack mediaStreamTrackTrack = c18058b.f70144b.getSender().track();
                        linkedHashMap.put(mediaStreamTrackTrack != null ? mediaStreamTrackTrack.m85628id() : null, c18058b.f70143a.getTrack_type());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap2.size()));
                    for (Object obj : linkedHashMap2.entrySet()) {
                        Object key = ((Map.Entry) obj).getKey();
                        AbstractC22676k.m65747g(key);
                        linkedHashMap3.put((String) key, ((Map.Entry) obj).getValue());
                    }
                    c12643m.f43182y = 1;
                    C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c12643m));
                    c3033m.m8774s();
                    ((PeerConnection) c2570m.f9987x).getStats(new C15990r(c2570m, linkedHashMap3, c3033m, 4));
                    objM8773r = c3033m.m8773r();
                    EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                    if (objM8773r == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return null;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8773r);
            return (C16831a) objM8773r;
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m35409y(CameraEnumerationAndroid.CaptureFormat captureFormat, List publishOptions) {
        MediaStreamTrack mediaStreamTrackTrack;
        AbstractC22676k.m65750j(publishOptions, "publishOptions");
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM35417f.f9273a)) {
            c2345kM35417f.f9274b.log(enumC2341g, c2345kM35417f.f9273a, AbstractC11895b.m31998q("New publish options: ", publishOptions), null);
        }
        Iterator it = publishOptions.iterator();
        while (it.hasNext()) {
            PublishOption publishOption = (PublishOption) it.next();
            TrackType trackType = publishOption.getTrack_type();
            AbstractC22676k.m65750j(trackType, "trackType");
            Iterator it3 = this.f43190F.m56595x().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    C2345k c2345kM35417f2 = m35417f();
                    InterfaceC2339e interfaceC2339e2 = c2345kM35417f2.f9275c;
                    EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                    if (!interfaceC2339e2.isLoggable(enumC2341g2, c2345kM35417f2.f9273a)) {
                        break;
                    }
                    c2345kM35417f2.f9274b.log(enumC2341g2, c2345kM35417f2.f9273a, "Not publishing " + trackType, null);
                    break;
                }
                C18058b c18058b = (C18058b) it3.next();
                if (c18058b.f70143a.getTrack_type() == trackType && (mediaStreamTrackTrack = c18058b.f70144b.getSender().track()) != null && mediaStreamTrackTrack.state() == MediaStreamTrack.State.LIVE && mediaStreamTrackTrack.enabled()) {
                    if (!(this.f43190F.m56589r(publishOption) != null)) {
                        m35398n(C25271y.f99162w, captureFormat == null ? this.f43194J : captureFormat, m35405u(publishOption.getTrack_type()), publishOption);
                        break;
                    }
                    break;
                }
            }
        }
        for (C18058b c18058b2 : this.f43190F.m56595x()) {
            PublishOption publishOption2 = c18058b2.f70143a;
            RtpTransceiver rtpTransceiver = c18058b2.f70144b;
            if (this.f43190F.m56589r(publishOption2) != null) {
                try {
                    rtpTransceiver.stop();
                    rtpTransceiver.dispose();
                } catch (Exception e5) {
                    C2343i c2343i = C2343i.f9269a;
                    InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
                    EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
                    if (interfaceC2339e3.isLoggable(enumC2341g3, "SafeCall")) {
                        C2343i.f9271c.log(enumC2341g3, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
                    }
                }
                ((Map) this.f43190F.f76422x).remove(C20378c.m56577y(publishOption2));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:546:0x0e35  */
    /* JADX INFO: renamed from: z */
    public final TrackInfo m35410z(CameraEnumerationAndroid.CaptureFormat captureFormat, RtpTransceiver rtpTransceiver, PublishOption publishOption, String str) {
        VideoDimension video_dimension;
        List listM59804a;
        MediaStreamTrack mediaStreamTrackTrack;
        ArrayList arrayList;
        boolean z4;
        Object next;
        C26355q0 c26355q0;
        String str2;
        C26355q0 c26355q1;
        boolean z13;
        boolean zM125876U;
        String str3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str4;
        MediaStreamTrack mediaStreamTrackTrack2 = rtpTransceiver.getSender().track();
        AbstractC22676k.m65747g(mediaStreamTrackTrack2);
        if (publishOption.getTrack_type() == TrackType.TRACK_TYPE_SCREEN_SHARE) {
            video_dimension = publishOption.getVideo_dimension();
            if (video_dimension == null) {
                video_dimension = AbstractC21300d.m59808e(this.f43193I);
            }
        } else if (captureFormat != null) {
            video_dimension = AbstractC21300d.m59808e(captureFormat);
        } else {
            video_dimension = publishOption.getVideo_dimension();
            if (video_dimension == null) {
                video_dimension = AbstractC21300d.m59808e(this.f43194J);
            }
        }
        boolean z14 = mediaStreamTrackTrack2.state() == MediaStreamTrack.State.LIVE;
        boolean zM59805b = AbstractC21300d.m59805b(publishOption.getTrack_type());
        C20378c c20378c = this.f43190F;
        if (zM59805b) {
            listM59804a = null;
        } else if (!z14) {
            c20378c.getClass();
            C18057a c18057a = (C18057a) ((Map) c20378c.f76423y).get(C20378c.m56577y(publishOption));
            if (c18057a != null) {
                listM59804a = c18057a.f70142b;
            } else {
                listM59804a = null;
            }
        } else if (AbstractC21300d.m59805b(publishOption.getTrack_type())) {
            listM59804a = null;
        } else {
            listM59804a = AbstractC21300d.m59804a(video_dimension, publishOption);
        }
        C25271y c25271y = C25271y.f99162w;
        List list = listM59804a == null ? c25271y : listM59804a;
        c20378c.getClass();
        Map map = (Map) c20378c.f76423y;
        C18057a c18057a2 = (C18057a) map.get(C20378c.m56577y(publishOption));
        if (c18057a2 != null) {
            c18057a2.f70142b = list;
        } else {
            map.put(C20378c.m56577y(publishOption), new C18057a(publishOption, list));
        }
        String strM85628id = mediaStreamTrackTrack2.m85628id();
        if (listM59804a == null) {
            listM59804a = c25271y;
        }
        List<C21299c> list2 = listM59804a;
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C21299c c21299c : list2) {
            String str5 = c21299c.f81377b;
            int i13 = c21299c.f81380e;
            Integer num = c21299c.f81381f;
            int iIntValue = num != null ? num.intValue() : 0;
            String str6 = c21299c.f81377b;
            arrayList4.add(new VideoLayer(str5, new VideoDimension(c21299c.f81378c, c21299c.f81379d, null, 4, null), i13, iIntValue, AbstractC22676k.m65745e(str6, "q") ? VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED : AbstractC22676k.m65745e(str6, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT) ? VideoQuality.VIDEO_QUALITY_MID : VideoQuality.VIDEO_QUALITY_HIGH, null, 32, null));
        }
        TrackType track_type = publishOption.getTrack_type();
        Iterator it = ((Map) c20378c.f76422x).values().iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            Object next2 = it.next();
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            if (AbstractC22676k.m65745e(C20378c.m56577y(((C18058b) next2).f70143a), C20378c.m56577y(publishOption))) {
                break;
            }
            i14++;
        }
        String mid = rtpTransceiver.getMid();
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str7 = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str7)) {
            c2345kM35417f.f9274b.log(enumC2341g, str7, AbstractC11266d.m30461o("Transceiver mid: ", mid), null);
        }
        if (mid != null) {
            arrayList = arrayList4;
            str4 = mid;
            z4 = z14;
        } else if (i14 >= 0) {
            mid = String.valueOf(i14);
            arrayList = arrayList4;
            str4 = mid;
            z4 = z14;
        } else {
            if (str == null || (mediaStreamTrackTrack = rtpTransceiver.getSender().track()) == null) {
                arrayList = arrayList4;
                z4 = z14;
            } else {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                arrayList = arrayList4;
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                z4 = z14;
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                List listM125906y0 = AbstractC39414r.m125906y0(str, new String[]{"\r\n"}, 6);
                ArrayList arrayList21 = new ArrayList();
                for (Object obj : listM125906y0) {
                    if (((String) obj).length() > 0) {
                        arrayList21.add(obj);
                    }
                }
                if (arrayList21.isEmpty()) {
                    throw new IllegalArgumentException("Invalid empty SDP");
                }
                Iterator it3 = arrayList21.iterator();
                while (it3.hasNext()) {
                    String str8 = (String) it3.next();
                    Iterator it4 = it3;
                    if (str8.length() < 2 || str8.charAt(1) != '=') {
                        throw new IllegalArgumentException("Invalid SDP line");
                    }
                    char cCharAt = str8.charAt(0);
                    String strSubstring = str8.substring(2);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    C26349o0 c26349o0 = (C26349o0) AbstractC25265s.m74114R0(arrayList20);
                    ArrayList arrayList22 = arrayList16;
                    if (cCharAt == 'v') {
                        C39410n c39410nM125850d = AbstractC26313c0.f104585a.m125850d(strSubstring);
                        C26365t1 c26365t1 = c39410nM125850d == null ? null : new C26365t1(Long.parseLong((String) ((C39408l) c39410nM125850d.m125843a()).get(1)));
                        if (c26365t1 != null && c26349o0 != null) {
                            c26349o0.f104723a = c26365t1;
                        }
                    } else {
                        arrayList15 = arrayList15;
                        if (cCharAt == 'o') {
                            C39410n c39410nM125850d2 = AbstractC26313c0.f104587b.m125850d(strSubstring);
                            C26370v0 c26370v0 = c39410nM125850d2 == null ? null : new C26370v0((String) ((C39408l) c39410nM125850d2.m125843a()).get(1), Long.parseLong((String) ((C39408l) c39410nM125850d2.m125843a()).get(2)), Long.parseLong((String) ((C39408l) c39410nM125850d2.m125843a()).get(3)), (String) ((C39408l) c39410nM125850d2.m125843a()).get(4), Long.parseLong((String) ((C39408l) c39410nM125850d2.m125843a()).get(5)), (String) ((C39408l) c39410nM125850d2.m125843a()).get(6));
                            if (c26370v0 != null && c26349o0 != null) {
                                c26349o0.f104725b = c26370v0;
                            }
                        } else if (cCharAt == 's') {
                            C39410n c39410nM125850d3 = AbstractC26313c0.f104589c.m125850d(strSubstring);
                            C26367u0 c26367u0 = c39410nM125850d3 == null ? null : new C26367u0((String) ((C39408l) c39410nM125850d3.m125843a()).get(1));
                            if (c26367u0 != null && c26349o0 != null) {
                                c26349o0.f104727c = c26367u0;
                            }
                        } else if (cCharAt == 'i') {
                            C39410n c39410nM125850d4 = AbstractC26313c0.f104591d.m125850d(strSubstring);
                            C26363t c26363t = c39410nM125850d4 == null ? null : new C26363t((String) ((C39408l) c39410nM125850d4.m125843a()).get(1));
                            if (c26363t != null && c26349o0 != null) {
                                c26349o0.f104729d = c26363t;
                            }
                        } else if (cCharAt == 'u') {
                            C39410n c39410nM125850d5 = AbstractC26313c0.f104593e.m125850d(strSubstring);
                            C26362s1 c26362s1 = c39410nM125850d5 == null ? null : new C26362s1((String) ((C39408l) c39410nM125850d5.m125843a()).get(1));
                            if (c26362s1 != null && c26349o0 != null) {
                                c26349o0.f104731e = c26362s1;
                            }
                        } else if (cCharAt == 'e') {
                            C39410n c39410nM125850d6 = AbstractC26313c0.f104595f.m125850d(strSubstring);
                            C26369v c26369v = c39410nM125850d6 == null ? null : new C26369v((String) ((C39408l) c39410nM125850d6.m125843a()).get(1));
                            if (c26369v != null && c26349o0 != null) {
                                c26349o0.f104733f = c26369v;
                            }
                        } else if (cCharAt == 'p') {
                            C39410n c39410nM125850d7 = AbstractC26313c0.f104597g.m125850d(strSubstring);
                            C26373w0 c26373w0 = c39410nM125850d7 == null ? null : new C26373w0((String) ((C39408l) c39410nM125850d7.m125843a()).get(1));
                            if (c26373w0 != null && c26349o0 != null) {
                                c26349o0.f104735g = c26373w0;
                            }
                        } else if (cCharAt == 'z') {
                            C39410n c39410nM125850d8 = AbstractC26313c0.f104599h.m125850d(strSubstring);
                            C26353p1 c26353p1 = c39410nM125850d8 == null ? null : new C26353p1((String) ((C39408l) c39410nM125850d8.m125843a()).get(1));
                            if (c26353p1 != null && c26349o0 != null) {
                                c26349o0.f104737h = c26353p1;
                            }
                        } else {
                            if (cCharAt == 'r') {
                                C39410n c39410nM125850d9 = AbstractC26313c0.f104601i.m125850d(strSubstring);
                                C26382z0 c26382z0 = c39410nM125850d9 == null ? null : new C26382z0((String) ((C39408l) c39410nM125850d9.m125843a()).get(1));
                                if (c26382z0 != null && c26349o0 != null) {
                                    c26349o0.f104739i = c26382z0;
                                }
                            } else {
                                if (cCharAt == 't') {
                                    C39410n c39410nM125850d10 = AbstractC26313c0.f104603j.m125850d(strSubstring);
                                    C26356q1 c26356q1 = c39410nM125850d10 == null ? null : new C26356q1(Long.parseLong((String) ((C39408l) c39410nM125850d10.m125843a()).get(1)), Long.parseLong((String) ((C39408l) c39410nM125850d10.m125843a()).get(2)));
                                    if (c26356q1 != null && c26349o0 != null) {
                                        c26349o0.f104741j = c26356q1;
                                    }
                                } else {
                                    arrayList13 = arrayList13;
                                    arrayList14 = arrayList14;
                                    if (cCharAt == 'c') {
                                        C39410n c39410nM125850d11 = AbstractC26313c0.f104605k.m125850d(strSubstring);
                                        C26348o c26348o = c39410nM125850d11 == null ? null : new C26348o(Long.parseLong((String) ((C39408l) c39410nM125850d11.m125843a()).get(1)), (String) ((C39408l) c39410nM125850d11.m125843a()).get(2));
                                        if (c26348o != null && c26349o0 != null) {
                                            c26349o0.f104743k = c26348o;
                                        }
                                    } else if (cCharAt == 'b') {
                                        C39410n c39410nM125850d12 = AbstractC26313c0.f104607l.m125850d(strSubstring);
                                        C26327h c26327h = c39410nM125850d12 == null ? null : new C26327h((String) ((C39408l) c39410nM125850d12.m125843a()).get(1), (String) ((C39408l) c39410nM125850d12.m125843a()).get(2));
                                        if (c26327h != null) {
                                            if (c26349o0 != null) {
                                                c26349o0.f104745l.add(c26327h);
                                            } else {
                                                arrayList5.add(c26327h);
                                            }
                                        }
                                    } else if (cCharAt == 'm') {
                                        C39410n c39410nM125850d13 = AbstractC26313c0.f104609m.m125850d(strSubstring);
                                        C26358r0 c26358r0 = c39410nM125850d13 == null ? null : new C26358r0((String) ((C39408l) c39410nM125850d13.m125843a()).get(1), (String) ((C39408l) c39410nM125850d13.m125843a()).get(3), Long.parseLong((String) ((C39408l) c39410nM125850d13.m125843a()).get(2)), (String) ((C39408l) c39410nM125850d13.m125843a()).get(4));
                                        if (c26358r0 != null) {
                                            C26349o0 c26349o1 = new C26349o0();
                                            c26349o1.f104745l = new ArrayList();
                                            c26349o1.f104748n = new ArrayList();
                                            c26349o1.f104749o = new ArrayList();
                                            c26349o1.f104752r = new ArrayList();
                                            c26349o1.f104753s = new ArrayList();
                                            c26349o1.f104754t = new ArrayList();
                                            c26349o1.f104756v = new ArrayList();
                                            c26349o1.f104704H = new ArrayList();
                                            c26349o1.f104708L = new ArrayList();
                                            c26349o1.f104709M = new ArrayList();
                                            c26349o1.f104711O = new ArrayList();
                                            c26349o1.f104716T = new ArrayList();
                                            c26349o1.f104717U = new ArrayList();
                                            c26349o1.f104730d0 = new ArrayList();
                                            c26349o1.f104746l0 = new ArrayList();
                                            c26349o1.f104747m = c26358r0;
                                            arrayList20.add(c26349o1);
                                        }
                                    } else if (cCharAt == 'a') {
                                        C39410n c39410nM125850d14 = AbstractC26313c0.f104610n.m125850d(strSubstring);
                                        C26326g1 c26326g1 = c39410nM125850d14 == null ? null : new C26326g1(Long.parseLong((String) ((C39408l) c39410nM125850d14.m125843a()).get(1)), (String) ((C39408l) c39410nM125850d14.m125843a()).get(2), AbstractC36259c.m115705p0((String) ((C39408l) c39410nM125850d14.m125843a()).get(3)), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d14.m125843a()).get(4)));
                                        if (c26326g1 == null) {
                                            C39410n c39410nM125850d15 = AbstractC26313c0.f104611o.m125850d(strSubstring);
                                            C26305a0 c26305a0 = c39410nM125850d15 == null ? null : new C26305a0(Long.parseLong((String) ((C39408l) c39410nM125850d15.m125843a()).get(1)), (String) ((C39408l) c39410nM125850d15.m125843a()).get(2));
                                            if (c26305a0 == null) {
                                                C39410n c39410nM125850d16 = AbstractC26313c0.f104612p.m125850d(strSubstring);
                                                C26357r c26357r = c39410nM125850d16 == null ? null : new C26357r((String) ((C39408l) c39410nM125850d16.m125843a()).get(1));
                                                if (c26357r == null) {
                                                    C39410n c39410nM125850d17 = AbstractC26313c0.f104613q.m125850d(strSubstring);
                                                    C26310b1 c26310b1 = c39410nM125850d17 == null ? null : new C26310b1(Long.parseLong((String) ((C39408l) c39410nM125850d17.m125843a()).get(1)), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d17.m125843a()).get(2)), AbstractC36259c.m115705p0((String) ((C39408l) c39410nM125850d17.m125843a()).get(3)), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d17.m125843a()).get(4)));
                                                    if (c26310b1 == null) {
                                                        C39410n c39410nM125850d18 = AbstractC26313c0.f104614r.m125850d(strSubstring);
                                                        C26317d1 c26317d1 = c39410nM125850d18 == null ? null : new C26317d1((String) ((C39408l) c39410nM125850d18.m125843a()).get(1), Long.parseLong((String) ((C39408l) c39410nM125850d18.m125843a()).get(2)));
                                                        if (c26317d1 == null) {
                                                            C39410n c39410nM125850d19 = AbstractC26313c0.f104615s.m125850d(strSubstring);
                                                            C26314c1 c26314c1 = c39410nM125850d19 == null ? null : new C26314c1((String) ((C39408l) c39410nM125850d19.m125843a()).get(1), (String) ((C39408l) c39410nM125850d19.m125843a()).get(2), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d19.m125843a()).get(3)));
                                                            if (c26314c1 == null) {
                                                                C39410n c39410nM125850d20 = AbstractC26313c0.f104616t.m125850d(strSubstring);
                                                                C26375x c26375x = c39410nM125850d20 == null ? null : new C26375x(Long.parseLong((String) ((C39408l) c39410nM125850d20.m125843a()).get(1)), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d20.m125843a()).get(2)), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d20.m125843a()).get(3)), (String) ((C39408l) c39410nM125850d20.m125843a()).get(4), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d20.m125843a()).get(5)));
                                                                if (c26375x == null) {
                                                                    C39410n c39410nM125850d21 = AbstractC26313c0.f104617u.m125850d(strSubstring);
                                                                    C26378y c26378y = c39410nM125850d21 == null ? null : new C26378y((String) ((C39408l) c39410nM125850d21.m125843a()).get(1));
                                                                    if (c26378y == null) {
                                                                        C39410n c39410nM125850d22 = AbstractC26313c0.f104618v.m125850d(strSubstring);
                                                                        C26360s c26360s = c39410nM125850d22 == null ? null : new C26360s((String) ((C39408l) c39410nM125850d22.m125843a()).get(2), (String) ((C39408l) c39410nM125850d22.m125843a()).get(3), Long.parseLong((String) ((C39408l) c39410nM125850d22.m125843a()).get(1)), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d22.m125843a()).get(4)));
                                                                        if (c26360s == null) {
                                                                            C39410n c39410nM125850d23 = AbstractC26313c0.f104619w.m125850d(strSubstring);
                                                                            C26335j1 c26335j1 = c39410nM125850d23 == null ? null : new C26335j1((String) ((C39408l) c39410nM125850d23.m125843a()).get(1));
                                                                            if (c26335j1 == null) {
                                                                                C39410n c39410nM125850d24 = AbstractC26313c0.f104620x.m125850d(strSubstring);
                                                                                C26351p c26351p = c39410nM125850d24 == null ? null : new C26351p((String) ((C39408l) c39410nM125850d24.m125843a()).get(1));
                                                                                if (c26351p == null) {
                                                                                    C39410n c39410nM125850d25 = AbstractC26313c0.f104621y.m125850d(strSubstring);
                                                                                    C26355q0 c26355q2 = c39410nM125850d25 == null ? null : new C26355q0((String) ((C39408l) c39410nM125850d25.m125843a()).get(1));
                                                                                    if (c26355q2 == null) {
                                                                                        C39410n c39410nM125850d26 = AbstractC26313c0.f104622z.m125850d(strSubstring);
                                                                                        C26361s0 c26361s0 = c39410nM125850d26 == null ? null : new C26361s0((String) ((C39408l) c39410nM125850d26.m125843a()).get(1));
                                                                                        if (c26361s0 == null) {
                                                                                            C39410n c39410nM125850d27 = AbstractC26313c0.f104559A.m125850d(strSubstring);
                                                                                            C26376x0 c26376x0 = c39410nM125850d27 == null ? null : new C26376x0(Long.parseLong((String) ((C39408l) c39410nM125850d27.m125843a()).get(1)));
                                                                                            if (c26376x0 == null) {
                                                                                                C39410n c39410nM125850d28 = AbstractC26313c0.f104560B.m125850d(strSubstring);
                                                                                                C26346n0 c26346n0 = c39410nM125850d28 == null ? null : new C26346n0(Long.parseLong((String) ((C39408l) c39410nM125850d28.m125843a()).get(1)));
                                                                                                if (c26346n0 == null) {
                                                                                                    C39410n c39410nM125850d29 = AbstractC26313c0.f104561C.m125850d(strSubstring);
                                                                                                    C26366u c26366u = c39410nM125850d29 == null ? null : new C26366u((String) ((C39408l) c39410nM125850d29.m125843a()).get(1));
                                                                                                    if (c26366u == null) {
                                                                                                        C39410n c39410nM125850d30 = AbstractC26313c0.f104562D.m125850d(strSubstring);
                                                                                                        C26319e0 c26319e0 = c39410nM125850d30 == null ? null : new C26319e0((String) ((C39408l) c39410nM125850d30.m125843a()).get(1));
                                                                                                        if (c26319e0 == null) {
                                                                                                            C39410n c39410nM125850d31 = AbstractC26313c0.f104563E.m125850d(strSubstring);
                                                                                                            C26328h0 c26328h0 = c39410nM125850d31 == null ? null : new C26328h0((String) ((C39408l) c39410nM125850d31.m125843a()).get(1));
                                                                                                            if (c26328h0 == null) {
                                                                                                                C39410n c39410nM125850d32 = AbstractC26313c0.f104564F.m125850d(strSubstring);
                                                                                                                C26325g0 c26325g0 = c39410nM125850d32 == null ? null : new C26325g0((String) ((C39408l) c39410nM125850d32.m125843a()).get(1));
                                                                                                                if (c26325g0 == null) {
                                                                                                                    C39410n c39410nM125850d33 = AbstractC26313c0.f104565G.m125850d(strSubstring);
                                                                                                                    C26381z c26381z = c39410nM125850d33 == null ? null : new C26381z((String) ((C39408l) c39410nM125850d33.m125843a()).get(1), (String) ((C39408l) c39410nM125850d33.m125843a()).get(2));
                                                                                                                    if (c26381z == null) {
                                                                                                                        C39410n c39410nM125850d34 = AbstractC26313c0.f104566H.m125850d(strSubstring);
                                                                                                                        C26345n c26345n = c39410nM125850d34 == null ? null : new C26345n((String) ((C39408l) c39410nM125850d34.m125843a()).get(1), Long.parseLong((String) ((C39408l) c39410nM125850d34.m125843a()).get(2)), (String) ((C39408l) c39410nM125850d34.m125843a()).get(3), Long.parseLong((String) ((C39408l) c39410nM125850d34.m125843a()).get(4)), (String) ((C39408l) c39410nM125850d34.m125843a()).get(5), Long.parseLong((String) ((C39408l) c39410nM125850d34.m125843a()).get(6)), (String) ((C39408l) c39410nM125850d34.m125843a()).get(7), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d34.m125843a()).get(8)), AbstractC36259c.m115705p0((String) ((C39408l) c39410nM125850d34.m125843a()).get(9)), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d34.m125843a()).get(10)), AbstractC36259c.m115705p0((String) ((C39408l) c39410nM125850d34.m125843a()).get(11)), AbstractC36259c.m115705p0((String) ((C39408l) c39410nM125850d34.m125843a()).get(12)), AbstractC36259c.m115705p0((String) ((C39408l) c39410nM125850d34.m125843a()).get(13)));
                                                                                                                        if (c26345n == null) {
                                                                                                                            C39410n c39410nM125850d35 = AbstractC26313c0.f104567I.m125850d(strSubstring);
                                                                                                                            C26372w c26372w = c39410nM125850d35 == null ? null : new C26372w((String) ((C39408l) c39410nM125850d35.m125843a()).get(1));
                                                                                                                            if (c26372w == null) {
                                                                                                                                C39410n c39410nM125850d36 = AbstractC26313c0.f104568J.m125850d(strSubstring);
                                                                                                                                C26379y0 c26379y0 = c39410nM125850d36 == null ? null : new C26379y0((String) ((C39408l) c39410nM125850d36.m125843a()).get(1));
                                                                                                                                if (c26379y0 == null) {
                                                                                                                                    C39410n c39410nM125850d37 = AbstractC26313c0.f104569K.m125850d(strSubstring);
                                                                                                                                    C26322f0 c26322f0 = c39410nM125850d37 == null ? null : new C26322f0((String) ((C39408l) c39410nM125850d37.m125843a()).get(1));
                                                                                                                                    if (c26322f0 == null) {
                                                                                                                                        C39410n c39410nM125850d38 = AbstractC26313c0.f104570L.m125850d(strSubstring);
                                                                                                                                        C26350o1 c26350o1 = c39410nM125850d38 == null ? null : new C26350o1((String) ((C39408l) c39410nM125850d38.m125843a()).get(1), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d38.m125843a()).get(2)), AbstractC36259c.m115706q0((String) ((C39408l) c39410nM125850d38.m125843a()).get(3)));
                                                                                                                                        if (c26350o1 == null) {
                                                                                                                                            arrayList2 = arrayList13;
                                                                                                                                            C39410n c39410nM125850d39 = AbstractC26313c0.f104571M.m125850d(strSubstring);
                                                                                                                                            C26347n1 c26347n1 = c39410nM125850d39 == null ? null : new C26347n1((String) ((C39408l) c39410nM125850d39.m125843a()).get(1), (String) ((C39408l) c39410nM125850d39.m125843a()).get(2));
                                                                                                                                            if (c26347n1 == null) {
                                                                                                                                                arrayList3 = arrayList14;
                                                                                                                                                C39410n c39410nM125850d40 = AbstractC26313c0.f104572N.m125850d(strSubstring);
                                                                                                                                                C26364t0 c26364t0 = c39410nM125850d40 == null ? null : new C26364t0((String) ((C39408l) c39410nM125850d40.m125843a()).get(1), (String) ((C39408l) c39410nM125850d40.m125843a()).get(2));
                                                                                                                                                if (c26364t0 == null) {
                                                                                                                                                    C39410n c39410nM125850d41 = AbstractC26313c0.f104573O.m125850d(strSubstring);
                                                                                                                                                    C26316d0 c26316d0 = c39410nM125850d41 == null ? null : new C26316d0((String) ((C39408l) c39410nM125850d41.m125843a()).get(1), (String) ((C39408l) c39410nM125850d41.m125843a()).get(2));
                                                                                                                                                    if (c26316d0 == null) {
                                                                                                                                                        arrayList15 = arrayList15;
                                                                                                                                                        C39410n c39410nM125850d42 = AbstractC26313c0.f104574P.m125850d(strSubstring);
                                                                                                                                                        C26320e1 c26320e1 = c39410nM125850d42 == null ? null : new C26320e1((String) ((C39408l) c39410nM125850d42.m125843a()).get(1));
                                                                                                                                                        if (c26320e1 == null) {
                                                                                                                                                            C26323f1 c26323f1M78082o = AbstractC26313c0.m78082o(strSubstring);
                                                                                                                                                            if (c26323f1M78082o == null) {
                                                                                                                                                                C26329h1 c26329h1M78083p = AbstractC26313c0.m78083p(strSubstring);
                                                                                                                                                                if (c26329h1M78083p == null) {
                                                                                                                                                                    C26368u1 c26368u1M78089v = AbstractC26313c0.m78089v(strSubstring);
                                                                                                                                                                    if (c26368u1M78089v == null) {
                                                                                                                                                                        C26306a1 c26306a1M78081n = AbstractC26313c0.m78081n(strSubstring);
                                                                                                                                                                        if (c26306a1M78081n == null) {
                                                                                                                                                                            arrayList22 = arrayList22;
                                                                                                                                                                            C26331i0 c26331i0M78075h = AbstractC26313c0.m78075h(strSubstring);
                                                                                                                                                                            if (c26331i0M78075h == null) {
                                                                                                                                                                                C26341l1 c26341l1M78085r = AbstractC26313c0.m78085r(strSubstring);
                                                                                                                                                                                if (c26341l1M78085r == null) {
                                                                                                                                                                                    C26338k1 c26338k1M78086s = AbstractC26313c0.m78086s(strSubstring);
                                                                                                                                                                                    if (c26338k1M78086s == null) {
                                                                                                                                                                                        C26309b0 c26309b0M78074g = AbstractC26313c0.m78074g(strSubstring);
                                                                                                                                                                                        if (c26309b0M78074g == null) {
                                                                                                                                                                                            C26344m1 c26344m1M78087t = AbstractC26313c0.m78087t(strSubstring);
                                                                                                                                                                                            if (c26344m1M78087t == null) {
                                                                                                                                                                                                C26342m c26342mM78072e = AbstractC26313c0.m78072e(strSubstring);
                                                                                                                                                                                                if (c26342mM78072e == null) {
                                                                                                                                                                                                    C26340l0 c26340l0M78078k = AbstractC26313c0.m78078k(strSubstring);
                                                                                                                                                                                                    if (c26340l0M78078k == null) {
                                                                                                                                                                                                        C26332i1 c26332i1M78084q = AbstractC26313c0.m78084q(strSubstring);
                                                                                                                                                                                                        if (c26332i1M78084q == null) {
                                                                                                                                                                                                            C26343m0 c26343m0M78079l = AbstractC26313c0.m78079l(strSubstring);
                                                                                                                                                                                                            if (c26343m0M78079l == null) {
                                                                                                                                                                                                                C26359r1 c26359r1M78088u = AbstractC26313c0.m78088u(strSubstring);
                                                                                                                                                                                                                if (c26359r1M78088u == null) {
                                                                                                                                                                                                                    C26352p0 c26352p0M78080m = AbstractC26313c0.m78080m(strSubstring);
                                                                                                                                                                                                                    if (c26352p0M78080m == null) {
                                                                                                                                                                                                                        C26337k0 c26337k0M78077j = AbstractC26313c0.m78077j(strSubstring);
                                                                                                                                                                                                                        if (c26337k0M78077j == null) {
                                                                                                                                                                                                                            C26354q c26354qM78073f = AbstractC26313c0.m78073f(strSubstring);
                                                                                                                                                                                                                            if (c26354qM78073f == null) {
                                                                                                                                                                                                                                C26333j c26333jM78069b = AbstractC26313c0.m78069b(strSubstring);
                                                                                                                                                                                                                                if (c26333jM78069b == null) {
                                                                                                                                                                                                                                    C26330i c26330iM78068a = AbstractC26313c0.m78068a(strSubstring);
                                                                                                                                                                                                                                    if (c26330iM78068a == null) {
                                                                                                                                                                                                                                        C26339l c26339lM78071d = AbstractC26313c0.m78071d(strSubstring);
                                                                                                                                                                                                                                        if (c26339lM78071d == null) {
                                                                                                                                                                                                                                            C26336k c26336kM78070c = AbstractC26313c0.m78070c(strSubstring);
                                                                                                                                                                                                                                            if (c26336kM78070c == null) {
                                                                                                                                                                                                                                                C26334j0 c26334j0M78076i = AbstractC26313c0.m78076i(strSubstring);
                                                                                                                                                                                                                                                if (c26334j0M78076i != null) {
                                                                                                                                                                                                                                                    if (c26349o0 != null) {
                                                                                                                                                                                                                                                        c26349o0.m78090a().add(c26334j0M78076i);
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        arrayList19 = arrayList19;
                                                                                                                                                                                                                                                        arrayList19.add(c26334j0M78076i);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            } else if (c26349o0 != null) {
                                                                                                                                                                                                                                                c26349o0.m78091b(c26336kM78070c);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        } else if (c26349o0 != null) {
                                                                                                                                                                                                                                            c26349o0.m78092c(c26339lM78071d);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    } else if (c26349o0 != null) {
                                                                                                                                                                                                                                        c26349o0.f104740i0 = c26330iM78068a;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } else if (c26349o0 != null) {
                                                                                                                                                                                                                                    c26349o0.f104738h0 = c26333jM78069b;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } else if (c26349o0 != null) {
                                                                                                                                                                                                                                c26349o0.f104736g0 = c26354qM78073f;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else if (c26349o0 != null) {
                                                                                                                                                                                                                            c26349o0.f104734f0 = c26337k0M78077j;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } else if (c26349o0 != null) {
                                                                                                                                                                                                                        c26349o0.f104732e0 = c26352p0M78080m;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else if (c26349o0 != null) {
                                                                                                                                                                                                                    c26349o0.f104730d0.add(c26359r1M78088u);
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    arrayList18.add(c26359r1M78088u);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else if (c26349o0 != null) {
                                                                                                                                                                                                                c26349o0.f104728c0 = c26343m0M78079l;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else if (c26349o0 != null) {
                                                                                                                                                                                                            c26349o0.f104726b0 = c26332i1M78084q;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } else if (c26349o0 != null) {
                                                                                                                                                                                                        c26349o0.f104724a0 = c26340l0M78078k;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else if (c26349o0 != null) {
                                                                                                                                                                                                    c26349o0.f104722Z = c26342mM78072e;
                                                                                                                                                                                                }
                                                                                                                                                                                            } else if (c26349o0 != null) {
                                                                                                                                                                                                c26349o0.f104721Y = c26344m1M78087t;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else if (c26349o0 != null) {
                                                                                                                                                                                            c26349o0.f104720X = c26309b0M78074g;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else if (c26349o0 != null) {
                                                                                                                                                                                        c26349o0.f104719W = c26338k1M78086s;
                                                                                                                                                                                    }
                                                                                                                                                                                } else if (c26349o0 != null) {
                                                                                                                                                                                    c26349o0.f104718V = c26341l1M78085r;
                                                                                                                                                                                }
                                                                                                                                                                            } else if (c26349o0 != null) {
                                                                                                                                                                                c26349o0.f104717U.add(c26331i0M78075h);
                                                                                                                                                                            } else {
                                                                                                                                                                                arrayList17.add(c26331i0M78075h);
                                                                                                                                                                            }
                                                                                                                                                                        } else if (c26349o0 != null) {
                                                                                                                                                                            c26349o0.f104716T.add(c26306a1M78081n);
                                                                                                                                                                        } else {
                                                                                                                                                                            arrayList22 = arrayList22;
                                                                                                                                                                            arrayList22.add(c26306a1M78081n);
                                                                                                                                                                        }
                                                                                                                                                                        arrayList19 = arrayList19;
                                                                                                                                                                    } else if (c26349o0 != null) {
                                                                                                                                                                        c26349o0.f104715S = c26368u1M78089v;
                                                                                                                                                                    }
                                                                                                                                                                } else if (c26349o0 != null) {
                                                                                                                                                                    c26349o0.f104714R = c26329h1M78083p;
                                                                                                                                                                }
                                                                                                                                                            } else if (c26349o0 != null) {
                                                                                                                                                                c26349o0.f104713Q = c26323f1M78082o;
                                                                                                                                                            }
                                                                                                                                                        } else if (c26349o0 != null) {
                                                                                                                                                            c26349o0.f104712P = c26320e1;
                                                                                                                                                        }
                                                                                                                                                    } else if (c26349o0 != null) {
                                                                                                                                                        c26349o0.f104711O.add(c26316d0);
                                                                                                                                                    } else {
                                                                                                                                                        arrayList15 = arrayList15;
                                                                                                                                                        arrayList15.add(c26316d0);
                                                                                                                                                    }
                                                                                                                                                    arrayList19 = arrayList19;
                                                                                                                                                    arrayList22 = arrayList22;
                                                                                                                                                } else if (c26349o0 != null) {
                                                                                                                                                    c26349o0.f104710N = c26364t0;
                                                                                                                                                }
                                                                                                                                            } else if (c26349o0 != null) {
                                                                                                                                                c26349o0.f104709M.add(c26347n1);
                                                                                                                                            } else {
                                                                                                                                                arrayList3 = arrayList14;
                                                                                                                                                arrayList3.add(c26347n1);
                                                                                                                                            }
                                                                                                                                            arrayList19 = arrayList19;
                                                                                                                                            arrayList22 = arrayList22;
                                                                                                                                            arrayList15 = arrayList15;
                                                                                                                                        } else if (c26349o0 != null) {
                                                                                                                                            c26349o0.f104708L.add(c26350o1);
                                                                                                                                        } else {
                                                                                                                                            arrayList2 = arrayList13;
                                                                                                                                            arrayList2.add(c26350o1);
                                                                                                                                        }
                                                                                                                                        arrayList3 = arrayList14;
                                                                                                                                    } else if (c26349o0 != null) {
                                                                                                                                        c26349o0.f104707K = c26322f0;
                                                                                                                                    }
                                                                                                                                } else if (c26349o0 != null) {
                                                                                                                                    c26349o0.f104706J = c26379y0;
                                                                                                                                }
                                                                                                                            } else if (c26349o0 != null) {
                                                                                                                                c26349o0.f104705I = c26372w;
                                                                                                                            }
                                                                                                                        } else if (c26349o0 != null) {
                                                                                                                            c26349o0.f104704H.add(c26345n);
                                                                                                                        } else {
                                                                                                                            arrayList12.add(c26345n);
                                                                                                                        }
                                                                                                                    } else if (c26349o0 != null) {
                                                                                                                        c26349o0.f104703G = c26381z;
                                                                                                                    }
                                                                                                                } else if (c26349o0 != null) {
                                                                                                                    c26349o0.f104702F = c26325g0;
                                                                                                                }
                                                                                                            } else if (c26349o0 != null) {
                                                                                                                c26349o0.f104701E = c26328h0;
                                                                                                            }
                                                                                                        } else if (c26349o0 != null) {
                                                                                                            c26349o0.f104700D = c26319e0;
                                                                                                        }
                                                                                                    } else if (c26349o0 != null) {
                                                                                                        c26349o0.f104699C = c26366u;
                                                                                                    }
                                                                                                } else if (c26349o0 != null) {
                                                                                                    c26349o0.f104698B = c26346n0;
                                                                                                }
                                                                                            } else if (c26349o0 != null) {
                                                                                                c26349o0.f104697A = c26376x0;
                                                                                            }
                                                                                        } else if (c26349o0 != null) {
                                                                                            c26349o0.f104760z = c26361s0;
                                                                                        }
                                                                                    } else if (c26349o0 != null) {
                                                                                        c26349o0.f104759y = c26355q2;
                                                                                    }
                                                                                } else if (c26349o0 != null) {
                                                                                    c26349o0.f104758x = c26351p;
                                                                                }
                                                                            } else if (c26349o0 != null) {
                                                                                c26349o0.f104757w = c26335j1;
                                                                            }
                                                                        } else if (c26349o0 != null) {
                                                                            c26349o0.f104756v.add(c26360s);
                                                                        } else {
                                                                            arrayList11.add(c26360s);
                                                                        }
                                                                    } else if (c26349o0 != null) {
                                                                        c26349o0.f104755u = c26378y;
                                                                    }
                                                                } else if (c26349o0 != null) {
                                                                    c26349o0.f104754t.add(c26375x);
                                                                } else {
                                                                    arrayList10.add(c26375x);
                                                                }
                                                            } else if (c26349o0 != null) {
                                                                c26349o0.f104753s.add(c26314c1);
                                                            } else {
                                                                arrayList9.add(c26314c1);
                                                            }
                                                        } else if (c26349o0 != null) {
                                                            c26349o0.f104752r.add(c26317d1);
                                                        } else {
                                                            arrayList8.add(c26317d1);
                                                        }
                                                    } else if (c26349o0 != null) {
                                                        c26349o0.f104751q = c26310b1;
                                                    }
                                                } else if (c26349o0 != null) {
                                                    c26349o0.f104750p = c26357r;
                                                }
                                            } else if (c26349o0 != null) {
                                                c26349o0.f104749o.add(c26305a0);
                                            } else {
                                                arrayList7.add(c26305a0);
                                            }
                                        } else if (c26349o0 != null) {
                                            c26349o0.f104748n.add(c26326g1);
                                        } else {
                                            arrayList6.add(c26326g1);
                                        }
                                    }
                                }
                                arrayList2 = arrayList13;
                                arrayList3 = arrayList14;
                            }
                            ArrayList arrayList23 = arrayList15;
                            arrayList13 = arrayList2;
                            arrayList15 = arrayList23;
                            arrayList19 = arrayList19;
                            arrayList16 = arrayList22;
                            arrayList14 = arrayList3;
                            it3 = it4;
                        }
                    }
                    arrayList2 = arrayList13;
                    arrayList3 = arrayList14;
                    arrayList19 = arrayList19;
                    arrayList22 = arrayList22;
                    arrayList15 = arrayList15;
                    ArrayList arrayList24 = arrayList15;
                    arrayList13 = arrayList2;
                    arrayList15 = arrayList24;
                    arrayList19 = arrayList19;
                    arrayList16 = arrayList22;
                    arrayList14 = arrayList3;
                    it3 = it4;
                }
                Iterator it5 = arrayList20.iterator();
                do {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                    C26349o0 c26349o2 = (C26349o0) next;
                    C26358r0 c26358r1 = c26349o2.f104747m;
                    if (AbstractC22676k.m65745e(c26358r1 != null ? c26358r1.f104772a : null, mediaStreamTrackTrack.kind())) {
                        C26361s0 c26361s1 = c26349o2.f104760z;
                        if (c26361s1 == null || (str3 = c26361s1.f104781a) == null) {
                            zM125876U = true;
                        } else {
                            String strM85628id2 = mediaStreamTrackTrack.m85628id();
                            AbstractC22676k.m65749i(strM85628id2, "id(...)");
                            zM125876U = AbstractC39414r.m125876U(str3, strM85628id2, false);
                        }
                        if (zM125876U) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                } while (!z13);
                C26349o0 c26349o3 = (C26349o0) next;
                C2345k c2345kM35417f2 = m35417f();
                InterfaceC2339e interfaceC2339e2 = c2345kM35417f2.f9275c;
                String str9 = c2345kM35417f2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str9)) {
                    c2345kM35417f2.f9274b.log(enumC2341g2, str9, "Media section (mid): " + ((c26349o3 == null || (c26355q1 = c26349o3.f104759y) == null) ? null : c26355q1.f104768a), null);
                }
                if (c26349o3 != null && (c26355q0 = c26349o3.f104759y) != null) {
                    str2 = c26355q0.f104768a;
                }
                str4 = str2;
            }
            str2 = "";
            str4 = str2;
        }
        Codec codec = publishOption.getCodec();
        int id4 = publishOption.getId();
        AbstractC22676k.m65747g(strM85628id);
        return new TrackInfo(strM85628id, track_type, arrayList, str4, false, false, false, !z4, codec, id4, false, null, 3152, null);
    }
}
