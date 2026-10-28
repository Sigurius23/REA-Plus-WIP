package e33;

import android.content.Context;
import android.media.AudioDeviceInfo;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import d33.C11620p;
import d33.C11622q;
import d33.C11624r;
import l83.C23470p;
import org.webrtc.Logging;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.audio.JavaAudioDeviceModule;
import p042c2.C3872q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import stream.video.sfu.models.AudioBitrateProfile;
import t23.C33414l;

/* JADX INFO: renamed from: e33.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12638j0 {

    /* JADX INFO: renamed from: a */
    public final Context f43151a;

    /* JADX INFO: renamed from: b */
    public final C33414l f43152b;

    /* JADX INFO: renamed from: c */
    public final C33414l f43153c;

    /* JADX INFO: renamed from: d */
    public final C33414l f43154d;

    /* JADX INFO: renamed from: e */
    public final Logging.Severity f43155e;

    /* JADX INFO: renamed from: f */
    public AudioBitrateProfile f43156f;

    /* JADX INFO: renamed from: g */
    public final C23470p f43157g;

    /* JADX INFO: renamed from: h */
    public final C23470p f43158h;

    /* JADX INFO: renamed from: i */
    public C11620p f43159i;

    /* JADX INFO: renamed from: j */
    public C3872q f43160j;

    /* JADX INFO: renamed from: k */
    public C11622q f43161k;

    /* JADX INFO: renamed from: l */
    public C11624r f43162l;

    /* JADX INFO: renamed from: m */
    public final C23470p f43163m;

    /* JADX INFO: renamed from: n */
    public final C23470p f43164n;

    /* JADX INFO: renamed from: o */
    public final C23470p f43165o;

    /* JADX INFO: renamed from: p */
    public JavaAudioDeviceModule f43166p;

    /* JADX INFO: renamed from: q */
    public volatile AudioDeviceInfo f43167q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f43168r;

    public C12638j0(Context context, C33414l c33414l, C33414l c33414l2, C33414l c33414l3, Logging.Severity webRtcLoggingLevel) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(webRtcLoggingLevel, "webRtcLoggingLevel");
        this.f43151a = context;
        this.f43152b = c33414l;
        this.f43153c = c33414l2;
        this.f43154d = c33414l3;
        this.f43155e = webRtcLoggingLevel;
        this.f43157g = AbstractC1772c1.m5382S(this, "Call:WebRTC");
        this.f43158h = AbstractC1772c1.m5382S(this, "Call:AudioTrackCallback");
        AbstractC30060g.m92088H(new C12664x(this));
        this.f43163m = AbstractC30060g.m92088H(new C12634h0(this));
        this.f43164n = AbstractC30060g.m92088H(new C12636i0(this));
        this.f43165o = AbstractC30060g.m92088H(new C12665y(this));
    }

    /* JADX INFO: renamed from: a */
    public final C2345k m35392a() {
        return (C2345k) this.f43158h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final PeerConnectionFactory m35393b() {
        return (PeerConnectionFactory) this.f43165o.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final C2345k m35394c() {
        return (C2345k) this.f43157g.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final PeerConnection m35395d(PeerConnection.RTCConfiguration rTCConfiguration, C12659u c12659u) {
        PeerConnection peerConnectionCreatePeerConnection = m35393b().createPeerConnection(rTCConfiguration, c12659u);
        if (peerConnectionCreatePeerConnection != null) {
            return peerConnectionCreatePeerConnection;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: renamed from: e */
    public final VideoTrack m35396e(String str, VideoSource videoSource) {
        VideoTrack videoTrackCreateVideoTrack = m35393b().createVideoTrack(str, videoSource);
        AbstractC22676k.m65749i(videoTrackCreateVideoTrack, "createVideoTrack(...)");
        return videoTrackCreateVideoTrack;
    }
}
