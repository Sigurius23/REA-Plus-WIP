package live.hms.video.factories;

import hms.webrtc.PeerConnection;
import java.util.List;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ$\u0010\n\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/factories/IceCandidateFactory;", "", "<init>", "()V", "TAG", "", "makeStunServer", "Lhms/webrtc/PeerConnection$IceServer;", "urls", "", "makeTurnServer", "username", "password", "DEFAULT_ICE_SERVERS", "getDEFAULT_ICE_SERVERS", "()Ljava/util/List;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class IceCandidateFactory {
    private static final List<PeerConnection.IceServer> DEFAULT_ICE_SERVERS;
    public static final IceCandidateFactory INSTANCE;
    private static final String TAG = "IceCandidateFactory";

    static {
        IceCandidateFactory iceCandidateFactory = new IceCandidateFactory();
        INSTANCE = iceCandidateFactory;
        DEFAULT_ICE_SERVERS = AbstractC37056f.m118958J(iceCandidateFactory.makeStunServer(AbstractC37056f.m118958J("stun:stun.stunprotocol.org:3478")));
    }

    private IceCandidateFactory() {
    }

    public final List<PeerConnection.IceServer> getDEFAULT_ICE_SERVERS() {
        return DEFAULT_ICE_SERVERS;
    }

    public final PeerConnection.IceServer makeStunServer(List<String> urls) {
        AbstractC22676k.m65750j(urls, "urls");
        HMSLogger.m71136d(TAG, "Building stun server with urls=" + urls);
        PeerConnection.IceServer iceServerCreateIceServer = PeerConnection.IceServer.builder(urls).createIceServer();
        AbstractC22676k.m65749i(iceServerCreateIceServer, "createIceServer(...)");
        return iceServerCreateIceServer;
    }

    public final PeerConnection.IceServer makeTurnServer(List<String> urls, String username, String password) {
        AbstractC22676k.m65750j(urls, "urls");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(password, "password");
        HMSLogger.m71136d(TAG, "Building turn server with urls=" + urls);
        PeerConnection.IceServer.Builder builder = PeerConnection.IceServer.builder(urls);
        builder.setUsername(username);
        builder.setPassword(password);
        PeerConnection.IceServer iceServerCreateIceServer = builder.createIceServer();
        AbstractC22676k.m65749i(iceServerCreateIceServer, "createIceServer(...)");
        return iceServerCreateIceServer;
    }
}
